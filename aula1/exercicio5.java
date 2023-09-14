public class exercicio5 {
    public static void main(String[]args){ //dificuldades
//quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite
        int hora = 2;
        int minuto = 23;
        int segundo = 3;

        int horaPMin= hora*3600; //hora dividido por 1 hora = 3660 seg
        int minPSeg = horaPMin+(minuto*60); //hora em seg + minuto para seg 1 min = 60 seg
        int contaSegundos = minPSeg+segundo; //soma tudo e vira segundo
        int contaMeiaNoite = contaSegundos ;

        System.out.println("Quantos segundos se passaram desde às 0h00min0s? "+contaSegundos+" segundos"+"/n"+"Quantos segundos faltam para a meia-noite? "+contaMeiaNoite+" segundos");
    }
    
}
