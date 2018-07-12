<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Welcome</h1>
    <form action = "${pageContext.request.contextPath}/login" method = "post">
        <label for = "inputEmail">">Email :</label>
        <input name = "emailValue" id = "inputEmail" type="email" placeholder="enter@mail.fr">
        <br>
        <label for = "inputPassword">">Email :</label>
        <input name = "passwordValue" id = "inputPassword" type="password" placeholder="Password">
        <br>
        <input type = "submit" value = "Send">
    </form>
<c:if test="${not empty requestScope.user}">
    <ul>
        <li>${requestScope.user.username}</li>
        <li>${requestScope.user.password}</li>
    </ul>

</c:if>
</body>
</html>
