package example1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private String name;
    private BigDecimal amount;

    public Account(String acctName, String startAmount) {
        setName(acctName);
        setAmount(startAmount);
        amount.setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setName(String newName) {
        String pattern = "^[a-zA-Z0-9]*$";
        if (newName.matches(pattern)) {
            name = newName;
        }
    }

    private void setAmount(String newAmount) {
        amount = new BigDecimal(newAmount);
    }

    public void withdraw(String withdrawal) throws IllegalArgumentException {
        BigDecimal desiredAmount = new BigDecimal(withdrawal);

        // Check for negative withdrawal
        if (desiredAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }

        // Check if withdrawal is greater than balance
        if (amount.compareTo(desiredAmount) < 0) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }

        amount = amount.subtract(desiredAmount);
    }

    public void deposit(String deposit) throws IllegalArgumentException {
        BigDecimal desiredAmount = new BigDecimal(deposit);

        // Check for negative deposit
        if (desiredAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative amount");
        }

        amount = amount.add(desiredAmount);
    }
}