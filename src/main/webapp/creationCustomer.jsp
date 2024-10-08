<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Customer Creation Page</h3>
<br><br>
<form  method="get" action="CustServlet">
<input type="hidden" name="action" value="insert" />
<table  >
<!-- <tr>
<td width="50%">ID : <td> <input type="text" name="id"/></td>
</tr> -->
<tr>
<td width="50%">FIRST NAME : </td><td> <input type="text" name="fname"/></td>
</tr>
<tr>
<td width="50%">LAST NAME : </td><td> <input type="text" name="lname"/></td>
</tr>
<tr>
<td width="50%">AGE : </td><td> <input type="text" name="age"/></td>
</tr>
<tr>
<td width="10%">GENDER : </td><td> Male: <input type="radio" name="gender" value="male"/>
    Female :<input type="radio"  name="gender" value="female"/> </td>
</tr>
<tr>
<td width="50%">CITY : </td><td><input type="text" name="city"/></td>
</tr>
<tr>
<td width="50%">OCCUPATION : </td><td> <input type="text" name="occupation"/></td>
</tr>


<tr>
<td width="50%">CONTACT NUMBER :</td> <td> <input type="text" name="cno"/></td>
</tr>

 <tr>
 <td width="50%">ACCOUNT NUMBER : </td><td> <input type="text" name="ano"/></td>
</tr>
<tr>
<td width="50%">  <label for="acctype">Choose your Account Type:</label></td>
  <td>  <select name="acctype" id="acctype">
    <option value="savings">Savings</option>
    <option value="current">Current</option>
    <option value="recurring">Recurring</option>
  </select></td>
</tr>


</table>

<input type="submit" value="proceed"/>
</form>

</body>
</html>