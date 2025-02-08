<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime, java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date & Time</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        .container {
            border: 1px solid #ccc;
            padding: 20px;
            width: 350px;
            margin: auto;
            box-shadow: 2px 2px 10px rgba(0,0,0,0.2);
            background-color: #f9f9f9;
            border-radius: 10px;
        }
        .button {
            background-color: blue;
            color: white;
            padding: 10px 15px;
            border: none;
            cursor: pointer;
            font-size: 16px;
            margin-top: 10px;
            border-radius: 5px;
        }
        .button:hover {
            background-color: darkblue;
        }
        .datetime {
            font-size: 18px;
            font-weight: bold;
            margin-top: 15px;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Current Date & Time</h2>

        <form method="post">
            <input type="submit" class="button" value="Refresh Date & Time">
        </form>

        <%
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);
        %>

        <p class="datetime">📅 Date & Time: <%= formattedDateTime %></p>
    </div>
</body>
</html>
