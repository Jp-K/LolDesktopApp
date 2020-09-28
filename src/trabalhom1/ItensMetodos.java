/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhom1;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ian
 */
public class ItensMetodos {

    private static HttpURLConnection conn;
    
    Connection connection = null;
    Statement statement = null;
    PreparedStatement prepStat = null;
    ResultSet resultSet = null;

    public static String leituraJSON(String urlItens) { // Puxa o url do JSON para retorna-lo em String

        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        try {
            URL url = new URL(urlItens);
            conn = (HttpURLConnection) url.openConnection();

            //request setup
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int status = conn.getResponseCode();
            // Se o status for 200 == conexão feita com sucesso

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close(); // encerra o buffer

        } catch (IOException e) {
        } finally {
            conn.disconnect(); // fecha a conexão
        }

        return responseContent.toString();
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
        // Função simples para remover um caracter de uma string
    }

    public static String[] preencheArrayIdItens(JSONObject objData) {

        String idsString = objData.keySet().toString(); // Pega string com todos os IDs

        // Inicia o tratamento da string
        String[] listaId = idsString.split(",");

        listaId[listaId.length - 1] = charRemoveAt(listaId[listaId.length - 1], 5);

        for (int i = 0; i < listaId.length; i++) {
            listaId[i] = charRemoveAt(listaId[i], 0);
        }
        // Finaliza o tratamento da string tornando-a um array com os IDs
        return listaId;
    }

    public static ItensStats[] retornaArrayItens(String jsonString) {

        JSONObject objItens = new JSONObject(jsonString); // Recebe objeto inteiro
        JSONObject objData = (JSONObject) objItens.get("data"); // Entra na sessão data

        String[] listaId = preencheArrayIdItens(objData); // Preenche array com todos os IDs

        String[] statsKeys = retornaJSONStatusKey(objItens); // Preenche array com todos os modificadores

        ItensStats[] itensTotais = preencheArrayItens(statsKeys, listaId, objData); // Preenche array com todos os itens

        return itensTotais;

    }

    public static String[] retornaJSONStatusKey(JSONObject objItens) {

        JSONObject objBasic = (JSONObject) objItens.get("basic"); // Le e entra na sessão basic do JSON
        JSONObject objStatus = (JSONObject) objBasic.get("stats"); // Entra na sessão stats

        String stats = objStatus.keySet().toString(); // Captura todas as keys para uma string

        // Separa a string unica em um array
        String[] arrayStats = stats.split(",");
        arrayStats[arrayStats.length - 1] = charRemoveAt(arrayStats[arrayStats.length - 1], 30);

        for (int i = 0; i < arrayStats.length; i++) {
            arrayStats[i] = charRemoveAt(arrayStats[i], 0);
        }
        // Fim do tratamento do array

        return arrayStats; // retorna array de string com todos os modificadores
    }

    public static ItensStats[] preencheArrayItens(String[] listaStatsKey, String[] listaItensId, JSONObject objData) {

        ItensStats[] arrayItem = new ItensStats[listaItensId.length]; // Array de itens vazio usado para retorno

        for (int i = 0; i < listaItensId.length; i++) { // Loop que percorre todos os itens
            ItensStats item = new ItensStats(); // Item a ser adicionado no array

            JSONObject objItemPorId = (JSONObject) objData.get(listaItensId[i]); // Busca todas as chaves dentro do item
            String itemStrings = objItemPorId.get("name").toString(); // vai atras da chave name e atribui seu valor
            item.setNome(itemStrings); // Adiciona o nome ao item
            item.setId(Integer.parseInt(listaItensId[i])); // Adiciona o Id atual do loop ao item

            int key = 0; // Chave para verificação dos modificadores no item atual
            for (int j = 0; j < listaStatsKey.length; j++) { // Testa todos os modificadores e atibui apenas os desejados

                JSONObject objStat = (JSONObject) objItemPorId.get("stats"); // Instancia um objeto de todos os valores da chave stats

                try {
                    if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatPhysicalDamageMod") && key < 1) {
                        double a = Double.parseDouble(objStat.get(listaStatsKey[j]).toString());
                        item.setDanoDeAtaque(a);
                        key = 1;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatArmorMod") && key < 4) {
                        item.setArmadura(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 4;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatHPPoolMod") && key < 9) {
                        item.setVida(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 9;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatMPPoolMod") && key < 11) {
                        item.setMana(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 11;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("PercentMovementSpeedMod") && key < 6) {
                        item.setPorcentagemVelocidadeDeMovimento(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 6;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatMovementSpeedMod") && key < 8) {
                        item.setVelocidadeDeMovimento(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 8;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("PercentAttackSpeedMod") && key < 3) {
                        item.setVelocidadeDeAtaque(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 3;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatCritChanceMod") && key < 7) {
                        item.setChanceDeAcertoCritico(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 7;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatMagicDamageMod") && key < 10) {
                        item.setDanoMagico(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 10;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("FlatSpellBlockMod") && key < 5) {
                        item.setResistenciaMagica(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 5;
                        j = 0;
                    } else if (objStat.get(listaStatsKey[j]) != null && listaStatsKey[j].equals("PercentLifeStealMod") && key < 2) {
                        item.setRouboDeVida(Double.parseDouble(objStat.get(listaStatsKey[j]).toString()));
                        key = 2;
                        j = 0;
                    }

                } catch (JSONException e) {
                    //System.out.println(item.getNome());
                    // Prossegue caso modificador testado seja invalido para o item
                }
            }
            arrayItem[i] = item;
            // Atribui o item ao array e prossegue para o proximo ID
        }
        return arrayItem;
        // Retorna o array dos itens
    }
    
    public ItensStats pesquisaItem(String nome){
        ItensStats item = new ItensStats();
        
        try{

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://179.220.42.166:3306/leagueoflegends?zeroDateTimeBehavior=convertToNull", "viewer", "");
            
            statement = connection.createStatement();
            
            String query = String.format("SELECT * FROM leagueoflegends.itens WHERE Name='%s'",nome);
                    
            resultSet = (ResultSet)statement.executeQuery(query);
            ResultQuery(resultSet, item);
            
        }catch(ClassNotFoundException | SQLException e){
        }
        
        return item;
        
    }
    
    private void ResultQuery(ResultSet result, ItensStats item)throws SQLException{
        
        while(result.next()){
            item.setId(result.getInt("itenID"));
            item.setNome(result.getString("Name"));
            item.setVida(result.getDouble("Life"));
            item.setArmadura(result.getDouble("Armour"));
            item.setResistenciaMagica(result.getDouble("MagicResist"));
            item.setDanoDeAtaque(result.getDouble("ATKDMG"));
            item.setVelocidadeDeAtaque(result.getDouble("VelATK"));
            item.setChanceDeAcertoCritico(result.getDouble("CritChance"));
            item.setDanoMagico(result.getDouble("MagicDMG"));
            item.setMana(result.getDouble("Mana"));
            item.setVelocidadeDeMovimento(result.getDouble("MovSpeed"));
            item.setPorcentagemVelocidadeDeMovimento(result.getDouble("PercMovSpeed"));
            item.setRouboDeVida(result.getDouble("LifeSteal"));
        }
    }
}
