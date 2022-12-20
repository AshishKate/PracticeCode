package practicecodes;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=157;
		int newnum=num;
		int rem;
		int arm=0;
		while(num>0) {
			rem=num%10;
			arm=arm+(rem^3);
			num=num/10;
			
		}
		System.out.println(newnum +" is armstrong number" );
		

	}

}
