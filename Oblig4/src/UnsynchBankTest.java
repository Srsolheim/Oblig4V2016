class UnsynchBankTest {
private static final int ACCOUNTS = 10;
	private static final int BALANCE = 10000;
	
	public static void main(String[] args) {
		
		Bank b = new Bank(ACCOUNTS, BALANCE);
		
		for (int i = 0; i < ACCOUNTS; i++) {
			TransferThread t = new TransferThread(b, i, BALANCE);
			t.setPriority(Thread.NORM_PRIORITY + i % 2);
			t.start();
		}
	}
}
