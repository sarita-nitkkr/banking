package banking;

import java.util.HashMap;
import java.util.Map;

public abstract class Bank {
	
	Map<Integer, Account> map = new HashMap<Integer, Account>();// like hr jagah koi chij unique hoti hai...like email id, 
	// bank account number, ab ye unique chij humne Integer type maan liya hai...
	// browser mai sb kuchh String k form mai hota hai..aur hum oose convert krte hain..int type ya char type main 
	
	Map map1 = new HashMap();// map1 is object
	public void createAccount(String name, String password, int balance,int accountNo) {
		Account a = new Account(); // create account object
		a.setName(name); // set values 
		a.setPassword(password);
		a.setBalance(balance);
		a.setAccountNo(accountNo);
		
		//put in map
		map.put(accountNo, a);// here accountNo is a key and in account No we put object a..means all the data of
		//a will be kept in account No.
		//map is like an index ..jismai  a wale account ka address pada hai
	}
	
	public Account getAccountByAccountNo(int n) {
		return map.get(n);
	}
	
	public Account depositAmount(int x, int accountNo) {
		Account z=map.get(accountNo);
		int currentBalace = z.getBalance();
		int newBalance = currentBalace+x; 
		z.setBalance(newBalance);
		return z;
		
	}
	
	public Account withdrawAmount(int x, int accountNo) {
		Account z=map.get(accountNo);
		int currentBalance= z.getBalance();
		if (currentBalance >= x ) {
		int newBalance = currentBalance - x;		
		z.setBalance(newBalance);
		}
		
		return z;
	}
	
//	
//	
////	Account b=new Account () ;
////	
////	b.setName ("Rahul");
////    protected String name = b.getName() ;
////    b.setPassword ("1234fgh");
////	protected String password = b.getPassword();
////	b.setBalance(10,000);
////	protected int balance = b.getBalance();
////	b.setAccountNo(123456);
////	protected int accountNo = b.getAccountNo();
//	
// protected int withdraw(int balWithdraw) {
//	 
//	 
//	 
//	 map.put("Sarita", new Account());
//	 
//	 
//	 if (balWithdraw > this.balance ) {
//		 balance=balance-balWithdraw;
//	 }
//	 return balance;
// }
//
//
//protected int deposit (int x) {
//	balance=balance+x;
//	return balance;
//}
//
//protected int checkBalance (int x) {
//	
//}
	
}

