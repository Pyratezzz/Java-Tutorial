package Examples.Generic.Substitution;

import java.util.ArrayList;
import java.util.List;


public class Driver {

    public static void build (Building b){
        System.out.println(b.toString());
    }
    public static void listBuild(List<Building> b){
        for(Building a :b)
        {
            System.out.println(a.toString());
        }
    }

    public static void listOffice(List<Office> o){
        for(Office a :o)
        {
            System.out.println(a.toString());
        }

    }
    public static void main(String[]args){
        System.out.println("Initialize Building");
        Building b = new Building();
        System.out.println("Initialize Office");
        Office o =new Office();

        System.out.println("Test1");//Building is super class for Office
        build(b);
        build(o);

        System.out.println("Test2");//Building is super class for Office
        List<Building> lb =new ArrayList<>();
        lb.add(b);
        lb.add(o);
        listBuild(lb);


        //Below Line will give error
        //listOffice(lb);

        System.out.println("Test3");//Parameterised List Type should be Building only
        List<Office> lo =new ArrayList<>();
        lo.add(o);
        lo.add(new Office());

        //Below line will give error
       // lo.add(b);

        //Below Line will give error
        //listbuild(lo);

       /*

                                    CONCLUSION:

            Backward Compatibility is not available as derived class can have extra methods and variable than base
            class. Though it will have all the methods and variables of base class so forward compatibility is
            available.

            Defination of Generic needs to be same as of argument of function(line no:40 and 52). Inside we can pass
            derived class object(line no 39).


        */



        //For understanding Inheritance
        System.out.println("Fun Activity 1");
        Building s= new Office();

        System.out.println("Fun Activity 2");

        s.Foo();
        ((Office) s).Fun();
        s.UltimateFun();

        //Below line will give error
       // Office x =new Building();


    }
}
