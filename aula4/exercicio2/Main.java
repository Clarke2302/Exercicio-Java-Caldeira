package exercicio2;

public class Main {
    public static void main(String[] args) {
        
        //criando
        
        FormaGeometrica f1 = new Retangulo(10, 5); //50
        FormaGeometrica f2 = new Circulo(12);//452,16
        FormaGeometrica f3 = new Triangulo(10, 5);//25
        FormaGeometrica f4 = new Quadrado(17);//289
        FormaGeometrica f5 = new Losango(8, 10);//40
        
        //criando arrays para auxiliar no print

        String [] nome = {"Retângulo", "Círculo", "Triângulo", "Quadrado", "Losango"};
        Double [] areas = {f1.calcularArea(), f2.calcularArea(), f3.calcularArea(), f4.calcularArea(), f5.calcularArea()};

        //mostrando

        for(int i=0; i<nome.length; i++){
        
        System.out.println("------------------------------------------------");
        System.out.println("A Área desse "+nome[i]+" é de "+areas[i]+" cm²/m²");
        }
    }
}
