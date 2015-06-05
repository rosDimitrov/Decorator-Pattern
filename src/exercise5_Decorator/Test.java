package exercise5_Decorator;

public class Test {

	public static void main(String[] args) {

		Ford myFord = new Focus();
		myFord = new PaintJob(myFord);
		myFord = new LeatherSeats(myFord);
		System.out.println(myFord.getDescription() + myFord.cost());
	}

}
