package Examples.Syncronisation;

public class Driver {
    public static void main(String[] args){
        BankAccount acc =new BankAccount();
        acc.setBalance(100);
        //ATM1 atm = new ATM1();
        Thread t1= new Thread(()->{
                ATM.withdraw(acc,100);
     //       atm.withdraw(acc,100);
        });
        Thread t2 =new Thread(()->{
       //     atm.withdraw(acc,100);
            ATM.withdraw(acc,100);
        });
        t1.start();
        t2.start();
    }
}
