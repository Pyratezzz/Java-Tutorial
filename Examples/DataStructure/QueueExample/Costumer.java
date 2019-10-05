package Examples.DataStructure.QueueExample;

public class Costumer {
    Boolean hasBeenServed;
    String name;
    Costumer(String name){
        this.name=name;
        hasBeenServed=false;
    }
    public void served(){
        hasBeenServed=true;
        System.out.println(name +" has been served");
    }

    @Override
    public String toString(){
        return name;
    }
}
