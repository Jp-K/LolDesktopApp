/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhom1.dao;

import trabalhom1.ItensStats;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import java.sql.*;

/**
 *
 * @author ian
 */
public class popularBancoDeDados {

    private Connection conn = null;
    private Statement statement = null;
    private PreparedStatement prepStat = null;
    private ResultSet resultSet = null;
    // Instancia todos as variaveis necessarias para a operação com o banco de dados

    public void popularBancoDeDados(ItensStats[] itens, String conexao, String user, String passwd) throws SQLException, ClassNotFoundException {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(conexao, user, passwd);
            System.out.println(conexao+" "+user+" "+passwd);
            // Executa a conexão com o banco de dados

            statement = conn.createStatement();

            for (int i = 0; i < itens.length; i++) {
                // Loop para preencher o banco de dados com os dados de cada item
                try {
                    
                    prepStat = conn.prepareStatement("INSERT INTO leagueoflegends.itens VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    prepStat.setString(1, Integer.toString(itens[i].getId()));
                    prepStat.setString(2, itens[i].getNome());
                    prepStat.setString(3, Double.toString(itens[i].getVida()));
                    prepStat.setString(4, Double.toString(itens[i].getArmadura()));
                    prepStat.setString(5, Double.toString(itens[i].getResistenciaMagica()));
                    prepStat.setString(6, Double.toString(itens[i].getDanoDeAtaque()));
                    prepStat.setString(7, Double.toString(itens[i].getVelocidadeDeAtaque()));
                    prepStat.setString(8, Double.toString(itens[i].getChanceDeAcertoCritico()));
                    prepStat.setString(9, Double.toString(itens[i].getDanoMagico()));
                    prepStat.setString(10, Double.toString(itens[i].getMana()));
                    prepStat.setString(11, Double.toString(itens[i].getVelocidadeDeMovimento()));
                    prepStat.setString(12, Double.toString(itens[i].getPorcentagemVelocidadeDeMovimento()));
                    prepStat.setString(13, Double.toString(itens[i].getRouboDeVida()));
                    // Preenche a query de insert
                    prepStat.executeUpdate();

                } catch (MySQLIntegrityConstraintViolationException e) {
                    System.out.println("Item com ID: " + itens[i].getId() + " ja esta cadastrado");
                    // Printa no console caso o item ja esteja cadastrado
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            close();
            // Fecha a conexão com o banco de dados
        }
    }

    private void writeMetaData(ResultSet resultSet) throws SQLException { // Mostra no console o nome de todas as colunas e suas respectivas posições
        System.out.println("As colunas sao: ");
        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            System.out.println("Coluna " + i + " " + resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int id = resultSet.getInt("itenID");
            String nome = resultSet.getString("nome");

            System.out.println("id: " + id);
            System.out.println("nome: " + nome);
        }
        // Mostra no console o resultado de uma query INSERT, conforme as informações necessárias
    }

    private void close() {
        // Fecha todas as conexões estabelecidas durante a execução do programa
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {

        }
    }
}
