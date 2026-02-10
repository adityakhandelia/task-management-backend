# Task Management Backend API

A RESTful backend application built using **Spring Boot** to manage tasks with full CRUD functionality.

##  Features
- Create, update, delete, and fetch tasks
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Spring Data JPA with Hibernate
- Input validation using Jakarta Validation
- Global exception handling
- H2 in-memory database
- Swagger/OpenAPI documentation

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Swagger (OpenAPI)

##  API Endpoints
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | `/tasks` | Create task |
| GET | `/tasks` | Get all tasks |
| GET | `/tasks/{id}` | Get task by ID |
| PUT | `/tasks/{id}` | Update task |
| DELETE | `/tasks/{id}` | Delete task |

