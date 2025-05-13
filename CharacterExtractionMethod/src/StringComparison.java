
public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String str1 = "HelloWorld";
		        String str2 = "WorldHello";

		        boolean result = str1.regionMatches(false, 5, str2, 0,5);
		        System.out.println("Case-Sensitive Match: " + result);
		    }
		}




