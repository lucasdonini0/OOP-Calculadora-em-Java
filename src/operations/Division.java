package operations;

public class Division implements Operations{
    @Override
    public double execute(double x, double y) {
        return x / y; //todo: verificar se y = 0
    }
}
