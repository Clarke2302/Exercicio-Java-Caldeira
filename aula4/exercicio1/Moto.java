package exercicio1;

public class Moto extends Veiculo{
    //duas classes concretas que herdem de Veiculo

    private double custo = 0.15;
    private int distancia;

    public Moto (int distancia){
        this.distancia=distancia;
    }

    
    @Override
    public double calcularCustoViagem(){
        double custoViagem = custo/distancia;
        return custoViagem;
    }
}


