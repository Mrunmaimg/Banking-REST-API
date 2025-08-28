# Banking REST API

A robust and scalable Banking REST API built with Spring Boot 3.5.5, Spring Data JPA, and MySQL. This application provides essential banking operations through a well-documented RESTful API.

## 🚀 Features

- **Account Management**: Create, read, update, and delete bank accounts
- **Transactions**: Deposit and withdraw money from accounts
- **RESTful API**: Follows REST principles for clean and intuitive endpoints
- **Data Validation**: Input validation for all API endpoints
- **Error Handling**: Comprehensive error handling with appropriate HTTP status codes

## 🛠️ Tech Stack

- **Backend Framework**: Spring Boot 3.5.5
- **Java Version**: 17
- **Build Tool**: Maven
- **Database**: MySQL
- **Lombok**: For reducing boilerplate code
- **JPA/Hibernate**: For ORM and database operations

## 📦 Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher
- MySQL 8.0 or higher
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Mrunmaimg/Banking-REST-API
cd banking
```

### 2. Configure Database

1. Create a MySQL database named `banking_app`
2. Update the database configuration in `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build and Run

```bash
# Build the application
mvn clean install

# Run the application
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📚 API Documentation

### Base URL
```
http://localhost:8080/api/accounts
```

### Endpoints

#### Create Account
- **URL**: `/`
- **Method**: `POST`
- **Request Body**:
  ```json
  {
    "accountHolderName": "John Doe",
    "balance": 1000.00
  }
  ```
- **Success Response**: `201 Created`

#### Get Account by ID
- **URL**: `/{id}`
- **Method**: `GET`
- **Success Response**: `200 OK`

#### Deposit Money
- **URL**: `/{id}/deposit`
- **Method**: `PUT`
- **Request Body**:
  ```json
  {
    "amount": 500.00
  }
  ```
- **Success Response**: `200 OK`

#### Withdraw Money
- **URL**: `/{id}/withdraw`
- **Method**: `PUT`
- **Request Body**:
  ```json
  {
    "amount": 200.00
  }
  ```
- **Success Response**: `200 OK`

#### Get All Accounts
- **URL**: `/`
- **Method**: `GET`
- **Success Response**: `200 OK`

#### Delete Account
- **URL**: `/{id}`
- **Method**: `DELETE`
- **Success Response**: `200 OK`

## 🧪 Testing

Run the test suite with:

```bash
mvn test
```

## 📝 Project Structure

```
src/main/java/net/bankingrestapi/banking/
├── BankingApplication.java        # Main application class
├── controller/                   # REST controllers
│   └── AccountController.java    # Account related endpoints
├── dto/                          # Data Transfer Objects
│   └── AccountDto.java           # Account DTO
├── entity/                       # JPA entities
│   └── Account.java              # Account entity
├── mapper/                       # Mappers for DTO conversion
│   └── AccountMapper.java        # Account mapper
├── repository/                   # Data access layer
│   └── AccountRepository.java    # Account repository
└── service/                      # Business logic
    ├── impl/                     
    │   └── AccountServiceImpl.java  # Account service implementation
    └── AccountService.java       # Account service interface
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


## 🙏 Acknowledgments

- Built with ❤️ using Spring Boot
