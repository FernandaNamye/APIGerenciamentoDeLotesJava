# 📦 API de Gerenciamento de Lotes (Java 25)

Esta é uma API REST moderna para o controle de lotes têxteis, desenvolvida durante meus estudos de Orientação a Objetos e persistência de dados.

## 🚀 Tecnologias e Recursos
- **Java 25**: Utilizando as versões mais recentes da linguagem.
- **Javalin**: Framework leve para as rotas da API.
- **MySQL**: Persistência de dados com `JDBC`.
- **Postman**: Testes de endpoints inclusos.

## 🛠️ Como rodar o projeto
1. Clone este repositório.
2. Certifique-se de ter o **MySQL** instalado.
3. Execute o script contido em `database.sql` para criar as tabelas.
4. **Segurança**: Configure uma variável de ambiente no seu sistema chamada `DB_PASSWORD` com a senha do seu banco de dados.
5. Importe o arquivo `lotes_api.json` no seu Postman para testar as rotas `GET` e `POST`.

## 📌 Endpoints
- `POST /lotes`: Cadastra um novo lote (lote, tipo, cor, nMetrico, operador).
- `GET /lotes`: Retorna a lista de todos os lotes com data de registro.