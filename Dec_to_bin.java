package numbersystem;

import java.util.Scanner;

public class Dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter the Decimal Number: ");
	      int num = scan.nextInt();
	      int binary=0, m=1, rem;
	      
	      while(num>0)
	      {
	         rem = num%2;
	         binary = binary + (rem*m);
	         m *= 10;
	         num /= 2;
	      }
	      
	      System.out.print("Decimal to binary " +binary);
	}

}
