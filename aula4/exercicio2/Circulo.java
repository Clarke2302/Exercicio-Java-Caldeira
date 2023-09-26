package exercicio2;

public class Circulo extends FormaGeometrica {
    
    double pi = 3.14;
    double raio;
    double diametro = 2*raio;

    public Circulo(double raio){
        this.raio=raio;
        
    }

    double area;
    public double calcularArea(){
        return area = pi*(raio*raio);
        
    }
}