# Employee Management RESTful Application

## Description
This is a Spring Boot based RESTful application that performs complete CRUD
(Create, Read, Update, Delete) operations on Employee data using MongoDB.

## Technologies Used
- Spring Boot
- Spring MVC
- Spring Data MongoDB
- MongoDB
- HTML

## Features
- Create Employee
- Display All Employees
- Display Employee by ID
- Update Employee Details
- Delete Employee

## REST API Endpoints

| Operation | Method | URL |
|--------|--------|-----|
| Create Employee | POST | /employees |
| Display All | GET | /employees/displayAll |
| Display by ID | GET | /employees/display/{employeeId} |
| Update Employee | PUT | /employees/update/{employeeId} |
| Delete Employee | DELETE | /employees/delete/{employeeId} |

## How to Run the Project
1. Start MongoDB on localhost:27017
2. Open the project in IntelliJ
3. Run the main Spring Boot application
4. Access the application at http://localhost:8080

## Testing
All REST APIs are tested using Postman.

## Author
Akhilesh Srivastav
