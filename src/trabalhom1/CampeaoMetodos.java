/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhom1;

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
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author ian
 */
public class CampeaoMetodos {
    
    Connection connection = null;
    Statement statement = null;
    PreparedStatement prepStat = null;
    ResultSet resultSet = null;
    
    private static HttpURLConnection conn;

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
        // Função simples para remover um caracter de uma string
    }

    public static String leituraJSON(String link){

        BufferedReader reader;
        String line;
        StringBuilder responseContent = new StringBuilder();

        try {
            URL url = new URL(link);
            conn = (HttpURLConnection) url.openConnection();

            //request setup
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int status = conn.getResponseCode();
            //System.out.println(status); // 200 == Success

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            }
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

        } catch (IOException | NumberFormatException | JSONException e){

        } finally {
            conn.disconnect();
        }

        return responseContent.toString();
    }

    public static String[] retornaNomesChamps(String json){
        JSONObject obj = new JSONObject(json);
        JSONObject data = (JSONObject) obj.get("data");

        String keys = data.keySet().toString();
        String[] nomes = keys.split(",");

        nomes[nomes.length-1] = charRemoveAt(nomes[nomes.length-1],7);

        for(int i = 0; i < nomes.length; i++){
            nomes[i] = charRemoveAt(nomes[i],0);
        }
        return nomes;
    }

    public static CampeaoStats[] retornaCampeoes(String[] nomes, String url){

        
        CampeaoStats[] arrayChamps = new CampeaoStats[nomes.length];
        JSONObject obj = new JSONObject(leituraJSON(url));
        JSONObject data = (JSONObject) obj.get("data");

        for(int i = 0; i < nomes.length; i++){
            CampeaoStats champ = new CampeaoStats();
            JSONObject nomeData = (JSONObject) data.get(nomes[i]);
            JSONObject stats = (JSONObject) nomeData.get("stats");

            champ.setNome(nomes[i]);
            champ.setHp(Double.parseDouble(stats.get("hp").toString()));
            champ.setMp(Double.parseDouble(stats.get("mp").toString()));
            champ.setMovespeed(Double.parseDouble(stats.get("movespeed").toString()));
            champ.setArmor(Double.parseDouble(stats.get("armor").toString()));
            champ.setSpellblock(Double.parseDouble(stats.get("spellblock").toString()));
            champ.setAttackrange(Double.parseDouble(stats.get("attackrange").toString()));
            champ.setHpregen(Double.parseDouble(stats.get("hpregen").toString()));
            champ.setMpregen(Double.parseDouble(stats.get("mpregen").toString()));
            champ.setCrit(Double.parseDouble(stats.get("crit").toString()));
            champ.setAttackdamage(Double.parseDouble(stats.get("attackdamage").toString()));
            champ.setAttackspeed(Double.parseDouble(stats.get("attackspeed").toString()));
            
            //relativos a level 
            champ.setAttackspeedperlevel(Double.parseDouble(stats.get("attackspeedperlevel").toString()));
            champ.setCritperlevel(Double.parseDouble(stats.get("critperlevel").toString()));
            champ.setAttackdamageperlevel(Double.parseDouble(stats.get("attackdamageperlevel").toString()));
            champ.setMpregenperlevel(Double.parseDouble(stats.get("mpregenperlevel").toString()));
            champ.setHpregenperlevel(Double.parseDouble(stats.get("hpregenperlevel").toString()));
            champ.setSpellblockperlevel(Double.parseDouble(stats.get("spellblockperlevel").toString()));
            champ.setArmorperlevel(Double.parseDouble(stats.get("armorperlevel").toString()));
            champ.setMpperlevel(Double.parseDouble(stats.get("mpperlevel").toString()));
            champ.setHpperlevel(Double.parseDouble(stats.get("hpperlevel").toString()));
            
            arrayChamps[i] = champ;
        }    
        return arrayChamps;
    }
    
    public CampeaoStats pesquisaCampeao(String nome){
        
        CampeaoStats champ = new CampeaoStats();
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://179.220.42.166:3306/leagueoflegends?zeroDateTimeBehavior=convertToNull", "viewer", "");
            
            statement = connection.createStatement();
            
            String query = String.format("SELECT * FROM leagueoflegends.champions WHERE nome='%s'",nome);
                    
            resultSet = (ResultSet)statement.executeQuery(query);
            ResultQuery(resultSet, champ);
            
            
        }catch(ClassNotFoundException | SQLException e){
        }
        
        return champ;
    }
    
    private void ResultQuery(ResultSet result, CampeaoStats champ) throws SQLException{
        
        while(result.next()){
            
            champ.setNome(result.getString("nome"));
            champ.setHp(result.getDouble("Life"));
            champ.setMp(result.getDouble("Mana"));
            champ.setMovespeed(result.getDouble("MovSpeed"));
            champ.setArmor(result.getDouble("Armour"));
            champ.setSpellblock(result.getDouble("MagicResist"));
            champ.setAttackrange(result.getDouble("ATKRange"));
            champ.setHpregen(result.getDouble("LifeRegen"));
            champ.setMpregen(result.getDouble("ManaRegen"));
            champ.setCrit(result.getDouble("CritChance"));
            champ.setAttackdamage(result.getDouble("ATKDMG"));
            champ.setAttackspeed(result.getDouble("ATKSpeed"));
            champ.setAttackspeedperlevel(result.getDouble("ATKSpeedLVL"));
            champ.setCritperlevel(result.getDouble("CritLVL"));
            champ.setAttackdamageperlevel(result.getDouble("ATKDMGLVL"));
            champ.setMpregenperlevel(result.getDouble("ManaRegenLVL"));
            champ.setHpregenperlevel(result.getDouble("LifeRegenLVL"));
            champ.setSpellblockperlevel(result.getDouble("MagicResistLVL"));
            champ.setArmorperlevel(result.getDouble("ArmourLVL"));
            champ.setMpperlevel(result.getDouble("ManaLVL"));
            champ.setHpperlevel(result.getDouble("LifeLVL"));
            
        }
    }
}
