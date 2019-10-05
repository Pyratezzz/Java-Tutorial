package Examples.Generic.Substitution;

public class Office extends Building {

   Office(){
       System.out.println("office constructor called");
    }
    @Override
    public String toString(){
        return("Office");
    }

    //For understanding Inheritance
    public void Fun(){
        System.out.println("Inside Office.Fun");
    }

    //For understanding Inheritance
    @Override
    public void Foo(){
        System.out.println("Inside Office.foo");
    }
}
