import java.util.HashMap;
import java.util.Map;

public class NumberOfTimeAccurse {

    private static int leastNumberOfTime(int[] arr,int k){
//        int leastNumber = 0;
        Map<Integer,Integer> collections = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(collections.containsKey(arr[i])){
                collections.put(arr[i],collections.get(arr[i])+1 );
            }else{
                collections.put(arr[i],1 );
            }
        }

        System.out.println(collections);

        for (Map.Entry<Integer,Integer> entry : collections.entrySet()){
            if(entry.getValue() ==k){
                return  entry.getKey();
            }
        }
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());

//        for(int i = 0;i<arr.length;i++){
//            int count =0;
//            for(int j =0;j< arr.length;j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//            if(k==count){
//                return arr[i];
//            }
//        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,7,4,3,4,8,7};
        System.out.println(leastNumberOfTime(arr,2));
    }
}
