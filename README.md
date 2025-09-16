# CRUD-application
# Car Management System

A simple Java console application for managing car dealership inventory and operations.

## Features

- **Add Cars**: Add new cars to the dealership inventory
- **View Cars**: Display all cars with their details
- **Update Cars**: Modify existing car information
- **Remove Cars**: Delete cars from the inventory
- **Search Cars**: Find cars by brand or model name
- **Statistics**: View total car count in inventory

## How to Run

1. Make sure you have Java installed on your system
2. Download the `Main.java` file
3. Open terminal/command prompt
4. Navigate to the file location
5. Compile the program:
   ```
   javac Main.java
   ```
6. Run the program:
   ```
   java Main
   ```

## Usage

The program starts with a menu-driven interface:

```
--- Car Management Menu ---
1. Add New Car
2. View All Cars
3. Update Car
4. Delete Car
5. Search Car
6. Exit
```

Simply enter the number corresponding to your desired operation and follow the prompts.

## Sample Data

The program comes with some sample cars:
- Toyota Camry 2020 - $25,000
- Honda Civic 2021 - $22,000
- Ford Focus 2019 - $18,000

## Car Information

Each car in the system contains:
- **ID**: Unique identifier for each car
- **Brand**: Car manufacturer (e.g., Toyota, Honda, Ford)
- **Model**: Specific car model (e.g., Camry, Civic, Focus)
- **Year**: Manufacturing year
- **Price**: Car price in USD

## Technologies Used

- **Java**: Core programming language
- **ArrayList**: For storing car data in memory
- **Scanner**: For handling user input
- **Object-Oriented Programming**: Car class with proper encapsulation

## Project Structure

- `Car` class: Represents individual cars with properties like ID, brand, model, year, and price
- `Main` class: Main class containing all CRUD operations and user interface logic

## Operations Details

### Add New Car
- Prompts user for brand, model, year, and price
- Automatically assigns unique ID
- Adds car to inventory

### View All Cars
- Displays all cars in a formatted list
- Shows total count of cars
- Handles empty inventory gracefully

### Update Car
- Allows modification of existing car details
- Shows current values before updating
- Supports partial updates (leave blank to keep current value)

### Delete Car
- Finds car by ID
- Shows car details before deletion
- Requires confirmation before removing

### Search Cars
- Search by brand or model name
- Case-insensitive search
- Displays all matching results

## Future Enhancements

- File-based data storage for persistence
- More search filters (by year, price range)
- Car condition tracking
- Sales record management
- Customer information system
- GUI interface using Swing or JavaFX

## Error Handling

- Input validation for numeric values
- Handles invalid menu choices
- Checks for empty inventory operations
- Confirms destructive operations (delete)

## Learning Objectives

This project demonstrates:
- Basic Java programming concepts
- Object-Oriented Programming principles
- ArrayList manipulation
- User input handling
- Menu-driven application design
- Search algorithm implementation
- Data validation techniques
