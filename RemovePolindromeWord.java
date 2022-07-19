package Practis;

public class RemovePolindromeWord {

	public static void main(String[] args) {


		String str = "Text contains malayalam and level words";
		System.out.println(removePolindrome(str));
	}

	private static boolean findPolindrome(String str){
		int i=0,j=str.length()-1;
		
		while(i<j){
			if(str.charAt(i++)!=str.charAt(j--)){
				return false;
			}
		}
		return true;
	}
	
	private static String removePolindrome(String str){
		String finalword="",word="";
		str = str+" ";
		int len = str.length();
		for(int i=0;i<len;i++){
			if(str.charAt(i)!=' '){
				word = word+str.charAt(i);
			}else{
				if(!findPolindrome(word)){
					finalword = finalword+word+" ";
				}
				word = "";
			}
		}
		return finalword;
	}
}
