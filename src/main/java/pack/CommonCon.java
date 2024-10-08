package pack;

import java.sql.*;


public class CommonCon {
	public static Connection Connect()

{
Connection c=null;

try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebanking","root","Dbsnake@285");
	System.out.println("Connected");
}

catch( Exception e)
{

System.out.println(e);
}
return c;
}
}


