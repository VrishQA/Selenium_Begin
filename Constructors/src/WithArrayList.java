
import java.util.ArrayList;

public class WithArrayList {
	
	//here we will make use of this keyword as we use same name
	
	
	String name;
	int rollN;
	int age;
	
	public WithArrayList(String name,int rollN,int age) {
	    this.name= name;
		this.rollN= rollN;
		this.age= age;
	}
	
	void display() {
		System.out.println(name +" "+rollN +" "+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WithArrayList> al= new ArrayList<>();
		al.add(new WithArrayList("Mahesh", 001,25));
		al.add(new WithArrayList("Suresh", 002,25));
		al.add(new WithArrayList("Gukesh", 003,26));
		
		for(WithArrayList X:al) {
			X.display();
			
		}
	}

}
