package com.jdbc;

import com.FabricaConexao;



public class Main {
    public static void main(String[] args) {
        FabricaConexao.connectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();

        cadastro.setNome("gostosa");
        cadastro.setIdade(21);
        


        repository.salvar(cadastro);

        
    }
}