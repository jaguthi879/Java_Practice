package Static_examples;

public final class FinalTest extends Sportscar {
	
	public void m1() {
		System.out.println("this is method m1");
		
	}
	//If a Final modifier is used in the declaration of a method, it means the method cannot be overridden.
   /* public final void m2() {
		System.out.println("this is method m2");
	}*/
	
	public static void main(String[] args) {
		FinalTest b=new FinalTest();
		b.HighestSpeed=280;
		//b.Wheels=4; //cannot change the final variable values 
		//b.Doors=4; //cannot change the final variable values 
		b.Model="high";
		b.Steering=2;
		b.m1();
		b.m2();
		b.display();
		
	}
}