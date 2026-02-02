package Abstraction;
import java.util.logging.Logger;
public class BankAccount {
    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;
    Logger logger = Logger.getLogger(BankAccount.class.getName());
    public BankAccount(String name, long balance, long accountNumber, String ifscCode, AccountType accountType) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
        this.balance = balance;
    }
    void deposit(long... amounts){
        for (long amt : amounts){
            if(amt<=0){
                logger.warning("Invalid Amounts");
            }else
                balance += amt;
        }
        logger.info("New balance is"+balance);
    }
    void withdraw(long amount){

    }
}