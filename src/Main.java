import bank.BankAccount;
import bank.Debit;

import java.util.Date;

public class Main {
    public static void main( String[] args ) {
        BankAccount client = new BankAccount( 15000D, "54321" );
        Date today = new Date();
        Debit debit = new Debit( "Mechi", "1234", today, client );

        debit.pay( 5000D );
        System.out.println( "Su saldo actual es: " + client.balance );
    }
}