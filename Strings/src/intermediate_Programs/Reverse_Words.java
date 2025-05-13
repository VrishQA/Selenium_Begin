package intermediate_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "I love Java";
String reversed="";
String[] s2=s1.split(" ");


int x=s2.length-1;// x=2


for(int i=x;i>=0;i--) {
	reversed= reversed+s2[i]+" ";
}

System.out.println(reversed);

	}

}
