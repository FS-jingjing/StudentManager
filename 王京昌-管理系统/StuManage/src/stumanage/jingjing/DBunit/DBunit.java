/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stumanage.jingjing.DBunit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBunit {
    static Connection con=null;
	   static{
	       try {
	           Class.forName("oracle.jdbc.OracleDriver");
	       } catch (ClassNotFoundException ex) {
                   ex.printStackTrace();
	       }
	   }
	   
	   public static Connection connect(){
	        try {
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","stu_jing_1","123123");
	            return con;
	        } catch (SQLException ex) {
	        	ex.printStackTrace();
	        }
	       return null;
	   }
	   public static void close(Connection con,Statement stat, ResultSet rs){
	        try {
	            if(rs!=null)rs.close();
	            if(stat!=null)stat.close();
	            if(con!=null)con.close();
	        } catch (SQLException ex) {
	        	ex.printStackTrace();
	        }
	   }
	   
//	   public static void main(String args[]){
//		   
//	            System.out.println(DBunit.connect());
//	            System.out.println("jjj");
//	   }
   
}
