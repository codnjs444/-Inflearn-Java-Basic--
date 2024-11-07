package oop1.ex;

public class Account {
    int balance;

    int deposit(int amount) {
        balance += amount;
        System.out.println("입금이 되었습니다." + amount);
        System.out.println("잔액 :" + balance);
        return balance;
    }

    int withdraw(int amount) {
        if (balance < amount){
            System.out.println("잔액이 없슴다");
            return 0;
        } else {
            balance -= amount;
            System.out.println("출금 되었습니다." + amount);
            System.out.println("잔액 :" + balance);
        }
        return amount;
    }
}
