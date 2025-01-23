package IntroducaoOO;

public class Executor {

    public static void main(String[] args) {
        Conta conta = new Conta(0001, "Thiago", 20.0);
        conta.extrato();
        conta.sacar(10.0)
    }
}
