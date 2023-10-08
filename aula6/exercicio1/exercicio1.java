import java.util.Scanner;
import java.util.Stack;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        Stack<Livro> pilhaDeLivros = new Stack<>(); //criando Stack

        int tecla = 1;

        while(tecla!=0){

        menu(); //mostra menu
        tecla = tec.nextInt();//digite opção

            if (tecla==1){
            adicionaLivros(pilhaDeLivros, 2); //adiciona Livros à pilha
            }
            if(tecla == 2){
            removeLivros( pilhaDeLivros, 2); //remove todos os elementos da pilha
            }
            if(tecla == 3){
            imprimirTodos(pilhaDeLivros);//imprime pilha
            }
            if(tecla == 4){
            imprimePorCategoria(pilhaDeLivros, tec);//imprime todos os livros da categoria digitada
            }
            if(tecla==0){
                System.out.println("Você está saindo do programa......");
            }

        } //while

    
    }//Main

    //--------------------Menu----------------------
    public static void menu(){

        System.out.println(
        "---------------------------------------"+"\n"+
        "----------------Menu-------------------"+"\n"+
        "1 - Adicionar livros na pilha:"+"\n"+
        "2 - Remover livros da pilha:"+"\n"+
        "3 - Mostrar livros da pilha:"+"\n"+
        "4 - Mostrar livros por Categoria/Gênero:"+"\n"+
        "---------------------------------------"+"\n");
        System.out.printf("Digite:  ");
    }
    
    //---------------------1-----------------------------------
    public static void adicionaLivros(Stack<Livro> pilhaDeLivros, int tamanho) {
        Scanner tec = new Scanner(System.in);
        
        for (int i = 1; i <= tamanho; i++) {

            System.out.println("\n"+"Digite um título para o livro " + i + " :");
            String titulo = tec.nextLine();
            
            System.out.println("Agora digite a categoria desse livro: ");
            String categoria = tec.nextLine();

            Livro l1 = new Livro(titulo, categoria);
            
            pilhaDeLivros.push(l1);
        }
        System.out.println("\n"+"Chegamos ao final do Stack, todos os espaços foram preenchidos!!!");
    }
    //--------------------------2-----------------------------

    public static void removeLivros(Stack<Livro> pilhaDeLivros, int tamanho){
         // implemente um loop para remover até que ela esteja vazia.
        for(int i = 1; i <= tamanho; i++){
            pilhaDeLivros.pop();
        }
        System.out.println("Todos os livros foram removidos da pilha!");

    }
    //----------------------------3-----------------------------
    public static void imprimirTodos(Stack<Livro> pilhaDeLivros) { // imprimir os elementos da pilha
        if(pilhaDeLivros==null){
            System.out.println("Não temos livros nessa pilha!");
        }
        
        for(Livro l1 : pilhaDeLivros){
        System.out.println("\n"+"=============================="+
                "\n"+
                "-Livro:"+
                "\n"+
                "Título: " + l1.getTitulo() +
                "\n"+"Categoria: " + l1.getCategoria()+"\n"
                +"==============================");
        }
        
    }
    //-----------------------------4----------------------------
    public static void imprimePorCategoria(Stack<Livro> pilhaDeLivros, Scanner tec){
        tec.nextLine();//buffer
        System.out.println("Qual a categoria/gênero, deseja procurar?");
        String digitaCat = tec.nextLine().toLowerCase();

        for(Livro l1 : pilhaDeLivros ){
            if(l1.getCategoria().toLowerCase().contains(digitaCat)){
                System.out.println("\n"+"---------------------------------------------"+
                "\n"+"--------------------Livros--------------------"+"\n"+
                "Título: " + l1.getTitulo() +
                "\n"+"Categoria: " + l1.getCategoria()+"\n"
                +"---------------------------------------------");
            
        }else{
            System.out.println("\n"+"Não encontramos essa categoria na pilha!");
        }
    }
    }
}
