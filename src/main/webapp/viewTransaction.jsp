
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/ebanking" user="root" password="Dbsnake@285"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view table</title>
</head>
<body>
<input type="hidden" name="custid" value="${param.custid}" />
<p>
ID: <c:out value="${param.custid}" /></p>
<br><br>
<form> 
 <table border=1>
<tr>
                <th>CustId</th>
				<th>fromAcc</th>
                <th>toAcc</th>
                <th>amount</th>
                <th>transDate</th>
                <th>transMode</th>
                <th>status</th>

</tr>
<sql:query var="trans" sql="SELECT * FROM transaction where custid=${param.custid}">
 </sql:query>
<c:forEach var="row" items="${trans.rows}">

<tr>
<td><c:out value="${row.CustId}"/></td>
<td><c:out value="${row.fromAcc}"/></td>
<td><c:out value="${row.toAcc}"/></td>
<td><c:out value="${row.amount}"/></td>
<td><c:out value="${row.transDate}"/></td>
<td><c:out value="${row.transMode}"/></td>
<td><c:out value="${row.status}"/></td>

</tr>
</c:forEach>

</table>
  </form>
<br><a href="inter.jsp"><input type="submit" value="back"/></a>
</body>
</html>