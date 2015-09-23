package br.univali.simulacao.modelo;


public class Tupla {
    private int id;
    private double tec;
    private double tc_i;
    private double ts_inicio;
    private double ts;
    private double ts_fim;
    private double t_fila;

    public Tupla(int id, double tec, double tc_i, double ts_inicio, double ts, double ts_fim, double t_fila) {
        this.id = id;
        this.tec = tec;
        this.tc_i = tc_i;
        this.ts_inicio = ts_inicio;
        this.ts  = ts;
        this.ts_fim = ts_fim;
        this.t_fila = t_fila;
    }
    
    public Tupla(int id, double tc_i, double ts_inicio, double ts, double ts_fim, double t_fila) {
        this.id = id;
        this.tc_i = tc_i;
        this.ts_inicio = ts_inicio;
        this.ts  = ts;
        this.ts_fim = ts_fim;
        this.t_fila = t_fila;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTec() {
        return tec;
    }

    public void setTec(double tec) {
        this.tec = tec;
    }

    public double getTc_i() {
        return tc_i;
    }

    public void setTc_i(double tc_i) {
        this.tc_i = tc_i;
    }

    public double getTs_inicio() {
        return ts_inicio;
    }

    public void setTs_inicio(double ts_inicio) {
        this.ts_inicio = ts_inicio;
    }

    public double getTs() {
        return ts;
    }

    public void setTs(double ts) {
        this.ts = ts;
    }

    public double getTs_fim() {
        return ts_fim;
    }

    public void setTs_fim(double ts_fim) {
        this.ts_fim = ts_fim;
    }

    public double getT_fila() {
        return t_fila;
    }

    public void setT_fila(double t_fila) {
        this.t_fila = t_fila;
    }
}
