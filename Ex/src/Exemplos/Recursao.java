package Exemplos;

public class Recursao {

    public int somatorioSemRecursao(int valor){
        int soma = 0;
        for (int i = 0; i <= valor ; i++) {
            soma = soma + i;
            //soma += i;
        }
        return soma;
    }

    public int somatorioComRecursao(int valor) {
        if (valor == 0) {
            return 0;
        }
        return valor + somatorioComRecursao( valor - 1);

    }

    /*public int potenciaDeTres(int valor);{
      condição de parada
      definir o retorno
      definir o retrono da chamada recursiva => return potenciaDeTres(valor);
     */
    }


