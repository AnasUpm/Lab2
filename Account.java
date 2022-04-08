package week2;

class Account{
	//data field
	private int AccNum;
	private double balance;
	private static int numberofAccounts;
	Account(){
		//no arg constructor
		AccNum = 10;
		balance = 110.00;
		numberofAccounts++;
	}
	Account(int id, double balance){
		this.AccNum=id;
		this.balance=balance;
		numberofAccounts++;
	}
	public String displayAccount() {
		return " id : "+AccNum+" balance : RM"+balance;
	}
	public double withdraw(double amount) {
		this.balance=this.balance-amount;
		return balance;
	}
	public double deposit(double amount) {
		this.balance=this.balance+amount;
		return balance;
	}
	public int getAccNum() {
		return AccNum;
	}
	public void setAccNum(int accNum) {
		AccNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static int getNumberofAccounts() {
		return numberofAccounts;
	}
	public static void setNumberofAccounts(int numberofAccounts) {
		Account.numberofAccounts = numberofAccounts;
	}

	
}