# Food-delivery-platform-API
Food Delivery Product API is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.


## Dataflow


* Entities : I have 5 enties namely Admin , User , Viewer , FoodItem and Order. All have mappings according to relations.

* Controller : I have to five controllers for each entity to make endpoint according to entities basically crud operations.

* Service : The Services layer contains business logic and application-specific operations. It acts as an intermediary between the Controller and the Repository, encapsulating complex functionalities. So I have four service classes for User Controller , Food Item Controller , Order Controller and for authentication where I have all my logic.

* Repository : The Repository layer is responsible for data access and manipulation. It communicates with the database and performs CRUD (Create, Read, Update, Delete) operations. So I have repositories for each service class. Repositories extending JPA Repositry which allowing us to do crud operations , also allow us to create custom finders and custom queries.

* DataBase Design :  I have used MYSQL as my RDBMS. The database designed for this project has tables for each model. The table has columns according to the properties of models. I have used my sql connector dependency in pom for connections to my sql and in applications.properties I have all details about database authentication and name of data base and also about Driver class etc.

## Data Structure

I have used MYSQL as an database to store my data in persistant way.

## Project Summary

Basically this is applications is for ordering foods via application with signIn/signUp functionalities for user and Admin. Without account user can't do anything.User needs to sign up and then sign in to use application. Admin can use all functionalities.
