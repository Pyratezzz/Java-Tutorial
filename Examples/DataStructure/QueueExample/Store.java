package Examples.DataStructure.QueueExample;

import java.util.LinkedList;
public class Store {
    public static void main(String[] args) {
        LinkedList<Costumer> costumerqueue = new LinkedList<>();
         costumerqueue.add(new Costumer("John"));
        costumerqueue.add(new Costumer("Jane"));
        costumerqueue.add(new Costumer("Jin"));
        costumerqueue.add(new Costumer("Jine"));

        System.out.println(costumerqueue);

        served(costumerqueue);

        System.out.println(costumerqueue);
    }

    public static void served(LinkedList<Costumer> costumers){
        Costumer c = costumers.poll();
        c.served();
    }
}
