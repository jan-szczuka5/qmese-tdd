
# Conference Management Service

RESTful web service for IT conference management and customer service created with Spring Boot 3, H2 in-memory database and Hibernate. API documentation is generated using Swagger.



### Instructions

Project should be built and run using Java 8 or above.

1. Open the `application.properties` file and set your own configurations for the database connection.

2. Build with Maven ```mvn clean install```

3. Change directory to ```../qmese-tdd/target/```

4. Execute in the terminal ```java -jar conference-management-1.0.jar ```

Alternatively run ```mvn spring-boot:run``` from command line or IDE or execute *conference.management.ConferenceManagementApplication.main()* from within IDE.

Once the service is up and running the documentation of the REST API can be accessed at:

* API documentation WEB UI [http://localhost:8080/api/swagger-ui.html](http://localhost:8080/api/swagger-ui.html)



### Initial database content
At the time of service launch, the database contains 9 lectures and 6 users. There are 5 users registered for one of the lectures with ID 8. The database also contains a junction table representing many-to-many relationships between users and lectures.

