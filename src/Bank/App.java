package Bank;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class App 
{
	public static void sendEmail(String message, String subject, String to, String from) {
		//variable for gmail
		String host = "smtp.gmail.com";
		Properties properties = System.getProperties();
		//System.out.println("PROPERTIES "+properties);
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465"); //check
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication("paperpattern1616@gmail.com","Ahamindrakar@4441");
			}
			
		});

		//session.setDebug(true);
		MimeMessage m = new MimeMessage(session);
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO	, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(message);
			
			Transport.send(m);
			//System.out.println( "sent successfully......... " );
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
