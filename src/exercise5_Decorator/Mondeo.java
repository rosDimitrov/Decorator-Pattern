package exercise5_Decorator;

public class Mondeo extends Ford {

	public Mondeo() {
		description = "Mondeo";
	}

	@Override
	public double cost() {
		return 600;
	}
}
