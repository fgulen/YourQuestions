package YourQuestions;

public class Banana extends Fruit {
		
		public Banana(int calories) {
		super(calories);
		peel();
		makeJuice();
	}

		public void peel() {
			System.out.println("Banana has been peeled");
			
		
		}
		
		@Override
		public void makeJuice() {
			System.out.println("Squeezing...Banana juice is gross ?");

		}
	}


