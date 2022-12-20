package practicecodes;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;
		if(num%2==0) {
			flag=false;
		}
		if (flag==false) {
			System.out.println(num + " is even number");
		}
		else {
			System.out.println(num + " is odd number");
		}
		
		// second way for even odd number
		
		if (num%2==0) {
			System.out.println(num + " is even number");
		}
		else 
			System.out.println(num + " is odd number");
	}
	

}
