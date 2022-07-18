package Practis;

import java.util.Scanner;
/*
 * 
 * Enter the Start Number:
3
Enter the End Number:
15
3;5;7;9;11;13;
 */

public class FindAddNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Start Number:");
		int start = scan.nextInt();
		System.out.println("Enter the End Number:");
		int end = scan.nextInt();
		findAdd(start,end);

	}

	private static void findAdd(int start,int end){
		for(int i=start;i<end;i++){
			if(i%2==1){
				System.out.print(i+";");
			}
		}
	}
}
