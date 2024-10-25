package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaConexao {

    private static  Connection conexao;

    public static  void  connectar(){
 
        if( conexao == null){

            try {
            String url = "jdbc:postgresql://localhost:5432/db_jdbc";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "203040");
            //props.setProperty("ssl", "true");
            Connection conexao = DriverManager.getConnection(url, props);
            System.out.println(" conectado ... !");

        
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        }
    }

    public static  Connection getConexao(){
        return  conexao;
    }
}
