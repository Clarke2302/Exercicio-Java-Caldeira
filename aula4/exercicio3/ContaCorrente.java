package exercicio3;

public class ContaCorrente extends Conta{ //herdarão de uma classe-base chamada Conta

    public ContaCorrente(double saldo){
        this.saldo=saldo;
    }
    public double sacar(double valor){
        return saldo -= valor;
    }
    public double depositar(double valor){
        return saldo += valor;
    }
    public double obterSaldo(){
        return saldo;
    }

    public double calculaTributos(){ //é tributável, com uma taxa de 1% sobre o saldo da conta.
        return saldo*0.01;
    }

}