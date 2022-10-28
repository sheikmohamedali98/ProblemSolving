import java.util.Arrays;

public class LargeSubArray {


    static int maxLen(int arr[], int N)
    {
        int maxLen = 0;
        for (int i = 0; i < N; i++) {
            int currSum = 0;
            for (int j = i; j < N; j++) {
                currSum += arr[j];
                if (currSum == 0) {
                    System.out.println(j-i+1);
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int N = arr.length;
        System.out.println(maxLen(arr, N));

    }
}
