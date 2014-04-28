/**
 *This class will create the Gui interface for the application
 *
 */
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class GUI extends Pizza 
{
	//Checkboxes for the veggies	
	
	  JCheckBox pepper = new JCheckBox ("Pepper");
	  JCheckBox onion = new JCheckBox  ("Onion");
	  JCheckBox tomatoes = new JCheckBox ("Tomatoes");
	  JCheckBox olive = new JCheckBox  ("Olive");
	  
	 //Checkboxes for the cheeses 
	  
	  JCheckBox mozzarella = new JCheckBox ("Mozzarella");
	  JCheckBox parmesan = new JCheckBox ("Parmesan");
	  JCheckBox provolone = new JCheckBox  ("Provolone");
	  
	  //Butttons for the meats
	  
	  JRadioButton pepperoni = new JRadioButton ("Pepperoni");
	  JRadioButton chicken = new JRadioButton  ("Chicken");
	  JRadioButton sausage = new JRadioButton ("Sausage");
	  	 
	  //Buttons for the sauces
	  
	  JRadioButton tomatoeSauce = new JRadioButton ("Tomatoe Sauce");
	  JRadioButton alfredoSauce = new JRadioButton  ("Alfredo Sauce");
	  JRadioButton barbecueSauce = new JRadioButton ("BarbecueSauce");
	  
	  //Buttons for the crusts
	  JRadioButton classic = new JRadioButton ("Classic: $ 1.00");
	  JRadioButton glutenFree = new JRadioButton  ("Gluten-Free: $ 1.25");
	  JRadioButton wholeWheat = new JRadioButton ("Whole-Wheat: $ 1.50");
	  
	  //Buttons for the sizes
	  
	  JRadioButton small = new JRadioButton ("Small: $ 4.00");
	  JRadioButton medium = new JRadioButton  ("Medium: $5.00");
	  JRadioButton large = new JRadioButton ("Large: $6.00");
	  
	  JLabel result = new JLabel();     	
	  
	    
		public GUI() 
		{
		super();
	
		}
		
		{
		
	  JButton calculate = new JButton("Calculate Total");
	  calculate.addActionListener(new AddingListener());
	  calculate.setForeground(Color.red);
	  calculate.setFont(new Font("Cooper Black", Font.BOLD,18));
	  calculate.setBackground(Color.cyan);
	
	  JButton grandTotal = new JButton ("Grand Total");
	  JButton print = new JButton("Print Confirmation");
	  print.setForeground(Color.RED);
	  print.setFont(new Font("Cooper Black", Font.BOLD, 18));
	  print.setBackground(Color.CYAN);
	  
	  JButton reset = new JButton ("Reset");
	  reset.setForeground(Color.red);
	  reset.setFont(new Font("Cooper Black", Font.BOLD, 18));
	  reset.setBackground(Color.CYAN);
	  
	  JButton order = new JButton("Place Order");
	  order.setForeground(Color.red);
	  order.setFont(new Font("Cooper Black", Font.BOLD, 18));
	  order.setBackground(Color.CYAN);
		
	
		
	  	  	  
	  /*Creating the different panels
	   * 
	   */
	  
		            
	  //Creating the panel for veggies and cheeses
	 
	  JPanel veggiesAndCheesesPanel = new JPanel();
	  veggiesAndCheesesPanel.setLayout(new GridLayout (2,5));
	  veggiesAndCheesesPanel.setPreferredSize(new Dimension (700,250));
	  veggiesAndCheesesPanel.setLocation(1, 1000);
	  veggiesAndCheesesPanel.setBorder(new TitledBorder( new EtchedBorder(),"Veggies and Cheeses Options"));
	  
	  //Grouping veggies and cheeses into 2 subgroups
	  
	  ButtonGroup theVeggies = new ButtonGroup();
	  theVeggies.add(pepper);
	  theVeggies.add(onion);
	  theVeggies.add(tomatoes);
	  theVeggies.add(olive);
	  
	  ButtonGroup theCheeses = new ButtonGroup();
	  theCheeses.add(mozzarella);
	  theCheeses.add(parmesan);
	  theCheeses.add(provolone);
	 	  
	  //Adding veggies and cheeses to the panel
	 
      veggiesAndCheesesPanel.add (onion);
      veggiesAndCheesesPanel.add (pepper);
      veggiesAndCheesesPanel.add (olive);
      veggiesAndCheesesPanel.add (tomatoes);		     
      veggiesAndCheesesPanel.add (mozzarella);
      veggiesAndCheesesPanel.add (provolone);
      veggiesAndCheesesPanel.add (parmesan);
      
	  //Creating the panel for meats and sauces
      
          
	  JPanel meatsAndSaucesPanel = new JPanel();
	  meatsAndSaucesPanel.setLayout(new GridLayout (2,3));
	  meatsAndSaucesPanel.setPreferredSize(new Dimension (700,250));
	  meatsAndSaucesPanel.setBorder(new TitledBorder(new EtchedBorder(), "Meats and Sauces Options"));
	 

	  //Grouping meats and sauces into 2 subgroups
	  
	  ButtonGroup theMeats = new ButtonGroup();
	  theMeats.add(pepperoni);
	  theMeats.add(chicken);
	  theMeats.add(sausage);
	  
	  ButtonGroup theSauces = new ButtonGroup();
	  theSauces.add(tomatoeSauce);
	  theSauces.add(alfredoSauce);
	  theSauces.add(barbecueSauce);
	  
	  //Adding meats and sauces to the panel
	  
	  meatsAndSaucesPanel.add (pepperoni);
      meatsAndSaucesPanel.add (chicken);
      meatsAndSaucesPanel.add(sausage);
      meatsAndSaucesPanel.add(tomatoeSauce);
      meatsAndSaucesPanel.add(alfredoSauce);
      meatsAndSaucesPanel.add(barbecueSauce);
      
      //Creating the panel for sizes and crusts
	  
	  JPanel sizesAndCrustsPanel = new JPanel();
	  sizesAndCrustsPanel.setLayout(new GridLayout (2,3));
	  sizesAndCrustsPanel.setPreferredSize(new Dimension (700,250));
	  sizesAndCrustsPanel.setForeground(Color.yellow.darker());
	  sizesAndCrustsPanel.setBorder(new TitledBorder(new EtchedBorder(),"Sizes and Crusts Options"));

	  //Grouping crusts and sizes into 2 subgroups
	  	  
	  ButtonGroup theSizes = new ButtonGroup();
	  theSizes.add(small);
	  theSizes.add(medium);
	  theSizes.add(large);
	  
	  ButtonGroup theCrusts = new ButtonGroup();
	  theCrusts.add(classic);
	  theCrusts.add(glutenFree);
	  theCrusts.add(wholeWheat);
	  
	  //Adding the sizes and crusts to the panel
	  
	  sizesAndCrustsPanel.add(small);
      sizesAndCrustsPanel.add(medium);
      sizesAndCrustsPanel.add(large);
      sizesAndCrustsPanel.add(classic);
      sizesAndCrustsPanel.add(glutenFree);
      sizesAndCrustsPanel.add(wholeWheat);
	  
	  //Creating the order panel
      
	  JPanel orderPanel = new JPanel();
	  orderPanel.setLayout(new GridLayout(1,3));
	  orderPanel.setPreferredSize(new Dimension (1000,200));
	  orderPanel.setBorder(new TitledBorder (new EtchedBorder(),"Order Pocessing"));
	  orderPanel.setFont(new Font("Cooper Black", Font.BOLD, 20)); 

	  //Adding components to the order panel
	  
	  orderPanel.add(result);
	  orderPanel.add(order);
	  orderPanel.add(calculate);
	  orderPanel.add(print);
	  orderPanel.add(reset);
	  
	  JPanel cartPanel = new JPanel();
	  cartPanel.setLayout(new GridLayout(1,4));
	  cartPanel.setPreferredSize(new Dimension (700,250));
	  cartPanel.setBorder(new TitledBorder (new EtchedBorder(), "Cart"));
	
	  cartPanel.setFont(new Font("Monospaced", Font.BOLD, 24));

	  
	  //Adding component to the panel
	  
	  cartPanel.add(grandTotal);
	  
	  	  	  
	  //main Panel
	  	  	  
	  		  JPanel mainPanel = new JPanel();
	  		  mainPanel.setLayout(new FlowLayout());
	  		  mainPanel.setBackground(Color.ORANGE);
	  		  mainPanel.add(sizesAndCrustsPanel);
	  		  mainPanel.add(meatsAndSaucesPanel);
	  		  mainPanel.add(veggiesAndCheesesPanel);
	  		  mainPanel.add(orderPanel);
	  		  mainPanel.add(cartPanel);
	  	  
	 
	  	  
	  	  	JFrame frame = new JFrame();
	  		
	  		frame.setSize(1500, 1500);
	  		frame.setTitle("Pizza Ordering System");
	  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  		frame.add(mainPanel);
	  		frame.setVisible(true);
	  } 


	//Adding action listeners
		class AddingListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{

			if (e.getSource() == small)
			{
		
				chooseSize(sizes[0]);
			}

			else if (e.getSource() == medium)
			{

				chooseSize(sizes[1]);
			}
		
			else if (e.getSource() == large)
			{

				chooseSize(sizes[2]);
			}
			
			
	//Adding action listeners for the Jbuttons	 
		 JButton pressed = (JButton)(e.getSource());
		 String text = pressed.getText();
		 		    		 
		 if(text.equals("Print Confirmation"))
		 {
			 //Cart.printConfirmation();
			 
		 }	  
		 
		 else if (text.equals ("Reset"))
		 {
			 resetOptions();
		 }
			
		 if(text.equals("Place Order"))
		 {
			 
		 }	
		 
		 if(text.equals("Calculate Total"))
		 {
			 calculateTotal();
			 result.setText("Your Total is: " + calculateTotal());
			 result.setVisible(true);
			 
		 }	  
		 
		 
		 if(text.equals("Grand Total"))
		 {
			 // Cart.calculateTotal();
		 }	  
	}
			
		
}
			
	@Override
	public double calculateTotal()
	{
		double partialPrice=0;
	    partialPrice = (quantity*pizzaPrice) + (quantity*crustPrice);
		
	    return 	partialPrice;
	}
	
	void resetOptions()
    {
      pepper.setSelected(false);
      onion.setSelected(false);
      olive.setSelected(false);
      tomatoes.setSelected(false);
      mozzarella.setSelected(false);
      parmesan.setSelected(false);
      provolone.setSelected(false);
    }

}
