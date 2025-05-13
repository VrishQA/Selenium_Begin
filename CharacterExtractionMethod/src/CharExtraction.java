import java.util.Arrays;

public class CharExtraction {

	public static void main(String[] args) {
		
		String s1= "JavaProgramming";
		String s2= "LAVAPRGRMMING";
		
	char cha=s1.charAt(6);
	System.out.println(cha);
	
	int Unicode=s1.codePointAt(5);
	System.out.println(Unicode);
	
	
	int Uni=s1.codePointBefore(4);
	System.out.println(Uni);
	
	int x=s1.codePointCount(0, 9);
	System.out.println(x);
	
	char[]chaar=new char[5];
	
	s1.getChars(3, 8, chaar, 0);
	System.out.println(chaar);
	
	
	int result=s1.compareTo(s2);
	System.out.println(result);
	
	char[] c=s1.toCharArray();
	System.out.println(Arrays.toString(c));
	
	
	

	}

}
