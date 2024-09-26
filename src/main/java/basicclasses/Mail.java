/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicclasses;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author HARSHIT
 */
public class Mail {
       public int val;
       //old id : voteforindiaelection pass: - VoteIndia123
       //new
       //id : donotreply.evotingforindia
       //pass: - VoteIndia123
       
       
    public Mail(String to)
    {
        int otp = ThreadLocalRandom.current().nextInt(100000, 999999);
        String from = "evoting@gmail.com";
        String sub = "One Time Password(OTP) Verification";
        String mes = "Your 6 Digit One Time Password for Email Verification is " + String.valueOf(otp) + ".\n\nPlease note, this OTP is valid only for mentioned transaction and cannot be used for any other transaction.\n" +
"Please do not share this One Time Password with anyone.\n\n\n\nYours Truly,\nVote for INDIA Election Team\n\nNote: This is an electronic message. Please do not reply to this email.";
        
        String username = "donotreply.evotingforindia";
        String pass = "cpobovfopntoxbnf";
        
        val = otp;
        
        Properties properties = new Properties();

        properties.put("mail.smtp.user","username"); 
        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.port", "25"); 
        properties.put("mail.debug", "true"); 
        properties.put("mail.smtp.auth", "true"); 
        properties.put("mail.smtp.starttls.enable","true"); 
        properties.put("mail.smtp.EnableSSL.enable","true");

        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");   
        properties.setProperty("mail.smtp.port", "465");   
        properties.setProperty("mail.smtp.socketFactory.port", "465"); 

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, pass);
            }
        });
        
        try
        {
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            message.setSubject(sub);
            
            message.setText(mes);
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"OTP Sent Successfully Check your Email...");                                
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }  
    
    public Mail(String to,String voterid)
    {
        String from = "evoting@gmail.com";
        String sub = "Vote Recorded Successfully";
        String mes = "Hello,\nVoterId No.:- '"+voterid+"'\n\nYour vote has been recorded..\n\nThank you for VOTING !\n\n\n\nYours Truly,\nElection Commision INDIA";
        
        String username = "donotreply.evotingforindia";
        String pass = "cpobovfopntoxbnf";
        
        Properties properties = new Properties();

        properties.put("mail.smtp.user","username"); 
        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.port", "25"); 
        properties.put("mail.debug", "true"); 
        properties.put("mail.smtp.auth", "true"); 
        properties.put("mail.smtp.starttls.enable","true"); 
        properties.put("mail.smtp.EnableSSL.enable","true");

        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
        properties.setProperty("mail.smtp.socketFactory.fallback", "false");   
        properties.setProperty("mail.smtp.port", "465");   
        properties.setProperty("mail.smtp.socketFactory.port", "465"); 

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, pass);
            }
        });
        
        try
        {
            MimeMessage message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            message.setSubject(sub);
            
            message.setText(mes);
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Vote Recorded Sucessfully...");                         
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }    
    
    public int oneTimePass()
    {
        return val;
    }
}
    

