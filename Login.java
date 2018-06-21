/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.DriverManager;
import java.sql.Statement;
import org.apache.struts2.ServletActionContext;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.Cookie; 
import javax.servlet.http.HttpSession;
public class Login extends ActionSupport {
    String Name;
    
    public Login() {
    }
    
    @Override
    public String execute() throws Exception {
        HttpServletRequest request=ServletActionContext.getRequest();  
        HttpSession session=ServletActionContext.getRequest().getSession();
        Cookie[] ck;  
        ck = request.getCookies();
        for (Cookie ck1 : ck) {
            if ("EMPID".equals(ck1.getName())) {
                Name=ck1.getValue();
            }
        }
        session.setAttribute("ID" , Name); 
        ServletContext ctx=ServletActionContext.getServletContext();
            if(Name!=null){
                return SUCCESS;

                
            }
            else
            {
                return ERROR;
            }
        } //m2.invoke(obj,null); 
   
}