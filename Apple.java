package YourQuestions;

public class Apple extends Fruit {

	public Apple(int calories) {
		super(calories);
		removeSeeds();
		makeJuice();
	}

	public void removeSeeds() {
		System.out.println("Apple seeds removed");
	}
	
	@Override
	public void makeJuice() {
		System.out.println("Squeezing...Apple juice is my favorite ?");

	}
}
