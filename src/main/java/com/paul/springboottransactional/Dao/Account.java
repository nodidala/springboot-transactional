package com.paul.springboottransactional.Dao;

import java.math.BigDecimal;

/**
 * @author paul
 * @Description
 * @date 2019/8/1 10:09
 */
public class Account {
    private String accountId;
    private String accountName;
    private BigDecimal balance;

    public Account(String accountId, String accountName, BigDecimal balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }

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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
