//requirement: if we need to create vehicle of type car and bike 

package Factory;

import java.util.Scanner;

interface Vehicle{
	void createvehicle();
}
class Car implements Vehicle{

	@Override
	public void createvehicle() {
		// TODO Auto-generated method stub
		System.out.println("car is created");
		
	}
	
}
class Bike implements Vehicle{

	@Override
	public void createvehicle() {
		// TODO Auto-generated method stub
		System.out.println("bike is created");
		
	}
	
}
//client class
public class WithoutFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle type");
		String vehicleType=sc.nextLine();
		Vehicle vehicle=null;
		if(vehicleType.equals("Car"))
				{
					vehicle=new Car();
				}
		else if(vehicleType.equals("Bike"))
{
	vehicle=new Bike();
}
		vehicle.createvehicle();
	}

}



//Problem:tightly coupled->suppose a new vehicle type comes like bus so we need to add that into this client function so we can see for every new change we have to modify client code that is wrong some how if something new is added our code will change in the background and it will work for client automatically
//solution:factory pattern
//vehicle factory will return create class object depending upon its type and client donot need to worry about the changes on their side
