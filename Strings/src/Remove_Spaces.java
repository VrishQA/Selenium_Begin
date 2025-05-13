
public class Remove_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String remve="Spaces between words";
String removed=remve.replace(" ","");
System.out.println(removed);

String hard= " Trim and Remove All Spaces ";
String remove=hard.strip().replace(" ", "");
System.out.println(remove);


//Tab\tSpace and New\nLine
String hard2= " \\t \\nJava\\t is \\nawesome\\t! \\n";
String remove2=hard2.strip().replace("[\\t\\n]", "").replaceAll(" ", "");
System.out.println(remove2);

String hard3= " Whitespace\\tMix \\nOf Spaces, Tabs and Lines ";
String remove3=hard3.strip().replace(" ", "");
System.out.println(remove3);
	}

}
