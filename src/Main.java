import calculator.Calculator;
import inputhandler.InputHandler;
import operations.Operations;

public class Main {

    static void main(String[] args) { // todo: loop do menu
        InputHandler inputHandler = new InputHandler();
        Calculator calculator = new Calculator();

        while (true){
        displayMenu(); // displeia o menu, dur
        Operations op = inputHandler.getOperation(); // Cria a interface Operations e usa o metodo getOperation para pegar o input do usuário
        double x = inputHandler.getNumber("Número 1: ");
        double y = inputHandler.getNumber("Número 2: ");
        
        double result = calculator.calculate(op, x, y);
        System.out.println("Resultado: " + result);
    }
    }

    public static void displayMenu(){
        System.out.println("=".repeat(32));
        System.out.println("Calculadora Foda");
        System.out.println("0- Sair");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Potência");
        System.out.println("=".repeat(32));
        System.out.print("Escolha a operação: ");
    }
}