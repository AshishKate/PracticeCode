package practicecodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringnInString {
	public static void main(String[] args) {
		
	int count=0;
	String text="aaaabsababbabaaba";
	Pattern p=Pattern.compile("ab");
	Matcher m=p.matcher(text);
	while(m.find()) {
		count++;
		
	}
	
		System.out.println("The count of ab " + count);
	}

}
