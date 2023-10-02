package exercicio6;

public class Places {

    //criando novo lugar para adicionar e manipular as informações de endereços e lugares a se visitar

    //indices

    //0 = Nova Zelândia (Auckland)
    //1 = Nova York (Manhattan)
    //2 = Flórida (Orlando)
    //3 = Rio de Janeiro (Leblon)
    //4 = Paraná (Cataratas do Iguaçu)


    //Criando Arrays para colocar variaveis como um objeto

    String[] nomeEstadia = {"Kiwi International Hotel","The Herald by LuxUrban, Trademark Collection by Wyndham","Comfort Inn & Suites perto do Universal Orlando Resort-Convention Ctr","Apto com vista para o mar, contém: piscina, sauna, academia e serviço de limpeza","Nacional Inn Foz do Iguaçu"};
    String[] enderecoEstadia = {"411 Queen Street, 1010 ","71 West 35th Street, Nova York, NY 10001","7495 Canada Avenue, Orlando, FL 32819","Rua Dias Ferreira, 15","Avenida das Cataratas, 8355"};
    String[] infoAddEstadia = {"1 Quarto Individual Econômico com Banheiro Compartilhado","Wifi Gratuito - Ar condicionado - Banheiro privativo - Cartão de acesso","Wifi Gratuito - Piscina ao ar livre - Estacionamento gratuito - Ar condicionado","1 Quarto - 2 Camas - 1 Banheiro - 1 Sala ","4 Piscinas - Wifi Gratuito - Ar Condicionado -  Cartão de Acesso"};
    Double[] valorEstadia = {1750.00,4180.00,3906.00,3234.00,};



    //criando funnção mostrar informações lugar

    public void infoPlaces(int indice){
        System.out.println("--------------------------------"+"\n"+"Nome: "+nomeEstadia[indice]+
        "\n"+"Endereço: "+enderecoEstadia[indice]+"\n"
        +infoAddEstadia[indice]+"\n"+
        "Valor: R$"+valorEstadia[indice]);
    }
}