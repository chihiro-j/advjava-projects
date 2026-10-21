JAVA SERVLET (JAKARTA SERVLET)

1\. Aim

To study Java Servlets, HTTP requests, the Servlet life cycle, sessions, cookies, listeners, and filters.

2\. What is a Servlet?

A Servlet is a Java class that processes browser requests and sends responses using a server such as Apache Tomcat.

3\. Uses of Servlets

* Generate dynamic web pages.

* Process HTML forms.

* Connect to databases.

* Manage user sessions and login.

4\. Servlet Architecture

Browser → Tomcat → Servlet → JDBC → Database → Response

5\. HTTP Methods

GET: Retrieves data using doGet().

POST: Submits data using doPost().

6\. Servlet API

HttpServlet: Creates Servlets.

HttpServletRequest: Reads client requests.

HttpServletResponse: Sends responses.

HttpSession: Stores session information.

Cookie: Stores small client-side values.

Filter: Checks requests and responses.

7\. HelloServlet Example

import java.io.IOException; import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.\*;

@WebServlet("/hello") public class HelloServlet extends HttpServlet
