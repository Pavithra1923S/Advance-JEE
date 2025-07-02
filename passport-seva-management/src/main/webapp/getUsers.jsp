<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details Table</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 30px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
            border: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>

<h1>The User Details</h1>

<table>
    <tr>
        <th>User ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email ID</th>
        <th>Password</th>
        <th>Gender</th>
    </tr>

    <c:forEach items="${listOfUsers}" var="dto">
        <tr>
            <td>${dto.userId}</td>
            <td>${dto.firstName}</td>
            <td>${dto.lastname}</td>
            <td>${dto.emailId}</td>
            <td>${dto.password}</td>
            <td>${dto.gender}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
