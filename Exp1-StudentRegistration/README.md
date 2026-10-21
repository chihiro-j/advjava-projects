# Student Registration Form (Java Swing)

A simple desktop-based Student Registration Form built using Java Swing. This project demonstrates GUI components, event handling, input validation, radio buttons, checkboxes, and dialog boxes.

## Features

- Enter student name, age, roll number, and branch.
- Select a gender using radio buttons.
- Accept the Terms and Conditions using a checkbox.
- Validate required fields and age input.
- Display a registration confirmation dialog after successful validation.
- Reset the form fields using the Reset button.

## Technologies Used

- Java
- Java Swing
- JDK 8 or later (compilation checked with JDK 21)

## Project Structure

```text
Form-Java/
├── StudentRegistration.java
└── README.md
```

## Requirements

1. Install a Java Development Kit (JDK).
2. Install Visual Studio Code.
3. Install the **Extension Pack for Java** in VS Code.

Verify Java is installed by opening a terminal and running:

```bash
java -version
javac -version
```

Both commands should display a version number.

## Run the Project in VS Code

1. Download or clone this repository.
2. Open VS Code.
3. Select **File → Open Folder** and choose the project folder.
4. Open `StudentRegistration.java`.
5. Run the program using the **Run Java** option above `main()`, or use the terminal commands below.

### Run from the terminal

Open the VS Code terminal using **Terminal → New Terminal**. Make sure the terminal is in the folder containing `StudentRegistration.java`, then run:

```bash
javac StudentRegistration.java
java StudentRegistration
```

The first command compiles the source file. The second launches the form.

Run the project on a desktop session that supports graphical applications. A headless environment cannot display the Swing window.

## How to Use

1. Launch the application.
2. Enter the student's name, age, roll number, and branch.
3. Select Male or Female.
4. Tick **Accept Terms and Conditions**.
5. Click **Submit** to validate the fields and display the registration details.
6. Click **Reset** to clear the form.

## Validation

- Name, age, roll number, and branch must not be empty.
- Age must be a number between 0 and 100.
- A gender option must be selected.
- The Terms and Conditions checkbox must be selected.

## Current Limitations

- Student details are displayed in a dialog and are not stored permanently.
- The Terms and Conditions checkbox does not display the terms themselves.
- The form uses fixed positioning, so its layout is not responsive.
- Only Male and Female are available as gender options.

## Future Improvements

- Save student records to a file or database.
- Improve the interface using a layout manager.
- Add more robust validation for names and roll numbers.
- Display the Terms and Conditions before acceptance.

## License

This project is provided for educational and academic use. Add a specific open-source license if you intend to publish it for reuse by others.
