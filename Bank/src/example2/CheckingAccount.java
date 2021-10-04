package example2;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    private static BigDecimal minimumBalance = new BigDecimal("25.00");

    private int numSignatories;

    public CheckingAccount(String acctName, String startAmount, int numSignatories) {
        super(acctName, startAmount);
        this.numSignatories = numSignatories;
    }
    
    public int getNumSignatories() {
        return numSignatories;
    }

    public void setNumSignatories(int newValue) {
        numSignatories = newValue;
    }

    @Override
    public void withdraw(String withdrawal) throws IllegalArgumentException {
        BigDecimal desiredAmount = new BigDecimal(withdrawal);
        BigDecimal checkedBalance = getAmount().subtract(desiredAmount);
        if (checkedBalance.compareTo(minimumBalance) < 0) {
            throw new IllegalArgumentException("Cannot go below minimum balance");
        }
        super.withdraw(withdrawal);
    }

    @Override
    public String toString() {
        return "Checking Account " + super.toString();
    }
}
