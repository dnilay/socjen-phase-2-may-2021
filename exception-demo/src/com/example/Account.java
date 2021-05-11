package com.example;

public class Account {
    private String accountId;
    private String accountName;
    private double amount;
    private AccountType accountType;

    public Account() {
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {

        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws InvalidAmountException {
        if(amount<1000)
        {
            throw new InvalidAmountException("amount must be atleast 1000 or greater");
        }
        this.amount = amount;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", amount=" + amount +
                ", accountType=" + accountType +
                '}';
    }
}
