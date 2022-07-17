package Practis;

import java.util.Scanner;
/*

Input:
N= 3, M=3
 
Output:
X X X
X 0 X
X X X
Input:
  N=4 M=5 
Output:
X X  X X
X  0  0 X
X  0  0 X
X  0  0 X
X X X X
 
Input:
N=6 M=7

X X X X X X
X 0  0  0  0 X
X 0  X  X 0 X
X 0  X  X 0 X
X 0  X  X 0 X
X 0  0  0  0 X
X X X X X X
*/
public class Mtrix_X_O {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the Row size:");
		int N = scan.nextInt();
		System.out.println("Enter the Col size");
		int M  = scan.nextInt();
		
		char[][] array = new char[N][M];
		int top = 0;
		int down = N-1;
		int left = 0;
		int right = M-1;
		
		char c;
		while (true){
			if(top%2==0){
				c = 'x';
			}
			else{
				c='o';
			}
			for(int i= left;i<=right;i++){
				array[top][i]=c;
				
			}
			top++;
			if(top>down||left>right){
				break;
			}
			
			for (int i=top;i<=down;i++ ){
				array[i][right]=c;
				
			}
			right--;
			if(top>down||left>right){
				break;
			}		
			for(int i=right;i>=left;i--){
				array[down][i]=c;
				
			}
			down--;
			if(top>down||left>right){
				break;
			}
			
			for(int i=down;i>=top;i--){
				array[i][left]=c;
				
			}
			left++;
			if(top>down||left>right){
				break;
			}
		}//while loop
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
