import calculator.Calculator;
import inputhandler.InputHandler;
import operations.OperationRegistry;
import operations.Operations;

import java.util.Map;

public class Main {

    static void main(String[] args) { // todo: loop do menu
        OperationRegistry operationRegistry = new OperationRegistry();
        Map<Integer, Operations> registry = operationRegistry.getRegistry();

        InputHandler inputHandler = new InputHandler(registry);
        Calculator calculator = new Calculator();

        while (true) {
            displayMenu(registry); // displayMenu recebe o registry pra printar dinamicamente
            Operations op = inputHandler.getOperation(); // Cria a interface Operations e usa o metodo getOperation para pegar o input do usuário
            double x = inputHandler.getNumber("Número 1: ");
            double y = inputHandler.getNumber("Número 2: ");

            double result = calculator.calculate(op, x, y);
            System.out.println("Resultado: " + result);
        }
    }

    public static void displayMenu(Map<Integer, Operations> registry) {
        System.out.println("=".repeat(32));
        System.out.println("Calculadora Foda");
        System.out.println("0- Sair");
        // itera o map e printa cada entrada como "getOrder() - getLabel()"
        for (Map.Entry<Integer, Operations> entry : registry.entrySet()){
            System.out.println(entry.getKey() + "- " + entry.getValue().getLabel());
                                                        // pega o valor do par e depois chama o metodo dele
        }
        System.out.println("=".repeat(32));
        System.out.print("Escolha a operação: ");
    }
}