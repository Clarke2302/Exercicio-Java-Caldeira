import java.util.Scanner;
public class exercicio10 {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);

        System.out.println("Insira a temperatura em Celsius: ");
        int celsinho=tec.nextInt();

        int fah = (celsinho*9/5)+32;
        System.out.println("Essa temperatura convertida para Fahrenheit é: "+fah);
    }
}
