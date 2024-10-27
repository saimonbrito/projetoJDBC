package com.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.FabricaConexao;





public class CadastroRepository {

   private  Connection conexao;

    public CadastroRepository(){
        conexao = FabricaConexao.getConexao();
    }

    public void salvar(Cadastro cadastro) throws SQLException{
        
        try {
            String instrucaoSql =  "INSERT INTO public.db_cadastro  ( nome, idade)  VALUES(?, ?);";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
 
            

            pst.execute();
            System.out.println("cadastro inserido com sucesso ");

        } catch (NullPointerException e) {
            System.out.println("nenhum paremetro foi recebido  " + e);
        }
        
        

    };
    public void alterar(Cadastro cadastro) throws SQLException{
        try {
            String instrucaoSql =  "UPDATE  public.db_cadastro SET  nome=?, idade=? WHERE id=?";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.setInt(3, cadastro.getId());
 
           

            pst.execute();
            System.out.println("cadastro auterado com sucesso ");

        } catch (NullPointerException e) {
            System.out.println("nenhum paremetro foi recebido  " + e);
        }

    };
    public void excluir(Integer id) throws SQLException{
        try {
            String instrucaoSql =  "DELETE FROM public.db_cadastro  WHERE id=?";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            pst.setInt(1, id);
 
           

            pst.execute();
            System.out.println("cadastro EXCLUIDO com sucesso ");

        } catch (NullPointerException e) {
            System.out.println("nenhum paremetro foi recebido  " + e);
        }
        
    };
    public List<Cadastro> listar() throws SQLException{

        List <Cadastro> list = new ArrayList<>();
        try {
            String instrucaoSql =  "SELECT  id, nome ,idade FROM public.db_cadastro ";
            PreparedStatement statement = conexao.prepareStatement(instrucaoSql);
            //pst.setInt(1, id);
            ResultSet result = statement.executeQuery();

           while (result.next()) {
            Integer id = result.getInt("id");
            String nome = result.getString("nome");
            Integer idade = result.getInt("idade");

            Cadastro cadastro = new Cadastro();
            cadastro.setId(id);
            cadastro.setNome(nome);
            cadastro.setIdade(idade);

            list.add(cadastro);
               
           }
           

            
            System.out.println("cadastro listado com sucesso ");

        } catch (NullPointerException e) {
            System.out.println("nenhum paremetro foi recebido  " + e);
        }
        return list;
        
    };
    public Cadastro buscar(Integer id) throws SQLException{


        Cadastro cadastro = null;
        try {
            String instrucaoSql =  "SELECT  id, nome ,idade FROM public.db_cadastro WHERE id=?";
            PreparedStatement statement = conexao.prepareStatement(instrucaoSql);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

           if (result.next()) {
                
                String nome = result.getString("nome");
                Integer idade = result.getInt("idade");

                cadastro = new Cadastro();

                cadastro.setId(id);
                cadastro.setNome(nome);
                cadastro.setIdade(idade);

                
                
            }
           

            
            System.out.println("cadastro encontrado com sucesso ");

        } catch (NullPointerException e) {
            System.out.println("nenhum paremetro foi recebido  " + e);
        }
        
        return cadastro;
    };

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }


    
}
