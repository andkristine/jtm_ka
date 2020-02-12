package jtm.activity05;

import jtm.activity04.Road;

public class Vehicle extends jtm.activity04.Transport {

	protected int wheels;

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.wheels = wheels;
	}

	public String move(Road road) {
		if (road instanceof Road) {
			return super.getId() + " " + this.getClass().getSimpleName() + " is driving on " + road.toString()
					+ " with " + wheels + " wheels";
		} else {
			return "Cannot drive on " + road.getClass().getSimpleName() + " if it is not Road.";

		}
	}
}
