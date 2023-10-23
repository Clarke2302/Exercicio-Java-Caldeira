package exercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Escreva um programa que aceite um dia da semana do usuário
    //imprima uma mensagem de acordo com o dia escolhido.


    Scanner tec = new Scanner(System.in);

    menuzinho();
    
    
    String diaDigitado = String.valueOf(tec.next().toUpperCase());
    

        if(diaDigitado.equals(DiaDaSemana.SEGUNDA.toString())){
            segunda();
        }
        if(diaDigitado.equals(DiaDaSemana.TERCA.toString())){
            terca();
        }
        if(diaDigitado.equals(DiaDaSemana.QUARTA.toString())){
            quarta();
        }
        if(diaDigitado.equals(DiaDaSemana.QUINTA.toString())){
            quinta();
        }
        if(diaDigitado.equals(DiaDaSemana.SEXTA.toString())){
            sexta();
        }
        if(diaDigitado .equals(DiaDaSemana.SABADO.toString())){
            sabado();
        }
        if(diaDigitado.equals(DiaDaSemana.DOMINGO.toString())){
            domingo();
        }
    }

    //Função menuzinho

    public static void menuzinho(){
        System.out.println("==============MENU==============="+"\n"+"================================="+"\n"+"        Dia da Semana "+"\n");
        System.out.println("Digite um dia da semana (EX: SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO):  ");
    }

    //Funções dias

    public static void segunda(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Eita hoje é segunda, o PIOR DIA de acordo com o Garfield!");
    }
    public static void terca(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Terça-feira, um dia legal mas não é sexta!");
    }
    public static void quarta(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Quarta um dia lindo porque foi o dia em que eu nasci, talvez seja o seu também!");
    }
    public static void quinta(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Quinta o Dia do TBT, tá quaseeee...");
    }
    public static void sexta(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Irrraa chegamos na Sexta, SEXTOUUU.");
    }
    public static void sabado(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Sábado um dia para RELAXAR.");
    }
    public static void domingo(){
        System.out.println("\n"+"--> Sua mensagem do dia é:"+"\n"+"=============================================="+"\n");
        System.out.println("Olá dia de dormir e descansar, porque amanhã tem mais!");
    }
    
}
