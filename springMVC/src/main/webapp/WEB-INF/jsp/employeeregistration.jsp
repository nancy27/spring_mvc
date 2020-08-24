
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<style>
.error{
color:red,
position:fixed}

</style>
</head>

<body>
 <h2>Employee Registration Form:</h2>

 <form:form action="register" method="POST" modelAttribute="employee">
 <div align="center">

 Employee Name: <form:input path="employeeName"/>
 <form:errors path="employeeName" cssClass="error"/><br><br>

 Mobile No(*): <form:input path="mobileNo"/>
 <form:errors path="mobileNo" cssClass="error"/><br><br>

 Date Of Birth: <form:input path="dob"/>
  <form:errors path="dob" cssClass="error"/><br><br>
<p>
Skills:
<form:select path="skills" multiple="true">
              <form:option value="Java Core"/>
              <form:option value="Spring Core"/>
              <form:option value="Spring MVC"/>

          </form:select>
</p>
    Country:
       <form:input path="address.country"/>
       <form:errors path="address.country" cssClass="error"/><br><br>
    City:
       <form:input path="address.city"/>
       <form:errors path="address.city" cssClass="error"/><br><br>

    Pincode:<form:input path="address.pincode"/><br>

   <input type="submit" value="submit">

</form:form>
</body>
</html>