# Library API REST

This project is a library management system that allows users to manage books, post comments and ratings for books. The project is built using Spring Boot, Spring Security, and JWT. The project is also secured with HTTPS.

## Tech stack

| **Technology** | **Description** |
|-----------------|-----------------|
| Java | 17 |
| Spring Boot | 3.0.0 |
| MySQL | 8.0.22 |
| Maven | 3.9.4 |
| Docker | 27.3.1 |
| Swagger | 2.2.7|

## Features

- User registration
- User login
- User roles
- Book management
- Comment management
- Rating management
- HTTPS
- Swagger

## Getting started

### Prerequisites

- Java 17
- Maven
- Docker

### Running the Application

1. Clone the repository

2. Navigate to the project directory

3. Run database service with Docker  

```bash
docker run --rm -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=books -p 3306:3306 -d mysql:8.0.22`  
```

4. Run the application  

```bash
mvn clean install
mvn spring-boot:run
```
  
5. Access the application at `https://localhost:8443/`

## How to use it  

### Anonimous user  

#### Allowed to get ID and title of all books  

```json
 curl --location --request GET 'https://localhost:8443/api/v1/books/basic'
```

#### Allowed to get all comments and info of a book

```json
curl --location --request GET 'https://localhost:8443/api/v1/books/1'
```

### Role user (all above +)  

#### Allowed to get all books information  

```json
curl --location --request GET 'https://localhost:8443/api/v1/books/' --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWJsbyIsImlhdCI6MTY3Mzk2MzkwNywiZXhwIjoxNjc0MDUwMzA3fQ.aEqiEYwrgFY-FNgCvDOuj-tmeAsip3nhi94q3BzCBUvgrzbBrwcLUDrlWfnnRCq8NWkYgfbKDbqK2Xw7fnYwuQ'
```

#### Allowed to create a new book  

```json
curl --location --request POST 'https://localhost:8443/api/v1/books/' --header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWJsbyIsImlhdCI6MTY3Mzk2MzkwNywiZXhwIjoxNjc0MDUwMzA3fQ.aEqiEYwrgFY-FNgCvDOuj-tmeAsip3nhi94q3BzCBUvgrzbBrwcLUDrlWfnnRCq8NWkYgfbKDbqK2Xw7fnYwuQ' --header 'Content-Type: application/json' --data-raw '{
    "title" : "libro 3",
    "summary" : "string",
    "author" : "string",
    "publisher": "string",
    "date" : "string"
    }'
```

#### Allowed to post a comment

```json
curl --location --request POST 'https://localhost:8443/api/v1/comments/' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWJsbyIsImlhdCI6MTY3Mzk2MzkwNywiZXhwIjoxNjc0MDUwMzA3fQ.aEqiEYwrgFY-FNgCvDOuj-tmeAsip3nhi94q3BzCBUvgrzbBrwcLUDrlWfnnRCq8NWkYgfbKDbqK2Xw7fnYwuQ' \
--header 'Content-Type: application/json' \
--data-raw '{
    "text" : "libro 3",
    "rating" : 3,
    "userId" : 1,
    "bookId":1
}'
```

#### Allowed to get a single comment

```json
curl --location --request GET 'https://localhost:8443/api/v1/comments/1' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWJsbyIsImlhdCI6MTY3Mzk2MzkwNywiZXhwIjoxNjc0MDUwMzA3fQ.aEqiEYwrgFY-FNgCvDOuj-tmeAsip3nhi94q3BzCBUvgrzbBrwcLUDrlWfnnRCq8NWkYgfbKDbqK2Xw7fnYwuQ'
```

### Role admin (all above +)

#### Delete a book  

```json
curl --location --request DELETE 'https://localhost:8443/api/v1/books/1' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWJsbyIsImlhdCI6MTY3Mzk2MzkwNywiZXhwIjoxNjc0MDUwMzA3fQ.aEqiEYwrgFY-FNgCvDOuj-tmeAsip3nhi94q3BzCBUvgrzbBrwcLUDrlWfnnRCq8NWkYgfbKDbqK2Xw7fnYwuQ'
```

#### Delete a comment  

```json
curl --location --request DELETE 'https://localhost:8443/api/v1/comments/1' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWJsbyIsImlhdCI6MTY3Mzk2MzkwNywiZXhwIjoxNjc0MDUwMzA3fQ.aEqiEYwrgFY-FNgCvDOuj-tmeAsip3nhi94q3BzCBUvgrzbBrwcLUDrlWfnnRCq8NWkYgfbKDbqK2Xw7fnYwuQ'
```

## Change Log

| **Version** | **Description** |
|-------------|-----------------|
| 0.0.1       | Initial release |

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
