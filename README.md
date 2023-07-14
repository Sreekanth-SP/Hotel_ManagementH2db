# Hotel Management Project using H2-database
> Hotel Management  using Springboot Annotations in the H2 database. This repository contains a sample project that demonstrates the Model-View-Controller (MVC) architecture using Spring Data JPA, Lombok, H2 Database, and Spring Web.

> This project allows us to perform various operations related to managing hotel rooms. It provides methods to retrieve all available rooms, retrieve all rooms, retrieve a room by its ID, create new rooms, update existing rooms, and delete rooms.
---
### Dependencies:
To run this project, we need to have the following dependencies installed:

* **Spring Web:** Spring Web is a framework for building web applications using Spring. It provides support for handling HTTP requests, mapping URLs to controllers, and rendering views.
* **Spring Data JPA:** This library provides a framework for interacting with databases using Java Persistence API (JPA) standards.
* **Lombok:** Lombok is a Java library that helps reduce boilerplate code by providing annotations for generating getters, setters, constructors, and more.
* **H2 Database:** H2 is an in-memory database that can be used during development and testing. It provides a lightweight and fast database solution.
---
## Project Structure
The project follows the MVC architecture, which separates the application into three main components:

* **Models:** These are the entity models used in the project, representing different aspects of the Hotel Management system.
    * HotelRoom - It has id as the primary key and it autogenerates, room number as unique, room type as enum, room price and room status.
   
* **Controllers:** Controllers handle incoming requests, process the data, and return appropriate responses. They act as intermediaries between the models and views.
    * RoomControllers

* **Service:** In Service, we can implement the business logic.
    * RoomServices
  
* **Repository:** The repositories are extending the JPA repository where the CRUD operations work. The repositories are interfaces.
    * IRoomRepo
---
### Usage
This project is a basic template for building web applications using the MVC architecture with Spring Data JPA, Lombok, H2 Database, and Spring Web. We can modify and extend the code to suit the application's needs.

Some essential files and directories to focus on:

* **src/main/java/com/geekster/HotelManagementH2db/controller/:** Contains controller classes that handle HTTP requests and define API endpoints.
* **src/main/java/com/geekster/HotelManagementH2db/model/:** Defines the model classes (entities) for the application.
* **src/main/java/com/geekster/HotelManagementH2db/repository/:** Provides interfaces for accessing and manipulating data.
* **src/main/java/com/geekster/HotelManagementH2db/service/:** Implements the business logic and interacts with repositories.
* **src/main/java/com/geekster/HotelManagementH2db/HotelManagementH2dbApplication.java:** The entry point of the application.

The project exposes the following endpoints to perform various operations on hotel rooms:

* **POST /rooms:** Create a list of new rooms.
* **POST /room:** Creates a new room.
* **GET /rooms:** Retrieves all rooms in the hotel.
* **GET /room/id/{roomId}:** Retrieves a room by its ID.
* **GET /room/{id}/exists:** Check whether the room by its ID exists.
* **GET/rooms/count:** Retrieves the count of total rooms.
* **GET /rooms/id/lists:** Retrieves a list of rooms by their IDs using @RequestBody to pass the list of room IDs.
* **PUT /room/{id}:** Updates an existing room.
* **DELETE /room/{id}:** Deletes a room. 

### Custom Finders:

* **GET /rooms/status/{roomStatus}:** Retrieves all available rooms in the hotel where the room status is false.
* **GET /rooms/type/{roomType}/status/{roomStatus}:** Fetch all rooms by their type and status.
* **GET /rooms/type/{roomType}/status/{roomStatus}/price/range:** Fetch all rooms by their type and status between the range of prices.And the upper and lower limits of the price range passed by @RequestParam.
* **GET /rooms/type/{roomType}:** Get all rooms by their type and sort decreasing order by price.
* **GET /rooms/types/{roomType1}/{roomType2}:**Fetch all rooms by type and price range or another type.
Feel free to explore and modify these files to build your own application.
---
### Conclusion
This project showcases the implementation of the MVC architecture using Spring Data JPA, Lombok, H2 Database, and Spring Web. It provides a solid foundation for developing web applications with a clear separation of concerns and improved code maintainability.
