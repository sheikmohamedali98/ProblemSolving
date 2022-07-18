package Practis;

/*
 * 
 * Write a program to print the following output for the given input. You can assume the string is of odd length

Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5
Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s 
 */
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the String ");
String str = scan.nextLine();
printPattern(str);
System.out.println();
anotherPattern(str);
	}

	private static void  printPattern(String str){
		int size = str.length();
		char[] arr = str.toCharArray();
		System.out.println();
		for(int row=0;row<arr.length;row++){
			for(int col =0;col<arr.length;col++ ){
				if(row+col==size-1||row==col){
						System.out.print(arr[row]+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	private static void anotherPattern(String str){
		int size = str.length();
		
		char[][] array = new char[size][size];
		for(int i=0;i<size;i++){
			array[i][i] = str.charAt(i);
			System.out.print(array[i][i]);
		}
		System.out.println();
		for(int i=size-1,j=0;j<size;j++,i--){
			array[i][j] = str.charAt(j);
			System.out.print(array[i][j]);
		}
		System.out.println();
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
