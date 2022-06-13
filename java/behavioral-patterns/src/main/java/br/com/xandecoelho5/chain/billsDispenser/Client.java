package br.com.xandecoelho5.chain.billsDispenser;

public class Client {

	public static void main(String[] args) {
		Dispenser dispenser = new Dispenser();
		System.out.println("Withdrawing $230...");
		dispenser.withdraw(230);
		System.out.println("Withdrawing $1589...");
		dispenser.withdraw(1589);

		Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(128), new Bill(64)
				, new Bill(32), new Bill(16), new Bill(8), new Bill(4), new Bill(2), new Bill(1));
		System.out.println("Withdrawing $230...");
		customDispenser.withdraw(230);
		System.out.println("Withdrawing $1589...");
		customDispenser.withdraw(1589);
	}
}
