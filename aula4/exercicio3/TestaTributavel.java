package exercicio3;
import java.util.Scanner;
public class TestaTributavel { //testar exemplo e calcular tributos
    public static void main(String[] args) {

        Scanner tec = new Scanner (System.in);
        
        Tributavel cp = new ContaPoupanca(1500);
        Tributavel cc = new ContaCorrente(2000);
        Tributavel sv = new SeguroDeVida();

        System.out.println("------------------------------------"+"\n"+"---------------Menu-----------------"+"\n");
        System.out.println("Banco: "+"\n"+"Qual você deseja acessar?");
        System.out.println("-Conta Corrente: digite 1");
        System.out.println("-Conta Poupança: digite 2");
        System.out.println("-Seguro de vida: digite 3");
        System.out.println("-Sair: digite 0");

        int tecla = tec.nextInt();

        while(tecla!=0){
            if(tecla==1){
                System.out.println("Bem-Vindo à sua Conta Corrente"+"\n"
                +"-Ver Saldo: digite 1"+"\n"+
                "-Saque: digite 2"+"\n"
                +"Depositar: digite 3"+"\n");

                System.out.printf("Digite: ");
                int txhis = tec.nextInt();

                if(txhis == 1){
                    cc.obterSaldo();
                }else if(txhis == 2){
                    cc.sacar(2000);
                }else if(txhis == 3){
                    cc.depositar(500);
                }
            }
        }

        System.out.println("Saindo ........");
        

    }


    
}
