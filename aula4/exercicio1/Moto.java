package exercicio1;

public class Moto extends Veiculo{
    //duas classes concretas que herdem de Veiculo

    private double custoPorKM = 0.15;
    private int distancia;

    public Moto (int distancia){
        this.distancia=distancia;
    }

    
    double custoViagem;
    public double calcularCustoViagem(){
        return custoViagem = custoPorKM*distancia;
        
    }
}


