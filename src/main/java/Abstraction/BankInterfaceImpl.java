package Abstraction;

import java.util.Arrays;

import static Abstraction.BankInterface.logger;

public class BankInterfaceImpl extends OfflineBank implements BankInterface ,RBi{
    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;
    public BankInterfaceImpl(String name, long balance, long accountNumber, String ifscCode, AccountType accountType) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
    }
    @Override
    public void deposit(long... amounts) {
        for (long amt : amounts) {
            if (amt <= 0) {
                logger.warning("INVALID AMOUNTS");
            } else {
                balance += amt;
            }
            logger.info("New Balance is: " + balance);
        }
    }

    @Override
    public void withdraw(long amount) {

        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            }
        }
        else {
            logger.warning("Invalid amount");
        }
        logger.warning("New balance is "+balance);
    }

    @Override
    public boolean isLicensed() {
        return false;
    }

    @Override
    public String toString() {
        return "BankInterfaceImpl{" +
                "name='" + name +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", ifscCode='" + ifscCode +
                ", accountType=" + accountType +
                ", postalCode=" + postalCode +
                ", branchName='" + branchName +
                '}';
    }
};
