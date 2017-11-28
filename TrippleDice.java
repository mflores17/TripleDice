public class TrippleDice extends Dice
{
	private Dice D1; //lines 3-5 create variables of type Dice
	private Dice D2;
	private Dice D3;

	public TrippleDice()
	{
		D1= new Dice(); //lines 9-11 initialize the new variable with random numbers from the constructor in Dice
		D2= new Dice();
		D3= new Dice();
	}
	
	public int Throw()
	{
		int average = D1.Value() + D2.Value() + D3.Value(); //simply adds up the returned random numbers from class Dice
		return average/3; //divides the added random numbers by 3 to return an average.
	}
}