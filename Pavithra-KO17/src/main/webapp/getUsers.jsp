<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details Table</title>

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
