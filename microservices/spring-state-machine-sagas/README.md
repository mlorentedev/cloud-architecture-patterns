# Delivery system following a microservices architecture State Machine

Proof of concept of a microservices architecture with Spring Boot, Spring State Machine, Kafka, MySQL, and Docker.

## Getting started

### Run the services

```bash
docker-compose -f docker-compose-mysql.yaml up
```

### Stop the services

```bash
docker-compose -f docker-compose-mysql.yaml down
```

### Run services

To run the services need to run in the directory of each service:

```bash
mvn spring-boot:run
```

## API endpoints

There are four collections of Postman tests.

| Order state | Rejection reason | Comment |
| --- | --- | --- |
| APPROVED | - | The order has been approved |
| REJECTED | INSUFFICIENT_CREDIT | The order has been rejected because the customer has insufficient credit |
| REJECTED | SOLD_OUT | The order has been rejected because the product is sold out |
| REJECTED | SOLD_OUT | The order has been rejected because the delivery is not available in the city |

### Notes

Make sure to retrieve the IDs of the orders and customers being created to test the endpoints of the services.
