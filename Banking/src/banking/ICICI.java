package banking;

public class ICICI extends PrivateBank{

	public Account withdrawAmount (int x, int accountNo) {
		Account z= map.get(accountNo);
		int curBalance= z.getBalance();
		int netBalance;
		if (x <= 5000 && curBalance >= x) {
			 netBalance= curBalance-x-6;
			 z.setBalance(netBalance);
		}
		else if(x>=5000) {
			netBalance= curBalance-x-11;
		
		z.setBalance(netBalance);
		}
		return z;
	}
}
