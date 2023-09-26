package exercicio1;

public class Carro extends Veiculo{
    //duas classes concretas que herdem de Veiculo

    double custoPorKM = 0.20;
    int distancia;
    
    public Carro (int distancia){
        this.distancia=distancia;
    }

    
    double custoViagem;
    public double calcularCustoViagem(){
        return custoViagem = custoPorKM*distancia;
        
    }
}
