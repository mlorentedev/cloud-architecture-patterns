# Monolith to Microservices Boilerplate

This project provides a boilerplate for transitioning a monolithic application to a microservices architecture using Spring Boot, Spring Cloud, and Docker. It offers a structured foundation that facilitates the development and deployment of microservices, leveraging best practices in cloud-native applications.

## Tech Stack

| **Technology**        | **Description**   |
|-----------------------|-------------------|
| Java                  | 17                |
| Spring Boot           | 2.7.0             |
| Spring Cloud          | 2021.0.5          |
| Spring Data JPA       | 2.5.0             |
| Docker                | 20.10.8           |
| PostgreSQL            | 13.3              |
| Minikube              | 1.24.0            |

## Getting Started

### Prerequisites

- Java 17
- Maven
- Docker

### Running the Application

1. Clone the repository.

2. Start docker service.

`sudo service docker start`

3. Launch minikube.

`minikube start`

4. Enable ingress.

`minikube addons enable ingress`

5. Associate domain name to IP to get access.

`echo "`minikube ip` booksapp" | sudo tee --append /etc/hosts >/dev/null`

6. Run the build script to build the Docker images and push them to Docker Hub.

`./build_and_push.sh`

7. Deploy the application.

`kubectl apply -f k8s/`

8. Test the API with Postman collection `api-test.postman_collection.json`.

## Change Log

| **Version** | **Description** |
|-------------|-----------------|
| 0.0.1       | Initial release |

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
