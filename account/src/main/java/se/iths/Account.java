package se.iths;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void makeDeposit(int deposit) {
        balance += deposit;
    }

    public void makeWithdrawal(int withdrawal) {
        balance -= withdrawal;
    }

    public int getBalance() {
        return balance;
    }

    public void addInterestToBalance(double interest) {
        balance *= interest;
    }
}
