package exercise5_Decorator;

public class Focus extends Ford {
	public Focus() {
		description = "Focus";
	}

	@Override
	public double cost() {
		return 900;
	}
}
