package Examples.ThreadInterface;

public class ThreadExample implements Runnable {
    /*
        Advantage of runnable interface is tha Java can only extends upto one class.

        When we extend Thread class, each of our thread creates unique object and associate with it. When we implements Runnable, it shares the same object to multiple threads

        Have loose coupling
     */
    @Override
    public void run() {
        int i=1;
        while(i<100){
            System.out.println(i + " : " +Thread.currentThread().getName());
            i++;
        }
    }
}
