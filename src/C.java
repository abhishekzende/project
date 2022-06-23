class d { // parameterized constructor
	
	int x;
	String y;   
	d(int a, String b)
	{
		
		x=a;  y=b;
	
		
		
	}
	
	void show() 
	{
		System.out.print(x+" "+y);
		
	}
	
	
}


public class C {

	public static void main(String[] args) {
		
		d r=new d(100,"abhishek");
		r.show();

		
	}

}
