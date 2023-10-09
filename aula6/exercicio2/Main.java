package exercicio2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner teclado = new Scanner (System.in);

    int tamanho = 3;


    Map<String, Integer> pessoas = new HashMap<String, Integer>(tamanho);

    //Insira algumas entradas no mapa
    pessoas.put("Alena Elliot", 63);
    pessoas.put("Eddie Stewarts", 17);
    pessoas.put("Irina George", 18);
    pessoas.put("Robert Daniels", 72);


    imprimirIdade(pessoas, "Eddie Stewarts");

    
    System.out.println("---------------------------------------------------");
    System.out.println("Esses são os idosos da lista:"+"\n");
    imprimirNomeIdosos(pessoas);
    
    }

    //funções
    
    //imprima a idade de um nome específico.

    public static void imprimirIdade(Map<String, Integer> pessoas,String digitaNome){
        
        for (Map.Entry<String, Integer> entra : pessoas.entrySet()){
		
            if(entra.getKey()==digitaNome){
                System.out.println("---------------------------------------------------");
                System.out.println("A idade de "+digitaNome+ " é "+entra.getValue()+" anos");
                System.out.println("");
            
            }else{
            System.out.println("\n"+"Não encontramos ninguém com esse nome!");
            }
        }
    }

    //Crie um método para imprimir nomes das pessoas que estão na terceira idade.
    public static void imprimirNomeIdosos(Map<String, Integer> pessoas){
        
        for(Map.Entry<String, Integer> entra : pessoas.entrySet()){
            
            if(pessoas==null){
                System.out.println("Não temos idosos nessa Lista!");
            }
            if(entra.getValue()>=60){
                System.out.println("Nome: "+entra.getKey()+"\n"+"Idade: "+entra.getValue()+" anos");
                System.out.println("");
            }
        }
    }
}
