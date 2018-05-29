package banking;

public class Account {
	
protected int accountNo;
protected String name;
protected String password;
protected int balance;

public int getAccountNo() {
	return this.accountNo;
}

public void setAccountNo(int x) {
	 this.accountNo=x;
}

public String getName () {
	return this.name;
}

public void setName(String name) {
	this.name=name;
}

public String getPassword () {
	return this.password;
}

public void setPassword(String s) {
	this.password=s;
}

public int getBalance () {
	return this.balance;
}

public void setBalance (int x) {
	this.balance=x;
} 
}
              