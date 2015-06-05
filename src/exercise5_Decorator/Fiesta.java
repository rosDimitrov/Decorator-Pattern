package exercise5_Decorator;

public class Fiesta extends Ford {

	public Fiesta() {
		description = "Fiesta";
	}

	@Override
	public double cost() {
		return 500;
	}

}
