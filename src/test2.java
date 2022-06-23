class sup2{
	// super keyword for method
	
	void show() 
	{
		
		System.out.println("hello viewers");
		
		
		
	}
}
	
	class big2 extends sup2
	{
		void show() {
			
			super.show();
			 System.out.println("hello learner");
			 
		}
		
	 
		
		
	}
	
	
	
	

	

public class test2 {

	public static void main(String[] args) {
		big2 ref= new big2();
		ref.show();

	}

}
