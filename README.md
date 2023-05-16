# Spring Boot Contact Management Project

This project is a Spring Boot application that provides contact management functionality. It allows you to create and retrieve contacts with their full name, date of birth, and address information. The application utilizes an in-memory database(H2) for persistence and supports filtering contacts by zip code.

## Requirements

To run this application, ensure that you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 17 
- Maven build tool

## Getting Started

Follow the steps below to set up and run the Spring Boot application:

1. Clone the repository to your local machine:

   ```shell
   git clone https://github.com/imhotkp/Fetchzie.git
   ```

2. Navigate to the project directory:

   ```shell
   cd contact-manager
   ```

3. Build the application using Maven:

   ```shell
   mvn clean package
   ```

4. Once the application is running, you can access it at `http://localhost:8080`.

## Endpoints

The following endpoints are available in the application:

- **GET /contacts**: Retrieves all existing contacts.
- **GET /contacts/{zip}**: Retrieves contacts filtered by the specified zip code.
- **POST /contacts**: Creates a new contact with the provided information.

## Contact Structure

Each contact consists of the following attributes:

- `contactId` (automatically generated unique identifier)
- `name` (full name of the contact)
- `dateOfBirth` (date of birth of the contact)
- `address` (sub-entity containing address information)

The address sub-entity has the following attributes:

- `city` (city of the address)
- `postalCode` (postal code of the address)

## Logging

The application performs logging every time a contact is created. You can find the log messages in the console output or the application log file.

## Database

This application uses an in-memory database, which is automatically started along with the application. The database stores the contact information and generates unique identifiers for each contact.

## Contributing

Contributions to this project are welcome. If you encounter any issues or have suggestions for improvements, please open an issue on the [GitHub repository](https://github.com/imhotkp/Fetchzie/issues).

\
