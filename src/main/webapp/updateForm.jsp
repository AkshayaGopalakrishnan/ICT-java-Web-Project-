<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/ebanking " user="root" password="Dbsnake@285"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
<h3>Customer Creation Page</h3>
<%-- <input type="hidden" name="action" value="update" />
<input type="hidden" name="custid" value="${param.custid}" />
<p>
ID: <c:out value="${param.custid}" /></p>
<br><br>
<sql:query var="cus" sql="SELECT * FROM customer WHERE custid=${param.custid}">
 </sql:query>
<sql:query var="acc" sql="SELECT * FROM account WHERE custid=${param.custid}">
 </sql:query> --%>



<form  method="get" action="CustServlet">
<input type="hidden" name="action" value="update" />
<input type="hidden" name="custid" value="${param.custid}" />
<p>
ID: <c:out value="${param.custid}" /></p>
<br><br>
<sql:query var="cus" sql="SELECT * FROM customer WHERE custid=${param.custid}">
 </sql:query>
<sql:query var="acc" sql="SELECT * FROM account WHERE custid=${param.custid}">
 </sql:query>
<table  >
<!-- <tr>
<td width="50%">ID : <td> <input type="text" name="id"/></td>
</tr> -->
<c:forEach var="row1" items="${cus.rows}">
<tr>
<td width="50%">FIRST NAME : </td><td> <input type="text" name="fname" value="<c:out value="${row1.firstname}"/>"/></td>
</tr>
<tr>
<td width="50%">LAST NAME : </td><td> <input type="text" name="lname" value="<c:out value="${row1.lastname}"/>"/></td>
</tr>
<tr>
<td width="50%">AGE : </td><td> <input type="text" name="age" value="<c:out value="${row1.age}"/>"/></td>
</tr>
<tr>
<td width="10%">GENDER : </td><td><input type="text" name="gender" value="<c:out value="${row1.gender}"/>"/></td>
</tr>
<tr>
<td width="50%">CITY : </td><td><input type="text" name="city" value="<c:out value="${row1.city}"/>"/></td>
</tr>
<tr>
<td width="50%">OCCUPATION : </td><td> <input type="text" name="occupation" value="<c:out value="${row1.occupation}"/>"/></td>
</tr>

<tr>
<td width="50%">CONTACT NUMBER :</td> <td> <input type="text" name="cno" value="<c:out value="${row1.contactno}"/>"/></td>
</tr>
</c:forEach>
<c:forEach var="row2" items="${acc.rows}">
 <tr>
 <td width="50%">ACCOUNT NUMBER : </td><td> <input type="text" name="ano" value="<c:out value="${row2.accno}"/>"/></td>
</tr>
<tr>
<td width="10%">Account Type : </td><td><input type="text" name="acctype" value="<c:out value="${row2.acctype}"/>"/></td>

</tr>
</c:forEach>

</table>

<input type="submit" value="proceed"/>
</form>

</body>
</html>