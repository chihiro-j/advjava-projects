🧮 Calculator using Java Swing (MVC Architecture)
📌 Title
Design and Develop a Calculator using Java Swing following MVC Architecture

🎯 Aim
To design a GUI‑based calculator using Java Swing that performs basic arithmetic operations using the MVC (Model‑View‑Controller) architecture.

🛠️ Objectives
Understand MVC Architecture.

Learn separation of Model, View, Controller.

Practice Swing Components.

Handle button click events.

Perform arithmetic operations.

📖 Theory
🔹 What is MVC?
MVC stands for:

Model → Business logic (Addition, Subtraction, Multiplication, Division).

View → GUI only (JFrame, JLabel, JTextField, JButton).

Controller → Bridge between View and Model (reads data, calls Model, updates View).

🔹 MVC Diagram
Code
+------------+        +-------------+        +-------------+
|   View     | -----> | Controller  | -----> |   Model     |
| Swing GUI  |        | ActionListener |     | Calculations|
+------------+        +-------------+        +-------------+
🧩 Components Used
JFrame

JLabel

JTextField

JButton

JPanel

ActionListener

📑 Algorithm
Create Model class.

Create View class.

Create Controller class.

Enter two numbers.

Click any operation button.

Controller sends values to Model.

Model performs calculation.

Result is displayed in View.

📂 Project Structure
Code
Calculator-using-Java-Swing/
│── Model.java        # Business logic
│── View.java         # GUI design
│── Controller.java   # Event handling
│── README.md         # Documentation
💻 Program Files
Model.java
java
public class CalculatorModel {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) {
        if (b == 0) return 0;
        return a / b;
    }
}
View.java
java
import javax.swing.*;
public class CalculatorView extends JFrame {
    JTextField txtNum1, txtNum2, txtResult;
    JButton btnAdd, btnSub, btnMul, btnDiv;

    public CalculatorView() {
        setTitle("MVC Calculator");
        setSize(400,300);
        setLayout(null);

        JLabel l1=new JLabel("First Number");
        l1.setBounds(30,30,100,25); add(l1);
        txtNum1=new JTextField();
        txtNum1.setBounds(150,30,150,25); add(txtNum1);

        JLabel l2=new JLabel("Second Number");
        l2.setBounds(30,70,100,25); add(l2);
        txtNum2=new JTextField();
        txtNum2.setBounds(150,70,150,25); add(txtNum2);

        btnAdd=new JButton("+"); btnAdd.setBounds(30,120,60,30); add(btnAdd);
        btnSub=new JButton("-"); btnSub.setBounds(100,120,60,30); add(btnSub);
        btnMul=new JButton("*"); btnMul.setBounds(170,120,60,30); add(btnMul);
        btnDiv=new JButton("/"); btnDiv.setBounds(240,120,60,30); add(btnDiv);

        JLabel l3=new JLabel("Result");
        l3.setBounds(30,180,100,25); add(l3);
        txtResult=new JTextField();
        txtResult.setBounds(150,180,150,25);
        txtResult.setEditable(false); add(txtResult);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
Controller.java
java
import java.awt.event.*;

public class CalculatorController implements ActionListener {
    CalculatorView view;
    CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        view.btnAdd.addActionListener(this);
        view.btnSub.addActionListener(this);
        view.btnMul.addActionListener(this);
        view.btnDiv.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(view.txtNum1.getText());
        double num2 = Double.parseDouble(view.txtNum2.getText());
        double result = 0;

        if(e.getSource() == view.btnAdd) result = model.add(num1, num2);
        else if(e.getSource() == view.btnSub) result = model.subtract(num1, num2);
        else if(e.getSource() == view.btnMul) result = model.multiply(num1, num2);
        else if(e.getSource() == view.btnDiv) result = model.divide(num1, num2);

        view.txtResult.setText(String.valueOf(result));
    }
}
🚀 How to Upload to GitHub
Go to your repository (Calculator-using-Java-Swing).

Click Upload files.

Drag & drop your project folder.

Add a commit message:

Code
Initial commit: Added MVC Calculator project
Click Commit changes.

📌 Learning Outcomes
Clear understanding of MVC architecture.

Practical use of Java Swing components.

Event handling with ActionListener.

Separation of concerns in software design.
