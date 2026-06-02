package inputhandler;
import operations.*;
import java.util.Locale;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Encapsulation: Só a própria classe pode usar o objeto
            // final pq não vou criar outro scanner

    public Operations getOperation(){

        int option = scanner.nextInt();

        switch (option){ // aqui só pega o input, o menu quem printa vai ser a Main por enquanto
            case 0:
                System.exit(0);
            case 1:
                return new Add();
            case 2:
                return new Subtract();
            case 3:
                return new Multiply();
            case 4:
                return new Division();
            case 5:
                return new Exponentiation();
            default:
                throw new IllegalArgumentException("Argumento inválido! Tente novamente");
        }

    }

    public double getNumber(String text){
        System.out.print(text);
        return scanner.nextDouble();
    }


}
