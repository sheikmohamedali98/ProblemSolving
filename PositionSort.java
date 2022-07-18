package Practis;


/*  Write a program to sort the elements in odd positions in descending order and elements in ascending order

Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
 */
public class PositionSort {

	public static void main(String[] args) {

		int[] arr = new int[]{13,2,4,15,12,10,5};
		posOrder(arr);
		
	}
	private static void posOrder(int[] arr){
		int len = arr.length;
		int[] ascending = new int[len/2];
		int[] desending = new int[len-(len/2)];
		int k = 0,l = 0;
		for(int i=0;i<len;i++){
			if(i%2==0){
				desending[k] = arr[i];
				k++;
			}else{
				ascending[l] = arr[i];
				l++;
			}
		}
		
		for(int i=0;i<desending.length;i++){
			for(int j=i+1;j<desending.length;j++){
				if(desending[i]<desending[j]){
					int temp = desending[i];
					desending[i] = desending[j];
					desending[j] =  temp;
				}
			}
		}
		
		for(int i=0;i<ascending.length;i++){
			for(int j=i+1;j<ascending.length;j++){
				if(ascending[i]>ascending[j]){
					int temp = ascending[i];
					ascending[i] = ascending[j];
					ascending[j] =  temp;
				}
			}
		}
		
		k=0;
		l=0;
		for(int i=0;i<len;i++){
			if(i%2==0){
				System.out.print(desending[k]+" ");
				k++;
			}else{
				System.out.print(ascending[l]+" ");
				l++;
			}
		}
	}

}
