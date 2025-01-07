
# Conference Management Service

RESTful web service for IT conference management and customer service created with Spring Boot 3, H2 in-memory database and Hibernate. API documentation is generated using Swagger.



### Conference Assumptions
1. The conference lasts for one day: January 10, 2025.
2. It starts at 10:00 AM and ends at 3:45 PM.
3. Each presentation lasts 1 hour and 45 minutes, including a 15-minute coffee break:
   - The first presentation starts at 10:00 AM and ends at 11:45 AM.
   - The second presentation starts at 12:00 PM and ends at 1:45 PM.
   - The third presentation starts at 2:00 PM and ends at 3:45 PM.
4. The conference offers three different thematic tracks running in parallel. If a user registers for a specific track at a given time, they cannot attend a presentation in a different track during the same time slot. However, they can choose a different track at a different time.
5. Each presentation can accommodate a maximum of 5 attendees.



### Requirements
The portal should support the following scenarios:
1. The user can view the conference schedule.
2. After providing their login, the user can view the presentations they have registered for.
3. If a presentation still has available seats, the user can make a reservation. While making a reservation, the user should provide their login and email address.
4. If there is already a user in the system with the provided login but a different email address, the system should display the message: "The provided login is already taken."
5. A successful reservation should result in sending a notification to the user at the provided email address (Notification Service is available).
6. The user can cancel a reservation.
7. The user can update their email address.
8. The system allows displaying a list of registered users along with their email addresses.
9. Generating a report for the organizer:
   - A report of lectures by interest (percentage participation of attendees in a given lecture)
   - A report of thematic tracks by interest (percentage participation)



### TDD task
Your task is to implement two functionalities: **lecture registration** and **user update**, as well as write tests for these functionalities 
(using either a TDD or non-TDD approach depending on the group you belong to). 
The functionalities to be implemented are located in the User Service: 

```../qmese-tdd/src/main/java/conference/management/service/UserService.java```.



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

