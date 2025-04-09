## 🧑‍💻 Sistema de Cadastro de Usuários - Spring Boot + Groovy

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, **Groovy** e **PostgreSQL**, que permite o cadastro e gerenciamento de usuários com validações, documentação Swagger, tratamento de erros e mais!



## 🚀 Funcionalidades

- ✅ Cadastro de usuários
- ✅ Listagem de todos os usuários
- ✅ Atualização de dados
- ✅ Remoção de usuários
- ✅ Validações de campos com mensagens personalizadas
- ✅ Datas automáticas: `createdAt`, `updatedAt`
- ✅ Documentação com Swagger
- ✅ Tratamento elegante de erros



## 📦 Tecnologias utilizadas

- [Groovy](https://groovy-lang.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Gradle](https://gradle.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [Swagger / Springdoc OpenAPI](https://springdoc.org/)
- [Hibernate Validator (Jakarta Bean Validation)](https://jakarta.ee/specifications/bean-validation/)


## 🔧 Pré-requisitos

- Java 17 ou superior
- PostgreSQL rodando localmente
- Gradle instalado (ou use o wrapper `./gradlew`)



## 💾 Configuração do banco de dados

Configure o banco em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/usuario_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```


## 🧪 Rodando o projeto

- ./gradlew bootRun

## 📬 Endpoints principais

- GET      /usuarios	Lista todos os usuários
- POST     /usuarios	Cria um novo usuário
- PUT      /usuarios/{id}	Atualiza usuário
- DELETE   /usuarios/{id}	Remove usuário

## 📚 Swagger (Documentação)

- [Documentação](http://localhost:8080/swagger-ui/index.html)
![image](https://github.com/user-attachments/assets/cd37aae7-1b3c-4575-bf2b-35c16944225f)

## 👤 Exemplo de payload (JSON)
```
{
  "nome": "Joana Silva",
  "idade": 28,
  "cidade": "São Paulo",
  "estado": "SP",
  "pais": "Brasil",
  "cep": "01000-000",
  "email": "joana@email.com",
  "cargo": "ALUNO"
}

```

## 📌 Cargos disponíveis

- ALUNO
- PROFESSOR
- DIRETOR
- MOTORISTA
- COZINHEIRO

## 🧠 Aprendizados e objetivos

> Este projeto foi feito com foco em aprendizado de:

- Backend com Spring Boot + Groovy
- Criação de API RESTful
- Padrões de validação e boas práticas
- Integração com banco de dados (PostgreSQL)
- Uso de ferramentas modernas de documentação e devtools  
