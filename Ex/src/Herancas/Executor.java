package Herancas;

public class Executor {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println(gerente.getNome());

        gerente.setNome("Ricardo");
        gerente.setCpf("111.111.111-11");
        System.out.println(gerente.getNome());
    }
}
