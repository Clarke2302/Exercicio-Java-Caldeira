import java.util.Scanner;
public class exercicio6 {
    public static void main (String[]args){
        Scanner tec = new Scanner(System.in);
    System.out.print("Qual a sua idade: ");
        int idade = tec.nextInt();

        if(idade<16){
            System.out.println("Você não tem permissão de votar!!!");
        }else if(idade==16||idade==17||idade>65){
            System.out.println("O seu voto é facultativo.");
        }else if(idade>17&&idade<=65){
            System.out.println("O seu voto é obrigatório!");
        }

    }
    
}
