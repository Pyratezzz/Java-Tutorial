package Examples.ThreadInterface;

public class Driver {

    public static void main(String[] args){
        Thread T1 = new Thread(new ThreadExample());
        T1.setName("Thread1");
        Thread T2 = new Thread(()->{
            int i=1;
            while(i<100){
                System.out.println(i +" : "+ Thread.currentThread().getName());
                i++;
            }
        });
        T2.setName("Thread2");
        /*
        Try T1.run() and see what happen. See FAQ's
         */
        T1.start();
        T2.start();

        //       Try this out.
//        ThreadExample T3 =new ThreadExample();
//        T3.run();
    }
}
