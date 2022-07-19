package Practis;

import java.util.Scanner;
/*
 * 
 * Enter the String:
               racecar
      e        
    c    c      
  a        a    
r            r  
  a        a    
    c    c      
      e        
 */

public class DiagonalPattern {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
//		String str = "racecar";
		int len = str.length();
		if(len%2==1){
			diagonalPatterns(str);
		}
		else{
			System.out.println("Not Possible");
		}
	}
	
	private static void diagonalPatterns(String str){
		int N= str.length();
		int n = N/2;
		for(int row=0;row<N;row++){
			for(int col=0;col<N;col++){
				
				if(row+col==(N-1)+n||row+col==n||col==row+n||row==col+n){
					System.out.print(str.charAt(col)+"  ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
