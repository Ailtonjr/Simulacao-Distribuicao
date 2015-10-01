package br.univali.simulacao.modelo;

public class Conversor {

    public int converteValor(int valor, String unidade) {
        switch (unidade) {
            case "Milisegundo":
                return valor*1000;
            case "Microsegundo":
                return valor*1000000;
            case "Nanosegundo":
                return valor*1000000000;
            default:
                return valor;
        }
    }

    public double converteValor(double valor, String unidade) {
        switch (unidade) {
            case "Milisegundo":
                return valor*1000;
            case "Microsegundo":
                return valor*1000000;
            case "Nanosegundo":
                return valor*1000000000;
            default:
                return valor;
        }
    }
    
}
