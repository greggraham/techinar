package example2;

public class AccountManager {
    public static void main(String[] args) throws Exception {
        Account mySavings = new SavingsAccount("Save001", "10.00");

        try {
            mySavings.withdraw("5.00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal: " + e.getMessage());
        } finally {
            System.out.println("New Balance:  " + mySavings.getAmount());
        }

        Account myChecking = new CheckingAccount("Check002", "28.00", 1);

        try {
            myChecking.withdraw("5.00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal: " + e.getMessage());
        } finally {
            System.out.println("New Balance:  " + myChecking.getAmount());
        }

        myChecking.deposit("500.00");

        try {
            myChecking.withdraw("5.00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal: " + e.getMessage());
        } finally {
            System.out.println("New Balance:  " + myChecking.getAmount());
        }
    }
}
