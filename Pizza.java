
/**
 * 	The Pizza class handles the declaration of the different components that will make up a pizza
 *  @author Farha C. Rondeau
 * 
 */

public abstract class Pizza 
{	
	//Setting up the different prices

	static final double SMALL_PIZZA_PRICE = 4.00;
	static final double MEDIUM_PIZZA_PRICE = 5.00;
	static final double LARGE_PIZZA_PRICE = 6.00;
	static final double CLASSIC_PRICE = 1.00;
	static final double GLUTEN_FREE_PRICE = 1.25;
	static final double WHOLE_WHEAT_PRICE = 1.50;

	//The size options
	private int small;
	private int medium;
	private int large;

	//The Crusts options

	private int glutenFree;
	private int wholeWheat;
	private int classic;

	//The Sauce options

	private int tomatoSauce;
	private int alfredoSauce;
	private int barbecueSauce;  

	//The cheese options

	private int mozzarella;
	private int parmesan;
	private int provolone;

	//The meat options

	private int  pepperoni;
	private int  sausage;
	private int  chicken;

	//The veggies options

	private int pepper;
	private int onion;
	private int tomatoe;
	private int olive;

	//Putting each set of options into one group 

	int	  [] sizes  = {small, medium, large};
	int   [] crusts = {glutenFree, wholeWheat, classic};
	int   [] sauces = {tomatoSauce, alfredoSauce, barbecueSauce};
	int   [] cheeses= {mozzarella, parmesan, provolone};
	int   [] meats  = {pepperoni, sausage, chicken};
	int   [] veggies= {pepper, onion, tomatoe, olive};

	//Variables declaration

	int orderNumber;
	static double pizzaPrice;
	static double crustPrice;
	static int quantity;
	int size;
	int crust;
	int sauce;
	int cheese;
	int meat;
	int veg;

	/**
	 * Creating a pizza object
	 *
	 */
	
	public Pizza() 
	{
		orderNumber = 0;
		pizzaPrice = 0;
		crustPrice = 0;
		quantity = 0;
		size = 0;
		crust = 0;
		sauce = 0;
		cheese = 0;
		meat = 0;
		veg = 0;
	}

	//The following concrete methods select the Components that will be used to create a pizza

	/**
	 * Randomly select an order number
	 * 
	 * @return the orderNumber
	 */

	public int selectOrderNumber()
	{
		orderNumber = (int) Math.random();

		return orderNumber;
	}

	/**
	 * Select price based on the pizza size
	 * 
	 * @return the PizzaPrice
	 */

	public double selectPizzaPrice()
	{		
		if (size == large)
		{	
			pizzaPrice = LARGE_PIZZA_PRICE;
		} 

		else if (size == medium)
		{
			pizzaPrice = MEDIUM_PIZZA_PRICE;
		}

		else if (size == small)
		{
			pizzaPrice = SMALL_PIZZA_PRICE;
		}

		return pizzaPrice;
	}

	/**
	 * Select price based on the pizza crust
	 * 
	 * @return the crustPrice
	 */
	
	public double selectCrustPrice()
	{		
		if (crust == classic)
		{	
			crustPrice = CLASSIC_PRICE;
		} 

		else if (crust == glutenFree)
		{
			pizzaPrice = GLUTEN_FREE_PRICE;
		}

		else if (crust == wholeWheat)
		{
			crustPrice = WHOLE_WHEAT_PRICE;
		}

	return crustPrice;
	}
	
	/**
	 * Set the quantity of pizza needed
	 * 
	 * @param quantity
	 */

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	/**
	 * Obtain the quantity of pizza ordered
	 * 
	 * @return the quantity of pizza ordered
	 */

	public int getQuantity() 
	{
		return quantity;
	}

	/**
	 * Select the pizza size
	 * @param sz 
	 */

	public void chooseSize(int sz)
	{		
		size = sz;
	}
	/**
	 * Select the pizza crust
	 * 
	 * @return the crust of choice
	 */

	public int chooseCrust()
	{
		for (int i = 0; i < crusts.length; i++)

			crust = crusts[i];

		return crust;
	}

	/**
	 * Select the pizza sauce
	 * 
	 * @return the sauce of choice
	 */

	public int chooseSauce()
	{
		for (int i = 0; i < sauces.length; i++)

			sauce = sauces[i];

		return sauce;
	}

	/**
	 * Select the pizza cheese
	 * 
	 * @return the cheese of choice
	 */

	public int chooseCheese()
	{
		for (int i = 0; i < cheeses.length; i++)

			cheese = cheeses[i];

		return cheese;
	}

	/**
	 * Select the pizza meat
	 * 
	 * @return the meat of choice
	 */

	public int chooseMeat()
	{
		for (int i = 0; i < meats.length; i++)

			meat = meats[i];

		return meat;
	}

	/**
	 * Select the pizza veggies
	 * 
	 * @return the veggies of choice
	 */

	public int chooseVeggies()
	{
		for (int i = 0; i < veggies.length; i++)

			veg = veggies[i];

		return veg;

	}

	/**
	 * Abstract method that will be implemented in subclasses
	 * 
	 * @return a double object
	 */

	public abstract double calculateTotal();
}
