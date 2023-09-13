import java.util.Scanner;
public class exercicio7 {
public static void main (String[]args){
    Scanner teclado = new Scanner(System.in);

    //Empresa Consórcio

    int idade;
    double salario;
    
    System.out.printf("Digite a sua idade: ");
    idade = teclado.nextInt();
    System.out.printf("Digite o seu salário: ");
    salario = teclado.nextDouble();
    System.out.println("\n");

    if(idade>17 && salario>2000){//maior idade e ganhar + 2000
        System.out.println("Você pode comprar um carro! Nos chame no whats, número: (51)975847362");
    }else if(salario>2000 && idade<=17){
        System.out.println("Você não pode comprar um carro! Idade Mínima não atingida! ");
    }else if(salario<=2000 && idade>17){
        System.out.println("Você não pode comprar um carro! Salário Mínimo não atingido !");
    }else if(salario<=2000 && idade<=17){
        System.out.println("Você não pode comprar um carro! Nenhum requerimento foi atingido! ");
    }

    }
}
