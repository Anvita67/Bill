package Bill;

import java.util.Scanner;

public class Pizza {
	protected int price;
	private Boolean veg;
	
	
	   protected int extraCheesePrice = 100;
	   protected int extraToppingsPrice = 150;
	   protected int backPackPrice = 100;
	   
	protected int basePizzaPrice;
	 
	
	   private boolean isExtraCheeseAdded= false;
	   private boolean isExtraToppingsAdded= false;
	   private boolean isOptedorTakeawayAdded= false;
	   
	   Scanner in = new Scanner(System.in);
	   
	   
	   public Pizza(Boolean veg) {
		   this.veg = veg;
		   
	   if(this.veg)
	   {
		   this.price = 300;
	   } else {
		   this.price = 400;
	   }
	  basePizzaPrice = this.price;
		   
	   }
	   
	public void addExtraCheese() {
		System.out.println("Extra cheese (y/n)? =>");
		char ch = in.next().charAt(0);
		switch(ch) {
		case ('y'):
			isExtraCheeseAdded = true;
		    this.price += extraCheesePrice;
		    break;
		case ('n'):
			isExtraCheeseAdded = false;
		    break;
		}
	}
	
	public void addExtraToppings() {
		System.out.println("Extra toppings (y/n)? =>");
		char ch = in.next().charAt(0);
		switch(ch) {
		case ('y'):
			isExtraToppingsAdded = true;
		    this.price += extraToppingsPrice;
		    break;
		case ('n'):
			isExtraToppingsAdded = false;
		    break;
		}
	}
	
	public void takeAway() {
		System.out.println("want to take  (y/n)? =>");
		char ch = Character.toLowerCase(in.next().charAt(0));
		switch(ch) {
		case ('y'):
			isOptedorTakeawayAdded = true;
		    this.price += backPackPrice;
		    break;
		case ('n'):
			isOptedorTakeawayAdded = false;
		    break;
		}
	}
	 
	public void getBill() {
		 String bill = " ";
		 
			System.out.println("Pizza: " +basePizzaPrice);
		 if(isExtraCheeseAdded) {
			 bill += "Extra cheese : "+extraCheesePrice+ "\n";
		 }
		 if(isExtraToppingsAdded) {
			 bill += "Extra Toppings : "+extraToppingsPrice+ "\n";
		 }
		 if(isOptedorTakeawayAdded) {
			 bill += "take awaye : "+backPackPrice+ "\n";
		 }
		bill += "\nTotal Amount:"+this.price +"\n";
		System.out.println(bill);
		System.out.println("\n\n\nThanks you!!!! Visit Again......");
		System.out.println("---------------------------------------------------------------------------");
		}
	}

	



