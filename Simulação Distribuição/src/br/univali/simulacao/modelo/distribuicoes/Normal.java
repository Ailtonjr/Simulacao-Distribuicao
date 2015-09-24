/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.simulacao.modelo.distribuicoes;

import br.univali.simulacao.modelo.Elemento;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ailton Jr
 */
public class Normal implements Distribuicao {
    double m;
    double o;

    public Normal(double m, double o) {
        this.m = m;
        this.o = o;
    }
    
    @Override
    public double calcula() {
        double retorno = 0;
        int tamanho = (int) o*2 + 1;
        List<Elemento> lista = new ArrayList();
        double x = m - o;
        
        System.out.println("m = " + m + "\to = " + o); // LOG
        
        for (int i = 0;i < tamanho; i++) {
            lista.add(new Elemento(x, (1.0/(o*pow(2.0*Math.PI, (1.0/2.0)))) * pow(Math.E, (pow(x - m, 2)/(2.0*pow(o, 2.0)))* (-1.0)) * 100));
            x++;
        }
        
        // Comparação de percentagem
        retorno = Comparador.comparaPercentagem(lista);
        
        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");
        
        return retorno;
    }
}
