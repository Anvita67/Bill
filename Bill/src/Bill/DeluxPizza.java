package Bill;

public class DeluxPizza extends Pizza {
	public DeluxPizza (Boolean veg) 
	{
		super(veg);
		//super.addExtraCheese();
		//super.addExtraToppings();
		
	}
	@Override
	public void addExtraCheese() {
		this.price += extraCheesePrice;
	}
 
	@Override
	public void addExtraToppings() {
		this.price += extraToppingsPrice;
	}
}
