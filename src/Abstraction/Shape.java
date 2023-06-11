package Abstraction;

 abstract class Shape {
	abstract void draw();
}
  class Rectangle extends Shape{

	  @Override
		void draw() {
		  System.out.println("This is  rectangle");			
		}
	  
	/*void draw() {
		System.out.println("This is  rectangle");
		
	}*/
	
	class Circle extends Shape{
		void draw() {
			System.out.println("This is circle");
			
		}
	class Triangle extends Shape{
		void draw() {
			System.out.println("This is triangle");		
		}
	}
	
	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.draw();
		
		
	}
		
		
	}	
}


