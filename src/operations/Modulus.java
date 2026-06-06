package operations;

public class Modulus implements Operations{
    @Override public double execute(double x, double y) {
        return x % y;
    }
    @Override public String getLabel (){
        return "Resto da divisão";
    }
    @Override public int getOrder (){
        return 7;
    }
}
