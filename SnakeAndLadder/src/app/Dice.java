package app;
import java.util.Random;

public class Dice{
	public static int rollDice() {
		Random rn =new Random();
		int number=rn.nextInt(6);
		return (number+1);
	}
}
