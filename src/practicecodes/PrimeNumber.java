package practicecodes;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		boolean  flag=true;
		for (int i=2;i<num;i++) {
			if(num%i==0)
			
			flag=false;
		}
		if (flag==true) {
			System.out.println(num + " is prime number");
		}
		else {
			System.out.println(num + " is not prime number");
		}
	}

}
