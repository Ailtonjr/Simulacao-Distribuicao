package br.univali.simulacao.modelo;

public class Conversor {

    public static double Conversor(int valor, String unidade) {
        switch (unidade) {
            case "Milisegundo":
                return valor / 1000;
            case "Microsegundo":
                return 1;
            case "Nanosegundo":
                return 2;
            default:
                return valor;
        }
    }

}
