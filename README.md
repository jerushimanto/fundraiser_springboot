# Fundraiser API

This is a Spring Boot-based RESTful API for managing fundraisers. It allows users to create, retrieve, update, and delete fundraiser records. The API also includes error handling, validation, and a clean project structure for scalability.

## Features

- Create, retrieve, update, and delete fundraiser records
- Input validation for entities
- Global error handling with custom exceptions
- Integration with a database using JPA and Hibernate
- RESTful design principles

## Prerequisites

Before running this project, ensure you have the following installed:

- Java 17 or higher
- Maven 3.8+ or Gradle
- MySQL or any preferred relational database
- Git

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/jerushimanto/fundraiser_springboot.git
   cd fundraiser_springboot
   ```

2. Configure the database:

   - Create a database named `fundraiser_db` (or use your preferred name).
   - Update the `application.properties` file in the `src/main/resources` directory with your database credentials:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/fundraiser_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password

     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. Build the project:

   ```bash
   ./mvnw clean install
   ```

4. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Alternate to step 3 and 4, 
    Use SPRING BOOT DASHBOARD extension to run the application (in VScode)
    
   
The API will be available at `http://localhost:8080`.

## Endpoints

### Fundraiser Endpoints

| Method | Endpoint                 | Description                   |
|--------|--------------------------|-------------------------------|
| GET    | `/api/fundraisers`       | Retrieve all fundraisers      |
| GET    | `/api/fundraisers/{id}`  | Retrieve a fundraiser by ID   | 
| POST   | `/api/fundraisers`       | Create a new fundraiser       |
| PUT    | `/api/fundraisers/{id}`  | Update a fundraiser by ID     | 
| DELETE | `/api/fundraisers/{id}`  | Delete a fundraiser by ID     |





## Technologies Used

- **Spring Boot**: Framework for building RESTful APIs
- **Hibernate/JPA**: ORM for database interaction
- **MySQL**: Relational database
- **Maven**: Build tool

## Testing

Run unit tests using:

```bash
./mvnw test
```

Ensure proper test coverage by creating unit and integration tests for your service and controller layers.

## Contribution Guidelines

1. Fork the repository.
2. Create a new branch (`feature/your-feature-name`).
3. Commit your changes.
4. Push the branch and create a pull request.


## Author

[Jerush Imanto ](https://github.com/jerushimanto)
