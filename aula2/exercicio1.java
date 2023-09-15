package aula2;

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int mostraPrimo;
        int interInicio;
        int interFim;
        
        System.out.println("Programa Números Primos");

        System.out.println("Digite o número inicial: ");
        interInicio = tec.nextInt();
        System.out.println("Digite o número final: ");
        interFim = tec.nextInt();
        

        int i=1;
        int conta = 0;

        int um = interInicio;
        //int dois = interFim;
        
        //primos divididos/1 e /por ele mesmo == 0
        //entre o inicio e o fim quantos primos tem??

        //variavel aumenta  ex: 200 a 400  200/1 200/2 até 200/200
        if(interInicio<interFim){
            System.out.println("Primos Encontrados: "+"\n");

            while(){

                System.out.println("dd");
                if(interInicio%i==0){
                    conta++;
                }
                if(conta==2){
                System.out.println(um);
            }
                i++;
            }
            interInicio++;
        }


        if(interInicio>interFim){

        }

    }
    
}
