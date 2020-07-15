package YourQuestions;

public class Q_3 {

	
	/*
	 * Q3
	 * 
	 * We declare two static variables as show in assignment s
	 * 
	 * For you to do: Create a static method and inside it write the logic follow
	 * the steps. Step 1: Assign values to the static variables. as below. age = 30;
	 * name = Daniel
	 * 
	 * Step 2: Print out the values on each variable one by one.
	 * 
	 * Step 3: using static way only call the method you just created in you main
	 * method.
	 * 
	 * Hint: Do not create an object
	 * 
	 * Output: 30 Daniel
	 */
	
	static int age; 
	static String name;
	
	static void getName() {
		
		age=30;
		name="Daniel";
		System.out.println(age+" "+name);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	getName();
	
	}

}
