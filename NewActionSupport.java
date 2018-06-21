/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.*;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import org.apache.struts2.ServletActionContext;
/**
 *
 * @author Lenovo
 */
public class NewActionSupport extends ActionSupport {
    private String to;
    private String name;
    private String Department;
    //private Date date;
    private String str2;
    public NewActionSupport() {
    }
    
    @Override
        public String execute() throws Exception {
        ServletContext ctx=ServletActionContext.getServletContext();  
        String obj=(String)ctx.getAttribute("ID");  
        String str1;
        if(obj!=null)
        {
        Integer obje = Integer.parseInt(obj);
        obje = obje + 1;
        str1 = Integer.toString(obje);
         str2 = "SKL"+str1;          
        ctx.setAttribute("ID" , str1);   
        }
        else
        {
            ctx.setAttribute("ID" ,"1");
            str2 = "SKL"+"1" ;       
        }
        String from;
        from = "khyatijohri102@gmail.com";
        String host;
        host = "localhost";
  
       EmployeeInf e = new EmployeeInf();
       e.Insert(this);
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.host", "smtp.gmail.com");  
      properties.setProperty("mail.smtp.port", "587");  
      properties.setProperty("mail.smtp.auth", "true"); 
      properties.setProperty("mail.smtp.starttls.enable", "true"); 
      properties.setProperty("mail.smtp.user", "khyatijohri102@gmail.com"); 
       Authenticator authenticator;
            authenticator = new Authenticator () {
                @Override
                public PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("khyatijohri102@gmail.com","rating32018@");//userid and password for "from" email address 
                }
            };

            Session session = Session.getInstance( properties , authenticator);

// Session session = Session.getDefaultInstance(props, new GMailAuthenticator("khyatijohri102@gmail.com", "khyatiyukti118@"));
session.setDebug(true);
  
     //compose the message  
       
          MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
            
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Employee ID");  
         message.setText("Thanks for registering with skill rock , Your EmployeeID is "+str2);  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
       System.out.println("mail sent");       
       
         return SUCCESS;
        }
               
      
              
           
        
          

 
          // Class c = Class.forName("SendEmail");
        // Object obj  = c.newInstance();
        // Method m2 = c.getDeclaredMethod("send",null);
  
          //m2.invoke(obj,null); 
    public String getTo () {
      return to;
   }

   public void setTo (String to) {
      this.to = to ;
   }
  public String getName () {
      return to;
   }

   public void setName (String name) {
      this.name = name ;
   }   
  public String getDepartment () {
      return name;
   }

   public void setDepartment (String Department) {
      this.Department = Department ;
   }     

 //public Date getDate () {
    //  return date;
   //}

   //public void setDate (Date date) {
     // this.date= date ;
 //  }     
   public String getID () {
      return str2;
   }
 //public void validate() {
      //if (name == null || name.trim().equals("")) {
         //addFieldError("name","The name is required");
      //}
      
      //if (age < 28 || age > 65) {
         //addFieldError("age","Age must be in between 28 and 65");
      //}
    

}