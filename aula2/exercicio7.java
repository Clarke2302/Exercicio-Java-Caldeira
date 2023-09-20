import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar.
        //Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater.
        //O usuário deve digitar seu palpite e se o número for menor do que 300.000,
        // Leônidas deve dizer Um pouco mais!, caso o número dito pelo usuário seja menor,
        // ele dirá Um pouco menos!".

        System.out.println("Olá bem vinde! Você terá a poderosa missão de descobrir quantos soldados os espartanos irão enfrentar.");
        System.out.println("Digite o seu palpite: ");
        double palpite = tec.nextDouble();

        if(palpite==300.000){
            System.out.println("Leônidas: Você Acertou!!!! Parabéns!!!");
        }else if(palpite<300.000){
            System.out.println("Leônidas: Um pouco MAIS!");
        }else if(palpite>300.000){
            System.out.println("Leônidas: Um pouco MENOS! ");
        }

        
    }
    
}
