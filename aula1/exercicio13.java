
import java.util.Scanner;
public class exercicio13{
public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    System.out.println("Digite um valor que não seja negativo: ");
    int valor = tec.nextInt();

    int conta=0;
    int fatorial=valor;

    if(valor<0){
        System.out.printf("Erro!!!! Não pode ser NEGATIVO!"+"\n"+"Digite novamente: ");
        valor = tec.nextInt();
        System.out.println("\n"+"---------------------"+"\n"+"Fatoriais:"+"\n");
    }
    if(valor>0){
        System.out.println("\n"+"---------------------"+"\n"+"Fatoriais de "+valor+": "+"\n");
        
        while(fatorial>=1){
            fatorial=valor--;
            System.out.print(+fatorial+"X");
            conta +=fatorial;
            fatorial--;
            
            
        }
        System.out.print(" = "+conta);
    }
        //valor*valor-- = fatorial fatorial*
    }
}