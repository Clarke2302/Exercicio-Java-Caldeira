import java.util.Scanner;
    public class primao {
        public static void main(String[] args) {
            Scanner tec = new Scanner(System.in);
            int interInicio;
            int interFim;

            System.out.println("Programa Números Primos");

            System.out.println("Digite o número inicial: ");
            interInicio = tec.nextInt();
            System.out.println("Digite o número final: ");
            interFim = tec.nextInt();

            if (interInicio == 1) {
                interInicio++;
            }

            for (int i = interInicio; i < -interFim; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i+ " é primo.");
                }
            }
        }


            private static boolean ehPrimo (int numero) {
                for (int j = 2; j < numero; j++) {

                    if (numero % j ==0) {
                        return false;
                    }
                }
                return true;
            }


