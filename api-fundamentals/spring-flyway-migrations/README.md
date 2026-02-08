# Airport API REST

This project is a simple API REST for airport management. It uses Flyway for database migration and JPA for persistence.

## Tech stack

| **Technology** | **Description** |
|-----------------|-----------------|
| Java | 17 |
| Spring Boot | 3.0.2 |
| MySQL | 8.0.22 |
| Flyway | 7.10.0 |
| MongoDB | 4.4.9 |
| Maven | 3.9.4 |
| Docker | 27.3.1 |

## Features

- [x] Create airport
- [x] Update airport
- [x] Delete airport
- [x] Get all airports
- [x] Get airport by id
- [x] Create flight
- [x] Update flight
- [x] Delete flight
- [x] Get all flights
- [x] Get flight by id

## Getting started

### Prerequisites

- Java 17
- Maven
- Docker

### Running the application

1. Clone the repository

2. Navigate to the project directory

3. Run database service with Docker  

```bash
docker run --rm -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=test -p 3306:3306 -d mysql:8.0.22 
docker run --rm -p 27017:27017 -d mongo:4.4-bionic
```

4. Load `airport\src\main\resources\Provincias.json` into MongoDB.

5. Run the application  

```bash
mvn clean install
mvn spring-boot:run
```
  
6. Access the application at `https://localhost:8443/`

## How to use it


## Change Log

| **Version** | **Description** |
|-------------|-----------------|
| 0.0.1       | Initial release |

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.