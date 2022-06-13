package br.com.xandecoelho5.chain.billsDispenser;

public class Dispenser {

    private final Bill chain;

    public Dispenser() {
        chain = new Bill(50, new Bill(10, new Bill(1)));
    }

    public Dispenser(Bill... bills) {
        for (int index = 0; index < bills.length - 1; index++) {
            Bill currentBill = bills[index];
            currentBill.setNext(bills[index + 1]);
        }
        chain = bills[0];
    }

    public void withdraw(int amount) {
        chain.execute(amount);
    }
}
