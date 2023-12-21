# springboot3fundamentals
java run in through terminal 

W:\BenchWork\SpringBootLearning\tickets\tickets> ./mvnw spring-boot:run


to run web api in java - intellij configuration

    Open the "Run/Debug Configurations" Dialog:
        Click on the dropdown menu next to the run configuration in the top-right corner of the IntelliJ IDEA window.
        Select "Edit Configurations."

    Create a New Maven Configuration:
        Click on the "+" icon to create a new configuration.
        Choose "Maven" from the list of configurations.

    Configure the Maven Run Configuration:
        Name: Enter a name for your configuration (e.g., "Spring Boot").
        Command line: Enter spring-boot:run in the "Command line" field.

    Apply and Run:
        Click "Apply" and then "OK" to close the dialog.
        Now, you should see your new Maven configuration in the dropdown menu next to the run configuration.
        Select it and click the green "Run" button to run your Spring Boot application.


Mango db commands 

1. First run the mongo db in docker : docker compose up -d
2. once run the projects create registration post 
eg: http://localhost:8080/registrations
   {"productId": 801, "attendeeName": "Test RK Manngo db"}
3. run this mongo db commands in terminal : docker exec -it tickets-mongo-1 mongosh
4. to see the created collection use this command in terminal: show collections
6. to view the data use this command : db.registrations.find()
   
