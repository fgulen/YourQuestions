package YourQuestions;

public class Q_2 {

	 static String ss="I am Sprinter!";
	
	/*
	 * Declare static variable in class level as below and assign it's value: String
	 * Then print it's value in you main method using three ways you learned so far
	 * Hint: First way: by calling directly 
	 * Second way: by using the className 
	 * Third way: by creating the object of the class
	 * Output: I am Sprinter! I am Sprinter! I am Sprinter!
	 */

	
	public static void main(String[] args) {
		
		//1
		System.out.println(ss);
		
		//2
		System.out.println(Q_2.ss);
		
		//
		Q_2 qq = new Q_2();
		System.out.println(qq.ss);
		
	}

}
