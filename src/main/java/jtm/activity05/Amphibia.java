package jtm.activity05;

import jtm.activity04.Road;


public class Amphibia extends jtm.activity04.Transport {
	
	//Make all internal properties of Amphibia private.
	
	private byte sails; //es uztaisiju
	private int wheels; //es uztaisiju

	public Amphibia (String id, float consumption, int tankSize, byte sails, int wheels){
		super(id, consumption, tankSize);
		this.sails = sails;
		this.wheels = wheels;
	}
	
	//Override move(Road road) method, that Amphibia behaves like a Vehicle on ground road and like a Ship on water road.
	
	@Override
	public String move(Road road){
		
		if (road instanceof Road){
			return super.getId() + " " + this.getClass().getSimpleName() + " is driving on " + road.toString()
			+ " with " + wheels + " wheels";
		} else {
			return super.getId() + " " + this.getClass().getSimpleName() + " is sailing on " + road.toString() + " with " + sails
					+ " sails";
		}
	}
	
}

 