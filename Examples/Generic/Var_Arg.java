package Examples.Generic;

public class Var_Arg {
    public static void printList(String ... args){
        for (String s :args)
        {
            System.out.println(s);
        }
    }
     public static void printlist2(String[] args){
        for (String s: args){
            System.out.println(s);
        }
     }

     public static void main(String[] args){

        String item1 = "Apple";
        String item2="Orange";
        String item3= "Mango";

        printList(item1,item2,item3,"Banana");
        printlist2(new String[]{item1,item2,item3});

     }

}
