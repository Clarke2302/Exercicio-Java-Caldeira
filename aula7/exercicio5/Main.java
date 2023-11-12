package exercicio5;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Em um programa, peça ao usuário que insira sua idade.
        //Se a idade for menor que 0 ou maior que 150, lance a exceção IdadeInvalidaException
        // com uma mensagem apropriada.

        Scanner tec = new Scanner(System.in);


            System.out.println("=============Menu===========" + "\n"
                    + "Olá Bem-Vindo ao programa de Idades..." + "\n"
                    + "Para começar, digite a sua idade: ");

            int idade = tec.nextInt();

            if (idade > 150 || idade < 0) {
                throw new IdadeInvalidaException("\n" + "Insira uma idade válida, você inseriu uma idade abaixo de 0 ou maior que 150!" + "\n"
                        + "Por acaso você é um vampiro, ou nasceu hoje?!" + "\n"
                        + "Porque se você for um vampiro, bora se conhecer! :)");

            } else {
                System.out.println("\n" + "Você tem " + idade + " anos.");

            }


    }
}
