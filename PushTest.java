import javapns.Push;
import org.apache.log4j.*;
      
public class PushTest {
 
	public static void main(String[] args) {
	try {
			BasicConfigurator.configure();
			Push.alert("Hi New APN", "keystore.p12", "password", false, "83dffa23ea92b3bcd9370a06b485d0c4664fc42cd0dd209104bad01ebf56e945");
			
	} catch (Exception e){
		e.printStackTrace();
	}
		
	}
}

//https://code.google.com/p/javapns/wiki/PushNotificationAdvanced
// Complile javac -cp "jar/*" PushTest.java
// run java -cp .:"jar/*" PushTest