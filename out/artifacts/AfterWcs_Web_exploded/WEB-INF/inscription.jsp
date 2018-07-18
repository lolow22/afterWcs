<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 18/07/18
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inscription</title>
</head>
<body>
<h1>Welcome</h1>
<form action = "${pageContext.request.contextPath}/inscription" method = "post">
    <label for = "inputFirstName">Firstname :</label>
    <input name = "firstNameValue" id = "inputFirstName" type="text" placeholder="Firstname">
    <br>
    <label for = "inputLastName">Lastname :</label>
    <input name = "lastNameValue" id = "inputLastName" type="text" placeholder="Lastname">
    <br>
    <label for = "inputMail">Mail :</label>
    <input name = "MailValue" id = "inputMail" type="email" placeholder="Mail">
    <br>
    <label for = "inputSchool">School :</label>
    <input name = "SchoolValue" id = "inputSchool" type="text" placeholder="School">
    <br>
    <label for = "inputIsAdmin">Are you an admin ? :</label>
    <input name = "isAdminValue" id = "inputIsAdmin" type="checkbox">
    <br>
    <input type = "submit" value = "Send">
</form>

</body>
</html>
