/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhom1.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import java.sql.*;
import trabalhom1.CampeaoStats;

/**
 *
 * @author ian
 */
public class popularBancoDeDadosCampeao {
    
    private Connection conn = null;
    private Statement statement = null;
    private PreparedStatement prepStat = null;
    private ResultSet resultSet = null;
    
    public void popularBancoDeDadosCampeao(CampeaoStats[] champs, String conexao, String user, String senha)throws SQLException, ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(conexao,user,senha);
            // Exsecuta a conexão com o banco de dados
            
            statement = conn.createStatement();
            
            for(int i = 0; i < champs.length; i++){
                // Loop que preenche o banco de dados
                try{
                    prepStat = conn.prepareStatement("INSERT INTO leagueoflegends.champions VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    prepStat.setString(1, champs[i].getNome());
                    prepStat.setDouble(2, champs[i].getHp());
                    prepStat.setDouble(3, champs[i].getMp());
                    prepStat.setDouble(4, champs[i].getMovespeed());
                    prepStat.setDouble(5, champs[i].getArmor());
                    prepStat.setDouble(6, champs[i].getSpellblock());
                    prepStat.setDouble(7, champs[i].getAttackrange());
                    prepStat.setDouble(8, champs[i].getHpregen());
                    prepStat.setDouble(9, champs[i].getMpregen());
                    prepStat.setDouble(10, champs[i].getCrit());
                    prepStat.setDouble(11, champs[i].getAttackdamage());
                    prepStat.setDouble(12, champs[i].getAttackspeed());
                    prepStat.setDouble(13, champs[i].getAttackspeedperlevel());
                    prepStat.setDouble(14, champs[i].getCritperlevel());
                    prepStat.setDouble(15, champs[i].getAttackdamageperlevel());
                    prepStat.setDouble(16, champs[i].getMpregenperlevel());
                    prepStat.setDouble(17, champs[i].getHpregenperlevel());
                    prepStat.setDouble(18, champs[i].getSpellblockperlevel());
                    prepStat.setDouble(19, champs[i].getArmorperlevel());
                    prepStat.setDouble(20, champs[i].getMpperlevel());
                    prepStat.setDouble(21, champs[i].getHpperlevel());
                    
                    prepStat.executeUpdate();
                }catch (MySQLIntegrityConstraintViolationException e){
                    System.out.println("Campeao: "+champs[i].getNome()+" ja esta cadastrado");
                }
            }
            
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } finally{
            close();
            // Fecha a conexão com o banco de dados
        }
    }
    
    private void close(){
        // Função para fechar todas as conexões
        
        try{
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch(Exception e){
            
        }
    }
}
