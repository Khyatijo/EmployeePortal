/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;
import javax.servlet.ServletContext;  
import org.apache.struts2.util.ServletContextAware;  
/**
 *
 * @author Lenovo
 */public class FirstAction implements ServletContextAware{

    /**
     *
     * @param ctx
     */
    @Override
    public void setServletContext(ServletContext ctx) {  
        ctx.setAttribute("ID","1");  
    }  
      
    public String execute(){  
        return "success";  
    }  
}  