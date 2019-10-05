package Examples.FunctinalInterface.MethodReference;

public class Driver {

    public static void main(String[] args){

        Square sq= new Square(5);

        Shape shape = Square::getArea;

        System.out.println(shape.getArea(sq));
    }
}
