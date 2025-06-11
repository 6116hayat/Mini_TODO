# Mini-TODO App

A simple in memory To-Do application built using Spring-Boot and Java (no Database involved).
This app allow users to Add, Delete, Retrieve and Update tasks

## Features
-> ✅ Add new tasks
-> 📋 Retrieve all tasks
-> ✏️ Update task and completion status
-> ❌ Delete tasks
-> 🔧 Built using Spring-Boot and Lombok

### Installation and Setup

--- Prerequisites ---
-> Java 8 or later
-> Maven (Dependency)
-> IntelliJ Idea (Code Editor)
-> Postman (for test API)

--- Steps to run ---
1. Clone the repository

-- 2 ways of running the program --
Method 1: Running with Lombok(Terminal)
    Use Lombok (@Data annotation) for reducing boilerplate code of Getter-&-Setter, run the whole program using terminal. (mvn clean install) followed by (mvn spring-boot run)

    Why it works: Lombok automatically generates getter and setter method at compile time, but your IDE might not always recognize them properly

    Solution: Since annotations processing isn't always enabled in IntelliJ, running the project from the terminal ensures Maven correctly processes Lombok annotations

Method 2: Running with Explicit Getter/Setter(Run Button)
    Provide Explicitly the Getter-Setter methods in the To-do class for no errors

    Why it works: When you manually define getter-setter methods, the IDE recognizes them without needing additional annotation processing

--> Best Approach
    ⁜ If Lombok works correctly, using it reduces boilerplate Code
    ⁜ If your IDE struggles with Lombok manually adding getter-setter ensures smooth execution

### API Endpoints:
» GET : /todos -> Retrieve all tasks
» POST : /todos -> Add a new task
» DELETE : /todos{id} -> Delete a task
» GET : /todos/{id}?completed=true -> Update completion status

### Technologies Used
    -> 🚀 Spring Boot
    -> ⚙️ Java
    -> 💡 Lombok
    -> 🔄 REST APIs
    -> 📝 Postman for testing

### License
This project is open-source and free to use



