package exercicio6;
import java.time.LocalDate;
import java.util.LinkedList; // Import the LinkedList class
import java.util.Scanner;

public class Reserva extends Places{
    String nome;
    String local;
    String cpf;
    int diaAntes;
    int mesAntes;
    int anoAntes;
    int diaDepois;
    int mesDepois;
    int anoDepois;
    LocalDate dataEntrada;
    LocalDate dataSaida;
    

// Use uma LinkedList para representar as reservas de passagens.
LinkedList<String> reservas = new LinkedList<String>();

//criando Scanner
Scanner tec = new Scanner(System.in);

public void  verMenu(){
    System.out.println("\n"+"------------------Menu---------------------"+"\n"+
    "1 - Reservar Local de Estadia:"+"\n"+
    "2 - Cancelar Reservas feitas:"+"\n"+
    "3 - Mostrar todas as reservas feitas: "+"\n"+
    "Digite:  ");
}

public void reservarPassagem(){
    String nomeUsuario = "usuario1";
    System.out.println("-----------------------------------------------------");
System.out.println("Oi "+nomeUsuario+" tudo bem?! Então você deseja reservar um lugar, para passar as férias ou como uma forma de lazer."+"\n"+"Primeiramente teremos que realizar o seu cadastro no site!"+
"\n");
System.out.printf("Digite o seu nome completo: ");
this.nome = tec.nextLine();
System.out.printf("Digite o seu cpf: ");
this.cpf = tec.nextLine();

System.out.printf("\n"+"Digite a o dia de começo da estadia: ");
this.diaAntes = tec.nextInt();
System.out.printf("Agora o mês: ");
this.mesAntes= tec.nextInt();
System.out.printf("Agora o ano: ");
this.anoAntes=tec.nextInt();

LocalDate dataA = LocalDate.of(anoAntes, mesAntes, diaAntes);
this.dataEntrada= dataA;


System.out.println("\n"+"Digite o dia de término da estadia: ");
this.diaDepois = tec.nextInt();
System.out.printf("Agora o mês: ");
this.mesDepois= tec.nextInt();
System.out.printf("Agora o ano: ");
this.anoDepois=tec.nextInt();

LocalDate dataD = LocalDate.of(anoDepois, mesDepois, diaDepois);
this.dataSaida= dataD;

System.out.println("\n"+"Digite o local onde deseja reservar: "+"\n"+"Alguns lugares que nós temos disponíveis são esses: "+"\n"+
"0-Nova Zelândia (Auckland)"+"\n"+"1-Nova York (Manhattan)"+"\n"+"2-Flórida (Orlando)"+"\n"+"3-Rio de Janeiro (Leblon)"+"\n"+"4-Paraná (Cataratas do Iguaçu)"+"\n"
+"-----------------------------------------------------------------------------------------------------------------------------------------------------"+"\n"+
"AVISO: Por favor digite a sua escolha pelo número em frente ao nome do lugar."+
"\n"+"Exemplo: 0 ---> para Nova Zelândia "+"\n"+"-----------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.printf("Digite:  ");

int escolhaLocal = tec.nextInt();

    if(escolhaLocal==0){
    System.out.println("OK, Escolhemos esse lugar aqui na Nova Zelândia que você vai gostar da Estadia!"+"\n");
    infoPlaces(0);
    this.local = "Nova Zelândia (Auckland)"+"\n"+nomeEstadia[0]+"\n"+enderecoEstadia[0]+"\n"+infoAddEstadia[0]+"\n"+valorEstadia[0];

    }

    if(escolhaLocal==1){
    System.out.println("OK, Escolhemos esse lugar aqui em New York que você vai gostar da Estadia!"+"\n");
    infoPlaces(1);
    this.local = "Nova York (Manhattan)"+"\n"+nomeEstadia[1]+"\n"+enderecoEstadia[1]+"\n"+infoAddEstadia[1]+"\n"+valorEstadia[1];
            
    }

    if(escolhaLocal==2){
    infoPlaces(2);
    this.local = "Flórida (Orlando)"+"\n"+nomeEstadia[2]+"\n"+enderecoEstadia[2]+"\n"+infoAddEstadia[2]+"\n"+valorEstadia[2];
        
    }

    if(escolhaLocal==3){
        System.out.println("OK, Escolhemos esse lugar aqui no Rio que você vai gostar da Estadia!"+"\n");
        
        this.local = "Rio de Janeiro (Leblon)"+"\n"+nomeEstadia[3]+"\n"+enderecoEstadia[3]+"\n"+infoAddEstadia[3]+"\n"+valorEstadia[3];

    }//if rio

    if(escolhaLocal==4){
        System.out.println("OK, Escolhemos esse lugar aqui no Rio que você vai gostar da Estadia!"+"\n");
        
        this.local = "Paraná (Cataratas do Iguaçu)"+"\n"+nomeEstadia[4]+"\n"+enderecoEstadia[4]+"\n"+infoAddEstadia[4]+"\n"+valorEstadia[4];

    }//if paraná
    
    //RESERVANDO
    
        reservas.add("-------------------------------------------------"+"\n"+
        "Reserva: "+"\n"+"Nome Completo: "+nome+"\n"+
        "Local da Estadia: "+local+"\n"+
        "CPF: "+cpf+"\n"+
        "Data de início da estadia: "+dataEntrada+"\n"
        +"Data de término da estadia: "+dataSaida);
        
    


}//final função de reserva

public void cancelarReserva(){
    System.out.println("-------------------------------------");
    System.out.println("Coloque o índice da Reserva para remove-la: ");
    int removeReserva = tec.nextInt();

    for (int indice=0;indice < reservas.size();indice++) {
        System.out.println("-------------------------------------");
        if (indice == removeReserva) {
            reservas.remove(indice);
            System.out.println("Reserva do indice "+indice+" removida!");
        }
    }
}

public void exibirReservas(){
    System.out.println("-------------------------------------");
    for (int i=0;i < reservas.size();i++) {
        System.out.println("indice: "+i+" - "+reservas.get(i));
    }
}

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int tecla=1;

        Reserva reservaTeste = new Reserva();

        while(tecla!=0) {

            reservaTeste.verMenu();
            tecla = tec.nextInt();


            if (tecla == 1) { //cria lista
                reservaTeste.reservarPassagem();
            }
            if (tecla == 2) {//add tarefa
                reservaTeste.cancelarReserva();
            }
            if (tecla == 3) { //remove tarefa
                reservaTeste.exibirReservas();
            }

        }//final while

        System.out.println("Você está site de reservas."+"\n"+"Volte Sempre :)");
    }
}

