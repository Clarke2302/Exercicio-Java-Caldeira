package exercicio3;

public class ContaPoupanca extends Conta  { //herdarão de uma classe-base chamada Conta
    
    double saldo;

    public ContaPoupanca(double saldo){
        this.saldo=saldo;
    }

    public double sacar(double valor) {
        return saldo -= valor;
    }
    public double depositar(double valor){
        return saldo += valor;
    }
    public double obterSaldo(){
        return saldo;
    }

    public double calculaTributos(){//Conta Poupança não é tributável, portanto, seu método calculaTributos() retornará 0.
        return 0;
    }



}
