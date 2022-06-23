
public class person {
	// CLASS AND OBJECTS
	
	int age=21;
	int weight =56;
	String color ="light";
	
	void eat() {
		
		System.out.println("i am eating");
		
		
	}
    
	void sleep() {
		System.out.println("i am sleeping");
		
	}
	

	
	
	
	
	
	public static void main(String[] args) {
	
		person p= new person();
		
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.color);
		
		p.eat();
		p.sleep();
		
		
		

	}

}
