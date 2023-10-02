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

### Dependencies
This project relies on following dependencies

- Spring Boot
- Lombok

### Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request if you have any improvements or suggestions.