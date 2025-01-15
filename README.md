# Employee Management System API

A robust Employee Management System built using Java, Spring Boot, and PostgreSQL, designed to manage employees, provide secure access with JWT authentication, and showcase modern application development practices.

---

## **Features**
- **Employee Management**: Create, update, view, and delete employees.
- **JWT Authentication**: Secure endpoints using JSON Web Tokens.
- **Role-Based Access Control**: Roles such as Admin, Manager, and Employee with restricted access to APIs.
- **Validation**: Enforce data integrity with Bean Validation.
- **Advanced Database Features**:
  - Pagination and Sorting for employee data.
  - Soft delete functionality for employees.
  - Audit fields (`created_at`, `updated_at`, `deleted_at`).

---

## **Tech Stack**
- **Backend**: Java 20, Spring Boot
- **Database**: PostgreSQL 17, H2 (testing)
- **Security**: Spring Security with JWT
- **Tools**: Maven, Docker, pgAdmin, IntelliJ IDEA

---

## **Setup Instructions**
1. Clone the repository:
   ```
   git clone https://github.com/<your-username>/employee-management-system.git
   cd employee-management-system
2. Build the project:

```
mvn clean install
```
3. Run the application:


```
mvn spring-boot:run
```
4. Access the application:

```
Base URL: http://localhost:8080
```


## **API Specifications**
Authentication
Method	Endpoint	Description	Request Body	Response
POST	/api/auth/login	Authenticate and get JWT	{"username": "admin", "password": "password"}	{ "token": "<jwt>" }
Employees
Method	Endpoint	Description	Request Body	Response
POST	/api/employees	Add a new employee	{"name": "John Doe", "email": "john.doe@example.com", "position": "Developer", "salary": 75000}	201 Created
GET	/api/employees	Get all employees	-	List of employees
GET	/api/employees/{id}	Get employee by ID	-	Employee details
PUT	/api/employees/{id}	Update employee	{"name": "Jane Doe", "email": "jane.doe@example.com", "position": "Manager", "salary": 90000}	200 OK
DELETE	/api/employees/{id}	Soft delete employee	-	204 No Content


## **Known Issues**
None at the moment. Please report issues via GitHub.
## **Future Enhancements**
Add advanced search functionality (e.g., search by position or salary range).
Implement notification services for employee updates.
Expand API with department and project management modules.
## **License**
This project is licensed under the MIT License.
