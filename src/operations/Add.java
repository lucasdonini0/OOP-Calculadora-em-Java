package operations;

public class Add implements Operations{

    @Override public double execute (double x, double y){
        return x + y;
    }
    @Override public String getLabel (){
        return "Adição";
    }
    @Override public int getOrder (){
        return 1;
    }
}
