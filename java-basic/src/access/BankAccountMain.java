package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("balance = " + account.getBalance());
        account.deposit(10000);
        System.out.println("balance = " + account.getBalance());
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
