package oop1.ex;

public class Account {
    int balance;    //잔액
    
    void deposit(int amount) {
        // 입금 메서드
        balance += amount;
    }
    
    void withdraw(int amount) {
        // 출금 메서드
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance);
        }
    }
}
