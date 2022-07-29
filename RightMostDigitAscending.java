package Practis;

import java.util.Arrays;
/*
 *output: 
 * [9, 6, 55, 25, 3, 123, 12]
 */

public class RightMostDigitAscending {

	public static void main(String[] args) {
		int[] arr ={3,12,55,25,6,9,123};
		System.out.println(Arrays.toString(ascending(arr)));

	}

	private static int[] ascending(int[] arr){
//		int[] array = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int start=arr[i]%10;
				int end = arr[j]%10;
				if(start<end){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		
		return arr;
	}
}
