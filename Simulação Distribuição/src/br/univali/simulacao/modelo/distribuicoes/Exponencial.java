
package br.univali.simulacao.modelo.distribuicoes;

import br.univali.simulacao.modelo.Elemento;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;


public class Exponencial implements Distribuicao {
    double lambda;
    double limite;

    public Exponencial(double lambda, double limite) {
        this.lambda = lambda;
        this.limite = limite;
    }
    
    @Override
    public double calcula() {
        // lambda deve ser maior que zero
        double retorno = 0;
        List<Elemento> lista = new ArrayList();
        double x = lambda;

        System.out.println("lambda = " + lambda + "\tlimite = " + limite);

        for (int i = 0; i < limite; i++) {
            lista.add(new Elemento(lambda + i, pow(lambda * Math.E, (lambda * x)) * (-1)));
        }

        retorno = Comparador.comparaPercentagemExponencial(lista);

        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");

        return retorno;
    }

}
