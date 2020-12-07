package securityz;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SigninCheck {
     public int ValidAll(String userName,String password,String confirmPassword){
         int i=0;
         
         if(userName.equals("")){
            i= 1;  
         }
         else if(password.equals(""))
            i=2;
         else if(password.equals(confirmPassword))
            i= 4;
         else
            i= 3;
        
         
        return i;
     }
     public int validUserName(String userName){
         int i=0;
           
         try{ 
           
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D://Java Project//SecurityZ//Database//Security-Z.accdb");
             
             Statement stmt=con.createStatement();
             ResultSet rs =stmt.executeQuery("select * from SLogin where UserName ='" +Signin.userName.getText()+ "'");
             
                 
                 if(rs.next())
                     i = 0;
                   else
                     i = 1;
            
          
             
         }
         catch(Exception e){
           System.out.println(e.getMessage()+""+e.getStackTrace()+""+e);
            
         }
         return i;
         
         
     
}
}
