package sarfrazsir;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
       n=sc.nextInt();
       for(int i=2;i<=n;i++) {
    	   if(n%i==0) {
    		   System.out.println(i+" ");
    	   }
       }
	}

}
