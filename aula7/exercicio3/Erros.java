package exercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Erros {

    public static void main(String[] args) {//Crie um programa que solicite ao usuário que insira dois números inteiros.
        
        Scanner tec = new Scanner(System.in);
        int prim;
        int seg;


        System.out.println("\n"+"--------------Números Inteiros---------------"+"\n");
        
        try{

        System.out.println("Digite o primeiro número inteiro: ");
        prim = tec.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        seg = tec.nextInt();

        }
        //Utilize tratamento de exceções para lidar com a possibilidade de entrada inválida
        catch(InputMismatchException ex){
            //TRATAMENTO DA exceção
            System.out.println("\n"+"O número inserido não é um número inteiro, por isso para solucionar esse problema, foi inserido dois valores DEFAULT.");
            prim = 57;
            seg = 12;
            //exiba uma mensagem de erro apropriada.
            
        }
            System.out.println("\n"+"Números: "+"\n"+"---> "+prim+"\n"+"---> "+seg);
        

    }
    
}
