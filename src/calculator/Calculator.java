package calculator;

import operations.Operations;

public class Calculator {
    public double calculate (Operations op, double x, double y){
        return op.execute(x, y); // Vai receber uma operação do inputhandler e executar independente de qual seja
    }
}
