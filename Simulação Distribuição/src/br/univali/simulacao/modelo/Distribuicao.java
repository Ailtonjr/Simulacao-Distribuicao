
package br.univali.simulacao.modelo;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;


public class Distribuicao {
    
    public void distribuicaoNormal(double m, double o) {
        int tamanho = (int) o*2 + 1;
        List<Elemento> lista = new ArrayList();
        double x = m - o;
        
        for (int i = 0;i < tamanho; i++) {
            lista.add(new Elemento());
        }
        
        for (Elemento l : lista) {
            l.setValor(x);
            l.setPercentual((1.0/(o*pow(2.0*Math.PI, (1.0/2.0)))) * pow(Math.E, (pow(x - m, 2)/(2.0*pow(o, 2.0)))* (-1.0)) * 100);
            x++;
        }
        
        
        
        for (Elemento vetor1 : lista) {
            System.out.println(vetor1.getValor() + "\t" + vetor1.getPercentual());
        }
    }
    
    
    
}
