<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.*, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Submission</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding: 20px;
        }
        .container {
            width: 40%;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            margin: auto;
        }
        h2 {
            color: #333;
        }
        input, textarea {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
        .output {
            margin-top: 20px;
            padding: 15px;
            background: #e9ffe9;
            border: 1px solid #28a745;
            border-radius: 5px;
        }
        .back-link {
            text-decoration: none;
            color: #007bff;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Enter Your Details</h2>

        <form method="post">
            <label for="name">Name:</label>
            <input type="text" name="name" id="name" required>

            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required>

            <label for="message">Message:</label>
            <textarea name="message" id="message" required></textarea>

            <input type="submit" value="Submit">
        </form>

        <hr>

        <%-- Display form data after submission --%>
        <%
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String message = request.getParameter("message");

            if (name != null && email != null && message != null) {
        %>
            <div class="output">
                <h2>Thank You, <%= name %>!</h2>
                <p><strong>Email:</strong> <%= email %></p>
                <p><strong>Your Message:</strong> <%= message %></p>
                <a class="back-link" href="<%= request.getContextPath() %>/index.jsp">Go Back</a>
            </div>
        <%
            }
        %>
    </div>
</body>
</html>

