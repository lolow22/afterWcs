<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Welcome</h1>
    <form action = "${pageContext.request.contextPath}/login" method = "post">
        <label for = "inputEmail">Email :</label>
        <input name = "emailValue" id = "inputEmail" type="email" placeholder="enter@mail.fr">
        <br>
        <label for = "inputPassword">Password :</label>
        <input name = "passwordValue" id = "inputPassword" type="password" placeholder="Password">
        <br>
        <input type = "submit" value = "Send">
    </form>

    <br>
    <button type = "submit" value = "Inscription" href="/WEB-INF/inscription.jsp"/>

</body>
</html>
