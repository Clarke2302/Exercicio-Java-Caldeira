package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compra{
    
    //Compra deve ser uma classe do seu código com os atributos: nome e data de validade e métodos que você julgue necessários.
    
    String nome;
    String dataDeValidade;
    
    Scanner teclado = new Scanner(System.in);

    // Crie um programa Java que simule uma lista de compras.
    //O programa deve permitir que o usuário adicione itens à lista, remova itens da lista e exiba a lista de compras atual.
    //Use um ArrayList para armazenar os itens da lista de compras.

    public void mostraMenu(){
        System.out.println("-----------------Menu-------------------"+"\n");
        System.out.println("1 - Criar uma Lista de Compras:");
        System.out.println("2 - Adicionar produtos na Lista de Compras:");
        System.out.println("3 - Remover produtos da lista:");
        System.out.println("4 - Exibir todos os produtos: ");
        System.out.println("5 - Exibir produtos com índice:");
        System.out.println("HELP - Se não sabe qual o índice, digite 5 para " +
                "exibir todas os itens e o índice estará à esquerda de cada item!");

        System.out.printf("Digite a opção: ");
    }

    List<String> ListaDeCompras = new ArrayList<String>(); //lista criada

    public void criaLista(){

        System.out.println("-------------------------------------");
        System.out.println("Lista de Compras criada!" + "\n");
    }

    public void adicionarItem(){
        
        System.out.println("-------------------------------------"+"\n");
        System.out.printf("Digite o nome do produto: "+"\n");
        this.nome = teclado.nextLine();
        
        System.out.printf("Digite a data de validade (com as barras): ");
        this.dataDeValidade = teclado.nextLine();

        ListaDeCompras.add("Nome do Produto: "+nome+" | Data de Validade: "+dataDeValidade);
        System.out.println("------------------------------------");
        
    }

    public void removerItem(){
        System.out.println("-------------------------------------");
        System.out.println("Coloque o código do produto para remover: ");
        int removeItem = teclado.nextInt();

        for (int i=0;i < ListaDeCompras.size();i++) {
            System.out.println("-------------------------------------");
            if (i == removeItem) {
                ListaDeCompras.remove(i);
                System.out.println("Item da Lista: "+i+" removido!");
            }
        }
    }

    public void exibirItens(){
        System.out.println("-------------------------------------");
        for (int i=0;i < ListaDeCompras.size();i++) {
            System.out.println(ListaDeCompras.get(i));
        }
    }

    public void mostraIndice(){ //nao sabe o indice
        System.out.println("-------------------------------------");
        for (int i=0;i < ListaDeCompras.size();i++) {
            System.out.println("indice: "+i+" - "+ListaDeCompras.get(i));
        }
    }

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int tecla=1;
        Compra c1 = new Compra();

        while(tecla!=0) {

            c1.mostraMenu();
            tecla = teclado.nextInt();


            if (tecla == 1) {
                c1.criaLista();
            }
            if (tecla == 2) {
                c1.adicionarItem();
            }
            if (tecla == 3) {
                c1.removerItem();
            }
            if(tecla == 4){
                c1.exibirItens();
            }
            if(tecla == 5){
                c1.mostraIndice();
            }

        }//final while

    }
}

