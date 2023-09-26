package exercicio2;

public class Quadrado extends FormaGeometrica{
    
    double lado;
    
    public Quadrado(double lado){
        this.lado=lado;

    }

    double area;
    public  double calcularArea(){
        return area = lado*lado;
        
    }
}