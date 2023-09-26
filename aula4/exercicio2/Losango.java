package exercicio2;

public class Losango extends FormaGeometrica{
    
    double diagonalMaior;
    double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor){
        this.diagonalMaior=diagonalMaior;
        this.diagonalMenor=diagonalMenor;
    }

    double area;
    public double calcularArea(){
        return area = (diagonalMaior * diagonalMenor)/2;
        
        
    }
}
