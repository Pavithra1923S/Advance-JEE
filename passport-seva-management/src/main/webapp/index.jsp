

<!DOCTYPE html>
<html>
<head>
    <title>User Registration Front Page</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            display: flex;
            height: 100vh;
        }

        .left-section {
            flex: 1;
            background-color: #ffffff;
            padding: 40px;
            text-align: center;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            border-right: 2px solid #ccc;
        }

        .left-section img {
            width: 800px;
            height: auto;
            margin-top: 40px;
            border-radius: 10px;
        }

        .right-section {
            flex: 1;
            background: linear-gradient(135deg, #ff9a9e, #fad0c4);
            border-radius: 30px 0 0 30px;
            margin: 30px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            box-shadow: 0 0 20px rgba(0,0,0,0.2);
        }

        .right-section a {
            text-decoration: none;
            padding: 12px 25px;
            background-color: white;
            color: #333;
            border-radius: 10px;
            font-size: 18px;
            margin: 10px;
            transition: 0.3s;
            box-shadow: 2px 2px 10px rgba(0,0,0,0.1);
        }

        .right-section a:hover {
            background-color: #333;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="left-section">
            <h2>User Registration</h2>
            <img src="download.jpg" alt="User Image">
        </div>
        <div class="right-section">
            <a href="register.jsp">New Registration</a>
            <a href="getUsers">get Users</a>
            <a href="help.jsp">Help</a>
            <a href="contact.jsp">Contact</a>
        </div>
    </div>
</body>
</html>
