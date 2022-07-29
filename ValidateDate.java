package Practis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 
 * 
 * "25/12/1990"
    "25/12/1990"
     "12/12/90" :false
     "05/02/1990":true
    "05-02-1990" :false
 */
public class ValidateDate {

	public static void main(String[] args) {
		String str= "13/12/1990";

		System.out.println(validate(str));

	}

	private static boolean validate(String str){
		 
		        String regex = "^(1[0-2]|0[1-9])/(3[01]"+"|[12][0-9]|0[1-9])/[0-9]{4}$";
		        Pattern pattern = Pattern.compile(regex);
		        Matcher matcher = pattern.matcher((CharSequence)str);
		        return matcher.matches();
		  
		
	}
}
