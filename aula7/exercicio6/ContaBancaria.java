package exercicio6;

public class ContaBancaria {
 //Crie uma classe ContaBancaria que represente uma conta com um saldo inicial.
 // Escreva um método sacar(double valor) na classe ContaBancaria que lance a exceção
 // SaldoInsuficienteException se o saldo for insuficiente para a retirada.

    double saldoInicial;

    public ContaBancaria(double saldoInicial){ //construtor
        this.saldoInicial=saldoInicial;
    }

    public void sacar (double valor) throws SaldoInsuficienteException {
        if(valor>saldoInicial){
            throw new SaldoInsuficienteException ("Seu saldo é insuficiente");
        }else{
            saldoInicial -= valor;
            System.out.println("\n"+"Você sacou R$"+valor+"."+"\n"+"Agora seu saldo é de R$ "+saldoInicial);
        }
    }

}
