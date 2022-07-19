package Practis;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * 
 * sheikmohamedali
sheikmoadl
asdehiklmo
 */
public class RemoveDublicateLetter {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(simpleMothods(str));
		usingSet(str);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void usingSet(String str){
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet();
		for(char c:ch){
			set.add(c);
		}
		for(char c:set){
			System.out.print(c);
		}
	}
	private  static String  simpleMothods(String str){
		
		char[] ch = str.toCharArray();
		int len = ch.length;
		int index =0;
		for(int i=0;i<len;i++){
			
			int j;
			for( j=0;j<i;j++){
				if(ch[i]==ch[j]){
					break;
				}
			}
			if(j==i){
				ch[index++] = ch[i];
			}
		}
		return String.valueOf(Arrays.copyOf(ch, index));
	}
}
