package Practis;

import java.util.Scanner;

/*
 * 
 * Enter the String :
a10b20
aaaaaaaaaabbbbbbbbbbbbbbbbbbbb
 */

public class PrintCharNuberTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.next();
		
		for(int i =0;i<str.length();i++){
			
			char a = str.charAt(i);
			int b = str.charAt(++i)-48;
			if(i+1>=str.length()){
				for(int j =0;j<b;j++){
					System.out.print(a);
					
				}
				break;
			}//if
			if(str.charAt(i+1)-48>-1&&str.charAt(i+1)-48<10){
			b=(b*10)+str.charAt(++i)-48;
			}
			
			for(int j=0;j<b;j++){
				System.out.print(a);
			}
		}//for loop
	}

}
