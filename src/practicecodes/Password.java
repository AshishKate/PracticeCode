package practicecodes;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the password");
		Scanner sc = new Scanner(System.in);

		int pass = 1234;
		int userpass = sc.nextInt();
		for (int i = 1; i < 3; i++) {
			if (pass == userpass) {
				System.out.println("Welcome you have login succesfully");
				break;
			} else if (pass != userpass & i <= 3) {
				System.out.println("Try again");
				userpass = sc.nextInt();
			}

			else if (pass != userpass & i == 3) {
				System.out.println("Your acoount is locked for next 24 hours");
			}

		}

		System.out.println("Thank you for visiting ");

	}

}
