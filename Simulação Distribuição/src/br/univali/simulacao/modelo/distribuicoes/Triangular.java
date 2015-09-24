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
public class Triangular implements Distribuicao {

    double a;
    double b;
    double c;

    public Triangular(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcula() {
        // b é sempre o maior valor do intervalo
        double retorno = 0;
        int tamanho = (int) (b - a);
        List<Elemento> lista = new ArrayList();
        double x = b - tamanho + 1;

        System.out.println("a = " + a + "\tb = " + b + "\tc = " + c);   // LOG

        for (int i = 1; i < tamanho; i++) {     // [a,b] sao intervalos fechados
            if (a <= x && x < c) {
                lista.add(new Elemento(x, (2 * (x - a)) / ((b - a) * (c - a)) * 100));
            } else if (x == c) {
                lista.add(new Elemento(x, 2 / (b - a) * 100));
            } else if (c < x && x <= b) {
                lista.add(new Elemento(x, (2 * (b - x)) / ((b - a) * (b - c)) * 100));
            } else {
                lista.add(new Elemento(x, 0));
            }
            x++;
        }

        retorno = Comparador.comparaPercentagem(lista);

        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");

        return retorno;

    }

}
