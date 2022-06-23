
public class ABH {
	// private constructor;
	//when canot make object any other class
	int a;  double b;
	String c;
	private ABH() 
	{
		
		a=10; b=30.5;c="ABHISHEK";
		
	  System.out.print(a+" "+b+" "+c);
	}



	public static void main(String[] args) {
		ABH ref=new ABH();

	}
	/* DONT MAKE IT IN OTHER CLASS
	class man {
		public static void main(String[] args)
		{
			ABH ref=new ABH();
		}
		
		
		
	}*/

}
