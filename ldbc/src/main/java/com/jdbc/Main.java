package com.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.FabricaConexao;



public class Main {
    public static void main(String[] args) throws SQLException {
        FabricaConexao.connectar();
        CadastroRepository repository = new CadastroRepository();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha uma operaçao");
            System.out.println("");

            boolean sair = true;
                while (sair) {
                    System.out.println(" ");
                    System.out.println(" (1) Adicionar cadastro");
                    System.out.println(" (2) listar cadastro");
                    System.out.println(" (3) Buscar cadastro por id");
                    System.out.println(" (4) Atualizar cadastro");
                    System.out.println(" (5) excluir cadastro ");
                    System.out.println(" (6) sair \n");
                    System.out.print("Escolha uma opção: ");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1 -> {
                           Cadastro cadastro = new Cadastro();

                           System.out.println("Escreva os dados para o cadastro  \n");
                           System.out.println("");
                           
                           System.out.print("nome: ");
                           String nome = scanner.nextLine();
                            cadastro.setNome(nome);

                            System.out.print("idade: ");
                            Integer idade = scanner.nextInt();
                            cadastro.setIdade(idade);

                            repository.salvar(cadastro); 
                            sair = true; // Aqui você indica que deseja sair do loop após essa escolha
                            }

                        case 2 -> {
                            System.out.println("");
                            List<Cadastro> cadastro = repository.listar();

                            for(Cadastro c: cadastro){
                                System.out.println(c.getId() + " nome: " + c.getNome()+ " Idade: " + c.getIdade());
                            }
                            // Adicione aqui a lógica para devolução de livro
                            sair = true;
                           }

                        case 3 -> {
                            System.out.println("");
                            System.out.println("Escreva os dados para  encontrar  cadastro  \n");
                            Cadastro cadastro = new Cadastro();

                            System.out.print("id: ");
                            Integer id = scanner.nextInt();
                            cadastro.setId(id);
                            

                            repository.buscar(id);

                            
                            sair = true;
                        }
                        case 4 -> {
                            System.out.println("Escreva os dados para  alterar o cadastro  \n");
                            Cadastro cadastro = new Cadastro();

                            System.out.print("nome: ");
                            String nome = scanner.nextLine();
                            cadastro.setNome(nome);

                            System.out.print("idade: ");
                            Integer idade = scanner.nextInt();
                            cadastro.setIdade(idade);

                            System.out.print("id: ");
                            Integer id = scanner.nextInt();
                            cadastro.setId(id);

                            repository.alterar(cadastro);


                                sair = true;
                         }

                        case 5 -> {

                            System.out.println("Escreva os dados para  excluir cadastro  \n");
                            Cadastro cadastro = new Cadastro();

                            System.out.print("id: ");
                            Integer id = scanner.nextInt();
                            cadastro.setId(id);

                            repository.excluir(id);
                            

                            sair = true;
                         }
                         case 6 -> {


                            System.out.print("Sair do sistema");
                            sair = false;
                         }

                        default -> System.out.println("Opção inválida. Escolha novamente \n");
                    }
                }
                
        }



        
    }
}