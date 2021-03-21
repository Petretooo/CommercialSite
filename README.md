# CommercialSite

# Introduction

This is a full-stack site build with Java and Spring Framework.
This is a commercial site that will allow users to buy items
like bags, shoes, coats and etc.
In the future, I'm going to expand the site with more products.
The site will allow users to make registration and login to buy items.
The site is not finished yet, because I'm still learning some technologies.

I'm building this site on Eclipse IDE with Java, Maven, and Spring Framework.
I use the MySQL database and implemented Version control for the database with Flyway migrations.
For connection with the database, I use JDBC, and managing the data basically with Spring Data JPA,
but I also use ORM technologies like Hibernate.

I'm using N-tier architecture for package structure. The realization of MVC architecture is created with
Spring controllers and for the view part I'm decided to use Servlets/JSP because I think
every Java true web developer should go through these archaic technologies.
I'm planning to use React for the frontend part.

# Used technologies

Java 11, Spring Boot, Spring Core, Spring Data, Spring MVC, Spring Web Hibernate, JPA, Flyway

JDBC, MySQL, Maven, JSP, JSTL, Taglibs, HTML, CSS, XML, Tomcat 9.0.43, Bootstrap, JSON, Lombok

# Very near future

1. Testing

It's very important to test the code we write, so the next step after I finish
the backend is to test the code I wrote.

Testing: Junit(Unit tests), Selenium(Functional and Integration tests), Mockito, AssertJ, Harmcrest, Rest assured(for REST API)

2. Frontend

I have restful controllers that going to expose the information on the frontend part
that I'm going to build next few days. I will make the connection between the backend and frontend
with the frontend-maven-plugin. I'm going to use ReactJS for the frontend.

Frontend: JavaScript, ReactJS, NodeJS, WebPack, npm, JEST(testing)

3. Security

I should protect my application, so I will decide between Spring Security and Apache Shiro.
Maybe I'm going to use Apache Shiro.

Security: Apache Shiro

# Architecture

MVC, N-tier

Future: RESTful architecture

# Setup Application

1.  Clone the repository to your machine: https://github.com/simonka0808/CommercialSite

2.  Import application like Maven project

3.  Open the /src/main/resources/application.properties and configure the JDBC driver which will connect the application to your MySQL database.
    You should change the value attributes of those two xml tags.

        spring.datasource.username=user
        spring.datasource.password=pass

4.  Make Maven force update

5.  Import Tomcat server in Eclipse. For the the development is used standalone Tomcat server with 9.0.43 version.

6.  Add the project to the server

7.  Run the application from the server

# Access the application

Backend server's port: 8080
Frontend server's port: 3000

Access the deployed web application at: http://localhost:8080/commercialSite

# Photos

...
