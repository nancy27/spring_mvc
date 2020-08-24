<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
.error{color:red,
position:fixed}

</style>
</head>


<body>

<h2 align="center">Login Form:</h2>
<form:form action="loginForm" method="POST" modelAttribute="login">
<div align="center">

Username: <form:input path="userName"/>
<form:errors path="userName" cssClass="error"/><br><br>

Password(*): <form:password path="passWord"/>
<form:errors path="passWord" cssClass="error"/><br><br>

<form:checkbox path="termsAndConditions" id="check"/>
<label>I am Agreeing </label>
<form:errors path="termsAndConditions" cssClass="error"/><br><br>

<input type="submit" value="submit">

</div>

</form:form>
</body>
</html>