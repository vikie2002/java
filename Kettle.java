
public class Kettle {

	String color;
	String manufacturer;
	int maxCapacity;
	int currentCapacity;
	
	public Kettle(String c, String m, int mc) {
		System.out.println("a new kettle has been created");
		this.color = c;
		this.manufacturer = m;
		this.maxCapacity = mc;
		this.currentCapacity =0;
	}
	
	public void fillup(int amount) {
		if(currentCapacity + amount <= maxCapacity) { // if currentCapacity and the amount in the kettle is less than capacity.
		currentCapacity += amount; // the currentCapacity add the amount added into it.
		System.out.println("increase current Capacity");// message that is given if it isn't at maxCapacity.
		
		} else {
			System.out.println("Can not fill up any more");// if it is at maxCapacity send this message.
		}
	}
	public void pour(int amount) {
		if(currentCapacity>=50) {	//the amount that is been taken out of the kettle.
			currentCapacity -= amount;// take away from the amount that is in the kettle.
		} else { 
			System.out.println("Not enough water for a cup of tea");// if there is not enough water in the kettle then send a message saying that it can not take more out. 
		}
	}
	public String toString() {
		return color + " " + manufacturer + " " + currentCapacity +"/"+ maxCapacity; // information that is given from the test.java 
	}
	
}
