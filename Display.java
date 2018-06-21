/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;  
import com.opensymphony.xwork2.ActionSupport;
import java.sql.PreparedStatement;
import javax.servlet.http.Cookie;
public class Display extends ActionSupport {
 private static final long serialVersionUID = 1L;
 
 
 
 @Override
 public String execute() throws Exception
 {
 
 String I;
     I = "null";
 Class.forName("oracle.jdbc.driver.OracleDriver");
    java.sql.Connection con;
     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Khyati");
     Statement st = con.createStatement();
      HttpServletRequest req=ServletActionContext.getRequest();
     Cookie[] ck;  
        ck = req.getCookies();
        for (Cookie ck1 : ck) {
            if ("EMPID".equals(ck1.getName())) {
                I=ck1.getValue();
            }
        }
     ResultSet r;
     String str = "select * from Employee1 where ID =?";
    PreparedStatement ps=con.prepareStatement(str);
    
    ps.setString(1, I);     
   r = ps.executeQuery();
    Bean mb;
    mb = new Bean();
    while(r.next())
    {
        mb.setDepartment(r.getString("Department"));
     mb.setNam(r.getString("Name"));
     mb.setID(r.getString("ID"));
     mb.setEmail(r.getString("Email"));
     req .setAttribute("disp",mb );
    }
     r.close();
    con.close();
 
     
 
 
 return SUCCESS;
 
 }
}