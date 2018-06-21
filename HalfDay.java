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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Lenovo
 */
public class HalfDay extends ActionSupport {
    
    public HalfDay() {
    }
    
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
     String str = "select * from HalfAtten where ID =?";
    PreparedStatement ps=con.prepareStatement(str);
    
    ps.setString(1, I);     
   r = ps.executeQuery();
      ArrayList<Bean1> al = new ArrayList<Bean1>();

    while(r.next())
    {
        Bean1 mb;
    mb = new Bean1();
        int mont = r.getInt("mon");
       int day = r.getInt("day");
       int year = r.getInt("year");
        String d = Integer.toString(day);
        String m = Integer.toString(mont);
        String y = Integer.toString(year);
        String date = d+"/"+m+"/"+y;
        String timeDiff = r.getString("TimeDiff");
        mb.setDate1(date);
        mb.setTimeDiff(timeDiff);
        al.add(mb);
    } 
     req .setAttribute("disp1",al );
    
     r.close();
    con.close();
 
     
 
 
 return SUCCESS;
 
 }
}
    
    

