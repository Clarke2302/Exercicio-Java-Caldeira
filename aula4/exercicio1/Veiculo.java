package exercicio1;
public abstract class Veiculo { //classe abstrata não pode criar objetos nela, somente em suas subclasses
    String marca;
    String modelo;
    int ano;
    public abstract double calcularCustoViagem();
}
