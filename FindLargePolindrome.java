package Basic;
/*
 * input:yellow
 * output:ll
 * 
 */
public class FindLargePolindrome {

	public static void main(String[] args) {
		String str ="yellow";
		char[] ch = str.toCharArray();
		int len = ch.length;
		boolean status = true;
		for(int subString=len;subString>=2;subString--){
			for(int start=0,end=subString-1;end<len;start++,end++){
				for(int i=start,j=end;i<=(start+end)/2;i++){
					if(ch[i]!=ch[j]){
						status = false;
						break;
					}else{
						status=true;
					}
				}
				if(status){
					
					printSubstring(start,end,ch);
				}
			}
		}
	}
	

	private static void printSubstring(int start, int end, char[] ch) {

		for(int i=start;i<=end;i++){
			System.out.print(ch[i]);
		}
		System.out.println();
	}
}
