package Examples.Syncronisation;

public class ATM {
     public static synchronized void withdraw(BankAccount acc, int amount){

         if(acc.getBalance()-amount<0){
             System.out.println("can't process transaction");
         }
         else{
             System.out.println("Transaction processed");
             acc.setBalance(acc.getBalance()-100);
         }

    }
}
