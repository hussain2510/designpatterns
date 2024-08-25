//requirement:vehicle factory will return create class object depending upon its type and client donot need to worry about the changes on their side
package Factory;

import java.util.Scanner;

interface Vehicle1{
	void createVehicle();
}
class Car1 implements Vehicle1{

	@Override
	public void createVehicle() {
		// TODO Auto-generated method stub
		System.out.println("car is created");
	}
	
}
class Bike1 implements Vehicle1{

	@Override
	public void createVehicle() {
		// TODO Auto-generated method stub
		System.out.println("bike is created");
		
	}
	
}
class VehicleFactory{
	static Vehicle getVehicle(String vehicleType)
	{
		Vehicle vehicle=null;
		if(vehicleType.equals("Car"))vehicle =new Car();
		else if(vehicleType.equals("Bike")) vehicle=new Bike();
		return vehicle;
	}
	
}
public class WithFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter vehicletype");
		Scanner sc=new Scanner(System.in);
		String vehicletype=sc.nextLine();
		Vehicle vehicle=VehicleFactory.getVehicle(vehicletype);
		vehicle.createvehicle();
		

	}

}

//benifits:
//now client donot need to worry about how to logic of creation of object is happening behind the scene client can use vehicle factory to get the vehicle of desired type 
//flexibility or adaptiblity for adding new vehilce in the future we can only need to modify the factory class and client can easily use that 
//for example like bus is added then only factory class need to modify and client can get bus object



//changes for new type of vehicle
//if some bus come then 
//class bus implements vehicle{createVehicle(){bus is created}}
//and in the vehiclefactory only add if(type==bus)return vehicle=new bus()
