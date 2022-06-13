package br.com.xandecoelho5.chain.billsDispenser;

public class Bill {

    private final int value;
    private Bill next;

    public Bill(int value, Bill next) {
        this.value = value;
        this.next = next;
    }

    public Bill(int value) {
        this.value = value;
    }

    public void setNext(Bill bill) {
        this.next = bill;
    }

    public void execute(int remaining) {
        if (remaining >= value) {
            int bills = remaining / value;
            remaining %= value;
            System.out.printf("- %d bill(s) of $%d, $%d remaining%n", bills, value, remaining);
        }
        if (remaining == 0) return;
        if (next != null) next.execute(remaining);
    }
}
