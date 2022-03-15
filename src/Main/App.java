package Main;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
	
	public static String getRandomValue(String[] list){
		Random rand = new Random();
		int randomNumber = rand.nextInt(list.length);
		String resultString = list[randomNumber];
		return resultString;
	}
	
	public static String getRandomValueString(String[] list, String previousItem) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(list.length);
		String resultString = list[randomNumber];
		while(resultString == previousItem) {
			randomNumber = rand.nextInt(list.length);
			resultString = list[randomNumber]; 
		}
		return resultString;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String newString = System.getProperty("line.separator");
		String[] settings = {"Milwaukee", "Tampa", "Denver"};
		String[] weapons = {"Gun", "Knife", "Hammer"};
		String[] villains = {"Agent Smith", "Palpatine", "Voldemort"};
		
		String settingsString = getRandomValue(settings);
		String weaponsString = getRandomValue(weapons);
		String villainsString = getRandomValue(villains);
		
		ArrayList<String> myAdventure = new ArrayList<String>(); // Create an ArrayList object
		myAdventure.add(settingsString);
		myAdventure.add(weaponsString);
		myAdventure.add(villainsString);
		
		System.out.println("Completed Adventue:");
	}
	
	
}

// 		*Java Choose Your Own Adventure*
//	As a developer, I want to start a new Java Project and create an App.java class that contains a main() method.
//	As a developer, I want to research “array literal” in Java so I can easily create three arrays of Strings.
//	As a hero, I want my adventure to consist of a randomly chosen setting, weapon, and villain, chosen from my three Array[String]s.
//	As a hero, I want the selected values to be saved in an ArrayList<String> called myAdventure.
//	As a hero, I want to loop over myAdventure to display all the original selected values.
//	As a hero, I want to be able to randomly re-select each of the values one at a time if chosen
//	As a hero, I want to replace the original value in the ArrayList with the new one I have selected in the same spot.
//	As a hero, I want to be given the option to reselect continually until I decide I am satisfied.
//	As a hero, I want to display my completed adventure in the terminal.
