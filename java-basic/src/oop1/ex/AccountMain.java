package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account card = new Account();
        card.deposit(10000);
        card.deposit(10000);
        card.withdraw(15000);
        card.withdraw(6000);
    }
}
