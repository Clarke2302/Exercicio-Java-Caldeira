import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Escreva um programa que receba uma string do usuário e imprima ela ao contrário

        System.out.println("Digite uma frase ou palavra: ");
        String frase = tec.nextLine();
        String contraria = "";

        System.out.println("\n"+"-------------------------------------"+"\n"+frase+"\n");
        System.out.println("Deseja ver essa frase/palavra ao contrário?"+"\n"+
        "SIM, digite 1"+"\n"+"NÃO, digite 2"+"\n");
        int tecla = tec.nextInt();

        if(tecla==1){
            for(int i=0;i<frase.length();i++){
                contraria = frase.charAt(i)+contraria;
            }
            System.out.println("\n"+"-------------------------------"+"\n"
            +"Sua frase/palavra ao contrário: "+contraria+"\n"+"---------------------------------------");
        }
        if (tecla==2){
        System.out.println("\n"+"Então tá :'( se deseja ir embora, adeus...."+"\n"
        +"--------------------------------------------");
        
        }


    }
    
}
