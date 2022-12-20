package practicecodes;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aa";
		String newstr = str;
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (newstr==rev) {
			System.out.println(newstr + " is pallindrome string");
		}
		else 
			System.out.println(newstr +" is not pallindrome strng");
	}

}
