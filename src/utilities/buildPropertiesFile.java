package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
 
public class buildPropertiesFile 
{
    public static void main( String[] args )
    {
    	Properties prop = new Properties();
 
    	try {
    		//set the properties value
    		prop.setProperty("stateGreeting", "Welcome to the Guesser/Learner application!");
 
    		//save properties to project root folder
    		prop.store(new FileOutputStream("config.properties"), null);
 
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
    }
}