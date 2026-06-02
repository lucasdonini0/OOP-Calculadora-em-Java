package operations;

public class Exponentiation implements Operations{
    @Override
    public double execute (double x, double y){
        return Math.pow(x, y);
    }
}
