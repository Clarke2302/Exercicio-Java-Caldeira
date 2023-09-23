package exercicio2;

public class Circulo {

    double raio;
    double diametro;
    double pi = 3.14;

    //construtor
    public Circulo(double raio){
        this.raio=raio;
        
    }

    // funções

    //-----calcularArea------

    public void calcularArea(){
        if(raio>0){
        double area = pi*(raio*raio);
        System.out.println("A Área desse círculo é de "+area+" metros");
        System.out.println("-----------------------------------------");
        }else{
            System.out.println("Coloque um valor do raio válido, precisa ser um valor positivo!");
            System.out.println("-----------------------------------------");
        }

    }
    //----calcularCircunferencia------

    public void calcularCircunferencia(){
        if(raio>0){
        double circunferencia = 2*(pi*raio);
        System.out.println("A Circunferência do círculo é de "+circunferencia+" cm.");
        System.out.println("-----------------------------------------");
        }else{
            System.out.println("Coloque um valor do raio válido, precisa ser um valor positivo!");
            System.out.println("-----------------------------------------");
        }
    }
    //-----calcularDiametro-----------

    public void calcularDiametro(){
        diametro = 2*raio;
        System.out.println("O diâmetro desse círculo é "+diametro+" cm");
        System.out.println("-----------------------------------------");
    }

    public void definirRaio(double novoRaio){
        if(raio>0){
        raio = novoRaio;
        System.out.println("Agora o raio tem valor de "+raio+" cm");
        System.out.println("-----------------------------------------");
        }else{
            System.out.println("Coloque um valor do raio válido, precisa ser um valor positivo!");
            System.out.println("-----------------------------------------");
        }
    }
    public void verificaIgual(Circulo destino, double raio, Circulo destino2, double raio2){
        if(raio == raio2){
            System.out.println("Os dois círculos são iguais!");
            System.out.println("-----------------------------------------");
        }
        System.out.println("Os dois círculos são diferentes!");
        System.out.println("-----------------------------------------");
    }



}

