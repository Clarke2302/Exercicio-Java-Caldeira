//import java.text.DateFormat;
import java.text.DateFormat;
import java.util.Scanner;
public class ContaBancaria {
    Scanner tec = new Scanner(System.in);
    //

    String nome;
    String cpf;
    int identificadorConta;
    String banco;
    String endereco;
    double saldo;
    DateFormat horarioAtual;

    //metodos funções

    public void saque (double valor){
        //System.out.printf("Digite o valor que deseja sacar: R$");
        //valor = tec.nextDouble();
        if(valor==saldo||valor<saldo){
            double saldo =-valor;
            System.out.println("Você sacou R$"+valor+"\n");
        }else{
            System.out.println("Erro, saldo insuficiente!!!");
        }
    }
    public void deposito(double valor){
        
        saldo +=valor;
        System.out.println("Você depositou R$"+valor);
    }

    public void pix(double valor){

    }
    public void transferencia(ContaBancaria destino, double valor){

    }
    public void verificarSaldo(){
        System.out.println("Seu saldo agora é de R$"+saldo);

    }
    public void verificarHorario(){
        horarioAtual.SHORT;
    }
    public void verificarInfo(){

    }
}
