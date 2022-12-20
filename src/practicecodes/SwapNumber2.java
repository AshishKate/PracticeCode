package practicecodes;

public class SwapNumber2 {
	public static void main(String[] args) {
		
		//without using third variable 
		int a=3;
		int b=2;
		a=a+b;// 3+2=5
		b=a-b; //b=5-2=3
		a=a-b; //5-3=2
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}

}
