package practicecodes;

public class PallindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456654;
		int newnum = num;
		int rev = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		if (newnum==rev) {
			System.out.println(newnum + " is pallindrome number");
		}
		else 
		{
			System.out.println(newnum + " is not pallindrome number");
		}

	}

}
