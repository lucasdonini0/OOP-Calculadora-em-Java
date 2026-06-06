package operations;

import java.util.*;

public class OperationRegistry {
    private final Map<Integer, Operations> registry;

    public OperationRegistry() {
        registry = new LinkedHashMap<>(); // pra manter a ordem, diferente do hashmap

        ServiceLoader<Operations> loader = ServiceLoader.load(Operations.class); // Descobre todas as implementações de Operations, isso não foi nada óbvio, como caralho as pessoas faziam isso sem perguntar pra IA? COMO QUE ALGUÉM DESENVOLVEU ISSO????
        loader.stream()
                .map(ServiceLoader.Provider::get)  // pipeline, também não foi nada óbvio fazer isso, obrigado Claudinho por me explicar como chegar aqui. entrega o objeto real, o ServiceLoader meio que embala eles, chuto eu que seja por motivos de memória, mas não sei.
                .sorted(Comparator.comparingInt(Operations::getOrder)) // sorted coloca em ordem, extrai um int de cada objeto e usa esse valor pra comparar e ver qual vai primeiro. O Operations::getorder é o que extrai
                .forEach(op -> registry.put(op.getOrder(), op)); // Insere no map, no caso o registry, quando o usuário digitar 1, o InputHandler faz registry.get(1) e recebe o objeto Add de volta.
    }

    public Map<Integer, Operations> getRegistry() {
        return Collections.unmodifiableMap(registry); // esse collections é uma classe utilitária do java, também nada óbvia
        // retorna o map protegido contra modificação externa
    }
}
