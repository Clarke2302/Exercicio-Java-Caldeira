import java.util.Scanner;
public class exercicio4 {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o valor do salário mínimo em seu estado?");
        double salarioMinimo = tec.nextDouble();
        System.out.println("Quanto você recebe em seu emprego?");
        double salarioFuncionario = tec.nextDouble();

        int conta;

        if(salarioMinimo==salarioFuncionario) {
        conta=1;
            System.out.println("Esse funcionário recebe "+conta+" salário mínimo.");
        }
        if(salarioMinimo>salarioFuncionario) {
            conta=0;
            System.out.println("O salário desse funcionário não chega nem a 1 salário mínimo.");

        }
        if(salarioFuncionario>salarioMinimo){
            double contaMais = (salarioFuncionario/salarioMinimo);
            System.out.println("Esse funcionário recebe mais ou menos "+contaMais+" salários mínimos.");
        }
    }
}
