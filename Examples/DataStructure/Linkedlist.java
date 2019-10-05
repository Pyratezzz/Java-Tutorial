package Examples.DataStructure;

import java.util.LinkedList;


public class Linkedlist {

    public static void main(String[] args){
        LinkedList<String> list =new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.get(0));

        list.remove("b");
        System.out.println(list);
    }
}
