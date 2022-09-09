package Practice;

import java.util.Arrays;

public class ArraySpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern(5);
	}
	
	private static void pattern(int n) {
		int[][] arr = new int[n][n];
		int N1 = n/2+1;
		int top = 0;
		int bottom = n-1;
		int right = n-1;
		int left = 0;
		int N = 1;
		for(int i =0;i<N1;i++) {
		for(int j =left ;j<right;j++ ) {
			arr[top][j] = N++;
		}
		for(int j = top;j<bottom;j++) {
			arr[j][right] = N++;
		}for(int j = right;j>=left;j--) {
			arr[bottom][j] = N++;
		}for(int j =bottom-1;j>top;j--) {
			arr[j][left] = N++;
		}
		top++;
		bottom--;
		left++;
		right--;
		}
	
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	
	

}
