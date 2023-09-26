import java.util.Random;
import java.util.Scanner;
    public class exercicio2 {
        public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        
        int [] numberSort = new int [10];
        Random geraNumbers = new Random();
        

        for(int i=0; i<numberSort.length;i++){
            numberSort[i] = geraNumbers.nextInt(100);
        }
        //ver numeros gerados
        /*
        for(int i = 0; i<numberSort.length;i++){
        System.out.println("Números Sorteados: "+numberSort[i]);
        }
        */

        //ver se número está na array
        System.out.println("---------------------------------------------------------"+"\n");
        System.out.printf("Insira um número para ver se ele está na array: ");
        int tecla = tec.nextInt();

        int achado = 0;
        for(int i=0; i<numberSort.length;i++){
            if(tecla==numberSort[i]){
                achado ++;
            }
            if(achado == 1){
                System.out.println("\n"+"Número encontrado na posição "+i);
                break;
            }
        }
        if(achado == 0){
                System.out.println("\n"+"Número não está contido na array!!");
        }
    System.out.println("---------------------------------------------------------");
    }
}
