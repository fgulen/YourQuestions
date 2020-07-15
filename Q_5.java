package YourQuestions;

public class Q_5 {
	
	/*
	 * Create below class variables. (Choose proper datatype and naming convention
	 * for variable (see the output) label price category hasExpiration stock
	 * (represent the stock quantity)
	 * 
	 * Step 2: Write three constructors: The main constructor( with all parameters)
	 * Second constructor with all parameters except category and hasExpiration
	 * (category defaults to "misc", hasExpiration defaults to false inside
	 * constructor) Third constructor all the parameters except category,
	 * expiration, and stock (stock default to 0 inside the constructor)
	 * 
	 * Step 3: Method for display output: In Store Class create a method to display
	 * the output of class variables. (Output sequence as as order of variable shown
	 * above. all in one line)
	 * 
	 * Step 4: in Main Class create an object of Store Class with each constructors,
	 * and pass the values. Lastly call the display method.
	 * 
	 * Step 5: Execute your application.
	 * 
	 * Hint: each variable must be object specific
	 * 
	 * Output: 
	 * Eggs 		3.0 	Produce true 10 
	 * Paper towels 2.0 	misc false 24
	 * Paper towels 2.0 	null false 0
	 */
	
	String label;
	double price;
	String  category ;
	boolean hasExpiration ; 
	int stock ;


	public Q_5(String label, double price, String category, boolean hasExpiration, int stock) {
		super();
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
		
		//System.out.println(toString());
		System.out.println(label+ " " + price + " " + category + " " + hasExpiration + " " + stock);
		
	}

	
	

	public Q_5(String label, double price, int stock) {
		super();
		this.label = label;
		this.price = price;
		this.stock = stock;
		category = "misc";
		hasExpiration = false;
		
		System.out.println(label+ " " + price + " " + category + " " + hasExpiration + " " + stock);

		}




	public Q_5(String label, double price) {
		super();
		this.label = label;
		this.price = price;
		stock=0;
		System.out.println(label+ " " + price + " " + category + " " + hasExpiration + " " + stock);

	}




	@Override
	public String toString() {
		return "Q_5 [label=" + label + ", price=" + price + ", category=" + category + ", hasExpiration="
				+ hasExpiration + ", stock=" + stock + "]";
	}




	public static void main(String[] args) {


		Q_5 qq = new Q_5("Eggs", 3.0, "Produce", true, 10);
		Q_5 qq2 =  new Q_5("Paper towels", 2.0, 24);
		Q_5 qq3 = new Q_5("Paper towels", 2.0);
	}

}
