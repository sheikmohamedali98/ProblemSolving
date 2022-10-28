import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private static int angramCount(String string){

        Map<String,Integer> map = new HashMap<>();
//        int count =0;
        for(int i =0;i<string.length();i++){
           for(int j = i;j<string.length();j++){
               char[] charArray = string.substring(i,j+1).toCharArray();
               Arrays.sort(charArray);
               String subString = new String(charArray);

               if(map.containsKey(subString)){
                   map.put(subString,map.get(subString)+1);
               }else{
                   map.put(subString,1);
               }

//               String str = string.substring(i,j);
//               String containString = string.substring(j,string.length());
//               System.out.println("String "+str);
//               System.out.println("ContainString "+containString);
//               System.out.println(map.keySet(
           }
        }
        int number = 0;
        for(int count : map.values()){
            if(count%2 ==0){
                number++;
            }

        }


//        System.out.println(map);

        return  number;
    }

    public static void main(String[] args) {
        System.out.println(angramCount("abcd"));
    }
}

//    static void subString(String s){
//    HashMap<String, Integer> map= new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++){
//        for(int j = i; j < s.length(); j++){
//        char[] valC = s.substring(i, j+1).toCharArray();
//        Arrays.sort(valC);
//        String val = new String(valC);
//        if (map.containsKey(val))
//        map.put(val, map.get(val)+1);
//        else
//        map.put(val, 1);
//        }
//        }
//        int anagramPairCount = 0;
//        for(String key: map.keySet()){
//        int n = map.get(key);
//        anagramPairCount += (n * (n-1))/2;
//        }
//        System.out.println(anagramPairCount);
//        }