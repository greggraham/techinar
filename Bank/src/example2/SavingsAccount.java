package example2;

public class SavingsAccount extends Account {

    public SavingsAccount(String acctName, String startAmount) {
        super(acctName, startAmount);
        deposit("10.00"); // new account bonus
    }

    @Override
    public String toString() {
        return "Savings Account " + super.toString();
    }
}
