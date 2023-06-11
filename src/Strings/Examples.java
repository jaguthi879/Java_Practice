package Strings;

public class Examples {

	public static void main(String[] args) {
	
		   String s1 = "Blue is my Favorite color";
		   //length of string
		    int len = s1.length();
		    System.out.println("The string length of is:"+len);
		    
		    //substring of string
		    String newstrng = s1.substring(10, 22);
		    System.out.println("The substring of string is:"+newstrng);
		    //string in upper case
		    String upperstrng = s1.toUpperCase();
		    System.out.println("The upper case of string is:"+upperstrng);
		    
		    //string in lower case
		    String lowerstrng = s1.toLowerCase();
		    System.out.println("The upper case of string is:"+lowerstrng);
	}

}
