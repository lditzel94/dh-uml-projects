package bank;

import java.util.Date;

public class Debit {
    BankAccount bankAccount;

    String principal;
    String number;
    Date expiration;

    public Debit( String principal, String number, Date expiration, BankAccount account ) {
        this.principal = principal;
        this.number = number;
        this.expiration = expiration;
        this.bankAccount = account;
    }

    public void pay( Double amount ) {
        bankAccount.balance -= amount;
    }
}
