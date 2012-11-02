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
    		prop.setProperty("stateGoodbye", "Goodbye! Thanks for playing and helping me learn!");
    		prop.setProperty("stateInstructions", "In this game you think of a " +
					"object and I will try to guess what it is.");
    		prop.setProperty("stateThinkOfAnObject", "In this game you think of a " +
					"object and I will try to guess what it is.");
    		prop.setProperty("askObject", "Is it a object?");
    		prop.setProperty("askGiveUpQuestion", "I give up. " +
								"What kind of object were you thinking of?");
    		prop.setProperty("askForDistinguishingQuestion", "Please enter a yes/no question" +
								" that distinguishes between a incorrectGuess " +
								"and a correctAnswer:");
    		prop.setProperty("askForAnswer", "What is the answer for a object?");
    		prop.setProperty("askPlayAgain", "Would you like to play again?");
    		prop.setProperty("stateVictoryResponse", "I guessed it!");
 
    		//save properties to project root folder
    		prop.store(new FileOutputStream("config.properties"), null);
 
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
    }
}