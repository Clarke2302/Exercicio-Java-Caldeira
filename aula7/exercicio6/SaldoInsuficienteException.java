package exercicio6;

public class SaldoInsuficienteException extends Exception {
    //Crie uma exceção personalizada chamada SaldoInsuficienteException que herde de Exception.

    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
