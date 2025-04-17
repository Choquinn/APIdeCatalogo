# 📦 API de Catálogo de Produtos

Uma API REST desenvolvida com **Java + Spring Boot** que permite gerenciar um catálogo de produtos, incluindo cadastro, listagem, edição e exclusão. Conta com persistência em banco de dados **MySQL** e documentação interativa via **Swagger UI**.

---

## 🚀 Funcionalidades

- ✅ Cadastrar novos produtos
- 🔍 Listar todos os produtos
- 📄 Buscar produto por ID
- ✏️ Atualizar produto existente
- ❌ Deletar produto
- 🌐 Swagger UI para testes e documentação

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **JUnit 5 & Mockito**
- **Swagger (Springdoc OpenAPI)**

---

## 📄 Estrutura da API

### 🔧 Modelo de Produto
```json
{
  "nome": "Teclado Mecânico",
  "descricao": "Teclado RGB com switches azuis",
  "preco": 250.00,
  "categoria": "Periféricos"
}
