package sarfrazsir;

public class PrimeNumber {

	public static void main(String[] args) {
		int n =15;
		for(int i=2;i< n;i++) {
			if(n%i==0) {
				System.out.println("not prime");	
				return;
			}
			
		}
		

	}

}
