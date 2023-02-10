package Examples.FunctinalInterface.LambdaImplementation;

public class Driver {
    public static void main(String[] argv){

        //Implementing Functional Interface with lambda, supported in java 8 and above
         Greeting greeting=(name)->{
            System.out.println("Hello "+name);
        };
         greeting.greet("John Doe");
    }
}
