package Practis;

import java.util.HashSet;

public class RemoveDublicareWords {

	public static void main(String[] args) {

		String str = "I love zoho and zoho good";
		removeDublicate(str);
		
	}

	private static void removeDublicate(String str){
		HashSet<String> set = new HashSet();
		String[] word = str.split(" ");
		
		for(String str1:word){
			set.add(str1);
		}
		
		for(String str2:set){
			System.out.print(str2+" ");
		}
		
	}
}
