package sarfrazsir;

public class BankAccount {
 void deposit()
 {
	 int a=90;
	System.out.println("money deposited"+a ); 
 }
 void withdraw()
 {
	 System.out.println("money withdrawn");
 }
}
class SavingAccount extends BankAccount{
	      @override
	     
	    public void withdraw()
	      {
	    	  int a=200;
	    	  if(a>=100) {
	    		  System.out.println("withdrwal declined");
	    		  
	    	  }
	      }

	}
