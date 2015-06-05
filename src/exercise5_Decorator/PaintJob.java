package exercise5_Decorator;

public class PaintJob extends Extras {

	Ford ford;

	public PaintJob(Ford ford) {
		this.ford = ford;
	}

	@Override
	public String getDescription() {
		return ford.getDescription() + ", PaintJob";
	}

	@Override
	public double cost() {
		return 30 + ford.cost();
	}

}
