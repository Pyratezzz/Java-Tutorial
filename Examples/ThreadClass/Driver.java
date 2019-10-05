package Examples.ThreadClass;

public class Driver {
    public static void main(String[] args){
        ThreadExample T1 =new ThreadExample();
        T1.setName("Thread1");
        T1.start();
        ThreadExample T2 = new ThreadExample();
        T2.setName("Thread2");
        T2.start();
    }
}
