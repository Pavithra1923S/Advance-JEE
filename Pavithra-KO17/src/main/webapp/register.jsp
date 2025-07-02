<%@ page contentType="text/html;charset=UTF-8" language="java" %>
      <%@ page  isELIgnored="false" %>
      <%@ taglib prefix="c" uri=
      "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

</head>
<body>

    <h2>Registration Form</h2>
    <form  action="registration" method="post">
      <label for="firstName">First Name<span>*</span>:</label>
      <input type="text" id="firstName" name="firstName" required />

      <label for="lastName">Last Name<span>*</span>:</label>
      <input type="text" id="lastName" name="lastName" required />

      <label for="gender">Gender<span>*</span>:</label>
      <select id="gender" name="gender" required>
        <option value="">Select</option>
        <option value="Male">Male</option>
        <option value="Female">Female</option>
        <option value="Other">Other</option>
      </select>

      <label for="emailId">Email ID<span>*</span>:</label>
      <input type="email" id="emailId" name="emailId" required />



      <label for="password">Password<span>*</span>:</label>
      <input type="password" id="password" name="password" required />


      <button type="submit">Register</button>
    </form>


</body>
</html>
