# Cloud Architecture Patterns

A curated collection of 15 Java/Spring Boot projects exploring cloud architecture patterns, microservices, serverless, and distributed systems. Built during a Master's in Cloud Native Applications Dev (MCA) program in URJC.

## Projects

| Category | Project | Pattern / Topic | Tech Stack |
|----------|---------|-----------------|------------|
| **API Fundamentals** | [spring-rest-api](api-fundamentals/spring-rest-api) | REST API, trunk-based development | Spring Boot 3, Spring Security, H2, Thymeleaf |
| | [spring-flyway-migrations](api-fundamentals/spring-flyway-migrations) | Database migrations, multi-DB | Spring Boot 3, Flyway, MySQL, MongoDB, Docker |
| | [spring-jwt-security](api-fundamentals/spring-jwt-security) | JWT authentication, RBAC | Spring Boot 3, JWT, MySQL, Swagger, Docker |
| **Architecture Patterns** | [hexagonal-api](architecture-patterns/hexagonal-api) | Hexagonal (Ports & Adapters) | Spring Boot 3, H2 |
| | [cqrs-event-sourcing](architecture-patterns/cqrs-event-sourcing) | CQRS, Event Sourcing | Spring Boot, Axon Framework, Docker |
| | [connect-four-mvp](architecture-patterns/connect-four-mvp) | MVP, Document-View, Domain Model | Java, UML |
| **Microservices** | [monolith-to-microservices](microservices/monolith-to-microservices) | Monolith decomposition | Spring Cloud, Docker, PostgreSQL, Minikube |
| | [eventuate-tram-sagas](microservices/eventuate-tram-sagas) | Saga pattern, distributed transactions | Eventuate Tram, Gradle, MySQL, Docker |
| | [spring-state-machine-sagas](microservices/spring-state-machine-sagas) | State machine workflows | Spring State Machine, Kafka, MySQL, Docker |
| | [spring-quarkus-grpc](microservices/spring-quarkus-grpc) | Multi-framework, gRPC + REST | Spring Boot, Quarkus, GraalVM, RabbitMQ, K8s, Helm |
| **Cloud Native** | [aws-serverless-sam](cloud-native/aws-serverless-sam) | Serverless, FaaS | AWS Lambda, API Gateway, SAM CLI |
| | [aws-spring-ec2](cloud-native/aws-spring-ec2) | Cloud deployment, managed services | Spring Boot, AWS EC2, S3, RDS |
| **Resilience & Testing** | [k8s-chaos-engineering](resilience-testing/k8s-chaos-engineering) | Chaos engineering, load testing | Kubernetes, JMeter, Istio, Minikube |
| **Web Applications** | [conecta-api](web-apps/conecta-api) | Full-stack API | Spring Boot, PostgreSQL, Docker |
| | [parcel-tracker](web-apps/parcel-tracker) | Server-side rendering, PDF generation | Spring Boot 3, Thymeleaf, Spring Security, iText |

## Directory Structure

```
cloud-architecture-patterns/
├── api-fundamentals/
│   ├── spring-rest-api/                 # Library management system
│   ├── spring-flyway-migrations/        # Airport API with Flyway + MySQL/MongoDB
│   └── spring-jwt-security/             # JWT auth with role-based access
│
├── architecture-patterns/
│   ├── hexagonal-api/                   # E-commerce with ports & adapters
│   ├── cqrs-event-sourcing/            # Shopping cart with Axon Framework
│   └── connect-four-mvp/               # MVP pattern, domain model, UML
│
├── microservices/
│   ├── monolith-to-microservices/       # Spring Cloud decomposition
│   ├── eventuate-tram-sagas/           # Distributed transactions with sagas
│   ├── spring-state-machine-sagas/     # Kafka + state machine workflows
│   └── spring-quarkus-grpc/            # Multi-framework with gRPC and Helm
│
├── cloud-native/
│   ├── aws-serverless-sam/             # Lambda + API Gateway with SAM
│   └── aws-spring-ec2/                 # EC2, S3, RDS deployment
│
├── resilience-testing/
│   └── k8s-chaos-engineering/          # JMeter + Istio fault injection
│
└── web-apps/
    ├── conecta-api/                    # Education platform REST API
    └── parcel-tracker/                 # Thymeleaf + PDF generation
```

## Tech Stack

| Category | Technologies |
|----------|-------------|
| **Languages** | Java 11–18 |
| **Frameworks** | Spring Boot 2/3, Quarkus, GraalVM |
| **Databases** | MySQL, PostgreSQL, MongoDB, H2 |
| **Messaging** | Kafka, RabbitMQ, Axon Framework |
| **Cloud** | AWS (Lambda, API Gateway, EC2, S3, RDS), SAM CLI |
| **Containers** | Docker, Kubernetes, Minikube, Helm |
| **Resilience** | Istio, JMeter, Chaos Engineering |
| **Auth** | Spring Security, JWT |
| **Build** | Maven, Gradle |
