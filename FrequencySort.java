package Practis;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * 
 * Enter the Size:
10


1
1
1
2
2
2
23
3
4
4

3;23;4;4;1;1;1;2;2;2;
 */

class FrequencyComparator implements Comparator<Integer>{
	Map<Integer,Integer> refmap;
	

	@Override
	public int compare(Integer num1, Integer num2) {
		Integer val1 = refmap.get(num1);
		Integer val2 = refmap.get(num2);
		int num = val1.compareTo(val2); 
		return num==0?num1.compareTo(num2):num;
	}


	public FrequencyComparator(Map<Integer, Integer> refmap) {
		this.refmap = refmap;
	}
	
}

public class FrequencySort{
	static Map<Integer,Integer> numbers = new HashMap();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Enter the Size:");
		int size = scan.nextInt();
		int[] array = new int[size];
		for(int i =0;i<size;i++){
			array[i] = scan.nextInt();
		}
		
		for(int number:array){
			if(numbers.containsKey(number)){
				Integer count = numbers.get(number);
				numbers.put(number,++count);
			}else{
				numbers.put(number, 1);
			}
		}

		FrequencyComparator compare = new FrequencyComparator(numbers);
		TreeMap<Integer,Integer> sort = new TreeMap(compare);
		sort.putAll(numbers);
		for(int i : sort.keySet()){
			int frequency = sort.get(i);
			for(int count=1;count<=frequency;count++){
				System.out.print(i+";");
			}
		}
	}
}

