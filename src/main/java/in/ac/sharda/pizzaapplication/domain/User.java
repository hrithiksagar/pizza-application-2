package in.ac.sharda.pizzaapplication.domain;

public class User {
	
	private Cart cart=Cart.getInstance();
	
	private static final User instance=new User();
	private User() {
		
	}
	
	
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public static User getInstance(){
		return instance;
	}
}
