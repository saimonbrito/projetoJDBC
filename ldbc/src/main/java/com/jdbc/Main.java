package com.jdbc;

import java.sql.SQLException;

import com.FabricaConexao;



public class Main {
    public static void main(String[] args) throws SQLException {
        FabricaConexao.connectar();
        CadastroRepository repository = new CadastroRepository();






        Cadastro cadastro = repository.buscar(2);

        if (cadastro != null) {
            System.out.println(cadastro.getId()+ " " + cadastro.getNome() +"" + cadastro.getIdade());

        }else{
            System.out.println("Nao foi possivel localisar o cadastro");

        }



        // List<Cadastro> cadastro = repository.listar();

        // for(Cadastro c: cadastro){
        //     System.out.println(c.getId() + " nome: " + c.getNome()+ " Idade: " + c.getIdade());
        // }




        /*
        cadastro.setNome("novinha");
        cadastro.setIdade(11);
        cadastro.setId(1);
        


        repository.excluir(4); */

        
    }
}