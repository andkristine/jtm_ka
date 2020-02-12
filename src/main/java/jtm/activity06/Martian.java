package jtm.activity06;

public class Martian implements Alien, Humanoid, Cloneable {

	private int weight;
	private boolean alive;
	private String[] backpack;
	private int armCount;
	private int legCount;

	public Martian(int weight) {
		this.weight = weight;
		this.alive = true;
		this.backpack = new String[10];
		this.armCount = ARM_COUNT;
		this.legCount = LEG_COUNT;
	}

	public Martian() {
		this(42);
	}

	@Override
	public String killHimself() {
		this.alive = true;
		return "I AM IMMORTAL!";
	}

	@Override
	public int getArmCount() {
		return this.armCount;
	}

	@Override
	public String[] getBackpack() {
		return this.backpack;
	}

	@Override
	public void addToBackpack(String item) {
		for (int i = 0; i < this.backpack.length; i++) {
			if (this.backpack[i] == null) {
				this.backpack[i] = item;
				break;
			}
		}

	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		if (humanoid.isAlive().equals("Alive")) {
			humanoid.killHimself();
			this.weight = this.getWeight() + humanoid.getWeight();
		}
	}

	@Override
	public int getLegCount() {
		return LEG_COUNT;
	}

	@Override
	public String isAlive() {
		this.alive = true;
		return "I AM IMMORTAL!";
	}
	
	public void setArmCount(int armCount) {
		this.armCount = armCount;
	}
	
	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}
	
	public void setBackpack(String[] backpack) {
		this.backpack = backpack;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	  
		Martian m = new Martian();
		m.setArmCount(this.getArmCount());
		m.setLegCount(this.getLegCount());
		m.setWeight(this.getWeight());
		m.setBackpack(this.getBackpack());
		
	  	return m;
	}


}
