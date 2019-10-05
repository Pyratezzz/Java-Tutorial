package Examples.Generic.WildCard;

import java.util.ArrayList;
import java.util.List;


public class Driver {
    public static void printBuilding(List<? extends Building> building){

        for(Object b : building){
            System.out.println(b.toString());
        }

    }
    public static void addList(List<? super House> house)
    {
        house.add(new House());
    }

    public static void main (String [] args){

        List<Building> building = new ArrayList<>();
        List<House> house =new ArrayList<>();

        System.out.println("Test1");
        addList(house);
        addList(building); //building will have object of class house
        System.out.println("");

        System.out.println("Test2");
        printBuilding(house);
        printBuilding(building);
        System.out.println("");

        System.out.println("Test3");
        building.add(new Building());
        printBuilding(building);
        System.out.println("");

     //   Below Line will give error
     //   house.add(new Building());

    }
}
