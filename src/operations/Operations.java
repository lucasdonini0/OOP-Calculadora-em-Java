package operations;

public interface Operations { // Interface é a classe pai
    double execute (double x, double y); // Blueprint pra outras classes usarem, acho que o nome disso é polimorfismokkk
    String getLabel (); // nome que vai aparecer no menu
    int getOrder (); // posição que vai aparecer no menu lá e tal, sim, esse comentário é bem bosta, mas eu tô tentando entender as coisas aqui, ok? para de me julgar um pouco e me contrata logo
}
