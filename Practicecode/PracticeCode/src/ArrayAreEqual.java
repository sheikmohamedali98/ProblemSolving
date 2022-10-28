import java.util.HashSet;
import java.util.Set;

public class ArrayAreEqual {

    public static  boolean compareArray(int[]arr1, int[] arr2){

        if(arr1.length!=arr2.length){
            return  false;
        }

        Set<Integer> setArr1 = setObject(arr1);
        Set<Integer> setArr2 = setObject(arr2);

        if(setArr1.size() == setArr2.size()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {1,2,1,3,1};
        int[] array2 = {1,3,1,2,1};

        System.out.println(compareArray(array1,array2));
    }
    private static Set<Integer> setObject(int[]arr){
        Set<Integer> equal = new HashSet<Integer>();
        for(int i =0;i<arr.length;i++){
            equal.add(arr[i]);
        }
        return equal;
    }
}
