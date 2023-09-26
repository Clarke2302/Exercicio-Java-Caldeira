package exercicio3;

public class Conta implements Tributavel {

    double saldo;

    public double sacar(double valor){
        return saldo -= valor;
    }
    public double depositar(double valor){
        return saldo += valor;
    }
    public double obterSaldo(){
        return saldo;
    }
    @Override
    public double calculaTributos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculaTributos'");
    }
    

}

