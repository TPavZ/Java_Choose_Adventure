package Main;
import java.util.ArrayList;
import java.util.Random;


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
}
