package operations;

public class Multiply implements Operations{ // we don't need to multiply!
    @Override
    public double execute (double x, double y){
        return x * y;
    }
}
