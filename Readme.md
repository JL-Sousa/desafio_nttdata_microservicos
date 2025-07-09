# Desafio Técnico - Microsserviços

Sistema composto por dois microsserviços Java Spring Boot, um API Gateway e Service Discovery.

## Microsserviços

- **ms-produtos**: Gerencia produtos (cadastro, listagem e consulta) com persistência em banco H2.
- **ms-pedidos**: Simula criação de pedidos consultando produtos do catálogo, sem persistência.
- **api-gateway**: Gateway de entrada para todos os endpoints.
- **eureka-server**: Service Discovery para registro e descoberta dos microsserviços.

## Tecnologias Utilizadas

- Java 21+
- Spring Boot
- Spring Cloud Gateway
- Spring Cloud Eureka
- Spring Data JPA (apenas no ms-produtos)
- H2 Database (apenas no ms-produtos)
- Maven

## Arquitetura

![Diagrama de Arquitetura](https://hermes.dio.me/files/assets/c2e4ece2-999a-4c35-b4b2-3171ac7d0308.png)

## Como Executar

1. Clone o repositório:
   ```sh
   git clone <url-do-repositorio>