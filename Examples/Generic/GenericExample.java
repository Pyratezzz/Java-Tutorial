package Examples.Generic;
//Use of Generics in JAVA
import java.util.ArrayList;
import java.util.List;
public class GenericExample {

    public static void main(String[] argv){

        //Without Generics

        List names= new ArrayList();
        names.add("JOHN DOE");
        System.out.println((String)names.get(0));
        names.add(1);

        //below line will print the output but of type int.
        System.out.println(names.get(1));

        //Below Line will give error at run time
        //System.out.println((String)names.get(1));


        //With Generics


        List<String> names2 =new ArrayList<>();
        names2.add("JANE DOE");
        //Below Line will give error at compile time.
        //names2.add(1);
        System.out.println(names2.get(0));

    }

}
