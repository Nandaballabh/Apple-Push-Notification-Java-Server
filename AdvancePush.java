import java.util.*;
import javapns.Push;
import javapns.notification.PushNotificationPayload;
import org.apache.log4j.*;
      
public class AdvancePush {
 
	public static void main(String[] args) {
	try {
			
			BasicConfigurator.configure();
			 
			 /* Build a blank payload to customize */ 
	PushNotificationPayload payload = PushNotificationPayload.complex();
	

       /* Customize the payload */ 
        payload.addAlert("Hello World!");;
        payload.addSound("alert.wav");
        payload.addCustomDictionary("body", "Hi APN Check");
        // etc.
		List<String> device = Arrays.asList("83dffa23ea92b3bcd9370a06b485d0c4664fc42cd0dd209104bad01ebf56e945");
       /* Push your custom payload */ 
       Push.payload(payload,  "keystore.p12", "password", false, device);
			
	} catch (Exception e){
		e.printStackTrace();
	}
		
	}
}

//https://code.google.com/p/javapns/wiki/PushNotificationAdvanced
// Complile javac -cp "jar/*" AdvancePush.java
// run java -cp .:"jar/*" AdvancePush
