package in.ac.sharda.pizzaapplication.domain;

public class Product {

	private int id, calories;
	
	private int price;
	private String name, desc;
	
	public Product() {
	}
	public Product(int id, int price, 
			String name, String desc, int calories) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.desc = desc;
		this.calories = calories;
	}
	
	
	
	public Product(int id, int calories) {
		this.calories = calories;
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}


	public int getCalories() {
		return calories;
	}

	public int getId() {
		return id;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof Product) {
			return ((Product)obj).getId()==id;
		}
		return false;
	}
}
