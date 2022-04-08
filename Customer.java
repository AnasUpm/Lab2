package week2;

public class Customer {

	private int id;
	private String name;
	private Account[] custAccount;
//no args constructor
	Customer(){
		//create object account in array
		custAccount=new Account[10];
		for(int i = 0; i<custAccount.length; i++) {
		custAccount[i]=new Account();
		}
		id=0;
		name="";
		
	}
	//constructor
	Customer(  int id, String name){
		custAccount=new Account[10];
		for(int i = 0; i<custAccount.length; i++) {
			custAccount[i]=new Account();
		}
		
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account[] getCustAccount() {
		return custAccount;
	}

	public void setCustAccount(Account[] custAccount) {
		this.custAccount=custAccount;
	}
	
	public String displayCustomerAcc() {
		return "ID Number : "+id+"\nName : "+name;
	}


	
}
	
