package chapter3.comparable.model;

public class Order implements Comparable<Order> {

	private double value;
	
	public Order(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(Order order) {
		
		// Eğer b > a gibi
		if(order.getValue() > this.getValue()) {
			return -1;
		}
		// Eğer a == b gibi
		else if(order.getValue() == this.getValue()) {
			return 0;
		}
		// Eğer b < a gibi
		else if(order.getValue() < this.getValue()) {
			return 1;
		}
		
		return this == order ? 1 : -1;
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(this.getValue());
	}

}
