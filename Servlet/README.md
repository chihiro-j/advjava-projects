Java Servlet Practical Project

1. Project Title

Java Servlet Web Application using Jakarta Servlet and Apache Tomcat 11

2. Aim

To study server-side programming using Java Servlets and develop a web application demonstrating HTTP GET and POST requests, Servlet API, Servlet life cycle, ServletConfig, ServletContext, request and response objects, session handling, cookies, listeners, and filters.

3. Technologies Used

- Java JDK 17 or newer
- Jakarta Servlet API 6.1.0
- Apache Tomcat 11
- Maven
- HTML
- Visual Studio Code

4. Project Structure

servlet/
├── pom.xml
├── README.md
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── servlet/
│       │           ├── HelloServlet.java
│       │           ├── StudentServlet.java
│       │           ├── LifeCycleServlet.java
│       │           ├── ConfigServlet.java
│       │           ├── ContextServlet.java
│       │           ├── LoginServlet.java
│       │           ├── HomeServlet.java
│       │           ├── LogoutServlet.java
│       │           ├── AuthFilter.java
│       │           ├── MyFilter.java
│       │           ├── AppListener.java
│       │           └── SessionListener.java
│       └── webapp/
│           ├── index.html
│           ├── student.html
│           ├── hello.html
│           └── WEB-INF/
│               └── web.xml
└── target/
    └── servlet.war

Note: The "target/" folder and WAR file are generated when the project is built. The "web.xml" file is optional when annotations are used.

5. Features

1. Basic Hello Servlet.
2. HTTP GET and POST request handling.
3. Student information form processing.
4. Servlet life cycle demonstration.
5. Servlet-specific configuration using ServletConfig.
6. Application-wide information using ServletContext.
7. Login validation and HttpSession management.
8. Logout using session invalidation.
9. Authentication Filter for protected pages.
10. Request logging using a Filter.
11. Application lifecycle events using ServletContextListener.
12. Session events using HttpSessionListener.

6. Maven Configuration

The project uses WAR packaging and the Jakarta Servlet API dependency.

<packaging>war</packaging>

<dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.1.0</version>
    <scope>provided</scope>
</dependency>

The "provided" scope means that Tomcat supplies the Servlet API at runtime.

7. Prerequisites

Install the following:

- JDK 17 or newer
- Apache Maven
- Apache Tomcat 11
- Visual Studio Code or another Java IDE

Verify Java and Maven installation:

java -version
mvn -version

8. How to Build the Project

1. Open the "servlet" folder in Visual Studio Code.
2. Open the terminal in the project root.
3. Run:

mvn clean package

4. After a successful build, locate:

target/servlet.war

9. How to Deploy

1. Copy "target/servlet.war" into the Tomcat "webapps" directory.
2. Start Tomcat.

On Windows, run:

bin\startup.bat

On Linux or macOS, run:

./bin/startup.sh

3. Open the application:

http://localhost:8080/servlet/

The application context path is "/servlet" because the WAR file is named "servlet.war".

10. URLs for Testing

Feature| URL
Login page| http://localhost:8080/servlet/
Hello Servlet| http://localhost:8080/servlet/hello
Student form| http://localhost:8080/servlet/student.html
Life cycle| http://localhost:8080/servlet/lifecycle
ServletConfig| http://localhost:8080/servlet/config
ServletContext| http://localhost:8080/servlet/context
Protected home| http://localhost:8080/servlet/home
Logout| http://localhost:8080/servlet/logout

11. Login Credentials

For this classroom demonstration only:

- Username: "admin"
- Password: "1234"

After successful login, the application creates an HttpSession and redirects the user to the protected home page. Logout invalidates the session.

Security note: These hard-coded credentials are for practical learning only. A real application should use secure password hashing and a proper user database.

12. Important Concepts

- Servlet: A Java server-side component that processes client requests.
- Servlet Container: Manages Servlet execution and lifecycle.
- HttpServlet: Base class for HTTP Servlets.
- doGet(): Handles HTTP GET requests.
- doPost(): Handles HTTP POST requests.
- HttpServletRequest: Provides incoming request information.
- HttpServletResponse: Creates the HTTP response.
- ServletConfig: Holds configuration specific to one Servlet.
- ServletContext: Represents the entire web application.
- HttpSession: Stores session-associated server-side data.
- Cookie: Stores a small client-associated value.
- Listener: Receives notifications about application or session events.
- Filter: Intercepts requests and responses.
- FilterChain: Passes processing to the next component.

13. Common Errors

Error| Possible solution
404 Not Found| Check WAR deployment, context path, and URL mapping.
500 Internal Server Error| Check Java exceptions and Tomcat logs.
"javax.servlet" package not found| Use "jakarta.servlet" with Tomcat 11.
Port 8080 already in use| Stop the conflicting process or change the port.
Form parameter is null| Check the HTML input "name" and "getParameter()" name.
Home page redirects to login| Log in first and check the session attribute.
Servlet classes not found| Check package declarations and Maven build output.
Filter blocks a request| Verify the filter mapping and "chain.doFilter()".

14. Learning Outcomes

After completing this practical, students should be able to:

- Create and deploy a Java Servlet application.
- Map Servlets to URL patterns.
- Handle GET and POST requests.
- Read form parameters and generate responses.
- Explain the Servlet life cycle.
- Differentiate ServletConfig and ServletContext.
- Manage sessions and cookies.
- Implement Servlet listeners and filters.
- Build and deploy a WAR file on Tomcat 11.

15. Conclusion

This project demonstrates the fundamental concepts of server-side web development using Java Servlets and Jakarta Servlet API. It provides practical experience with request processing, configuration, session management, event handling, authentication filters, Maven packaging, and deployment using Apache Tomcat 11.
