
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class ContaBancaria {
    Scanner tec = new Scanner(System.in);
    String nome;
    String cpf;
    int identificadorConta;
    String banco;
    String endereco;
    double saldo;


    //construtor

    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco,double saldo){
        this.nome=nome;
        this.cpf=cpf;
        this.identificadorConta= identificadorConta;
        this.banco=banco;
        this.endereco=endereco;
        this.saldo=saldo;
    }

    //metodos funções

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

    //---------- fazer pix --------------- //realiza transf verificando saldo e horário atual

    public void pix(double valor){
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


    }
    public void verificarSaldo(){
        System.out.println("-----------------------------------------");
        System.out.println("Seu saldo agora é de R$"+saldo);

    }
    public void verificarHorario(){
        System.out.println("-----------------------------------------");

        java.time.format.DateTimeFormatter dtf2 = java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dtf2.format(LocalDateTime.now()));

    }

    public void verificarInfo(ContaBancaria usuario){

        System.out.println("------------------------------------------"+
                "\n"+getNome()+"\n"+getCpf()+"\n"+getIdentificadorConta()+
                "\n"+getBanco()+"\n"+getEndereco()+"\n"+getSaldo()+"\n");
        System.out.println("------------------------------------------");
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

    //data
    private static class DateTimeFormatter {
    }
}