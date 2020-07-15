package YourQuestions;

public class Q_4 {

	/*
	 * Q4
	 * 
	 * 1. Complete the Dog.java class: Create following class variables. dogName;
	 * dogWeight; static dogBreed=Pug;
	 * 
	 * For all methods and variables use proper naming convention.
	 * 
	 * Write two constructors: The main constructor(include all the variables as
	 * parameter) A secondary constructor that takes in only Name and Weight
	 * 
	 * 2. Create a display method to print the values of class variable in Dog
	 * class.
	 * 
	 * 3. In Main class Create a Dog object using both Constructors.and they call
	 * display method with each object
	 * 
	 * Output examples:
	 * 
	 * Expected output 1 (the main constructor(with all parameters)): Louis Pug 7
	 * 
	 * Expected output 2 (secondary constructor that takes in only Name and Weight
	 * (Breed defaults to “Pug") Louis Pug 7
	 */
	
	
	String dogName;
	int dogWeight; 
	static String dogBreed="Pug";

	
	
	public Q_4(String dogName, int dogWeight) {
		this.dogName = dogName;
		this.dogWeight = dogWeight;
		System.out.println(dogName + " " +dogBreed +" " +dogWeight);
		
	}

	 
	public static void main(String[] args) {

	Q_4 qq = new Q_4("Louis", 7);
		
		
	}

}
