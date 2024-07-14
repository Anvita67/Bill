package Bill;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("-----------------Welcome to Pizzamania-------------------------\n");
		System.out.println("Which Pizza (1.veg pizza   2.non-veg pizza   3.Delux veg pizza     4.Delux non-veg pizza)===>");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1 :
			Pizza vegpizza =  new Pizza (true);
			vegpizza.addExtraToppings();
			vegpizza.addExtraCheese();
			vegpizza.takeAway();
			vegpizza.getBill();
			break;
		case 2 :
			Pizza nonvegpizza =  new Pizza (false);
			nonvegpizza.addExtraToppings();
			nonvegpizza.addExtraCheese();
			nonvegpizza.takeAway();
			nonvegpizza.getBill();
			break;
		case 3 :
			Pizza Deluxvegpizza =  new Pizza (true);
			Deluxvegpizza.addExtraToppings();
			Deluxvegpizza.addExtraCheese();
			Deluxvegpizza.takeAway();
			Deluxvegpizza.getBill();
			break;
		case 4 :
			Pizza Deluxnonvegpizza =  new Pizza (true);
			Deluxnonvegpizza.addExtraToppings();
			Deluxnonvegpizza.addExtraCheese();
			Deluxnonvegpizza.takeAway();
			Deluxnonvegpizza.getBill();
			break;
			
		}
		
	}

}
