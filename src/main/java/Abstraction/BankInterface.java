package Abstraction;

import java.util.logging.Logger;
public interface BankInterface {

    public static final Logger logger = Logger.getLogger(BankInterface.class.getName());
    abstract void deposit(long... amounts);
    abstract void  withdraw(long amount);
} //funtion which no body is called abstract
