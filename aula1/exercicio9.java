import java.util.Scanner;
public class exercicio9 {
public static void main (String[]args){
    Scanner tec = new Scanner(System.in);

    System.out.println("Qual o seu ano de nascimento? ");
    int anoNascimento = tec.nextInt();

    int anoAtual = 2023;
    int idade = 2023-anoNascimento;

    System.out.println("Voce tem "+idade+" anos.");
    }

}
