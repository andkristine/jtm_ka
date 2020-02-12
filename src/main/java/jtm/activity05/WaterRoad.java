package jtm.activity05;

public class WaterRoad extends jtm.activity04.Road {

	public WaterRoad() {
		super();
	}

	public WaterRoad(String from, String to, int distance) {
		super(from, to, distance);
	}

	public String toString() {
		return "WaterRoad " + super.getFrom() + " — " + super.getTo() + ", " + super.getDistance() + "km";
	}
}
