package exercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;

import static exercicio4.Calculavel.*;

public class Erros {

    public static void main(String[] args) {//Crie um programa que solicite ao usuário que insira dois números inteiros.
        
        Scanner tec = new Scanner(System.in);
        int prim;
        int seg;


        System.out.println("\n"+"--------------Programa Números Inteiros---------------"+"\n");
        
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
            prim = 9;
            seg = 3;
            //exiba uma mensagem de erro apropriada.
            
        }
        try{
            System.out.println("Agora digite o nome da operação a ser realizada:" +"\n"+
                    "EXEMPLO: " +"\n"+
                    "SOMAR, " +"\n"+
                    "SUBTRAIR, " +"\n"+
                    "MULTIPLICAR, " +"\n"+
                    "DIVIDIR): "+"\n");

            String operacao = String.valueOf(tec.next().toUpperCase());

            if(operacao.equals(usaMetodos.SOMAR.toString())){
                adicionar(prim, seg);
            }
            if(operacao.equals(usaMetodos.SUBTRAIR.toString())){
                subtrair(prim,seg);
            }
            if(operacao.equals(usaMetodos.MULTIPLICAR.toString())){
                multiplicar(prim,seg);
            }
            if(operacao.equals(usaMetodos.DIVIDIR.toString())){
                dividir(prim,seg);
            }

        }
        catch (ArithmeticException exc){ //Trate exceções adequadamente para situações como divisão por zero


            if(prim==0){
                System.out.println("Não se pode dividir um número por zero!!!!");
                prim++;
                System.out.println("Trocamos o valor do primeiro número para: "+prim);
                System.out.println("Então a divisão fica: ");
                dividir(prim,seg);
            }else if(seg==0){
                System.out.println("Não se pode dividir um número por zero!!!!");
                seg++;
                System.out.println("Trocamos o valor do segundo número para: "+seg);
                System.out.println("Então a divisão fica: ");
                dividir(prim,seg);
            }
        }

        

    }
    
}
