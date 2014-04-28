import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements the payment process
 
 * @author Farha C. Rondeau
 * 
 */

public class Cart extends Pizza 
{
	private static double partialPrice;
	private static double TAX = partialPrice * 0.07;
	

	

	public Cart()
	{
		super();
	}

	public void makePayment(ArrayList<int[]> cardNumber)
			throws FileNotFoundException 
		{
		System.out.println("Please enter card number.");

		cardNumber = new ArrayList<int[]>();
		Scanner in = new Scanner(new FileReader("cardNum.txt"));

		while (in.hasNextInt())
		{
			cardNumber.equals(in);

		}

		if ((cardNumber.indexOf(0)) != 4 || ((cardNumber.indexOf(0)) != 5))
		{
			System.out.println("Please verify card number: should start with '4' for Visa or '5' for Mastercard");
		}

		in.close();

		System.out.println("This is your card Number");
		System.out.println(cardNumber.toString());
		System.out.println("Proceed with payment?");
		String answer = "";

		if (answer == "yes") 
		{
			printConfirmation();
		}
		
		else if (answer == "no")
		{
			cardNumber.clear();
			in.reset();
		}

	}

	public double calculateTotal()
	{
		partialPrice = (quantity*pizzaPrice) + (quantity*crustPrice);
		
		return partialPrice + TAX;
	}
	
	public String totalToString()
	   {
	      double grandTotal = calculateTotal();
	      NumberFormat formatter = NumberFormat.getCurrencyInstance();
	      return formatter.format(grandTotal);
	   }

	public void printConfirmation() 
	{
		System.out.println("Your total price is: " + totalToString());
	}

}
