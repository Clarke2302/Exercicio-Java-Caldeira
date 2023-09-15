package aula2;

import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);


        System.out.println("Para entrar no programa digite um valor de 1 a 4: "+"\n"+
        "Para sair do programa, digite 0: ");

            int tecl = tec.nextInt();

            while(tecl!=0){

            


                
            System.out.println("-----------------------------");
            System.out.println("Calculadora"+"\n");
            System.out.println("Para Soma, digite 1:");
            System.out.println("Para Subtração, digite 2:");
            System.out.println("Para Multiplicação, digite 3:");
            System.out.println("Para Divisão, digite 4:");
            System.out.println("Para Sair do programa, digite 0:");

            int tecla = tec.nextInt();

            if(tecla==1){

            }
            if(tecla==2){

            }
            if(tecla==3){

            }
            if(tecla==4){

            }
            if(tecl==0){
            break;
            }
        }
        
            System.out.println("Saindo do programa...");
        
    }
    
}
