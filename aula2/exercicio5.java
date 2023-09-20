public class exercicio5 {
    //Escreva um programa que separa a string em duas metades
    // e imprime a primeira parte.

    public static void main (String[]args){

        String frase = "Helena ama coelhos, ela tem um de pelúcia.";
        System.out.println("-----------------------------------------"+"\n"
        +"Frase sem edição: "+"\n"+"\n"+frase+"\n"+"-----------------------------------------");

        String [] editada = frase.split(",");

        System.out.println("Frase com edição:"+"\n"+"\n"+editada[0]+".");



    }
}
