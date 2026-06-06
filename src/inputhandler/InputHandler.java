package inputhandler;
import operations.*;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private final Map<Integer, Operations> registry; // é só map não linkedhashmap pq só preciso usar o .get aqui e qualquer map faz isso

    public InputHandler(Map<Integer, Operations> registry) { // recebe o mapa que o OperationRegistry montou
        this.registry = registry;
    }

    public Operations getOperation(){

        int option = scanner.nextInt();
        if (option == 0) System.exit(0);

        Operations op = registry.get(option);
        if (op == null) throw new IllegalArgumentException("Opção não encontrada."); // todo: dar um jeito de fazer essa porra mandar printar o menu dnv
        return op;
    }

    public double getNumber(String text){
        System.out.print(text);
        return scanner.nextDouble();
    }


}
