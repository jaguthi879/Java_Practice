package Strings;

public class Concatnate {
	public static void main(String[] args) {
		 String s1 = "Today is ";
	      String s2 = "Beautiful day";	        
	     String s3 = s1.concat(s2);
	     String s4= "Beautiful";

	      System.out.println("The concatenated string: " + s3);
	      
	      //finding particular word is present or not 
	      
	      System.out.println("Original String is: " + s2);
	      
	        System.out.println(s2.contains(s4));
	    }
	}


