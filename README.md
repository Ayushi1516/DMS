# DMS Microservices Project

## 📌 Overview
This project demonstrates a **microservices architecture** using Spring Boot and Spring Cloud.  
It includes the following services:

- **Eureka Server** → Service discovery and registry
- **API Gateway** → Routing and load balancing
- **Order Service** → Handles order placement and management
- **Inventory Service** → Manages product stock and availability

The services communicate via **REST (Feign Clients)** and **Kafka (asynchronous events)**, and all are registered with **Eureka** for dynamic discovery.

---

## 🏗️ Architecture

- **Eureka Server** runs on port `8761` and provides the dashboard at `http://localhost:8761`.
- **API Gateway** routes requests to services using Eureka discovery.
- **Order Service** connects to MySQL, checks inventory via Feign, and publishes events to Kafka.
- **Inventory Service** connects to MySQL, updates stock, and consumes Kafka events.

---

## ⚙️ Tech Stack
- **Java 25**
- **Spring Boot 4.1.1**
- **Spring Cloud 2023.0.x**
- **Eureka Server / Client**
- **Spring Cloud Gateway**
- **Spring Data JPA + Hibernate**
- **MySQL 8**
- **Kafka**
- **Resilience4j (Circuit Breaker, Retry, Rate Limiter)**

---

cd eureka-server
mvn spring-boot:run
