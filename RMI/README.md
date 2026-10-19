Java RMI Experiment
📌 Title
Implementation of Remote Method Invocation (RMI) using Java.
🎯 Aim
To develop a simple Java RMI application in which a client invokes a method of a remote object to perform addition of two numbers.
🛠️ Software Requirements
Java Development Kit (JDK)
Java programming language
Command Prompt / Terminal
Text editor or IDE
📖 Introduction
Remote Method Invocation (RMI) is a Java technology that allows an object running in one Java Virtual Machine (JVM) to invoke methods on an object running in another JVM. It enables communication between client and server programs.
📂 Project Files
MyInterface.java — Defines the remote interface and declares the add() method.
MyRemote.java — Implements the remote method to add two numbers.
Server.java — Creates and registers the remote object.
Client.java — Looks up the remote object, invokes the method, and displays the result.
⚙️ How to Execute
Step 1: Compile the Java files
javac *.java

Step 2: Start the RMI Registry
rmiregistry

Step 3: Start the Server
 Open another terminal in the same folder.
java Server

Expected server output:
Server is ready...

Step 4: Run the Client
 Open another terminal in the same folder.
java Client

💻 Expected Output
Result = 30

🔄 Working
The server creates a remote object.
The server registers the object with the RMI Registry under the name Add.
The client searches for the remote object using Naming.lookup().
The client invokes add(10, 20).
The server calculates the sum and returns 30.
The client displays the result.
✅ Result
The Java RMI experiment demonstrates remote method invocation using a client-server application to perform addition of two numbers.
