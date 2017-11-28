import java.util.Scanner;

public class Driver
{
	public static void main(String [] args)
	{
		Dice object1 = new Dice(); //creates an object of class Dice
		TrippleDice object2 = new TrippleDice(); //creates an object from the TrippleDice class that uses methods from the Dice class
		System.out.println(object1.Value());
		System.out.println(object2.Throw()); 
	}
}