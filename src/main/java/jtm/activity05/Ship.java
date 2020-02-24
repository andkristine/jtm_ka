package jtm.activity05;

import jtm.activity04.Road;

public class Ship extends jtm.activity04.Transport {

	protected byte sails;

	public Ship(String id, byte sails) {
		super(id, 0, 0);
		this.sails = sails;
	}

	public String move(Road road) {
		if (road instanceof WaterRoad) {
			return super.getId() + " " + this.getClass().getSimpleName() + " is sailing on " + road.toString()
					+ " with " + sails + " sails";
		} else {
			return "Cannot sail on " + road.toString();

		}

	}
}
