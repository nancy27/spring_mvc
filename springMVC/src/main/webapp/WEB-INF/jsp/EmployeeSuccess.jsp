<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head
<body>
  <h2>Congratulations!</h2>
    <h3>Your Details Registered with us :</h3>
      <table>
         <tr>

           <td>Employee Name:</td>
           <td>
           ${employee.employeeName}
           </td>
         </tr>
         <tr>
           <td>Mobile NO</td>
             <td>
              ${employee.mobileNo}
           </td>
         </tr>

         <tr>
           <td>Date Of Birth:</td>
            <td>
            ${employee.dob}
           </td>
         </tr>
         <tr>
           <td>Skills:</td>
           <td>
           ${employee.skills}
           </td>
         </tr>
         <tr>
           <td> Employee Address:</td>
           <td>Country:${employee.address.country}
           City:${employee.address.city}
           Pincode:${employee.address.pincode}
           </td>
         </tr>
      </table>
</body>
</html>