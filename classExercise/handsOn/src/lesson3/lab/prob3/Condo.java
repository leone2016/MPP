package lesson3.lab.prob3;


import java.util.List;

public class Condo extends Property {
	private int numberOfFloors;
	public Condo(Address address, int numberOfFloors) {
		super(address);
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public double computeRent(){
		return 400 * numberOfFloors;
	}
}
