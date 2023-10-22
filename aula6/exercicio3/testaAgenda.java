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

    TreeMap<Agenda, Integer> agenda = new TreeMap<Agenda, Integer>();
    Scanner tec = new Scanner (System.in);


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

    public static void cadastraNaAgenda(TreeMap<Agenda, Integer> nome, Scanner tec){
        tec.nextLine();
        System.out.println("\n"+"Cadastrando pessoa na Agenda:"+"\n"+
        "Digite o nome completo da pessoa: "+"\n");
        String nomeComp = tec.nextLine();
        System.out.println("Digite o número de telefone sem DDD: "+"\n");
        int numero = tec.nextInt();
        System.out.println("Digite o endereço com nº dessa pessoa: "+"\n");
        String endere = tec.nextLine();
        System.out.println("Digite a zona da cidade que essa pessoa mora (norte, sul, centro, leste e oeste): ");
        String zona = tec.nextLine();
        
        Agenda ag = new Agenda(nomeComp,endere,zona);
        nome.put(ag,numero);
        //Associe nomes a números de telefone e, em seguida, ordenar lista em ordem alfabética
    
    }
    
    public static void mostraNaAgenda(TreeMap<Agenda, Integer> nome, Scanner tec){// imprima a lista de contatos em ordem alfabética
        for(int i=0; i<nome.size(); i++){
            
            System.out.println(nome);
        }
        
    }
    public static void mostraNaAgendaZona(TreeMap<Agenda, Integer> nome, Scanner tec){//imprima os contatos com base na localidade.
        System.out.println("Mostrando pessoas pela zona: ");
        System.out.println("Digite a zona das pessoas que deseja procurar: ");
        String zonaDigitada = tec.nextLine().toLowerCase();
        
        if(nome.containsKey(zonaDigitada)){
            for(int i=0; i<nome.size(); i++){

                System.out.println(nome);
            }
        }
    }
}
