package Examples.Syncronisation;


/*
    Sync. for a block.
 */
public class ATM1 {
    public void withdraw(BankAccount acc, int amount){

        synchronized (this) {
            if (acc.getBalance() - amount < 0) {
                System.out.println("can't process transaction");
            } else {
                System.out.println("Transaction processed");
                acc.setBalance(acc.getBalance() - 100);
            }
        }
    }
}
