import java.util.Scanner;
public class exercicio8 { //dificuldade
    public static void main (String[]args){
        Scanner tec = new Scanner (System.in);

        String certa = "gestante";
        String certa2 = "Gestante";
        String certa3 = "PCD";
        String certa4 = "pcd";
        String certa5 = "Idosa";
        String certa6 = "idosa";


        System.out.println("--------------Menu---------------"+"\n"+"Digite em que alternativa você se encaixa: "+"\n"+
        "-Gestante"+"\n"+"-Idosa"+"\n"+"-PCD"+"\n"+"-Nenhuma das alternativas"+"\n");
        System.out.printf("Digite: ");
        String resposta = tec.nextLine();
        if(resposta == certa||resposta == certa2||resposta == certa3||
        resposta == certa4||resposta == certa5||resposta == certa6){
            System.out.println("Você tem direito a fila prioritária!");
        }else{
            System.out.println("Você NÃO tem direito a fila prioritária!");
        }
        //resposta =="Gestante"||resposta =="gestante"||resposta =="PCD"||
        //resposta =="pcd"||resposta =="Idosa"||resposta =="idosa"
    }
    
}
