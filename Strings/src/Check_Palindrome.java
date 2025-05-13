//
//public class Check_Palindrome {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String original="madamzz";
//	
//		boolean isPalindrome=true;
//		int n=original.length()-1;
//		
//		int left=0;
//		int right=n;
//		
//		while(left<right) {
//			if(original.charAt(left)!= original.charAt(right)) {
//				isPalindrome=false;
//				break;
//			}
//			left++;
//			right--;
//		}
//		if(isPalindrome) {
//		System.out.println(original);
//		}
//		else {
//			System.out.println("Not a palindrome");
//		}
//	}
//
//}



//public class Check_Palindrome {
//
//	public static void main(String[] args) {
//		
//		String original="ma11dam";
//		String reverse="";
//		
//		for(int i=0;i<original.length();i++) {
//			reverse= original.charAt(i)+reverse;
//			}
//		if(original.equals(reverse)) {
//			System.out.println("Given String is Palindrome");
//		}
//		else {
//			System.out.println("Given String is Not a Palindrome");
//		}
//		
//	}
//	}



public class Check_Palindrome {
//
	public static void main(String[] args) {

String palindrom="racecar";
boolean isPalindrom= true;
int n=palindrom.length()-1;

int left=0;

int right=n;


while(left<right) {
	
	if(palindrom.charAt(left)==palindrom.charAt(right)) {
		left++;
		right--;
	}else {
		isPalindrom=false;
		break;
	}
	
	
	 
}
if(isPalindrom) {
	System.out.println("Yes it's Palindrom");
}else {
	System.out.println("It's not Palindrom");
}

	}
	}

