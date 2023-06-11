package Strings;

public class Getthechar {

	public static void main(String[] args) {
		String str = "Welcometomyhouse";
     
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        System.out.println("The character at position 0 is " +
            (char)index1);
        System.out.println("The character at position 10 is " +
            (char)index2);

	}

}
