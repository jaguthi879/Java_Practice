package Static_examples;

public class Car {
	
	public String Model;
	public int HighestSpeed;
	public static int Steering;
	public static int Wheels;
	public static int Doors;
	
	
	public Car() {
		Steering = 1;
		Wheels = 4;	
	}		
	
	public void display() {
		System.out.println(Model);
		System.out.println(Wheels);
	}
    public static void displaystatic() {
    	System.out.println(Doors);
    	System.out.println(Steering);
    	System.out.println(Wheels);
    	//System.out.println(HighestSpeed);//not a static variable
   	
    }
   
}
