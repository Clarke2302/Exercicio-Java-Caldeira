package exercicio1;
public class Main {

    public static void main(String[] args) {
        
    
    Veiculo c1 = new Carro(500);
    Veiculo m1 = new Moto(100);

    System.out.println("----------------------------------------"+"\n");
    System.out.println("O custo da viagem de carro foi de R$"+c1.calcularCustoViagem());
    System.out.println("O custo da viagem de moto foi de R$"+m1.calcularCustoViagem());
    System.out.println("--------------------------------------");

    }
}