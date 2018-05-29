package banking;

public class HDFC extends PrivateBank{
	public Account withdrawAmount(int x, int accountNo) {
		Account z=map.get(accountNo);
		int currentBalance= z.getBalance();
		if (x<=5000 && currentBalance >= x) {
		int newBalance = currentBalance - x-5;
		z.setBalance(newBalance);
		}
		else if (x >5000 && currentBalance >= x ) {
			int newBalance = currentBalance - x- 10;
			z.setBalance(newBalance);
		}
		return z;
	}
}
