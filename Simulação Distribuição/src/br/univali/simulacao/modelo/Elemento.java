
package br.univali.simulacao.modelo;


public class Elemento {
    private double valor = 0;
    private double percentual = 0;

    public Elemento(double valor, double percentual) {
        this.valor = valor;
        this.percentual = percentual;
    }

    public Elemento(double x, double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
}
