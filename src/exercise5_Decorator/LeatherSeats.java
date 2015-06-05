package exercise5_Decorator;

public class LeatherSeats extends Extras {

	Ford ford;

	public LeatherSeats(Ford ford) {
		this.ford = ford;
	}

	@Override
	public String getDescription() {
		return ford.getDescription() + ", Leather";
	}

	@Override
	public double cost() {
		return 50 + ford.cost();
	}
}
