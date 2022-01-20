package numbersystem;

import java.util.Scanner;

public class Oct_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Octal Number");
		int octalnum = s.nextInt();
		int i=0, decimal=0, digit;
		
		while(octalnum>0){
		  
		    digit = octalnum%10; 
		    decimal += Math.pow(8,i++)* digit;  //multiply with exponential of 8 and add to the decimal
		    octalnum = octalnum/10;
		}
		
		System.out.println(" Octal to Decimal: "+decimal);
	}

}
