import java.util.Arrays;
public class Dice
{
	private int total;
	private int[] arrayRoll;
	
	public Dice()
	{
		int randomRoll = 1 + (int) ( Math.random() * 6);
		total = randomRoll;
	}
	public int Throw(int n) //throw method that allows any number of rolls to be input by the user
	{
		arrayRoll = new int [n]; //will be used to save the history of the rolls
		for (int i = 0; i < n; i++) //i < n is the termination. As soon as i is not less than the user input of rolls the loop will end
		{
		int randomRoll = 1 + (int) ( Math.random() * 6);
		arrayRoll[i]=randomRoll;//generates a random number between 1 and 6
		total = total + randomRoll; //will add up all the rolls
		//System.out.println(randomRoll);
		}
		
		return total;
	}
	public int SetDices(int n) //int n is the user input numRolls from DiceTest.java
	{
		Throw(n); //runs the Roll(int n) method
		return n; 
	}
	public int Value()
	{
		return total; //returns the total number added up from all the rolls. If that method isn't used it will only return one roll.
	}
	public String History()
	{
		return Arrays.toString(arrayRoll); //returns the array as a string
	}
}

