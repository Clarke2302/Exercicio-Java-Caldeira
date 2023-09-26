package exercicio2;

public class Retangulo extends FormaGeometrica{

    double base;
    double altura;

    public Retangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
        
    }

    double area;
    public double calcularArea(){
        return area = base * altura;
        
    }
}