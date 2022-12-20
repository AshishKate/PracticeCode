package practicecodes;

public class ProductOfArraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		int ch[] = { 1, 2, 3 };
		for (int i=0;i<=ch.length-1;i++) {
		product=product*ch[i];
		}
		
		System.out.println("product of the numbers in arry " + product);
		
	}

}
