package Practiceprograms;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		int n,r,sum=0,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		t=n;
		while(n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
		}
		if(t==sum) 
			System.out.println("Number is palindrome");
		else 
			System.out.println("Number is not a palindrome");
			}		
	}


     
