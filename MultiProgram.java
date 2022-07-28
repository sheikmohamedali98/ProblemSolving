package Programs;

import java.util.Arrays;
/*
 * 
 * output:
 * Find Palindrome true
Find Binary false
Merge And Sort[6, 6, 5, 4, 3, 3, 2, 1]
String Only Contain Numbers true
Swap Array[0, 2, 0, 3, 4, 5]
Swap Two Array
3;6;7;
1;2;5;Add Zero Alternate
1;0;2;0;3;0;4;0;5;0;
 */
public class MultiProgram {

	public static void main(String[] args) {


		String str="ABBA";
		System.out.println("Find Palindrome "+polindrome(str));
		int binary = 10210;
		System.out.println("Find Binary "+findBinary(binary));
		int[] arr1 = {1,3,3,5};
		int[] arr2={2,4,6,6};
		System.out.println("Merge And Sort"+Arrays.toString( mergeSort(arr1,arr2)));

		String str4="1100";
		System.out.println("String Only Contain Numbers "+containNumber(str4));
		int[] arr3 ={5,4,0,3,2,0};
		System.out.println("Swap Array"+Arrays.toString(swap(arr3)));
		System.out.println("Swap Two Array");
		int[] arr4 = {1,2,5};
		int[] arr5={3,6,7};
		swapTwoArray(arr4,arr5);
		int[] arr6={1,2,3,4,5};
		System.out.println("Add Zero Alternate");
		addZero(arr6);

	}

	private static boolean polindrome(String str){
		char[] ch = str.toCharArray();
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
	private static char[] anotherArray(char[] arr){
		char[] output = new char[arr.length];
		
		for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
			output[i] = arr[j];
		}
		
		return output;
	}

	
	private static boolean findBinary(int num){
		
		if(num==0||num==1||num<0){
			return false;
			
		}
		
		while(num!=0){
			if(num%10>1){
				return false;
			}
			num=num/10;
		}
		
		return true;
	}
	
	private static  int[]  mergeSort(int[] arr1,int[] arr2){
		
		int[] array= new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++){
			array[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++){
			array[arr1.length+j]= arr2[j];
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]<array[j]){
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		return array;
	}
	
	private static int numberSubString(String str1,String str2){
		String[] strArray=str1.split(" ");
		int count=0;
		for(int i=0;i<strArray.length;i++){
			if(strArray[i].equals(str2)){
				count++;
			}
		}
		return count;
	}
	
	private static boolean  containNumber(String str){
		char[] ch = str.toCharArray();
		boolean status = true;
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=120){
				status = false;
				break;
			}
			
		}
		return status;
	}
	
	private static int[] swap(int[] arr){
	int[] swap = new int[arr.length];
		for(int i=0,j=arr.length-1;i<(i+j)/2;i++,j--){
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
		}
		return arr;
	}
	
	private static void swapTwoArray(int[] arr1,int[] arr2){
		int[] temp = new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			temp[i]=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp[i];
		}
		printArray(arr1);
		System.out.println();
		printArray(arr2);
	}
	
	private static  void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+";");
		}
	}
	
	private static void addZero(int[] arr){
	
		int[] array = new int[2*arr.length];
		for(int i=0;i<array.length;i++){
			array[i]=0;
		}
		int j=0;
		for (int i=0;i<array.length;i++){
			if(i%2==0&&j<arr.length){
				array[i]=arr[j];
				j++;
			}
		}
			
		printArray(array);
	}
}
