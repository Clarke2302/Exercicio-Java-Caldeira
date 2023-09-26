import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        
        //array

        int [] numeros = new int [5];
        String [] nome = {"primeiro","segundo","terceiro","quarto","quinto"};

        //inserindo na array

        for(int i=0;i<numeros.length; i++){
            System.out.printf("Adicione o "+nome[i]+" número inteiro: "+"\n");
            numeros[i]=tec.nextInt();

        }
        System.out.println("---------------------------------------------------");
        //Soma
        int soma=0;
        for(int i=0;i<numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: "+soma);

        //Média

        int media = soma/numeros.length;
        System.out.println("E sua média é: "+media);
        
        
        System.out.println("---------------------------------------------------");
    }
    
}