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
            System.out.printf("Digite: ");
            int tecla = tec.nextInt();


            if(tecla==1){
                System.out.println("\n"+"----------------------------------"+"\n"+"Digite o primeiro número que deseja somar: ");
                int n1 = tec.nextInt();
                System.out.println("Digite o segundo número que deseja somar: ");
                int n2 = tec.nextInt();
                int soma = n1+n2;
                System.out.println("Sua soma é = "+soma);
            }
            if(tecla==2){
                System.out.println("\n"+"----------------------------------"+"\n"+"Digite o primeiro número que deseja subtrair: ");
                int n1 = tec.nextInt();
                System.out.println("Digite o segundo número que deseja subtrair: ");
                int n2 = tec.nextInt();
                int sub = n1-n2;
                System.out.println("Sua subtração é = "+sub);
            }
            if(tecla==3){
                System.out.println("\n"+"----------------------------------"+"\n"+"Digite o primeiro número que deseja multiplicar: ");
                int n1 = tec.nextInt();
                System.out.println("Digite o segundo número que deseja multiplicar:  ");
                int n2 = tec.nextInt();
                int multi = n1*n2;
                System.out.println("Sua multiplicação é = "+multi);

            }
            if(tecla==4){
                System.out.println("\n"+"----------------------------------"+"\n"+"Digite o primeiro número que deseja dividir: ");
                int n1 = tec.nextInt();
                System.out.println("Digite o segundo número que deseja dividir: ");
                int n2 = tec.nextInt();
                int div = n1/n2;
                System.out.println("Sua divisão é = "+div);

            }
            if(tecl==0){
            break;
            }
        }
        
            System.out.println("Saindo do programa...");
        
    }
    
}
