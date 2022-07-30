package Practis;
/*
 * 
 *  1
   22
  333
 4444
55555
 */

public class RecursionPattern {

	public static void main(String[] args) {

		pattern(5,5,1);
	}
	
	private static void space(int space){
		
		if(space==0){
			return;
		}
		System.out.print(" ");
		space(space-1);
	}
	private static int print(int num,int ct){
	
		if(num==0){
			return ct;
		}
		System.out.print(ct);
		
		return print(num-1,ct);
	}
	private static  void pattern(int n,int num,int count){
		if(n==0){
			return;
		}
		space(n-1);
		count = print(num-n+1,count);
		System.out.println();
		pattern(n-1,num,count+1);
	}

}
