# 🛫 Boarding Pass Microservice

A modular Spring Boot-based backend microservice simulating airline boarding pass generation and processing logic. Inspired by enterprise airline systems (e.g., Delta Airlines), this service integrates XML-based APIs using JAXB, secure secrets management, and deployable Docker architecture.

---

## 🚀 Features

- RESTful APIs with Spring Web
- JAXB integration for XML-to-Java POJO binding
- PostgreSQL + Spring Data JPA for persistence
- `application.yml`-based configuration with secrets injection
- Dockerized environment
- End-to-end + unit testing (JUnit 5, Mockito)
- Secrets managed via environment variables

---

## 🛠 Tech Stack

| Layer         | Tech                                       |
|---------------|--------------------------------------------|
| Language      | Java 21                                    |
| Framework     | Spring Boot                                |
| Build Tool    | Gradle (Kotlin DSL)                        |
| DB            | PostgreSQL (can switch to H2 for local)    |
| XML Parsing   | JAXB                                       |
| Testing       | JUnit 5, Mockito                           |
| Config        | application.yml + environment placeholders |
| Container     | Docker                                     |

---

## 🧾 Example Configuration (`application.yml`)

```yaml
server:
  port: 8080

api:
  key: ${API_KEY}
  endpoint: https://example.com/boardingpass

spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}
    username: ${DB_USER}
    password: ${DB_PASSWORD}
