# Blog API

## Descrição
A Blog API é uma aplicação RESTful desenvolvida com Spring Boot para gerenciar um blog pessoal. Ela permite a criação, leitura, atualização e exclusão de postagens, comentários, categorias e etiquetas. 
## Funcionalidades
- **Usuários**
  - Criar, visualizar, atualizar e excluir usuários.
- **Postagens**
  - Criar, visualizar, atualizar e excluir postagens.
- **Comentários**
  - Adicionar, visualizar, atualizar e excluir comentários em postagens.
- **Categorias**
  - Criar, visualizar, atualizar e excluir categorias de postagens.
- **Etiquetas (Tags)**
  - Criar, visualizar, atualizar e excluir etiquetas de postagens.

## Endpoints

### Usuários
- `POST /users`: Cria um novo usuário.
- `GET /users/{id}`: Retorna um usuário específico.
- `GET /users`: Retorna todos os usuários.
- `DELETE /users/{id}`: Exclui um usuário específico.

### Postagens
- `POST /posts`: Cria uma nova postagem.
- `GET /posts/{id}`: Retorna uma postagem específica.
- `GET /posts`: Retorna todas as postagens.
- `DELETE /posts/{id}`: Exclui uma postagem específica.

### Comentários
- `POST /comments`: Adiciona um novo comentário.
- `GET /comments/{id}`: Retorna um comentário específico.
- `GET /comments`: Retorna todos os comentários.
- `DELETE /comments/{id}`: Exclui um comentário específico.

### Categorias
- `POST /categories`: Cria uma nova categoria.
- `GET /categories/{id}`: Retorna uma categoria específica.
- `GET /categories`: Retorna todas as categorias.
- `DELETE /categories/{id}`: Exclui uma categoria específica.

### Etiquetas
- `POST /tags`: Cria uma nova etiqueta.
- `GET /tags/{id}`: Retorna uma etiqueta específica.
- `GET /tags`: Retorna todas as etiquetas.
- `DELETE /tags/{id}`: Exclui uma etiqueta específica.

## Configuração do Banco de Dados
A aplicação utiliza PostgreSQL como banco de dados. Configure a conexão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Dependências
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- PostgreSQL Driver
- Spring Boot DevTools

## Iniciando a Aplicação
1. Clone o repositório.
2. Configure o banco de dados no arquivo `application.properties`.
3. Execute a aplicação com o comando:
   ```sh
   ./mvnw spring-boot:run
   ```
   ou clicar no botão executar
4. Acesse a API em `http://localhost:8080`.

> TODO: A API também deve gerenciar usuários, permitindo a autenticação e autorização!



## Autor
Desenvolvido por Alexandre Dev.
