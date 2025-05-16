
public class Cons {
	
	String x;
	int y;

	//here we haven't used the instance variable to initialize 
	//example- x=x; or y=y; we have made x=p; y=q; for this reason we haven't made use of this keyword
	//this keyword will be used only when --
	//✅ When parameter names are same as instance variables.
    //✅ To call another constructor from the current one: this(...).
    //✅ To clarify intent when accessing instance members.
	
	 Cons() {
	        this("DefaultBrand", 2000); // calling another constructor
	        System.out.println("Default constructor called");
	    }

	    // Constructor 2
	    Cons(String p, int q) {
	        x = p;
	        y = q;
	        System.out.println("Parameterized constructor called");
	    }
	    
	    void displayy() {
	        System.out.println(x + " - " + y);
	    }
	
	public void display() {
		System.out.println(x +" "+ y);
	}

	
	public static void main(String[] args) {
		Cons cs= new Cons();
		cs.displayy();
		
		Cons c= new Cons("Hello",123);
		c.display();
		
		Cons c1= new Cons("Helloji",123);
		c1.display();
		
		Cons c2= new Cons("Hellojiii",123);
		c2.display();
		
		
		
		

		   

		    
		}

		
  }
	 
	

