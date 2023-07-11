# Hotel Management Project using H2-database
> `Hotel Management  using Springboot Annotations in the H2 database. This repository contains a sample project that demonstrates the Model-View-Controller (MVC) architecture using Spring Data JPA, Lombok, H2 Database, and Spring Web.This project is a Hotel Management system that allows you to perform various operations related to managing hotel rooms. It provides methods to retrieve all available rooms, retrieve all rooms, retrieve a room by its ID, create new rooms, update existing rooms, and delete rooms.`
---
### Dependencies:
To run this project, you need to have the following dependencies installed:

* **Spring Web:** Spring Web is a framework for building web applications using Spring. It provides support for handling HTTP requests, mapping URLs to controllers, and rendering views.
* **Spring Data JPA:** This library provides a framework for interacting with databases using Java Persistence API (JPA) standards.
* **Lombok:** Lombok is a Java library that helps reduce boilerplate code by providing annotations for generating getters, setters, constructors, and more.
* **H2 Database:** H2 is an in-memory database that can be used during development and testing. It provides a lightweight and fast database solution.
---
### Configuration
No additional configuration is required for this project as it uses default settings for Spring Data JPA, Lombok, H2 Database, and Spring Web. However, you can customize the configurations as per the specific requirements.

---
### Usage
This project serves as a basic template for building web applications using the MVC architecture with Spring Data JPA, Lombok, H2 Database, and Spring Web. You can modify and extend the code to suit the application's needs.

Some key files and directories to focus on:

* **src/main/java/com/geekster/HotelManagementH2db/controller/:** Contains controller classes that handle HTTP requests and define API endpoints.
* **src/main/java/com/geekster/HotelManagementH2db/model/:** Defines the model classes (entities) for the application.
* **src/main/java/com/geekster/HotelManagementH2db/repository/:** Provides interfaces for accessing and manipulating data.
* **src/main/java/com/geekster/HotelManagementH2db/service/:** Implements the business logic and interacts with repositories.
* **src/main/java/com/geekster/HotelManagementH2db/HotelManagementH2dbApplication.java:** The entry point of the application.
  
Feel free to explore and modify these files to build your own application.

---
### Conclusion
This project showcases the implementation of the MVC architecture using Spring Data JPA, Lombok, H2 Database, and Spring Web. It provides a solid foundation for developing web applications with a clear separation of concerns and improved code maintainability.
