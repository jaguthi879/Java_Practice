package Practiceprograms;

import java.util.Scanner;

public class NextPalindrome {
	
	 static int ispalindrome (int num){
		int n,r,sum=0;
		n=num;
		while(num>0) {
		r=num%10;
		sum=sum*10+r;
		num=num/10;		
	}
		if(n==sum) {
		return 1;
		}
		else {
			return 0;
		}
	 }
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int m=num+1;
		while(m>0) {
			if(ispalindrome(m)==0) {
				m=m+1;
			}else
				break;	
		}
			System.out.println(m);
			
		}
	}

