    import java.util.Scanner;
    public class exercicio8 {
        public static void main(String[] args) {
            Scanner tec = new Scanner(System.in);

            String certa = "gestante";
            String certa2 = "Gestante";
            String certa3 = "PCD";
            String certa4 = "pcd";
            String certa5 = "Idosa";
            String certa6 = "idosa";


            System.out.println("--------------Menu---------------" + "\n" + "Digite em que alternativa você se encaixa: " + "\n" +
                    "-Gestante" + "\n" + "-Idosa" + "\n" + "-PCD" + "\n" + "-Nenhuma das alternativas" + "\n");
            System.out.printf("Digite: ");
            String resposta = tec.nextLine();
            if (resposta.equals("gestante") || resposta.equals("Gestante") || resposta.equals("PCD") ||
                    resposta.equals("pcd") || resposta.equals("Idosa") || resposta.equals("idosa")) {
                System.out.println("Você tem direito a fila prioritária!");
            } else {
                System.out.println("Você NÃO tem direito a fila prioritária!");
            }
        }
    }

