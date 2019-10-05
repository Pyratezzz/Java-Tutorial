package Examples.Generic;

import java.util.ArrayList;
import java.util.List;


public class GenericMethod {
    static Character[] charArray = {'J','o','h','n'};
    static Integer[] intArray ={1,2,3,4};
    static Boolean[] boolArray ={true,false};

    public static List listToArrayList(Object[] arr){
        List list = new ArrayList();
        for(Object object : arr){
            list.add(object);
        }
        return list;

    }
    public static void main(String[]args){

        List<Boolean> bool = listToArrayList(boolArray);
        List<Integer> integer = listToArrayList(intArray );
        List<Character> character =listToArrayList(charArray);

        System.out.println(bool);
        System.out.println(integer);
        System.out.println(character);



    }
}
