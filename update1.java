/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class update1 extends ActionSupport {
    
    public update1() {
    }
    
    @Override
    public String execute() throws Exception {
        String s;
        String I = "null";
        Class.forName("oracle.jdbc.driver.OracleDriver");
    java.sql.Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Khyati");
  HttpServletRequest req=ServletActionContext.getRequest();
      HttpSession session=ServletActionContext.getRequest().getSession();
  Cookie[] ck;  
        ck = req.getCookies();
        for (Cookie ck1 : ck) {
            if ("EMPID".equals(ck1.getName())) {
                I=ck1.getValue();
            }
        }
      PreparedStatement ps;
    if( "1".equals((String)session.getAttribute("param")))
     {
    String s1 =   (String)req.getParameter("update");  
 s= "update Employee1 set Name=? where ID=?";
     ps=con.prepareStatement(s);
 ps.setString(1,s1);
 ps.setString(2, I); 
      ps.executeUpdate();
 con.commit();
     }
  if("2".equals((String)session.getAttribute("param")))
     {
     String s1 =   (String)req.getParameter("update");
      s= "update Employee1 set Email=? where ID=?";
      ps=con.prepareStatement(s);
      ps.setString(1,s1); 
      ps.setString(2, I);
      ps.executeUpdate();
      con.commit();
        }   
  if(   "3".equals((String)session.getAttribute("param")))
     {
    String s1 =   (String)req.getParameter("update");     
 s= "update Employee1 set Department=? where ID=?";
   ps=con.prepareStatement(s);   
 ps.setString(1,s1);
 ps.setString(2, I); 
     
  ps.executeUpdate();
 con.commit();
     }
   return SUCCESS; 
}
}