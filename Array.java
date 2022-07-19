package Basic;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,5,6,7};
		arrayReverse(arr);
		swapArray(arr);
	}
	
	private static void arrayReverse(int[] arr){
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void swapArray(int arr[]){
		
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		printArray(arr);
	}
	private static void printArray(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
