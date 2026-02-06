# JobPortal Backend

A robust and scalable backend application for a job portal platform built with Java. This service provides comprehensive APIs for job listings, user management, applications, and related job portal functionalities.

## Overview

JobPortal Backend is a modern backend service designed to power a complete job portal application. It handles user authentication, job postings, job applications, employer profiles, and various job-related features with high performance and security.

## Features

- **User Management**: Registration, authentication, and profile management for job seekers and employers
- **Job Listings**: Create, read, update, and delete job postings
- **Job Applications**: Submit and track job applications
- **Search & Filtering**: Advanced search capabilities for jobs with multiple filters
- **User Profiles**: Manage user profiles, resume uploads, and portfolio information
- **Employer Dashboard**: Tools for employers to manage job postings and view applications
- **Security**: Secure authentication and authorization mechanisms
- **RESTful API**: Clean and well-documented REST API endpoints

## Technology Stack

- **Language**: Java
- **Framework**: Spring Boot (recommended)
- **Database**: [Configure as needed - e.g., MySQL, PostgreSQL]
- **Build Tool**: Maven/Gradle
- **Authentication**: JWT/OAuth2 (or as implemented)
- **API Documentation**: Swagger/OpenAPI

## Prerequisites

Before you begin, ensure you have the following installed:

- Java 11 or higher
- Maven 3.6+ or Gradle 6.0+
- MySQL/PostgreSQL or your database of choice
- Git

## Installation & Setup

1. **Clone the repository**  
   ```bash
   git clone https://github.com/mahendharjillala/JobPortal_Backend.git
   cd JobPortal_Backend
   ```

2. **Configure the database**  
   - Update `application.properties` or `application.yml` with your database credentials  
   - Create the required database schema

3. **Build the project**  
   ```bash
   # Using Maven
   mvn clean install
   
   # Using Gradle
   gradle clean build
   ```

4. **Run the application**  
   ```bash
   # Using Maven
   mvn spring-boot:run
   
   # Using Gradle
   gradle bootRun
   ```

5. **Access the application**  
   - The API will be available at `http://localhost:8080` (default port)  
   - API documentation: `http://localhost:8080/swagger-ui.html`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/jobportal/
│   │       ├── controller/      # REST API controllers
│   │       ├── service/         # Business logic
│   │       ├── repository/      # Data access layer
│   │       ├── model/           # Entity classes
│   │       ├── dto/             # Data transfer objects
│   │       ├── exception/       # Custom exceptions
│   │       ├── config/          # Configuration classes
│   │       └── JobPortalApplication.java
│   └── resources/
│       ├── application.properties
│       └── db/migration/        # Database migration scripts
└── test/                        # Unit and integration tests
```

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - User login
- `POST /api/auth/logout` - User logout

### Jobs
- `GET /api/jobs` - Get all jobs
- `GET /api/jobs/{id}` - Get job by ID
- `POST /api/jobs` - Create a new job (employer only)
- `PUT /api/jobs/{id}` - Update job (employer only)
- `DELETE /api/jobs/{id}` - Delete job (employer only)

### Applications
- `POST /api/applications` - Submit job application
- `GET /api/applications` - Get user applications
- `GET /api/applications/{id}` - Get application details

### Users
- `GET /api/users/profile` - Get user profile
- `PUT /api/users/profile` - Update user profile

## Configuration

Key configuration properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jobportal
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

## Testing

Run tests with the following commands:

```bash
# Using Maven
mvn test

# Using Gradle
gradle test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For support, please open an issue on the GitHub repository or contact the maintainers.

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a list of changes in each release.

---

**Last Updated**: 2026-02-06