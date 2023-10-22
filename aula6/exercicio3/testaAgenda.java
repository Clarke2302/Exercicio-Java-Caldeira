package exercicio3;

import java.util.Scanner;
import java.util.TreeMap;

public class testaAgenda {
    public static void main(String[] args) {
    /*
    Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);

        // Getting values from the tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);
    */

    TreeMap<String, Integer> agenda = new TreeMap<String, Integer>();
    Scanner tec = new Scanner (System.in);

        //Agenda agi1 = new Agenda("Claudia Brasil", "Rua dos ladrões, 171", "Sul");
        //Agenda agi2 = new Agenda("Ana Rosa","Beco das Pétalas, 325", "norte");

        //agenda.put("Claudia Brasil", 97382647 );
        //agenda.put("Ana Rosa", 97462384);

        int tecla = 1;
        while(tecla!=0){
        System.out.println("==================MENU======================"+"\n"+
                            "1 - Cadastrar Pessoa na Agenda:"+"\n"+
                            "2 - Mostrar agenda em ordem alfabética:"+"\n"+
                            "3 - Mostrar pessoa pela zona da cidade: "+"\n"+
                            "4 - Sair da Agenda: "+"\n"+
                            "============================================");
            System.out.printf("\n"+"Digite: ");
            tecla = tec.nextInt();

            if(tecla==1){
                cadastraNaAgenda(agenda, tec);
            }
            if(tecla==2){
                mostraNaAgenda(agenda, tec);
            }
            if(tecla==3){
                mostraNaAgendaZona(agenda, tec);
            }
            if(tecla==0){
                System.out.println("Última página da Agenda Telefônica........");
                //saindo
            }
        }
    }

    //funções

    public static void cadastraNaAgenda(TreeMap<String, Integer> nome, Scanner tec){
        tec.nextLine();
        System.out.println("\n"+"Cadastrando pessoa na Agenda:"+"\n"+"============================================"+"\n"+
        "Digite o nome completo da pessoa: ");
        String nomeComp = tec.nextLine();
        System.out.println("\n"+"Digite o número de telefone sem DDD: ");
        int numero = tec.nextInt();
        tec.nextLine(); //buffer
        System.out.println("\n"+"Digite o endereço com nº dessa pessoa: ");
        String endere = tec.nextLine();
        System.out.println("\n"+"Digite a zona da cidade que essa pessoa mora (norte, sul, centro, leste e oeste): ");
        String zona = tec.nextLine();
        
        //Agenda ag = new Agenda(nomeComp,endere,zona);
        String dadosPessoais=(nomeComp+"\n"+endere+"\n"+zona);
        nome.put(dadosPessoais,numero);
        
        //Associe nomes a números de telefone e, em seguida, ordenar lista em ordem alfabética
        System.out.println("\n"+"Cadastro efetuado!"+"\n");
    
    }
    
    public static void mostraNaAgenda(TreeMap<String, Integer> nome, Scanner tec){// imprima a lista de contatos em ordem alfabética
        System.out.println("\n"+"Mostrando Agenda em ordem alfabética: "+"\n"+"============================================"+"\n");
            
            System.out.println(nome+"\n");
        
        
    }
    public static void mostraNaAgendaZona(TreeMap<String, Integer> nome, Scanner tec){//imprima os contatos com base na localidade.
        tec.nextLine();
        System.out.println("\n"+"Mostrando pessoas da Agenda pela zona: "+"\n"+"============================================"+"\n");
        System.out.println("Digite a zona das pessoas que deseja procurar: ");
        String zonaDigitada = tec.nextLine().toLowerCase();
        
        if(nome.containsKey(zonaDigitada)){
            for(int i=0; i<nome.size(); i++){

                System.out.println(nome);
            }
        }else{
            System.out.println("\n"+"Não encontramos nenhuma pessoa nessa zona da cidade!"+"\n");
        }
    }
}
