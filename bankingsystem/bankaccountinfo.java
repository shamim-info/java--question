package bankingsystem;

public class bankaccountinfo {
private String accountnumber;
private double balance;

	
	public String getAccountnumber() {
	return accountnumber;
}


public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


	public static void main(String[] args) {
		bankaccountinfo info =new bankaccountinfo();
		info.setAccountnumber("sb-366234");
		info.setBalance(2000);
		System.out.println(info.getAccountnumber()+"   balance  "+info.getBalance());

	}

}
