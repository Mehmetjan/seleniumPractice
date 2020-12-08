package iuhrdf;

import java.util.Properties;
import java.net.PasswordAuthentication;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {
public static void main(String[] args) {
	String to = "mbbugra1986@gmail.com";
	String from =  "bugra19860105@gmail.com";
	//String host=  "local host";
	String host = "smtp.gmail.com";
	Properties properties = System.getProperties();
	properties.setProperty("mail.smtp.host",host);
	properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", "465");
    properties.put("mail.smtp.ssl.enable", "true");
    properties.put("mail.smtp.auth", "true");
	
	
	//Session session = Session.getDefaultInstance(properties);
    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {

            return new javax.mail.PasswordAuthentication("bugra19860105@gmail.com", "mb8.....5");

        }

    });
	  

    try {
        // Create a default MimeMessage object.
        MimeMessage message = new MimeMessage(session);

        // Set From: header field of the header.
        message.setFrom(new InternetAddress(from));

        // Set To: header field of the header.
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        // Set Subject: header field
        message.setSubject("This is the javamail Subject Line!");

        // Now set the actual message
        message.setText("This is java mail bod part, so i can edit and add content here...");

        System.out.println("now sending...");
        // Send message
        Transport.send(message);
        System.out.println("Sent message successfully....");
    } catch (MessagingException mex) {
        mex.printStackTrace();
    }

}
}



/*
 add these two dependencies to pom.xml file:
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>javax.activation-api</artifactId>
    <version>1.2.0</version>
</dependency>
<dependency >
            <groupId >com.sun.mail </groupId >
            <artifactId >javax.mail </artifactId >
            <version >1.5.4 </version >
        </dependency >

  </dependencies>


*/
