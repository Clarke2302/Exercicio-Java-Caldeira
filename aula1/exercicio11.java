import java.util.Scanner;
public class exercicio11 {
    public static void main (String[]args){
    Scanner tec = new Scanner(System.in);

        int conta=0;

        System.out.println("Digite uma palavra ou frase: ");
        String martaFala = tec.nextLine();

        martaFala.toLowerCase();

        for(int i = 0; i<martaFala.length(); i++) {
             char vogais = martaFala.charAt(i);
            if (vogais == 'a' ||vogais== 'e'||vogais== 'i'||vogais== 'o'||vogais== 'u') {
            conta++;
            }
        }
        System.out.println("Nessa palavra ou frase, temos "+conta+" vogais!");




    }
}
