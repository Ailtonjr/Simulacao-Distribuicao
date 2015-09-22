
package br.univali.simulacao.modelo;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Distribuicao {
    
    public double geraValor() {
        Random rand = new Random();
        double valor = rand.nextDouble() * 100;     //nextDouble gera valores entre 0.0 e 1.0
        System.out.println("Probabilidade gerada:\t" + valor);
        
        return valor;
    }
    
    public double comparaPercentagem(List<Elemento> lista) {
        double n = geraValor();    // Randomico
        double aux = lista.get(0).getPercentual();
        
        for (Elemento elemento : lista) {
            if (n <= aux) {
                System.out.println("Valor equivalente:\t" + elemento.getValor());
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
        
        System.out.println("m = " + m + "\to = " + o); // LOG
        
        for (int i = 0;i < tamanho; i++) {
            lista.add(new Elemento(x, (1.0/(o*pow(2.0*Math.PI, (1.0/2.0)))) * pow(Math.E, (pow(x - m, 2)/(2.0*pow(o, 2.0)))* (-1.0)) * 100));
            x++;
        }
        
        // Comparação de percentagem
        retorno = comparaPercentagem(lista);
        
        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");
        
        return retorno;
    }
    
    public double distribuicaoUniforme(double a, double b) {
        // b deve ser o limite superior (caso contrario teria que fazer Math abs nas diferencas)
        double retorno = 0;
        int tamanho = (int) (b - a);
        List<Elemento> lista = new ArrayList();
        
        System.out.println("a = " + a + "\tb = " + b);   // LOG
        
        for (int i = 0; i < tamanho; i++) {
            lista.add(new Elemento(i + a, (1/(b-a)) *100));    // lista.valor não pode ser incrementado de 1 em 1. Cenario teste a=2.2 b= 3.3
        }
        
        retorno = comparaPercentagem(lista);
        
        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");
        
        return retorno;
    }
    
    public double distribuicaoTriangular(double a, double b, double c) {
        // b é sempre o maior valor do intervalo
        double retorno = 0;
        int tamanho = (int) (b - a);
        List<Elemento> lista = new ArrayList();
        double x = b - tamanho + 1;
        
        System.out.println("a = " + a + "\tb = " + b + "\tc = " + c);   // LOG
        
        for (int i = 1; i < tamanho; i++) {     // [a,b] sao intervalos fechados
            if (a <= x && x < c)        lista.add(new Elemento(x, (2*(x-a))/((b-a)*(c-a)) *100));
            else if (x == c)            lista.add(new Elemento(x, 2/(b-a) *100));
            else if (c < x && x <= b)   lista.add(new Elemento(x, (2*(b-x))/((b-a)*(b-c)) *100));
            else                        lista.add(new Elemento(x, 0));
            x++;
        }
        
        retorno = comparaPercentagem(lista);
        
        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");
        
        return retorno;
    }
    
    public double distribuicaoExponencial(double lambda, double limite) {
        // lambda deve ser maior que zero
        double retorno = 0;
        List<Elemento> lista = new ArrayList();
        double x = lambda;
        
        System.out.println("lambda = " + lambda + "\tlimite = " + limite);
        
        for (int i = 0; i < limite; i++) {
            lista.add(new Elemento(lambda + i, pow(lambda*Math.E, (lambda*x))*(-1) ));
        }
        
        retorno = comparaPercentagem(lista);
        
        for (Elemento elemento : lista) {
            System.out.println(elemento.getValor() + "\t" + elemento.getPercentual());
        }
        System.out.println("\n");
        
        return retorno;
    }
    
}
