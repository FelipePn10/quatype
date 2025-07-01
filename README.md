
# 🏥 Enterprise Patient Management System

![Java](https://img.shields.io/badge/Java-21+-blue?logo=java&style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-green?logo=springboot&style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-blue?logo=docker&style=for-the-badge)
![Kafka](https://img.shields.io/badge/Kafka-orange?logo=apachekafka&style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-blue?logo=postgresql&style=for-the-badge)
![gRPC](https://img.shields.io/badge/gRPC-36454F?logo=grpc&style=for-the-badge)
![API Gateway](https://img.shields.io/badge/API_Gateway-springcloudsuccess?style=for-the-badge&logo=spring)
![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)

Sistema empresarial de gerenciamento de pacientes de alta escalabilidade, resiliência e segurança, construído com arquitetura de microsserviços pronta para produção.

---

## 🚀 Visão Geral

Este projeto desenvolve um ambiente completo de microsserviços usando **Java** e **Spring Boot**, executados via **Docker** com **PostgreSQL** para persistência e **Kafka** para comunicação orientada a eventos. A interação entre microsserviços é feita por meio de uma combinação eficiente de **REST**, **gRPC** e **mensageria Kafka**, garantindo escalabilidade e alta performance.

---

## 🛠️ Ambiente de Desenvolvimento

- Todos os microsserviços são executados localmente em containers Docker.  
- Utilizamos imagens oficiais de PostgreSQL para banco de dados em containers, garantindo isolamento e facilidade de uso.  
- Configuração integrada de comunicação entre serviços via REST, gRPC e Kafka, simulando um ambiente real e complexo.  
- Esta infraestrutura local permite construir, testar e validar cada componente antes de avançar para produção.

---

## ☁️ Implantação Avançada e Infraestrutura como Código

Após o desenvolvimento local, o projeto evolui para uma implantação robusta utilizando o **WES (Workload Execution Service)** com pilha local e práticas de infraestrutura como código.

- Simulação de serviços de nuvem como ECS, RDS e API Gateways diretamente no ambiente local.  
- Uso de serviços gerenciados WES, incluindo MSK (Kafka gerenciado), para replicar produção com custos reduzidos.  
- Fluxo completo do desenvolvimento até a implantação na nuvem, preparando para ambientes reais e escaláveis.

---

## 🧰 Stack Tecnológica

| Tecnologia         | Descrição                                           | Link Oficial                         |
|--------------------|----------------------------------------------------|------------------------------------|
| Java 21+           | Linguagem principal do backend                      | [java.com](https://www.java.com)   |
| Spring Boot        | Framework para microsserviços                       | [spring.io](https://spring.io)     |
| Spring Cloud Gateway| API Gateway e balanceamento de carga                | [spring.io/projects/spring-cloud](https://spring.io/projects/spring-cloud) |
| Apache Kafka       | Mensageria orientada a eventos                      | [kafka.apache.org](https://kafka.apache.org) |
| PostgreSQL         | Banco de dados relacional                           | [postgresql.org](https://www.postgresql.org/) |
| Docker             | Containerização e deploy                            | [docker.com](https://www.docker.com)|
| gRPC               | Comunicação de microsserviços de alta performance  | [grpc.io](https://grpc.io/)         |
| JWT                | Autenticação via tokens                             | [jwt.io](https://jwt.io/)           |

---

## 🧱 Arquitetura
FUTURO
![Arquitetura do Sistema](https://raw.githubusercontent.com/seu-usuario/patient-enterprise-system/main/docs/architecture-diagram.png)

Arquitetura modular e escalável baseada em microsserviços com comunicação síncrona e assíncrona, orquestrada via API Gateway.

---

## 🔒 Segurança

- Autenticação via tokens JWT seguros.  
- Validação de tokens centralizada no API Gateway.  
- Serviços com controle de acesso granular.  
- Serviço dedicado para autenticação e autorização.

---

## 📦 Recursos Principais

- Microsserviços independentes, isolados e escaláveis.  
- Comunicação híbrida: REST, gRPC e Kafka.  
- API Gateway com balanceamento de carga e roteamento dinâmico.  
- Docker Compose para ambiente local rápido.  
- Testes automatizados e integração contínua.  
- Práticas de Clean Code e arquitetura hexagonal.

---

## 🧪 Testes Automatizados

- Testes unitários com JUnit e Mockito.  
- Testes de integração usando Testcontainers.  
- Testes end-to-end simulando fluxos reais.

---

## 📂 Estrutura do Projeto

```
FUTURO

```

## 📞 Contato

Para dúvidas, sugestões ou contribuições, abra uma issue ou envie um PR no GitHub.

---

## 📝 Licença

Este projeto está sob a licença [MIT](LICENSE).

---
