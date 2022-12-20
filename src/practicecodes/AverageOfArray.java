package practicecodes;

public class AverageOfArray {
	public static void main(String[] args) {
		int sum=0;
		int ch []= {1,2,3,4,5};  //1+2+3+4+5=15/5=3=avg
		for (int i=0;i<=ch.length-1;i++) {
			sum=sum+ch[i];
		}
		
		int len=ch.length;
		int avg=sum/len;
		System.out.println("avg = "+ avg);
		
	}

}
