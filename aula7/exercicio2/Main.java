package exercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Escreva um programa que aceite um dia da semana do usuário
    //imprima uma mensagem de acordo com o dia escolhido.

    Scanner tec = new Scanner(System.in);

    menuzinho();
    String diaDigitado = tec.next().toUpperCase();
    DiaDaSemana dia = diaDigitado;

        if(dia == DiaDaSemana.SEGUNDA){
            segunda();
        }
        if(dia == DiaDaSemana.TERCA){
            terca();
        }
        if(dia == DiaDaSemana.QUARTA){
            quarta();
        }
        if(dia == DiaDaSemana.QUINTA){
            quinta();
        }
        if(dia == DiaDaSemana.SEXTA){
            sexta();
        }
        if(dia  == DiaDaSemana.SABADO){
            sabado();
        }
        if(dia == DiaDaSemana.DOMINGO){
            domingo();
        }
    }

    //Função menuzinho

    public static void menuzinho(){
        System.out.println("==============MENU==============="+"\n");
        System.out.println("========Dia==da==Semana========"+"\n");
        System.out.println("Digite um dia da semana (EX: SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADÕ, DOMINGO):  ");
    }

    //Funções dias

    public static void segunda(){
        System.out.println("Eita hoje é segunda, o PIOR DIA de acordo com o Garfield!");
    }
    public static void terca(){
        System.out.println("Terça-feira, um dia legal mas não é sexta!");
    }
    public static void quarta(){
        System.out.println("Quarta um dia lindo porque foi o dia em que eu nasci, talvez seja o seu também!");
    }
    public static void quinta(){
        System.out.println("Quinta o Dia do TBT, tá quaseeee...");
    }
    public static void sexta(){
        System.out.println("Irrraa chegamos na Sexta, SEXTOUUU.");
    }
    public static void sabado(){
        System.out.println("Sábado um dia para RELAXAR.");
    }
    public static void domingo(){
        System.out.println("Olá dia de dormir e descansar, porque amanhã tem mais!");
    }
    
}
