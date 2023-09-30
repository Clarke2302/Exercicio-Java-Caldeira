package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    String titulo;
    String data;
    String descricao;

    
    Scanner teclado = new Scanner(System.in);

    public void mostraMenu(){
        System.out.println("-----------------Menu-------------------"+"\n");
        System.out.println("1 - Criar uma Lista:");
        System.out.println("2 - Adicionar tarefas na Lista:");
        System.out.println("3 - Remover tarefas da lista:");
        System.out.println("4 - Exibir todas as tarefas: ");
        System.out.println("HELP - Se não sabe qual o índice, digite 4 para " +
                "exibir todas as tarefas e o índice estará à esquerda de cada tarefa!");

        System.out.printf("Digite a opção: ");
    }

    List<String> tarefas = new ArrayList<String>(); //lista criada

    public void criaLista(){

        System.out.println("-------------------------------------");
        System.out.println("Lista de Tarefas criada!" + "\n");
    }

    public void addTarefa(){
        int j=1;
        
        System.out.println("-------------------------------------"+"\n");
        System.out.printf("Adicione a tarefa: "+"\n");
        System.out.printf("Título: ");
        this.titulo = teclado.nextLine();
        
        System.out.printf("Descrição: ");
        this.descricao = teclado.nextLine();

        System.out.printf("Dia da Semana: ");
        this.data = teclado.nextLine();

        tarefas.add("Dia da Semana: "+data+" Titulo: "+titulo+" Descrição: "+descricao);
        System.out.println("------------------------------------");
        
        
    }
    public void removeTarefa(){
        System.out.println("-------------------------------------");
        System.out.println("Coloque o índice da tarefa para remove-la: ");
        int removeTarefa = teclado.nextInt();

        for (int indice=0;indice < tarefas.size();indice++) {
            System.out.println("-------------------------------------");
            if (indice == removeTarefa) {
                tarefas.remove(indice);
                System.out.println("Tarefa do indice "+indice+" removida!");
            }
        }
    }
    public void mostraIndice(){ //nao sabe o indice
        System.out.println("-------------------------------------");
        for (int i=0;i < tarefas.size();i++) {
            System.out.println("indice: "+i+" - "+tarefas.get(i));
        }
    }



    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Descrição: Crie um programa Java que permita ao usuário criar uma lista de tarefas.
        //O programa deve permitir adicionar tarefas à lista,
        // remover tarefas e exibir todas as tarefas na lista.

        // Use um ArrayList para armazenar as tarefas.
        // Tarefa deve ser uma classe do seu código com os atributos:
        // titulo, data e descrição e métodos que você julgue necessários.
        int tecla=1;
        Tarefa ex = new Tarefa();

        while(tecla!=0) {

            ex.mostraMenu();
            tecla = teclado.nextInt();


            if (tecla == 1) { //cria lista
                ex.criaLista();
            }
            if (tecla == 2) {//add tarefa
                ex.addTarefa();
            }
            if (tecla == 3) { //remove tarefa
                ex.removeTarefa();
            }
            if(tecla == 4){ //exibir tarefas
                ex.mostraIndice();
            }

        }//final while

    }
}
