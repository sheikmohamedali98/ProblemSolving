package LeetCode;
/*
 * 
 * Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class SubstringWithoutRepeating {

	public static void main(String[] args) {
		String str="abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));

	}
	  private static int lengthOfLongestSubstring(String s) {
	        char[] ch = s.toCharArray();
	        int index=0;
	        for(int i=0;i<ch.length;i++){
	           int j;
	            for( j=0;j<i;j++){
	                if(ch[i]==ch[j]){
	                   
	                    break;
	                }
	            }
	            if(j==i){
	                index++;
	            }
	        }
	        return index;
	    }

}
