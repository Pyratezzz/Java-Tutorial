package Examples.Generic.Substitution;

public class Building {
    Building(){
        System.out.println("building constructor called");
    }
    @Override
    public String toString(){
        return("Building");
    }



    //For understanding Inheritance
    public void Foo(){
        System.out.println("Inside Building.Foo");
    }

    //For understanding Inheritance
    public void UltimateFun(){
        System.out.println("Inside Building.UltimateFun");
    }
}
