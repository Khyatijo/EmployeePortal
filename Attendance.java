/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import java.text.DateFormat;
/**
 *
 * @author Lenovo
 */
public class Attendance extends ActionSupport {
    
    public Attendance() {
    }
    
    @Override
    public String execute() throws Exception {
         Date date = new Date();
LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
int year  = localDate.getYear();
int month = localDate.getMonthValue();
int day   = localDate.getDayOfMonth();
 String s;
HttpSession session=ServletActionContext.getRequest().getSession();  
Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","khyati"); 
 //String myTime = "09:01:00"; 
   //Time startingTime = new Time (myTime);
     HttpServletRequest req;
        req = ServletActionContext.getRequest();
         String Lat = (String)req.getParameter("lat");
        
        String lon;
        lon = req.getParameter("long");
      int laa = (int)Float.parseFloat(Lat);
      int loo = (int)Float.parseFloat(lon);
        //String[] str1 = lon.split("3");
        //float lo = Float.parseFloat(lon);
        String str = (String)session.getAttribute("ID");
       //String value = new DecimalFormat("##.##").format(la);
       //String value1 = new DecimalFormat("##.##").format(lo);
   
     //req.setAttribute("lat" , strn[0]);
     if( laa==28 && loo== 77)
     {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
    Date date1 = new Date();  
    // String time1 = "11:44:00";
     //DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
      //Date date2 = sdf.parse(time1);
     String strng;
     strng = dateFormat.format(date1);
      String[] strng2;  
        strng2 = strng.split("\\s+");
        String time = strng2[1];
        
        
     //String strr2[];
     //strr2 = formatter.format(date2).split(":");
         
         
         
     String[] strr = time.split(":");
        String hour = strr[0];
        int h = Integer.parseInt(hour);
       //String[] hour1 = strr2[0].split("1970");
        String min = strr[1];
        int m = Integer.parseInt(min);
        //String fin = hour+min;
        //String fin1 = hour1[1]+min1;
       // int t = Integer.parseInt(fin1);
        //String f = "10"+":"+"35";
        req.setAttribute("time" , hour);
         req.setAttribute("time1" , min);
         if("1021".equals(hour+min))     
           {
       s = "insert into Attendance2 values(? ,?, ?,?)";       
      PreparedStatement ps=con.prepareStatement(s);
      ps.setString(1, str);
      ps.setInt(2, day);
      ps.setInt(3, month);
      ps.setInt(4, year);
     ps.executeUpdate();
       con.commit();
           }
        else
         {
        s = "insert into HalfAtten values(? ,?, ?,?,?)";  
         PreparedStatement ps=con.prepareStatement(s);
          int mindiff = m;
          int hourdiff = h-9;
         String mind = Integer.toString(mindiff);
         String ho = Integer.toString(h);
         ps.setInt(1, month);
         ps.setInt(2,day);
         ps.setInt(3, year);
       ps.setString(4,str);
         ps.setString(5, (ho+":"+mind));
         ps.executeUpdate();
           con.commit();
                }
        
         
         return SUCCESS;
     }
     else
       return ERROR;
    
}
}