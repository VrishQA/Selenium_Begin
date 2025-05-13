
public class StringSearchingMethods {

	public static void main(String[] args) {
	String str="Java is one of the best language for java to learn java in is the hello Java world";
	
	
	//all the searching methods returns int value if not found returns -1
	
	int v=str.indexOf("the");
	System.out.println(v);
	
	int v1=str.indexOf('l');
	System.out.println(v1);
	
	int v2=str.indexOf("is",10);
	System.out.println(v2);

	int v3=str.indexOf('w',0);
	System.out.println(v3);
	
	
	int v4=str.lastIndexOf("java");
	System.out.println(v4);
	
	int v5=str.lastIndexOf("java",53);
	System.out.println(v5);
	
	int v6=str.lastIndexOf("q");
	System.out.println(v6);
	}


}
