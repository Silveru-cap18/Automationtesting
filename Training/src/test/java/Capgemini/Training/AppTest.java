package Capgemini.Training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class AppTest {



	public static void main(String []args) {
		App a=new App();
		String regex="^(.+)@(.+)$";
		String email=a.userEmail("sowmyagmail");
		Pattern pattern=Pattern.compile(regex);
		
		Matcher match=pattern.matcher(email);
	    System.out.println("is is match::"+match.matches());
	    
	    
        String regex1="^[0-9]{0,6}$";
        String password=a.userPassword("efr267");
        
        Pattern pattern1=Pattern.compile(regex1);
         
        Matcher match1=pattern1.matcher(password);
        System.out.println("is is match password::"+match1.matches());
	    
        
		System.out.println(email);
		System.out.println(password);
		String login=a.login("succesful");
		System.out.println(login);
         
    
	
    }
}