
package br.univali.simulacao.modelo;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Distribuicao {
    
    public double geraValor() {
        Random rand = new Random();
        return rand.nextDouble();
    }
    
    public double comparaPercentagem(List<Elemento> lista) {
        double n = geraValor();    // Randomico
        double aux = lista.get(0).getPercentual();
        
        for (Elemento elemento : lista) {
            if (n <= aux) {
                System.out.println(elemento.getValor());
                return elemento.getValor();
            }
            aux += elemento.getPercentual();
        }
        
        return 0;
    }
    
    public double distribuicaoNormal(double m, double o) {
        double retorno = 0;
        int tamanho = (int) o*2 + 1;
        List<Elemento> lista = new ArrayList();
        double x = m - o;
        
        for (int i = 0;i < tamanho; i++) {
            lista.add(new Elemento(x, (1.0/(o*pow(2.0*Math.PI, (1.0/2.0)))) * pow(Math.E, (pow(x - m, 2)/(2.0*pow(o, 2.0)))* (-1.0)) * 100));
            x++;
        }
        
        // Comparação de percentagem
        retorno = comparaPercentagem(lista);
        
        for (Elemento vetor1 : lista) {
            System.out.println(vetor1.getValor() + "\t" + vetor1.getPercentual());
        }
        
        return retorno;
    }
    
    public double distribuicaoUniforme(double a, double b) {
        // b deve ser o limite superior (caso contrario teria que fazer Math abs nas diferencas)
        double retorno = 0;
        int tamanho = (int) (b - a);
        List<Elemento> lista = new ArrayList();
        
        for (int i = 0; i <= b; i++) {
            lista.add(new Elemento(i + a, 1/(b-a)));    // lista.valor não pode ser incrementado de 1 em 1. Cenario teste a=2.2 b= 3.3
        }
        
        retorno = comparaPercentagem(lista);    // Todas tem chance igual, que numero vem?
        
        for (Elemento vetor1 : lista) {
            System.out.println(vetor1.getValor() + "\t" + vetor1.getPercentual());
        }
        
        return retorno;
    }
    
    
    
}
