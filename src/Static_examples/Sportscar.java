package Static_examples;

public class Sportscar {
	public String Model;
	public int HighestSpeed;
	public final int Wheels;
	public int Steering;
	public static final int Doors = 4;
	
	
	public Sportscar() {
		Steering = 1;
		Wheels = 4;	
	}	
	public void m1() {
		System.out.println("this is method m1");
		
	}
    public final void m2() {
		System.out.println("this is method m2");
	}
    
    public void display() {
    	System.out.println(Model);
		System.out.println(Wheels);
		System.out.println(HighestSpeed);
		System.out.println(Steering);
		System.out.println(Doors);
    }

}
