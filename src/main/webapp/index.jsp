<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Авторизация</title>
    <link href="index.css" rel="stylesheet" type="text/css">
</head>


<body>
<center><h1>Login:</h1></center>
    <form action="auth" method="get">
        <table align="center">
            <tr>
                <th align="right">User:</th>
                <td><input type="text" name="user"></td>
            </tr>
            <tr>
                <th align="right">Password:</th>
                <td><input type="password" name="pass"></td>
            </tr>
            <tr>
                <td colspan="2" align="right"><input class="button" type="submit" value="Log In"</td>
            </tr>
        </table>

    </form>

</body>

</html>