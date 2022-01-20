package numbersystem;

import java.util.Scanner;

public class Dec_to_oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
	     System.out.print("Enter a decimal number : ");
	     int num =input.nextInt();
		 int rem;
		  String str=""; 
		  char dig[]={'0','1','2','3','4','5','6','7'}; // Digits in Octal number system
		 
		    while(num>0)
		    {
		       rem=num%8; 
		       str=dig[rem]+str; 
		       num=num/8;
		    }
		    System.out.println("Decimal to octal: "+str);
		  }
	

}
