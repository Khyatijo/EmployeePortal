/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Lenovo
 */
public class NewActionSupport1 extends ActionSupport {
    
    public NewActionSupport1() {
    }
    
    @Override
    public String execute() throws Exception {
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
     String str = "select * from Attendance2 where ID =?";
    PreparedStatement ps=con.prepareStatement(str);
    
    ps.setString(1, I);     
   r = ps.executeQuery();
   List al = new ArrayList(); 

          
    while(r.next())
          {
        Bean1 mb;
        mb = new Bean1();
        int day = r.getInt("day");
       int mon = r.getInt("Month");
       int year = r.getInt("year");
        String d = Integer.toString(day);
        String m = Integer.toString(mon);
        String y = Integer.toString(year);
        String date = d+"/"+m+"/"+y;
          mb.setDate(date);
          al.add(mb);
           }
          req .setAttribute("disp",al );
    
    
     r.close();
    con.close();
 
     
 
 
 return SUCCESS;
 
 }
} 
    
