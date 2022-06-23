class sup //  super class for variable
{
	int a=10;
  	
}
class big extends sup 
{
	int a=20;
	
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	
	
	
}




public class test {

	public static void main(String[] args) {
		
	big ref= new big();
	ref.show();
	}

}
