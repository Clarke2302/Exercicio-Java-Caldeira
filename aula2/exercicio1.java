import java.util.Scanner;
    public class exercicio1 {
        public static void main(String[] args) {
            Scanner tec = new Scanner(System.in);
            int interInicio;
            int interFim;

            System.out.println("\n"+"-------------------------------"
            +"\n"+"Programa Números Primos"+"\n");

            System.out.println("Digite o número inicial: ");
            interInicio = tec.nextInt();
            System.out.println("Digite o número final: ");
            interFim = tec.nextInt();

            System.out.println("-------------------------------"+"\n"+
            "Número Primos nesse intervalo de valores:"+"\n");

            for (int i = interInicio; i <= interFim; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i+ " ");
                }
            }

        }


            private static boolean ehPrimo (int numero) {
                
                if( numero <= 1) {
                    return false;
                }
                for(int i=2; i<= numero-1; i++) {
                    if(numero % i==0){
                        return false;
                    }
                }
            
            return true;
            }
    }
        



