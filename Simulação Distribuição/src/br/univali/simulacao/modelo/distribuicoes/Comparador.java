
package br.univali.simulacao.modelo.distribuicoes;

import br.univali.simulacao.modelo.Elemento;
import java.util.List;
import java.util.Random;


public class Comparador {

    private static double geraValor() {
        Random rand = new Random();
        double valor = rand.nextDouble() * 100;     //nextDouble gera valores entre 0.0 e 1.0
        System.out.println("Probabilidade gerada:\t" + valor);

        return valor;
    }

    public static double comparaPercentagem(List<Elemento> lista) {
        double n = geraValor();    // Randomico
        double aux = lista.get(0).getPercentual();

        for (Elemento elemento : lista) {
            if (n <= aux) {
                System.out.println("Valor equivalente:\t" + elemento.getValor());
                return elemento.getValor();
            }
            aux += elemento.getPercentual();
        }
        System.err.println("Deu 0 e Chamou de novo");
        return comparaPercentagem(lista);                                           //Teste para nao retornar 0 quando o rand der um valor fora dos intervalos
    }
    
    public static double comparaPercentagemExponencial(List<Elemento> lista) {
        double n = geraValor();    // Randomico
        double aux = lista.get(0).getPercentual();

        for (Elemento elemento : lista) {
            if (n <= aux) {
                System.out.println("Valor equivalente:\t" + elemento.getValor());
                return elemento.getValor();
            }
            aux += elemento.getPercentual();
        }
        return 1;
    }
}
