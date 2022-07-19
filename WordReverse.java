package Practis;

import java.util.Scanner;
/*
 * 
 * Input : "Welcome to India"
Output : "India to Welcome"

Input : "I love Java Programming"
Output :"Programming Java love I"
 */

public class WordReverse {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
reverseWord(str);
	}
	
	private  static void  reverseWord(String str){
		String[] arr = str.split(" ");
		String word = "";
		for(int i=arr.length-1;i>=0;i--){
			word+=arr[i]+" ";
		}
		System.out.println(word);
	}

}
