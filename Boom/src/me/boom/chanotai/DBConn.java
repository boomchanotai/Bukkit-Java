package me.boom.chanotai;

import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBConn {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	MD5 MD5 = new MD5();
	
	public DBConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/minecraft","root","");
			st = (Statement) conn.createStatement();
		} catch(Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	/*public boolean Checkuser(String player) {
		try {
			String checkuser = "SELECT * FROM user WHERE username='"+ player + "'";
			rs = st.executeQuery(checkuser);
			if(!(rs.next())) {
				return true;
			} else {
				return false;
			}
		} catch(Exception ex) {
			System.out.println(ex);
		}
		return false;
	}*/
	
	/*public boolean Checkpass(String username, String pass) {
		try {
			String checkpass = "SELECT password FROM user WHERE username='" + username + "'";
			rs = st.executeQuery(checkpass);
			rs.next();
			String passdb = rs.getString(1);
			String passconverted = MD5.getMd5(pass);
			String passdb1 = passdb.toUpperCase();
			String passconverted1 = passconverted.toUpperCase();
			if(passdb1 == passconverted1) {
				Bukkit.broadcastMessage("true");
				Bukkit.broadcastMessage("Fucking False Again I sas");
				Bukkit.broadcastMessage("passdb : '" + passdb1 + "'");
				Bukkit.broadcastMessage("passconverted : '" + passconverted1 + "'");
			} else {
				Bukkit.broadcastMessage("Fucking False Again I sas");
				Bukkit.broadcastMessage("passdb : '" + passdb1 + "'");
				Bukkit.broadcastMessage("passconverted : '" + passconverted1 + "'");
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return false;
	}*/

}
