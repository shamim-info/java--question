package bankingsystem;

public class bankaccounts {
	
 private int accountNumber;
 private double balance ;
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public void deposit(double amount )
{
	if (amount >0) {
		balance+=amount;
		System.out.println("deposited "+amount+" into account " +accountNumber);
		
	}		
	else {
		System.out.println("invalid");
		
	}
	 {	 
	 }
}
public void withdraw(double amount) {
	if(amount>0&&amount<=balance) {
		balance -=amount;
		System.out.println("withdrown " +amount +" from account number "+ accountNumber);
	}
}

public void checkBalance() {
	System.out.println("account "+ accountNumber +" has balance of  "+  balance);
}



	public static void main(String []args) {
		bankaccounts info=new bankaccounts();
		info.setAccountNumber(366275922);
		info.setBalance(2345.56);
		info.deposit(2000);
		info.withdraw(2000);
		info.checkBalance();
		System.out.println(info.getAccountNumber() +info.getBalance());
		
	}
}








