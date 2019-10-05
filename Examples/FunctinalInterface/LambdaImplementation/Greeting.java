package Examples.FunctinalInterface.LambdaImplementation;

//Annotation for Functional Interface
@FunctionalInterface
public interface Greeting {

    //Only one abstract metod is allowed in functional interface
    public abstract void greet(String name);
}
