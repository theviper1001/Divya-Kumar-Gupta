package digital_arrayzero;

import java.util.Scanner;

public class test1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		 int size=sc.nextInt();
		 
		 int b[]=new int[size];
		 System.out.println("Enter the elements of the array");
			 
		 int count=0;
		 
		 for(int i=0;i<size;i++)
		 {
			 b[i]=sc.nextInt();
		 
			 if(b[i]==0)
			 {count++;}
		 }
		 
		 System.out.println("Initially");
		 for(int i=0;i<size;i++)
		 {
			 System.out.print(b[i]);
		 }
		 
		 for(int i=0;i<count;i++)
		 {
			 b[i]=0;
		 }
		 
		 for(int i=count;i<size;i++)
		 {
			 b[i]=1;
		 }
		
		 System.out.println("Finally");
		 for(int i=0;i<size;i++)
		 {
			 System.out.print(b[i]);
		 }
		 
	sc.close();}
	
}
