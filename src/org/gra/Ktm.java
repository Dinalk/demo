package org.bike;

public class Ktm implements Bike{

	
	public void cost() {
		System.out.println("100");
	}
	public void speed() {
        System.out.println("120");
		
	}
	public static void main(String[] args) {
		Ktm bike=new Ktm();
		
		bike.speed();
		bike.cost();


}
	
}
