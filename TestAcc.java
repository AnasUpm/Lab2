package week2;

import java.util.Scanner;

public class TestAcc {
	
	public static void main(String[] args) {
		
		
		//create 2 instances of customer
		Cust1();
		Cust2();
		
	
	}
	
	public static void Cust1 () {
		Scanner scanner = new Scanner(System.in);
		
		Customer cust = new Customer();
		
		System.out.println("Dear customer, please enter id and name");
		cust.setId(scanner.nextInt());
		cust.setName(scanner.next());
		
		
		System.out.println("press 1 to create accounts ");
		int a = scanner.nextInt();
		
		int i = 1;
		int j = 0;
		
		while(a!=0) {
			
			
			System.out.println("enter detail(Account Number and Balance) for account number "+i);
			cust.getCustAccount()[i].setAccNum(scanner.nextInt());
			cust.getCustAccount()[i].setBalance(scanner.nextDouble());
			
			
			System.out.println(+i+".account"+cust.getCustAccount()[i].displayAccount());
			
			j++;
			i++;
			cust.getCustAccount();
			Account.setNumberofAccounts(j);
			System.out.println("press 1 to continue creating accounts or press 0 to exit ");
			a= scanner.nextInt();
			
		}
		

		
		System.out.println("enter 1 to continue with transaction, enter 0 to exit");
		a = scanner.nextInt();
		
		double amount = 0;
		
		while(a!=0) {
			
			System.out.println("enter number of account entry");
			i = scanner.nextInt();
			
			System.out.println("enter 1 for withdraw \n enter 2 for deposit \n enter 0 to exit");
			int num = scanner.nextInt();
			
			//loop for transactions
			switch(num) {
			case 1 :
				System.out.println("enter amount to withdraw");
				amount = scanner.nextDouble();
				cust.getCustAccount()[i].withdraw(amount);
				System.out.println("new balance = "+cust.getCustAccount()[i].getBalance());
				break;
			case 2 :
				System.out.println("enter amount to deposit");
				amount = scanner.nextDouble();
				cust.getCustAccount()[i].deposit(amount);
				System.out.println("new balance = "+cust.getCustAccount()[i].getBalance());
				break;
			case 0:
				break;
				
			}
		System.out.println("enter 0 to exit, enter 1 to continue");
		a=scanner.nextInt();
		}
		System.out.println("id \t  \t   balance");
		cust.getCustAccount();
		for (i=1; i <= Account.getNumberofAccounts();i++) {
			
			System.out.println(cust.displayCustomerAcc()+"\n"+cust.getCustAccount()[i].displayAccount());
		}
	}
	
	public static void Cust2 () {
		Scanner scanner = new Scanner(System.in);
		
		Customer cust1 = new Customer();
		
		System.out.println("Dear customer, please enter id and name");
		cust1.setId(scanner.nextInt());
		cust1.setName(scanner.next());
		
		
		System.out.println("press 1 to create accounts ");
		int a = scanner.nextInt();
		
		int i = 1;
		int j = 0;
		
		while(a!=0) {
			
			
			System.out.println("enter detail(Account number and Balance) for account number "+i);
			cust1.getCustAccount()[i].setAccNum(scanner.nextInt());
			cust1.getCustAccount()[i].setBalance(scanner.nextDouble());
			
			
			System.out.println(+i+".account"+cust1.getCustAccount()[i].displayAccount());
			
			j++;
			i++;
			cust1.getCustAccount();
			Account.setNumberofAccounts(j);
			System.out.println("press 1 to continue creating accounts or press 0 to exit ");
			a= scanner.nextInt();
			
		}
		

		cust1.getCustAccount();
		
		
		System.out.println("enter 1 to continue with transaction");
		a = scanner.nextInt();
		
		double amount = 0;
		
		while(a!=0) {
			
			System.out.println("enter number of account entry");
			i = scanner.nextInt();
			
			System.out.println(" enter 1 for withdraw \n enter 2 for deposit \n enter 0 to exit");
			int num = scanner.nextInt();
			
			//loop for transactions
			switch(num) {
			case 1 :
				System.out.println("enter amount to withdraw");
				amount = scanner.nextDouble();
				cust1.getCustAccount()[i].withdraw(amount);
				System.out.println("new balance = "+cust1.getCustAccount()[i].getBalance());
				break;
			case 2 :
				System.out.println("enter amount to deposit");
				amount = scanner.nextDouble();
				cust1.getCustAccount()[i].deposit(amount);
				System.out.println("new balance = "+cust1.getCustAccount()[i].getBalance());
				break;
			case 0:
				break;
				
			}
		System.out.println("enter 0 to exit, enter 1 to continue");
		a=scanner.nextInt();
		}
		System.out.println("id \t  \t   balance");
		
		cust1.getCustAccount();
		for (i=1; i <= Account.getNumberofAccounts();i++) {
			System.out.println(cust1.getCustAccount()[i].getAccNum()+"\t \t   "+cust1.getCustAccount()[i].getBalance());
		}
	}


	}

