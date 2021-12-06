package fr.unilim.iut.kataparrot;

public class NorwegianParrot extends Parrot {
	
	private static final double MAXIMUM_SPEED = 24.0;
	private double voltage;
	
	public NorwegianParrot(double voltage	) {
		this.voltage=voltage;
	}
	
	@Override
	public double getSpeed() {
			return Math.min(MAXIMUM_SPEED, this.voltage * BASE_SPEED);
	}
}
