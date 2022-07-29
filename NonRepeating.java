package Practis;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
/*
 * 
 * output:rr
 */
public class NonRepeating {

	public static void main(String[] args) {
		String str ="engineering";
		System.out.println("Normal method:");
		findNonRepeating(str);
		System.out.println("Using Map");
		System.out.println(findNonrepeatinUsingMap(str));

	}
	
	private static void findNonRepeating(String str){
		for(char ch:str.toCharArray()){
		
			if(str.indexOf(ch)==str.lastIndexOf(ch)){
				System.out.print(ch);
				break;
			}
			
		}
	}

	private static Character findNonrepeatinUsingMap(String str){
		char ch;
		HashMap<Character,Integer> nonrepeating = new LinkedHashMap<Character,Integer>();
		
		for(int i =0;i<str.length();i++){
			ch= str.charAt(i);
			if(nonrepeating.containsKey(ch)){
				nonrepeating.put(ch, nonrepeating.get(ch)+1);
			}else{
				nonrepeating.put(ch, 1);
			}
		}
		
		for(Entry<Character,Integer> entry:nonrepeating.entrySet()){
			if(entry.getValue()==1){
				return entry.getKey();
			}
		}
		return null;
	}
}
