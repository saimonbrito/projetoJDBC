# Projeto: Criação de um CRUD com PostgreSQL e Java (JDBC)  

Este projeto tem como objetivo a criação de um CRUD (Create, Read, Update, Delete) utilizando PostgreSQL como banco de dados e Java para manipulação de dados com JDBC. O projeto é estruturado com foco em três pilares da programação orientada a objetos: Encapsulamento, Abstração e polimorfismo.  

## Tecnologias Utilizadas  

- **Linguagem**: Java  
- **Banco de Dados**: PostgreSQL  
- **Conexão com Banco de Dados**: JDBC (Java Database Connectivity)  

## Funcionalidades  

- **Criar**: Adicionar novos registros ao banco de dados.  
- **Ler**: Consultar registros existentes.  
- **Atualizar**: Modificar registros já armazenados.  
- **Deletar**: Remover registros do banco de dados.  

## Estrutura do Projeto  

O projeto é dividido nas seguintes classes principais:  

- `FabricaConexao`: Classe responsável por gerenciar a conexão com o banco de dados PostgreSQL. Ela encapsula a lógica de conexão e fornece métodos para obter a conexão necessária.  
  
- `Cadastro`: Classe que representa a entidade de cadastro, contendo atributos e métodos pertinentes, como validações e manipulação de dados relacionados ao cadastro.  

- `CadastroRepository`: Classe responsável pela interface com o banco de dados, implementando os métodos para as operações CRUD (Create, Read, Update, Delete) sobre a entidade `Cadastro`.  

- `Main`: Classe principal onde a aplicação é executada. Aqui você pode incluir interações de usuário e chamadas aos métodos do repositório para realizar operações.  

## Pré-requisitos  

Para executar este projeto, você precisará de:  

- JDK instalado (versão 8 ou superior)  
- PostgreSQL instalado e em execução  
- Dependência do driver JDBC do PostgreSQL  

## Instruções de Instalação  

1. Clone o repositório:  

    ```bash  
    git clone  https://github.com/saimonbrito/projetoJDBC.git 
    ```  

2. Navegue até o diretório do projeto:  

    ```bash  
    cd seurepositorio  
    ```  

3. Certifique-se de que o banco de dados PostgreSQL está em execução e configure as credenciais no arquivo de configuração (ex: `config.properties`).  

4. Compile e rode o projeto utilizando sua IDE favorita ou pela linha de comando.  

## Exemplo de Uso  

Após configurar e executar o projeto, você pode interagir com o CRUD através de comandos no console ou pela interface que você implementar.  

## Contribuições  

Contribuições são bem-vindas! Sinta-se à vontade para abrir um issue ou pull request.  

## Licença  

Este projeto está licenciado sob a [Licença MIT](LICENSE).
