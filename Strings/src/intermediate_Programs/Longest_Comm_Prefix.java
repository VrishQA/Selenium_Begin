package intermediate_Programs;

import java.util.Arrays;

public class Longest_Comm_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr = {"floral", "florist", "flower"};
String x=arr[0];
String y=arr[1];
String z=arr[2];

char[] a=x.toCharArray();
System.out.println(Arrays.toString(a));

char[] b=y.toCharArray();
System.out.println(Arrays.toString(b));

int x1=x.length();
int y1=y.length();
int z1=z.length();

StringBuilder prefix = new StringBuilder();

for(int i = 0; i < x1 && i < y1; i++) {
    if(x.charAt(i) != y.charAt(i)) {
        break;
    }
    prefix.append(x.charAt(i));  //  store matching characters
}

System.out.println("Common prefix between x and y: " + prefix.toString());


int a1=prefix.length();
StringBuilder commonPrefix= new StringBuilder();
for(int i = 0; i < a1 && i < z1; i++) {
    if(prefix.charAt(i) != z.charAt(i)) {
        break;
    }
    commonPrefix.append(prefix.charAt(i));  //  store matching characters
}

System.out.println("Common prefix between x and y: " + commonPrefix.toString());


	
//below should work for all inputs

String[] arra= {"interview","interviewer", "interviewing"};

if(arra==null || arra.length==0) {
	System.out.println("No Such Prefix exists");
	return;
	
}

String prefixx=arra[0];
for(int i=1;i<arra.length;i++) {
	while(arra[i].indexOf(prefixx)!=0) {
		prefixx=prefixx.substring(0, prefixx.length()-1);
		if(prefixx.isEmpty()) {
			System.out.println("No Common Prefix");
			return;
		}
		
	}
	
}
System.out.println("The longest common prefix is "+" " +prefixx);

	}

	}
