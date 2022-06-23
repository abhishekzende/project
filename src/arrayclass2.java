import java.util.Arrays;
import java.util.Scanner;

public class arrayclass2 {
	//ARRAY SCANNER CLASS

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER ARRAY ELEMENTS");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			
		}
		Arrays.sort(a);
		
		System.out.println(" ARRAY ELEMENTS");
		for(int b:a)
		{
			System.out.println(b+" ");
			
		}
		
		
	}

}
