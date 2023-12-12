package sarfrazsir;

import java.util.Scanner;

public class Check {
void checkOddNumbers()
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the size o array");
	n=sc.nextInt();
	System.out.println("enter the array elements");
	int arr[]=new int[n];
	 for(int i =0;i<=n;i ++)
	 {
		 arr[i]=sc.nextInt();
		 
	 
	if( n %2==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("number is odd");
	}
	
}

}

	public static void main (String[]args) {
		Check r=new Check();
		r.checkOddNumbers();
	}
}

