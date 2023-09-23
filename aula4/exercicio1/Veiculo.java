package exercicio1;

public abstract class Veiculo { //classe abstrata
    String marca;
    String modelo;
    int ano;
}

public abstract calcularCustoViagem(int distancia){ //método abstrato
    //calcular o custo de uma viagem com bas e na distância fornecida.

}

//duas classes concretas que herdem de Veiculo

public void Carro(){
    double custoPorKm = 0.20;
calcularCustoViagem();
}
public void Moto(){
    double custoPorKm = 0.15;
calcularCustoViagem();
}
