package Static_examples;

public class StaticTest {
	
	public static void main(String[] args) {
		
	
	Car Toyota=new Car();
	Toyota.HighestSpeed=190;
	Toyota.Model="ABC";
	Car.Doors=4;
	
	System.out.println(Toyota.Model);
	System.out.println(Toyota.HighestSpeed);
	System.out.println(Car.Doors);
	System.out.println(Toyota.Steering);
	System.out.println(Toyota.Wheels);
	Car.displaystatic();//only static variables is displayed
	Toyota.display(); //Both static and non static variables is displayed
	
	
	 // class name followed by the static variable can be used directly if declared as Static
	  //ClassName.StaticVariabe;
      //ClassName.Method();
}
}