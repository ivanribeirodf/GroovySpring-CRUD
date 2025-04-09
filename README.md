## 🧑‍💻 Sistema de Cadastro de Usuários - Spring Boot + Groovy

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, **Groovy** e **PostgreSQL**, que permite o cadastro e gerenciamento de usuários com validações, documentação Swagger, tratamento de erros e mais!

---

## 🚀 Funcionalidades

- ✅ Cadastro de usuários
- ✅ Listagem de todos os usuários
- ✅ Atualização de dados
- ✅ Remoção de usuários
- ✅ Validações de campos com mensagens personalizadas
- ✅ Datas automáticas: `createdAt`, `updatedAt`
- ✅ Documentação com Swagger
- ✅ Tratamento elegante de erros

---

## 📦 Tecnologias utilizadas

- [Groovy](https://groovy-lang.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Gradle](https://gradle.org/)
- [PostgreSQL](https://www.postgresql.org/)
- [Swagger / Springdoc OpenAPI](https://springdoc.org/)
- [Hibernate Validator (Jakarta Bean Validation)](https://jakarta.ee/specifications/bean-validation/)

---

## 🔧 Pré-requisitos

- Java 17 ou superior
- PostgreSQL rodando localmente
- Gradle instalado (ou use o wrapper `./gradlew`)

---

## 💾 Configuração do banco de dados

Configure o banco em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/usuario_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
