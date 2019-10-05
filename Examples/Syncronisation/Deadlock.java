package Examples.Syncronisation;

public class Deadlock {

    public static void main(String[] args){
        Object spoon = new Object();
        Object bowl = new Object();
        /*

            Situation below will cause Deadlock.
            To avoid it: 1) Don't use consecutive sync block
                         2) Maintain the same order for syncing objects

         */
        Thread t1= new Thread(()->{
            synchronized (spoon){
                System.out.println("T1 is having spoon, waiting for bowl...");
                synchronized (bowl){
                    System.out.println("T1 is having spoon and bowl...");
                }
            }
        });

        Thread t2 =new Thread(()->{
            synchronized (bowl){
                System.out.println("T2 is having bowl, waiting for spoon...");
                synchronized (spoon){
                    System.out.println("T2 is having bowl and spoon ...");
                }
            }
        });

        /*
           // ALTERNATIVE TO AVOID DEADLOCK

            Thread t1= new Thread(()->{
            synchronized (spoon){
                System.out.println("T1 is having spoon, waiting for bowl...");
                synchronized (bowl){
                    System.out.println("T1 is having spoon and bowl...");
                }
            }
        });

        Thread t2 =new Thread(()->{
            synchronized (spoon){
                System.out.println("T2 is having bowl, waiting for spoon...");
                synchronized (bowl){
                    System.out.println("T2 is having bowl and spoon ...");
                }
            }
        });
         */

        t1.start();
        t2.start();
    }
}
