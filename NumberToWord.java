package Practis;
/*
 *  To output the number in words (0-999)
    Input: 234
    Output: Two hundred and Thirty Four
 */

import java.util.Scanner;

public class NumberToWord {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = scan.nextInt();
		convertNumberToWord(num);

	}
	public static void convertNumberToWord(int num){
		 String[] one = {"","One", "Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	     String[] two = {"Twenty","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","eighteen","nineteen"};
	     String[] three = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	     if(num==0){
	    	 System.out.println("ZERO");
	     }
	     else if(num<11){
	    	 System.out.println(one[num]);
	     }else if(num>10&&num<21){
	    	 System.out.println(two[num%10]);
	     }else if(num>20&&num<1000){
	    	 int temp = num;
	    	 int count = 0;
	    	 while(temp!=0){
	    		 count++;
	    		 temp /= 10;
	    	 }
	    	 if(count==2){
	    		 System.out.print(three[num/10]+" ");
	    		 System.out.print(one[num%10]);
	    	 }else if(count==3){
	    		 System.out.print(one[num/100]+" Hundred ");
	    		 num -=(num/100)*100;
	    		 if(num>10&&num<21){
	    			 System.out.print(two[num%10]);
	    		 }else{
	    		 System.out.print(three[num/10]+" ");
	    		 System.out.print(one[num%10]);
	    		 }
	    	 }
	     }
	}

}
