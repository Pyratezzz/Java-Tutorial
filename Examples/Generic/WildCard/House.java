package Examples.Generic.WildCard;

public class House extends Building{
    House(){
        System.out.println("House-Constructor");
    }
    @Override
    public String toString(){
        return("House");
    }
}
