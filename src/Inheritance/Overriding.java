package Inheritance;

		class Bank{
			
			int getrateofinterest() {
				return 0;
			}
		class SBI extends Bank{
			int getrateofinterest() {
				return 15;
			}	
		}
		class ICICI extends Bank{
				int getrateofinterest() {
					return 10;
			
		}
			}	
			class HDFC extends Bank{
					int getrateofinterest() {
						return 12;
					}
				}

 public class Overriding {
	public static void main(String[] args) {
		Bank obj =new Bank();
		
		SBI obj1= obj.new SBI();
		System.out.println(obj1.getrateofinterest());
		
		ICICI obj2=obj.new ICICI();
		System.out.println(obj2.getrateofinterest());
		
		HDFC obj3=obj.new HDFC();
		System.out.println(obj3.getrateofinterest());
			
	}
}
}


