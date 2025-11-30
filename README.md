# 🚀 Projeto: Testes de API com Rest Assured (Java)

Este repositório contém um projeto criado do zero para estudar e demonstrar na prática:

- 📌 **Como configurar um projeto Java + Maven**
- 📌 **Como instalar e usar o Rest Assured**
- 📌 **Como testar endpoints reais (Reqres API)**
- 📌 **Como estruturar testes automatizados de API**
  
Projeto simples e curto criado como parte da preparação para **entrevistas técnicas**, com foco em automação de testes.
---

## 📌 Etapa 2 — Criação do projeto Maven

Nesta etapa foi criado um projeto **Java + Maven** dentro do diretório do repositório clonado.  
O objetivo é estruturar a base para implementar os testes automatizados com Rest Assured.

### ✔ Como foi criado o projeto
1. Abrir o IntelliJ IDEA  
2. File → New → Project  
3. Selecionar **Maven**  
4. Inserir:
   - **GroupId:** br.com.viviane  
   - **ArtifactId:** api-rest-assured  
5. Salvar dentro da pasta do repositório clonado  
6. Confirmar criação da estrutura padrão:
```
/src
  /main/java
  /test/java
pom.xml
```
## 📌 Etapa 3 — Adicionar dependências do Rest Assured ao `pom.xml`

Nesta etapa foram adicionadas ao projeto as dependências necessárias para executar testes de API utilizando o **Rest Assured**, além das bibliotecas de validação (**Hamcrest**) e do framework de testes (**JUnit 5**).

### ✔ Dependências adicionadas
```xml
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest</artifactId>
    <version>2.2</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```

Essas dependências permitem:

- **realizar requisições HTTP** (GET, POST, PUT, DELETE)
- **validar dados retornados pela API**
- **executar testes com o JUnit 5**

## 📌 Etapa 4 — Criar o primeiro teste GET com Rest Assured

Nesta etapa foi criado o primeiro teste automatizado utilizando o Rest Assured, com objetivo de validar um endpoint real e entender a estrutura básica de um teste de API (given / when / then).

### ✔ O que foi feito
- **Criada a pasta testsRestAssured dentro de src/test/java**
- **Criado o arquivo GetUserTest.java**
- **Implementado o primeiro teste consumindo a API pública JSONPlaceholder**
- **Validado que a requisição retorna status code 200**

### ✔ Estrutura do método de teste
- **given → configurações da requisição**
- **when → ação executada (GET)**
- **then → validações da resposta**

### ✔ API utilizada
- **Endpoint consumido para o teste:**
    https://jsonplaceholder.typicode.com/users/1

### ✔ Resultado
- **O teste executou com sucesso, retornando status 200, confirmando que o endpoint está funcionando corretamente.**

### ✔ Estrutura atual do projeto
```xml
  /src
  /main/java
  /test/java
      /testsRestAssured
          GetUserTest.java
  pom.xml
```
## 📌 Etapa Etapa 5 — Criar o primeiro teste POST com Rest Assured

Nesta etapa foi criado o primeiro teste utilizando o método POST, enviando um corpo JSON para a API pública Reqres API.
O objetivo foi aprender como enviar dados, configurar headers e validar o retorno da API utilizando o padrão given / when / then.

## 📌 Etapa 6 — Criar o primeiro teste PUT (atualização de dados)

Nesta etapa foi criado um teste utilizando o método PUT, responsável por atualizar os dados de um usuário em uma API pública.
Esse teste demonstra como enviar dados no corpo da requisição e validar a resposta retornada.

## 📌 7. Requisição DELETE – Remover um Usuário

A operação DELETE é usada para remover um recurso da API. No nosso caso, vamos deletar um usuário específico utilizando o endpoint: DELETE /users/1
