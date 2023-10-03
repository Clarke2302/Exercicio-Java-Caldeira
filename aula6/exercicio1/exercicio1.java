import java.util.Scanner;
import java.util.Stack;

public class exercicio1 {
    //aula6 --> exercicio 1

    //Crie um programa Java que utilize uma estrutura de dados do tipo Stack
    // para armazenar objetos da classe Livros.
    // Implemente a classe Livro, com titulo e categoria,
    // inicialize a pilha com alguns livros,
    // imprimir os elementos da pilha,
    // imprimir com base na categoria e
    // implemente um loop para remover até que ela esteja vazia.
    public static void adicionaObjetos(Stack pilhaDeLivros, int tamanho) {
        Scanner tec = new Scanner(System.in);
        for (int i = 1; i < tamanho; i++) {

            System.out.println("Digite um título para o livro " + i + " :");
            String titulo = tec.nextLine();
            System.out.println("Agora digite a categoria desse livro: ");
            String categoria = tec.nextLine();

            Livro l1 = new Livro(titulo, categoria);


            //pilhaDeLivros.push(new Livro(titulo, categoria));

        }
        System.out.println("Chegamos ao final do Stack, todos os espaços foram preenchidos!!!");

    }

    public static String imprimirTodos() {
        return "---------------------------------------------"+
                "\n"+"--------------------Livros--------------------"+"\n"+
                "Título: " + getTitulo() +
                "\n"+"Categoria: " + getCategoria();
    }


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int tamanho = 3; //tamanho Stack

        Stack<Livro> pilhaDeLivros = new Stack<>(); //criando Stack

        adicionaObjetos(pilhaDeLivros, 2); //adiciona Livros à pilha
        pilhaDeLivros.push(l1);

        imprimirTodos();//imprime pilha

        //imprimePorCategoria(pilhaDeLivros, 6);

        //removeObjetos( pilhaDeLivros, 6); //remove todos os elementos da pilha

    }


    // for (Livro l : pilhaDeLivros) {
    //            System.out.println(pilhaDeLivros);
    //        }
    //        System.out.println(pilhaDeLivros);
}
