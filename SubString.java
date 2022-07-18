package Practis;

import java.util.Scanner;
/*
 * 
 *   Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
 */
 

public class SubString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String string1 = scan.nextLine();
		System.out.println("Enter the String2:");
		String string2 = scan.nextLine();
		int result = findIndexOfSubString(string1,string2);
		System.out.println(result);

	}
	private static int findIndexOfSubString(String str1,String str2){
		
	int length1 = str1.length();
	int length2 = str2.length();
	
	for(int i=0;i<length1-length2;i++){
		int j;
		for(j=0;j<length2;j++){
			if(str1.charAt(i+j)!=str2.charAt(j)){
				break;
			}
		}
		if(j==length2){
			return i;
		}
		
	}
	return -1;	
	}
}
