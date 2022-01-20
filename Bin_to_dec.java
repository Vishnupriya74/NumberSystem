package numbersystem;

import java.util.Scanner;

public class Bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
	       System.out.print("Enter a binary number: ");
	       String binary=input.nextLine();
	       System.out.println("Output: "+Integer.parseInt(binary,2));
	    }
	

}
