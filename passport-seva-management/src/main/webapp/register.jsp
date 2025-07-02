<%@ page contentType="text/html;charset=UTF-8" language="java" %>
      <%@ page  isELIgnored="false" %>
      <%@ taglib prefix="c" uri=
      "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Passport Seva Portal</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f4f8;
  }
  .container {
    width: 400px;
    margin: 40px auto;
    padding: 25px;
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }
  h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
  }
  form label {
    display: block;
    margin: 10px 0 5px;
  }
  form input[type="text"],
  form input[type="email"],
  form input[type="password"],
  form select {
    width: 100%;
    padding: 8px;
    box-sizing: border-box;
  }
  span {
    color: red;
  }
  button {
    width: 100%;
    padding: 10px;
    margin-top: 15px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
  }
  button:hover {
    background-color: #0056b3;
  }
  #message {
    text-align: center;
    margin-top: 15px;
  }
  .radio-group {
    margin-top: 5px;
  }
  .radio-group label {
    margin-right: 15px;
    font-weight: normal;
    display: inline-block;
  }
</style>
</head>
<body>
  <div class="container">
    <h2>Passport Seva Registration Form</h2>
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

      <label>Do you want to use the same Email as Login ID?<span>*</span>:</label>
      <div class="radio-group">
        <input type="radio" id="yesOption" name="useSameEmail" value="Yes" required />
        <label for="yesOption">Yes</label>

        <input type="radio" id="noOption" name="useSameEmail" value="No" />
        <label for="noOption">No</label>
      </div>

      <label for="loginId">Login ID<span>*</span>:</label>
      <input type="text" id="loginId" name="loginId" required />

      <label for="password">Password<span>*</span>:</label>
      <input type="password" id="password" name="password" required />

      <label for="confirmPassword">Confirm Password<span>*</span>:</label>
      <input type="password" id="confirmPassword" name="confirmPassword" required />

      <button type="submit">Register</button>
    </form>
    <p id="message"></p>
  </div>

  <script>
    const emailIdInput = document.getElementById('emailId');
    const loginIdInput = document.getElementById('loginId');
    const yesOption = document.getElementById('yesOption');
    const noOption = document.getElementById('noOption');
    const form = document.getElementById('passportForm');
    const msg = document.getElementById('message');

    yesOption.addEventListener('change', () => {
      loginIdInput.value = emailIdInput.value;
      loginIdInput.readOnly = true;
    });

    noOption.addEventListener('change', () => {
      loginIdInput.value = '';
      loginIdInput.readOnly = false;
    });

    emailIdInput.addEventListener('input', () => {
      if (yesOption.checked) {
        loginIdInput.value = emailIdInput.value;
      }
    });

    form.addEventListener('submit', function (e) {
      e.preventDefault();

      const password = document.getElementById('password').value;
      const confirmPassword = document.getElementById('confirmPassword').value;

      if (password !== confirmPassword) {
        msg.textContent = 'Password and Confirm Password do not match.';
        msg.style.color = 'red';
      } else if (yesOption.checked && emailIdInput.value !== loginIdInput.value) {
        msg.textContent = 'Login ID should match Email ID as per your choice.';
        msg.style.color = 'red';
      } else {
        msg.textContent = 'Form submitted successfully!';
        msg.style.color = 'green';
      }
    });
  </script>
</body>
</html>
