package pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CustDAO {
	public int custinsert(CustPojo cp)

	{
		Connection c=null;
		int res=0;
		PreparedStatement ps=null;
		try
		{
		c= CommonCon.Connect();
		ps=c.prepareStatement("insert into customer(firstname,lastname,age,gender,city,occupation,contactno) values(?,?,?,?,?,?,?)");
		//ps.setInt(1,r.getId());
		ps.setString(1,cp.getFname());
		ps.setString(2,cp.getLname());
		ps.setInt(3,cp.getAge());
		ps.setString(4,cp.getGender());
		ps.setString(5,cp.getCity());
		ps.setString(6,cp.getOcc());
		ps.setString(7,cp.getCno());
		res=ps.executeUpdate();
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
		return res;
		}
	public int accinsert(CustPojo cp)

		{
		Connection c=null;
		int res=0;
		PreparedStatement ps=null;
		try
		{
		c= CommonCon.Connect();
		ps=c.prepareStatement("INSERT INTO account (accNo, accType, custid) VALUES (?, ?, (SELECT CustId FROM customer ORDER BY CustId DESC LIMIT 1));");
		ps.setInt(1,cp.getAno());
		ps.setString(2,cp.getAcctype());
	
		res=ps.executeUpdate();
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
		return res;
		}
	public int custupdate(CustPojo cp)

		{
		Connection c=null;
		int res=0;
		PreparedStatement ps=null;
		try
		{
		c= CommonCon.Connect();
		ps=c.prepareStatement("update customer set firstname=?,lastname=?,age=?,gender=?,city=?,occupation=?,contactno=? where custid=?");
		ps.setString(1,cp.getFname());
		ps.setString(2,cp.getLname());
		ps.setInt(3,cp.getAge());
		ps.setString(4,cp.getGender());
		ps.setString(5,cp.getCity());
		ps.setString(6,cp.getOcc());
		ps.setString(7,cp.getCno());
		ps.setInt(8,cp.getCustID());
		res=ps.executeUpdate();
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
		return res;
		}
	public int accupdate(CustPojo cp)

			{
			Connection c=null;
			int res=0;
			PreparedStatement ps=null;
			try
			{
			c= CommonCon.Connect();
			ps=c.prepareStatement("update account set accNo=?, accType=? where custid=?");
			ps.setInt(1,cp.getAno());
			ps.setString(2,cp.getAcctype());

			ps.setInt(3,cp.getCustID());
			res=ps.executeUpdate();
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
			return res;
			}
	public void delete(int id)

		{
		Connection c=null;
	
		PreparedStatement ps=null;
		try
		{
		c= CommonCon.Connect();
		ps=c.prepareStatement("delete from customer where custid=?");
		
		ps.setInt(1,id);
		ps.executeUpdate();
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
	
		}
}
