public class bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        System.out.println(account.getBalance());
        account.depositAmount(500);
        System.out.println(account.getBalance());
        account.withdrawAmount(1000);
        System.out.println(account.getBalance());
    }
}
