package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.FabricaConexao;





public class CadastroRepository {

   private  Connection conexao;

    public CadastroRepository(){
        conexao = FabricaConexao.getConexao();
    }

    public void salvar(Cadastro cadestro){
        try {
            String instrucaoSql =  "INSERT INTO public.db_cadastro(id, nome, idade)  VALUES(?,?, ?);";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSql);
            pst.setString(1, cadestro.getNome());
            pst.setInt(2, cadestro.getIdade());


            pst.execute();
            System.out.println("cadastro inserido com sucesso ");

        } catch (Exception e) {
            e.printStackTrace();
        }

    };
    public void alterar(Cadastro cadastro){

    };
    public void excluir(Integer id){
        
    };
    public List<Cadastro> listar(){
        return null;
    };
    public Cadastro buscar(){
        return null;
    };

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }


    
}
