package Main;
import java.util.Random;
import java.util.ArrayList;


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
}
