package exercicio6;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        
        //Em um programa principal, trate essa exceção e forneça uma mensagem de erro adequada.

        ContaBancaria c1 = new ContaBancaria(2000);
        ContaBancaria c2 = new ContaBancaria(200);

        c1.sacar(700); //Dá certo
        
        c2.sacar(300); //Dá Erro

    }
}
