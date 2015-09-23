/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.simulacao.modelo.distribuicoes;

import br.univali.simulacao.modelo.Elemento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ailton Jr
 */
public class Uniforme implements Distribuicao {

    double a;
    double b;

    public Uniforme(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcula() {
        // b deve ser o limite superior (caso contrario teria que fazer Math abs nas diferencas)
        double retorno = 0;
        int tamanho = (int) (b - a);
        List<Elemento> lista = new ArrayList();

        System.out.println("a = " + a + "\tb = " + b);   // LOG

        for (int i = 0; i < tamanho; i++) {
            lista.add(new Elemento(i + a, (1 / (b - a)) * 100));    // lista.valor não pode ser incrementado de 1 em 1. Cenario teste a=2.2 b= 3.3
        }

        retorno = God.comparaPercentagem(lista);

        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");

        return retorno;
    }
}
