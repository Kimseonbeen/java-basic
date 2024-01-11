package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance
    public int getBalance() {
        return balance;
    }

    /**
     * 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이다. 따라서 private 사용
     */
    private boolean isAmountValid(int amount) {
        // 금액이 0 보다 커야한다
        return amount > 0;
    }




}
