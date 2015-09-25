
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
        double tamanho = limite - lambda;
        List<Elemento> lista = new ArrayList();
        double x = limite - tamanho;

        System.out.println("lambda = " + lambda + "\tlimite = " + limite);

        for (int i = 0; i < tamanho; i++) {
            lista.add(new Elemento(x, (1/lambda) * pow(Math.E, (x/lambda) * (-1) ) ));
            x++;
            
            // lambda + i, pow(lambda * Math.E, (lambda * x)) * (-1)s
        }

        retorno = Comparador.comparaPercentagemExponencial(lista);

        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");

        return retorno;
    }

}
