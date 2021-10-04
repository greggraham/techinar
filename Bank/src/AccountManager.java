public class AccountManager {
    public static void main(String[] args) throws Exception {
        Account myAccount = new Account("FirstAccount", "10.00");
        System.out.println("Account Created: " + myAccount.getName());
        System.out.println("Ballance: " + myAccount.getAmount());

        try {
            //myAccount.deposit("500.00");
            myAccount.withdraw("20.00");
            //myAccount.deposit("check");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal: " + e.getMessage());
        } finally {
            System.out.println("New Balance:  " + myAccount.getAmount());
        }
    }
}
