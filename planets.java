/****************************************************************************
 * Created by: Wendi Yu
 * Created on: Feb 21 2019
 * Created for: ICS4U
 * This program for planets and its position.
 ****************************************************************************/
import java.util.Scanner;

public class planets {
	
	public static void main(String[] args) {
		Planets userChoice;
		/* for the name of the planets display in order 
		 *method returns array of Enum constants in the same order
		 *it have listed in Enum 
		 */
		for(Planets planetName : Planets.values()) {
			System.out.println("Planets: " + planetName);
		}
		
		System.out.println("Enter a planet you want to go: ");
		
		Scanner userInput = new Scanner(System.in);
		String user = userInput.nextLine();
		
		// convert whatever userChoice into upper case so the program can run.
		userChoice = Planets.valueOf(user.toUpperCase());
		
		//Using Enum in Switch case statement
		switch(userChoice) {
		
		case MERCURY :
			System.out.println("You would like to go " + Planets.MERCURY + " , the position is " + Planets.MERCURY.position + "st.");
			break;
			
		case VENUS :
			System.out.println("You would like to go " + Planets.VENUS + " , the position is " + Planets.VENUS.position + "nd.");
			break;
		
		case EARTH :
			System.out.println("You would like to go " + Planets.EARTH + " , the position is " + Planets.EARTH.position + "rd.");
			break;
			
		case MARS :
			System.out.println("You would like to go " + Planets.MARS + " , the position is " + Planets.MARS.position + "th.");
			break;
		
		case JUPITER :
			System.out.println("You would like to go " + Planets.JUPITER + " , the position is " + Planets.JUPITER.position + "th.");
			break;	
		
		case SATURN :
			System.out.println("You would like to go " + Planets.SATURN + " , the position is " + Planets.SATURN.position + "th.");
			break; 
			
		case URANUS :
			System.out.println("You would like to go " + Planets.URANUS + " , the position is " + Planets.URANUS.position + "th.");
			break;
			
		case NEPTUNE :
			System.out.println("You would like to go " + Planets.NEPTUNE + " , the position is " + Planets.NEPTUNE.position + "th.");
			break;
			
		}
		
	}
	 //Idea froms https://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html
	
	public enum Planets{
		
		//declare planet position
		MERCURY(1),
		VENUS(2),
		EARTH(3),
		MARS(4),
		JUPITER(5),
		SATURN(6),
		URANUS(7),
		NEPTUNE(8);
		
		private final int position;
		
		private Planets(int position) {
			this.position = position;
		}
		
	}

}
