package Basic;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String");
		String  str = scan.nextLine();
		char[] ch = str.toCharArray();
		char[] ch1 = anotherArray(ch);
		System.out.println("one way to Polindrome  "+polindrome(ch,ch1));
		System.out.println("Second way to polindeome:  "+anotherPolindrome(ch));
	    System.out.println("Thirsd way to Polindrome  :"+thirdwayPolindrome(ch));
	}

	private static char[] anotherArray(char[] arr){
		char[] output = new char[arr.length];
		
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
			output[i] = arr[j];
		}
		
		return output;
	}
	
	private  static boolean  polindrome(char[] arr1,char[] arr2){
		
		boolean status = true;
		
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i]){
				status = false;
				return status;
			}
		}
		return status;
	}
	
	
	private static void printArray(char[] arr){
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static boolean anotherPolindrome(char[] ch){
		char[] ch1 = anotherArray(ch);
		boolean status = true;
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=ch1[i]){
				status = false;
				
				break;
			}
		}
		return status;
	}
	
	
	private static boolean thirdwayPolindrome(char[] ch){
		
		int i = 0,j = ch.length-1;
		boolean status  = true;
		
		while(i<j){
			if(ch[i++]!=ch[j--]){
				status = false;
				break;
			}
		}
		return status;
	}
}
