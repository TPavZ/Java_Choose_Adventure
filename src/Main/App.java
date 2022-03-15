package Main;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
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
	}
}
