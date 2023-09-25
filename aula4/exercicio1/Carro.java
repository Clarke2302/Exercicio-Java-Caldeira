package exercicio1;

public class Carro extends Veiculo{
    //duas classes concretas que herdem de Veiculo

    double custo = 0.20;
    int distancia;
    
    public Carro (int distancia){
        this.distancia=distancia;
    }

    @Override
    public double calcularCustoViagem(){
        double custoViagem = custo/distancia;
        return custoViagem;
    }
}
