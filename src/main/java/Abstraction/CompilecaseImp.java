package Abstraction;

import Abstraction.Inteface.Compilecase;

public class CompilecaseImp implements Compilecase {
    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;

    public CompilecaseImp(String name, long balance, long accountNumber, String ifscCode, AccountType accountType) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
    }

    public CompilecaseImp() {

    }


    @Override
    public String toString() {
        return "CompilecaseImp{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", ifscCode='" + ifscCode + '\'' +
                ", accountType=" + accountType +
                '}';
    }

    public void ring() {

    }
}
