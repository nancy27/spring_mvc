<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
 <h2>Employee Registration Form:</h2>
 <form:errors path="employee.*"/>
   <form action="register" method="post" >

<p> UserName:
   <input type="text" name="employeeName">
</p>
<p>Mobile No:
   <input type="text" name="mobileNo">
</p>
<p>Date Of Birth:
   <input type="text" name="dob"><br>
</p>
<p>
   <select name="skills" multiple >
   <option value="Java Core">Java Core</option>
   <option value="Spring Core">Spring Core</option>
   <option value="Spring MVC">Spring MVC</option>
   </select>
</p>

   <table>
   <tr><td>Employee`s Address </td></tr>
     <tr>
       <td>
         Country:
       </td>
       <td>
         <input type="text" name="address.country"><br>
       </td>
     </tr>
     <tr>
       <td>
         City:
       </td>
       <td>
          <input type="text" name="address.city"><br>
       </td>
     </tr>

     <tr>
     <td>
        Pincode:
     </td>
     <td>
        <input type="text" name="address.country"><br>
     </td>
     </tr>
      <tr><td><input type="submit" value="Submit"></td></tr>

   </table>

</form>
</html>