/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Lenovo
 */
public class FIRSTTIMELOGIN extends ActionSupport {
    private String ID;
    public FIRSTTIMELOGIN() {
    }
    
    @Override
    public String execute() throws Exception {
       HttpServletResponse response; 
        response = ServletActionContext.getResponse();
        ServletContext ctx=ServletActionContext.getServletContext();
         ctx.setAttribute(ID ,"1");
          Cookie ck1=new Cookie("EMPID",ID);  
        ck1.setMaxAge(24000);  
        response.addCookie(ck1);
         return SUCCESS;
     }
    public String getID () {
      return ID;
   }

   public void setID (String ID) {
      this.ID = ID ;
}
 
}
