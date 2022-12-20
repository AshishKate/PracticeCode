package practicecodes;

import java.util.Scanner;

public class EvenOddNumber2 {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;
for (int i=1;i<=num;i++) {
		if (i%2==0) {
			System.out.println(i + " is even number");
		}
		else 
			System.out.println(i + " is odd number");
	}
	}

}
