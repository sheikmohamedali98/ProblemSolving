package Practis;

public class SNackLatterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		snackPattern(5);
	}
	
	private static void snackPattern(int n){
		int i=0;
		for(int row=0;row<n;row++){
			for(int space=0;space<n-row;space++){
				System.out.print(" ");
			}
			for(int col=0;col<n;col++){
				if(row%2==0){
					++i;
					System.out.print(i+" ");
					
				}else{
					
					System.out.print(i+" ");
					--i;
				}
			}
			i=i+n;
			System.out.println();
		}
		
	}

}
