package bank;

import java.util.Objects;

public class BankAccount {

    public Double balance;
    String accountNumber;

    public BankAccount( Double balance, String accountNumber ) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        BankAccount that = ( BankAccount ) o;
        return balance.equals( that.balance ) && accountNumber.equals( that.accountNumber );
    }

    @Override
    public int hashCode() {
        return Objects.hash( balance, accountNumber );
    }
}
