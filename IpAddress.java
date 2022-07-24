package Practis;


public class IpAddress {

	public static void main(String[] args) {
		String str = "2001:0db8:0000:000:0000:ff00:0042:8329";

		System.out.println(ipn6IsValid(str));
	}
	
	private static boolean ipn6IsValid(String str){
		if(str.length()<15){
			return false;
		}if(str.charAt(0)==':'){
			return false;
		}if(str.charAt(str.length()-1)==':'){
			return false;
		}
		String[] token = str.split(":");
		if(token.length!=8){
			return false;
		}
		for(String take :token){
			if(!validateSubString(take)){
				return false;
			}
		}
		return true;
	}

	private static boolean validateSubString(String take) {
		
		char[] ch = take.toCharArray();
		
		if(ch.length>4||ch.length==0){
			return false;
		}
			for(char charc :ch){
				boolean isDigit=charc>=48&&charc<=57;
				boolean isUpperCase=charc>=65&&charc<=70;
				boolean isLowercase =charc>=97&&charc<=102;
				if(!(isDigit||isUpperCase||isLowercase)){
					return false;
				}
			}
		
		return true;
	}

}
