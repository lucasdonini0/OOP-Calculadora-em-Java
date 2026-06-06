package operations;

public class Subtract implements Operations{
    @Override
    public double execute (double x, double y){
        return x - y;
    }
    @Override public String getLabel (){
        return "Subtração";
    }
    @Override public int getOrder (){
        return 2;
    }
}
