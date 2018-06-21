/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeInf {
    
public void Insert(NewActionSupport nw) throws Exception
{
   
   
              
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","khyati"); 
    String s;
       s = "insert into Employee1 values(? ,?, ?, ?)";
 PreparedStatement ps=con.prepareStatement(s);
 ps.setString(1, nw.getID());
 ps.setString(2, nw.getName());
 
 ps.setString(3, nw.getTo());
  
 ps.setString(4, nw.getDepartment());
 
 
 ps.executeUpdate();
 con.commit();
 
   }
 

  }
