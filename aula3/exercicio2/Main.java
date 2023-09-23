package exercicio2;

public class Main {
    public static void main(String[] args) {
        
        Circulo circo1 = new Circulo(7);
        Circulo circo2 = new Circulo(6);

        System.out.println("\n"+"-----------------------------------------");

        circo1.calcularArea();
        circo1.calcularCircunferencia();
        circo1.calcularDiametro();
        circo1.definirRaio(9);
        
        circo1.verificaIgual(circo1, 7, circo2, 6);

        System.out.println("\n"+"-----------------------------------------");

        
    }
    
}
