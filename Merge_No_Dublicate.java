package Practis;
/*
Given two sorted arrays, merge them such that the elements are not repeated

Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 
*/
public class Merge_No_Dublicate {

	public static void main(String[] args) {
		int[] array1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] array2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		storeInSingleArray(array1, array2);

	}

	private static void storeInSingleArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];

		}
		for (int i = arr1.length; i < arr2.length; i++) {
			arr3[i] = arr2[i];

		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[i] > arr3[j]) {
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}

		}
		
		for (int i = 1; i < arr3.length; i++) {
			int flag = 1;
			for (int j = 0; j < i; j++) {
				if (arr3[j] == arr3[i]) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.print(arr3[i] + ",");
			}
		}
	}

}
