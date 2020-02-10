package Newyear.Newyear;

public class Sweets extends Gifts {
	protected String name;
	protected int weight;
	
	void setName(String name) {
		this.name = name;
	}
	void setWeight(int weight) {
		this.weight = weight;
	}
	String getName() {
		return name;
	}
	int getWeight() {
		return weight;
	}

}