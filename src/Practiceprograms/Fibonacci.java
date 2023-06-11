package Practiceprograms;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n,x=0,y=1,m=-1;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the number");	
		n=sc.nextInt();
		
		if(n>0) {
		while(x<=n){
		System.out.println(x);	
			int z=x+y;	
			x=y; 
			y=z; 		
	}			
		}
		if(n<0) {
		while(x>n){
		System.out.println(x);	
			int z=x+m;	
			x=m; 
			m=z; 			
		}
}
}
}

