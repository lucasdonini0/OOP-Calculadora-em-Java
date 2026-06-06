package operations;

public class Division implements Operations{
    @Override
    public double execute(double x, double y) {
        return x / y; //todo: verificar se y = 0
    }
    @Override public String getLabel (){
        return "Divisão";
    }
    @Override public int getOrder (){
        return 4;
    }
}
