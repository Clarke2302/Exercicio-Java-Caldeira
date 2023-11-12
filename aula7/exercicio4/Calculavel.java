package exercicio4;

public interface Calculavel {
    //Expanda o exercício 3 adicionando uma interface chamada Calculavel
    //com métodos para adicionar, subtrair, multiplicar e dividir números inteiros.
    //Em seguida, crie uma classe que implemente a interface Calculavel
    //e use um enum para selecionar a operação desejada.
    //Trate exceções adequadamente para situações como divisão por zero ou operação inválida.

    //Métodos

    public static void adicionar(int val1, int val2){
    int soma = val1 + val2;
        System.out.println(val1+" + "+val2+" = "+soma);
    }

    public static void subtrair(int val1, int val2){
        if(val2>val1) {
            int sub = val2 - val1;
            System.out.println(val2+" - "+val1+" = "+sub);
        }
        if(val1>val2){
        int sub = val1 - val2;
            System.out.println(val1+" - "+val2+" = "+sub);
        }
    }
    public static void multiplicar(int val1, int val2) {
        int multi = val1 * val2;
        System.out.println(val1+" * "+val2+" = "+multi);
    }
    public static void dividir(int val1, int val2) {
        if(val2>val1) {
            int div = val2/val1;
            System.out.println(val2+" / "+val1+" = "+div);
        }
        if(val1>val2){
            int div = val1/val2;
            System.out.println(val1+" / "+val2+" = "+div);
        }
    }
}
