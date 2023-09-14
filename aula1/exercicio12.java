import java.util.Scanner;
public class exercicio12 {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);

        //Crie um programa que converta uma quantia em dólares para outra moeda,
        // como euros ou reais. Peça ao usuário para inserir a quantia em dólares
        // e a taxa de câmbio atual. Em seguida, calcule e exiba o valor convertido.

        double dolares;
        double cambio ;


        System.out.println("Insira um valor em dólar: ");
        dolares = tec.nextDouble();
        System.out.println("Agora insira a taxa de cambio atual: ");
        cambio = tec.nextDouble();

        double calculaDinDin = dolares*cambio;
        double reais= calculaDinDin;

        System.out.println("O valor de $"+dolares+" equivale a R$"+reais+".");

    }
}
