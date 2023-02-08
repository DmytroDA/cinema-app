
<img width="347" alt="picLogo" src="https://user-images.githubusercontent.com/99273831/217341593-407fe050-4052-4b07-bdd0-5cbacce232e2.png">




# CineTix service

CineTix web service provides a convenient and cost-effective way for customers to purchase tickets to the cinema.
This is simple simulator of cinema service for reservation tickets, that supports registration, authentication and CRUD operations.
Customers can easily browse through available showtimes and select the movie they want to watch.
___

<img width="64" alt="features" src="https://user-images.githubusercontent.com/99273831/217265487-fcffb8bf-b193-4083-a430-a6081b234713.png"> 

## Features:

* register or login as user
* create and find movies
* create and find available movie sessions
* creating shopping cart
* add tickets to shopping cart
* complete an order
---

<img width="67" alt="architecture" src="https://user-images.githubusercontent.com/99273831/217269127-500dda9a-9d6e-472f-8d50-1c61ccbcf7fd.png">

## Project architecture:
The Cinema-Service is based on 3-layer architecture:
1. Controllers, which handle requests, call services and send responses!
2. Services - there are all business logic
3. DAO, which handle CRUD operations to database

### Model structure
![Hibernate_Cinema_Uml](https://user-images.githubusercontent.com/99273831/217271967-c47b5ec6-3009-4c1c-8ac3-575c4db8b6d0.png)

---

<img width="64" alt="tech" src="https://user-images.githubusercontent.com/99273831/217344566-5dccc4fd-ba67-401b-82d7-482646d30108.png">

## Technologies used in project:

* Java 11
* Git
* Apache Maven
* Apache Tomcat
* Checkstyle plugin
* Hibernate
* MySql
* Spring

## 
## ⚙️ Steps to run the program on your computer:
* Clone the repo: [https://github.com/DmytroDA/cinema-app/);
* Install MySQL;
* Configure Apache Tomcat version: 9.0.xx;
* Configure [/src/main/java/resources/db.properties](/src/main/java/resources/db.properties) with your DB-DRIVER, DB-URL, USERNAME, PASSWORD;
* Done. Now just try to use it.
