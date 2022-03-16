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
	};
	
	public static String getNewRandomValue(String[] list, String previousItem) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(list.length);
		String resultString = list[randomNumber];
		while(resultString == previousItem) {
			randomNumber = rand.nextInt(list.length);
			resultString = list[randomNumber]; 
		}
		return resultString;
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] settings = {"Milwaukee", "Tampa", "Denver"};
		String[] weapons = {"Gun", "Knife", "Hammer"};
		String[] villains = {"Agent Smith", "Palpatine", "Voldemort"};
		
		String settingsString = getRandomValue(settings);
		String weaponsString = getRandomValue(weapons);
		String villainsString = getRandomValue(villains);
	
		ArrayList<String> myAdventure = new ArrayList<String>();
		myAdventure.add(settingsString);
		myAdventure.add(weaponsString);
		myAdventure.add(villainsString);

		System.out.println("Completed Adventue:" + "\n");
		for(String nameString : myAdventure) {
			System.out.println(nameString);
		}
		
		boolean confirmed = false;
		while(confirmed == false){
			System.out.println("\n" + "Would you like to modify the adventure?" + "\n" + "Type: 0 - For NO, 1 - for Setting, 2 - for Weapon, & 3 - for Villian.");
			int response = sc.nextInt();
			switch(response) {
				case 0:
					System.out.println("\n" + "Done, Thank You!");
					confirmed = true;
					break;
				case 1:
					String updateSettingsString = getNewRandomValue(settings, myAdventure.get(0));
					myAdventure.set(0, updateSettingsString);
					System.out.println("\n" + "New Adventure:" + "\n" + "\n" + updateSettingsString + "\n" + myAdventure.get(1) + "\n" + myAdventure.get(2));
					break;
				case 2:
					String updateWeaponsString = getNewRandomValue(weapons, myAdventure.get(1));
					myAdventure.set(1, updateWeaponsString);
					System.out.println("\n" + "New Adventure:" + "\n" + "\n" + myAdventure.get(0) + "\n" + updateWeaponsString + "\n" + myAdventure.get(2));
					break;
				case 3:
					String updateVillainsString = getNewRandomValue(villains, myAdventure.get(2));
					myAdventure.set(2, updateVillainsString );
					System.out.println("\n" + "New Adventure:" + "\n" + "\n" + myAdventure.get(0) + "\n" + myAdventure.get(1) + "\n" + updateVillainsString);
					break;
			};	
			
		};
	
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
