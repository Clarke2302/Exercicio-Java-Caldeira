import java.util.Scanner;
public class exercicio1 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);

        System.out.printf("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("\n"+"Olá "+nome+"!");
    }

}
