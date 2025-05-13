
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String original= "VRISHAB J Hombal";
String reverse= "";

int n=original.length();
for(int i=0;i<n;i++) {
	reverse=original.charAt(i)+reverse;
}
System.out.println("Reversed String is "+ reverse);

	}

}
