# Java Calculator Using MVC Architecture

A simple desktop calculator developed using Java Swing and the Model-View-Controller (MVC) design pattern. It performs basic arithmetic operations through a graphical user interface.

## Features

- Addition, subtraction, multiplication, and division.
- Support for decimal numbers.
- Clear button to reset the display.
- Exit button to close the application.
- Error handling for division by zero.
- Graphical user interface using Java Swing.
- MVC architecture for organized and maintainable code.

## Technologies Used

- Java
- Java Swing
- AWT Event Handling
- Model-View-Controller (MVC) Architecture

## Project Structure

```text
Calculator-Java/
├── Main.java
├── Model.java
├── View.java
├── Controller.java
└── README.md
```

## MVC Architecture

- **Model.java:** Performs arithmetic calculations.
- **View\.java:** Creates the calculator interface, display, and buttons.
- **Controller.java:** Handles button clicks and connects the Model and View.
- **Main.java:** Starts the application and initializes the MVC components.

## Requirements

1. Java Development Kit (JDK 8 or later).
2. Visual Studio Code.
3. Extension Pack for Java installed in VS Code.

Verify that Java is installed by running these commands in the terminal:

```bash
java -version
javac -version
```

## How to Use

1. Click the number buttons to enter a number.
2. Select an arithmetic operator: `+`, `-`, `*`, or `/`.
3. Enter the second number.
4. Press `=` to display the result.
5. Press `C` to clear the calculator.
6. Press `EXIT` to close the application.

## Current Limitations

- The calculator is designed for basic arithmetic operations.
- Chained calculations are limited.
- The interface uses a fixed window size.
- Student or calculation history is not stored.

## Future Improvements

- Improve error recovery and input validation.
- Add percentage and square-root operations.
- Improve the interface design.
- Support keyboard input.
- Add calculation history.

<!-- ## Command To Run in VS Code

```bash
javac Main.java Model.java View.java Controller.java
```

```bash
java Main
``` -->



## License

This project is intended for educational and academic purposes.
