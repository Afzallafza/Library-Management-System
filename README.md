# Library Inventory Management System

This project implements a basic Library Inventory Management System. It allows users to add, remove, search, and display books in the library, using object-oriented programming concepts, design patterns, and exception handling.

## Functional Requirements

### 1. Add a Book
- **Description**: Allows users to add a new book to the library inventory.
- **Input**:
  - Book ID (unique identifier, integer)
  - Title (string)
  - Author (string)
  - Publication Year (integer)
  - Genre (string)
- **Output**: Confirmation message with the book details.
- **Covered Topics**:
  - **OOP**: Class and object creation for `Book`.
  - **Collections**: Store books in a `List`.
  - **Generics**: Ensure type safety in the `List`.

### 2. Remove a Book
- **Description**: Allows users to remove a book by its ID or Title.
- **Input**:
  - Book ID (integer) or Title (string)
- **Output**:
  - If found: Confirmation message with removed book details.
  - If not found: Error message.
- **Covered Topics**:
  - **Collections**: Use `List` and its operations to find and remove the book.
  - **Exception Handling**: Throw and handle exceptions for invalid or missing input.

### 3. Search for a Book
- **Description**: Allows users to search for a book by one or more criteria.
- **Search Criteria**:
  - Title (string, partial matches allowed)
  - Author (string, exact match)
  - Publication Year (integer, optional filter)
- **Output**: Display a list of books matching the criteria or an error message if none found.
- **Covered Topics**:
  - **Streams**: Use filtering, mapping, and sorting operations.
  - **Collections**: Search operations within a `List`.

### 4. Display All Books
- **Description**: Display all books in the inventory with their details.
- **Output**: A table or formatted list of books showing:
  - Book ID, Title, Author, Publication Year, Genre.
- **Covered Topics**:
  - **Collections**: Iterating through the `List`.
  - **Streams**: Sorting books by Title or Publication Year before displaying.

### 5. Exception Handling
- **Scenarios to Handle**:
  - Adding a book with duplicate ID.
  - Removing a book that doesn't exist.
  - Searching with invalid criteria (e.g., invalid publication year input).
- **Covered Topics**:
  - Create and use custom exceptions like `BookNotFoundException` or `DuplicateBookException`.
  - Use try, catch, and finally blocks.

### 6. Singleton Design Pattern
- **Description**: Ensure that the library inventory management system has only one instance to manage data throughout the application lifecycle.
- **Implementation**:
  - Use the Singleton pattern for the `Library` class.
- **Covered Topics**:
  - **Design Patterns**: Singleton.

### 7. Factory Design Pattern
- **Description**: Use a factory pattern to create `Book` objects dynamically based on user input.
- **Implementation**:
  - Create a `BookFactory` class to handle book creation.
- **Covered Topics**:
  - **Design Patterns**: Factory.

### 8. Exit the Program
- **Description**: Provide an option to safely exit the program.
- **Implementation**:
  - Ensure any unsaved changes are logged or displayed (optional).
- **Covered Topics**:
  - Basic syntax and control structures (if, while).

## Requirements

- **Java**: Version 8 or higher
- **IDE**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse)

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/library-inventory.git
