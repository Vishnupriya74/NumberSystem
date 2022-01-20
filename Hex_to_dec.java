package numbersystem;

import java.util.Scanner;

public class Hex_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any hexadecimal number: ");
		String hexnum = s.nextLine();
		s.close();
		int num = Integer.parseInt(hexnum,16);
			
		System.out.println("Decimal equivalent of given hex number: "+num);
	}

}
