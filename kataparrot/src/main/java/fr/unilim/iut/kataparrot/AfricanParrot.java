package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {
	
	private static final double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts;
	
	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(MINIMUM_SPEED, BASE_SPEED - LOAD_FACTOR * this.numberOfCoconuts);
	}
}