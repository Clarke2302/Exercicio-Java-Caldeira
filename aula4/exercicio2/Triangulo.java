package exercicio2;

public class Triangulo extends FormaGeometrica{
    
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    double area;
    public double calcularArea(){
        return area = (base*altura)/2;
        
    }
}