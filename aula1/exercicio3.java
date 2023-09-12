public class exercicio3 {
    public static void main (String[]args){

        int num1 = 3;
        int num2 = 5;
        int num3 = 7;
        int maior=num1;
        int media = (num1+num2+num3)/3;
        int menor=num1;

        if(num2>num1&&num2>num3){ //maior
            maior=num2;
        }else if (num3>num1&&num3>num2){
            maior=num3;
        }
        if(num1>num2&&num3>num2){//menor
            menor=num2;
        }else if(num1>num3&&num2>num3){
            menor=num3;
        }

        System.out.println("O número "+maior+" é o maior número, o número "+menor+" é o menor número e a média aritmética desses números é "+media);

    }
}
