# Projeto de Exercícios Java

## Sobre o Projeto

Este projeto contém três exercícios implementados em Java:

1. **Folha de Pagamento**
   Calcula salário bruto, auxílio-família e salário líquido de um funcionário.

2. **Sequência**
   Gera uma sequência de números conforme a lógica do exercício.

3. **Fibonacci**
   Calcula a sequência de Fibonacci até uma quantidade definida.

> Todos os testes dos endpoints foram feitos via **Postman**.

---

## Endpoints da API

### 1. Folha de Pagamento

* **URL:** `/payroll`
* **Método:** POST
* **Body (JSON):

```json
{
  "name": "Miguel",
  "workedHourValue": 25.0,
  "hoursWorked": 160,
  "childrenAges": [5, 8]
}
```

### 2. Sequência

* **URL:** `/sequence/sequence`
* **Método:** POST
* **Body (JSON):

```json
{
  "quantity": 5,
  "numbers": [1, 2, 3, 4, 5]
}
```

### 3. Fibonacci

* **URL:** `/fibonacci/fibonacci`
* **Método:** POST
* **Body (JSON):

```json
{
  "n": 10
}
```

---

## Como Testar

1. Abra o **Postman**
2. Configure o método e a URL conforme os exemplos acima
3. Envie a requisição com o **body em JSON**
4. Verifique a resposta da API

---

## Requisitos

* Java 21
* Spring Boot
* Postman (para testar os endpoints)


Repositório

O código deste projeto está disponível no GitHub:
https://github.com/ThamirisGracielle/acedata