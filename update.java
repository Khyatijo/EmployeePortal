/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Lenovo
 */
public class update extends ActionSupport {
    
    public update() {
    }
    
    @Override
    public String execute() throws Exception {
        HttpSession session=ServletActionContext.getRequest().getSession();
        HttpServletRequest req=ServletActionContext.getRequest();
        String s1 = (String)req.getParameter("fid");  
        String s = (String)req.getParameter("fid1");
        String s3 =(String)req.getParameter("fid2");
         //ssion.setAttribute("param" , "1");
          if(s1 !=null)
           session.setAttribute("param" , "1");
           if(s !=null)
           session.setAttribute("param" , "2");
           if(s3 !=null)
           session.setAttribute("param" , "3");
           return SUCCESS;
    }
    
}
