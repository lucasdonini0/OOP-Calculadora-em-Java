package operations;

public class Percentage implements Operations{
    @Override public double execute(double x, double y) {
        return y * (x/100);
    }
    @Override public String getLabel (){
        return "Porcentagem";
    }
    @Override public int getOrder (){
        return 6;
    }
}
