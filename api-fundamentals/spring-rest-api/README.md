# API book store

This project is a demonstration of trunk-based development practices using a library management system. The application allows users to manage books in a library, leveraging a Spring Boot backend and Thymeleaf for the frontend.

## Tech Stack

| **Technology**          | **Description**                            |
|-------------------------|--------------------------------------------|
| Backend Framework        | Spring Boot 3.3.4                          |
| Programming Language     | Java 17                                    |
| Database                 | H2 (in-memory)                             |
| Web Framework            | Thymeleaf                                  |
| Security                 | Spring Security                            |
| ORM                      | Spring Data JPA                            |
| Dependency Management    | Maven                                      |
| Project Management       | Lombok for reducing boilerplate code       |

## Features

- Manage books (add, update, delete)
- Event-driven notifications for library updates
- Unit and integration tests
- Generate structured web pages using Thymeleaf templates

## Running the Application

### Prerequisites

- Java
- Maven

### Running Locally

1. Clone the repository

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

4. Access the app:
    - Open [http://localhost:8080](http://localhost:8080) to view the library system.

### Running Tests

To run the unitary and end-to-end tests:
    ```bash
    mvn test
    ```

## Deployment strategies

- **Canary deployment**: Deploy the new version of the application to a subset of users to test the new features and gather feedback before rolling out to the entire user base.

- **Blue-green deployment**: Deploy the new version of the application alongside the existing version. Once the new version is tested and ready, switch the traffic to the new version.

- **Parallel change deployment**: Deploy the new version of the application in parallel with the existing version. Gradually migrate users to the new version while monitoring the performance and stability of the application.

## Change Log

| **Version** | **Description** |
|-------------|-----------------|
| 0.0.1       | Initial release |

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
