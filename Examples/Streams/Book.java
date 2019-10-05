package Examples.Streams;

public class Book {

    String title;
    String auther;

    Book(String auther, String title){
        this.auther=auther;
        this.title=title;
    }
    public String getName() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    @Override
    public String toString(){
        return(title +" by "+ auther);
    }

}
