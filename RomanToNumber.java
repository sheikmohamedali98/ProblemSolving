package Practis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * 
 * 
 * input:cliv
 * output:154
 */
public class RomanToNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine().toUpperCase();
		System.out.println("Roman "+convertor(str));
		romanToInt("Map method"+str);

	}
	private static int  romanToValue(char r){
		if(r=='I'){
			return 1;
		}if(r == 'V'){
			return 5;
		} if(r =='X'){
			return 10;
		} if(r == 'L'){
			return 50;
		} if(r =='C'){
			return 100;
		} if(r=='D'){
			return 500;
		}if(r=='M'){
			return 1000;
		}
		return-1;
	}

	private static int convertor(String str){
		
		int sum=0;
		for(int i=0;i<str.length();i++){
			int num1 = romanToValue(str.charAt(i));
			if(i+1<str.length()){
				int num2 = romanToValue(str.charAt(i+1));
				
				if(num1>=num2){
					sum = sum+num1;
				}else{
					sum= sum+num2-num1;
					i++;
				}
				
			}else{
				sum+=num1;
			}
			
		}
		return sum;
	}
	
	  public static void romanToInt(String s)
	    {
	        Map<Character,Integer> translations=new HashMap<Character,Integer>(); 
	 
	         //Adding elements to map 
	        translations.put('I',1); 
	        translations.put('V',5); 
	        translations.put('X',10); 
	        translations.put('L',50); 
	        translations.put('C',100); 
	        translations.put('D',500); 
	        translations.put('M',1000);
	       
	        s = s.replace("IV","IIII");
	        s = s.replace("IX","VIIII");
	        s = s.replace("XL","XXXX");
	        s = s.replace("XC","LXXXX");
	        s = s.replace("CD","CCCC");
	        s = s.replace("CM","DCCCC");
	          
	        System.out.println(s.length());
	        int number = 0;
	        for (int i = 0; i < s.length(); i++)
	        {
	        	
	        
	        	int value = translations.get(s.charAt(i));
	        	System.out.println("value"+value);
	        	
	        
	        }
	        System.out.println(number);
	  }
	   
	
}
