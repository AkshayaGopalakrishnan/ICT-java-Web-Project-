package pack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
public int validate(String un,String pw) {
	Connection c=null;
	ResultSet res;
	int status=0;
	PreparedStatement ps=null;
	try
	{
	c= CommonCon.Connect();
	ps=c.prepareStatement("select * from login where user=? and password=?");

	ps.setString(1,un);
	ps.setString(2,pw);

	res=ps.executeQuery();
	if (res.next())
		status=1;

	}
	catch(SQLException ex)
	{

	System.out.println(ex);
	}
	finally
	{

	try {
	ps.close();
	c.close();
	} catch (SQLException ex) {

	ex.printStackTrace();
	}

	}
	return status;
	}

}


