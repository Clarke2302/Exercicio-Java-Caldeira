public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Ronaldo Guto", "367.748.738-36",53627272,"CBS Bank","Rua dos Monges, 123",1500);


        System.out.println("\n");

        //saque
        cb.verificarSaldo();
        cb.saque(200);
        cb.verificarSaldo();

        //deposito
        cb.deposito(500);
        cb.verificarSaldo();

        //ver hora
        cb.verificarHorario();
        //ver info contaBancaria cb
        cb.verificarInfo(cb);

        //faz pix
        cb.pix(cb,200);

        //

        


    }
}
