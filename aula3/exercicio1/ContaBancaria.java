
import java.time.LocalDateTime;
import java.util.Scanner;
public class ContaBancaria {
    Scanner tec = new Scanner(System.in);
    String nome;
    String cpf;
    int identificadorConta;
    String banco;
    String endereco;
    double saldo;
    LocalDateTime horarioAtual;


    //construtor

    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco,double saldo){
        this.nome=nome;
        this.cpf=cpf;
        this.identificadorConta= identificadorConta;
        this.banco=banco;
        this.endereco=endereco;
        this.saldo=saldo;
        this.horarioAtual = LocalDateTime.now();
    }

    //metodos funções

    //criei horario
    java.time.format.DateTimeFormatter dtf2 = java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");
    
    



    //-------sacar-------------------

    public void saque (double valor){
        System.out.println("-----------------------------------------");
        if(valor==saldo||valor<saldo){
            saldo -= valor;
            System.out.println("Você sacou R$"+valor);
        }else{
            System.out.println("Erro, saldo insuficiente!!!");
        }
    }

    //----------depositar-----------

    public void deposito(double valor){
        System.out.println("-----------------------------------------");
        
        saldo +=valor;
        System.out.println("Você depositou R$"+valor);
    }

    //---------- fazer pix ---------------

    public void pix(ContaBancaria destino ,double valor){
        System.out.println("-----------------------------------------");

        if(valor==saldo||valor<saldo){
            saldo -= valor;
            System.out.println("Você fez um pix de R$"+valor);
        }else{
            System.out.println("Erro, saldo insuficiente para fazer o pix!!!");
        }

    }

    //----------transferir----------------

    public void transferencia(ContaBancaria destino, double valor){
        System.out.println("-----------------------------------------");
        
            String[] splitHour = dtf2.format(horarioAtual).split(":");
            int hour = Integer.parseInt(splitHour[0]);

            if (hour >= 8 && hour <= 19) {
                if (saldo >= valor) {
                    this.saldo = saldo - valor;
                    destino.saldo = saldo + valor;
                    System.out.println("Você fez uma tranferência de R$"+valor + " realizada para " + destino.nome);
                } else {
                    System.out.println("Confira seu saldo e tente novamente!");
                }
            } else {
                System.out.println("Estamos fora do horário de serviço, nosso funcionamento é das 8hrs às 19:00hrs !");
            }
        }
        
    //-------ver saldo-----------------

    public void verificarSaldo(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu saldo agora é de R$"+saldo);

    }
    //-------ver hora-----------------

    public void verificarHorario(){
        System.out.println("-----------------------------------------");
        System.out.println("Horário: ");
        System.out.printf(dtf2.format(LocalDateTime.now()));

    }
    //-------ver informações da conta-----------------

    public void verificarInfo(ContaBancaria usuario){

        System.out.println("\n"+"------------------------------------------"+
                "\n"+getNome()+"\n"+getCpf()+"\n"+getIdentificadorConta()+
                "\n"+getBanco()+"\n"+getEndereco()+"\n"+getSaldo());
        
    }


    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getHorarioAtual(){
        return horarioAtual;
    }
    
    public void  setHorarioAtual(){
        this.horarioAtual = horarioAtual;
    }

    //data
    private static class DateTimeFormatter {
    }
}
