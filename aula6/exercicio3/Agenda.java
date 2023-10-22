package exercicio3;

public class Agenda {
    //Crie um programa Java que utilize uma estrutura de dados do tipo TreeMap para criar uma agenda telefônica.
    //Agenda deve conter: número de telefone, nome, endereço e local da cidade (norte, sul, centro, leste e oeste).
        
    String nomeCompleto;
    String endereco;
    String localCidade;

    public Agenda(String nomeCompleto,String endereco,String localCidade){
        this.nomeCompleto = nomeCompleto;
        this.endereco = endereco;
        this.localCidade=localCidade;
    }

}
