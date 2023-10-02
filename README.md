# Spring Boot Project - CS545WAA

This is a simple Spring Boot project for CS5454 - Web Application Architecture.

## Getting Started

Follow the instructions below to set up and run the project on your local machine.

### Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your system (Java 8 or higher).

### Installation

1. Clone this repository to your local machine using Git:

   ```shell
   git clone https://github.com/kushalshrestha/CS545WAA.git
   
2. Open the project in your preferred IDE.
3. Build and run the application.
4. Access the application in your web browser.

### Project Structure

```agsl
CS545WAA/
|
|-- src/
|   |-- http-requests/
|   |   |- books/
|   |   
|   |-- main/
|   |   ├-- java/
|   |   |   ├-- com/
|   |   |   |    |-- kushal.cs545waa/
|   |   |   |       ├-- controller/           # RESTful API controllers
|   |   |   |       ├-- model/               # Entity classes
|   |   |   |       └-- Cs545WaaApplication.java       # Main Spring Boot application class
|   |   |   |
|   |   ├-- resources/
|   |   |   ├-- static/                        
|   |   |   ├-- templates/                     
|   |   |   ├-- application.properties         # Application configuration
|   |   |
|   ├-- test/
|       |-- java/
|           └-- com/
|               └-- kushal.cs545waa/
|                   ├-- controllers/           # Test classes for controllers
|                   └-- Cs545WaaApplicationTests.java  # Main application test class
|
├-- .gitignore                                # Git ignore file
├-- mvnw                                      # Maven wrapper script (for Unix-based systems)
├-- mvnw.cmd                                  # Maven wrapper script (for Windows)
├-- pom.xml                                   # Maven project configuration
└-- README.md                                 # Project documentation


```

- `src/main/java`: Contains the Java source code of this application.
   - `com.example.cs545waa`: A package for your application's classes.
     - `controller`: Controllers for handling HTTP requests and responses.
     - `model`: Model classes for your data entities.
     - `Cs545WaaApplication.java`: The main class with the `main` method to run the Spring Boot application.

- `src/main/resources`: Contains application configuration files (e.g., `application.properties`) and static resources.

- `src/http-requests` : Collection of RESTful web service HTTP Requests

- `src/test`: Contains test source code and resources for unit and integration testing.

- `target`: Contains compiled class files and build artifacts (generated when you build the project).

- `.gitignore`: A file specifying which files and directories should be ignored by version control (Git in this case).

- `pom.xml`: The project's Maven configuration file.


### Dependencies
This project relies on following dependencies

- Spring Boot
- Lombok

### Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request if you have any improvements or suggestions.