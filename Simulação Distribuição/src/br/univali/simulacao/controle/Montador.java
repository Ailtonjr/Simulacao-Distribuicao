package br.univali.simulacao.controle;

import br.univali.simulacao.modelo.Distribuicaoasaasadasd;
import br.univali.simulacao.modelo.Tupla;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ailton Jr
 */
public class Montador {

    List<Tupla> tuplas = new ArrayList<>();
    int id = 0;

    double tec;
    double tc_i;
    double ts_inicio;
    double ts;
    double ts_fim;
    double t_fila;
    Tupla tuplaAnterior;
    Distribuicaoasaasadasd distribuicao;

    //int[] testeTEC = new int[]{0, 7, 8, 3, 5, 9};
    //int[] testeTS = new int[]{5, 5, 10, 15, 25, 40};

    public Montador(String strTec, String strTs, float limiteInferiorTec, float limiteSuperiorTec, float limiteInferiorTs, float limiteSuperiorTs, float tempoSimulacao) {
        System.out.println(strTec + " " + strTs);
        distribuicao = new Distribuicaoasaasadasd();

        while (true) {
            if (strTec.equals("Normal")) {
                tec = distribuicao.distribuicaoNormal(limiteInferiorTec, limiteSuperiorTec);
            }

            if (strTs.equals("Uniforme")) {
                ts = distribuicao.distribuicaoUniforme(limiteInferiorTs, limiteSuperiorTs);
            }else if(strTs.equals("Normal")){
                
            }

            if (id == 0) {
                tuplas.add(new Tupla(id, 0, 0, ts, ts, 0));
            } else {
                tuplaAnterior = tuplas.get(id - 1);
                //tec = testeTEC[id];                                               // valore para teste e validação
                tc_i = tec + tuplaAnterior.getTc_i();
                if (tuplaAnterior.getTs_fim() <= tc_i) {
                    ts_inicio = tc_i;
                } else {
                    ts_inicio = tuplaAnterior.getTs_fim();
                }
                //ts = testeTS[id];                                                 // valore para teste e validação
                ts_fim = ts_inicio + ts;
                t_fila = ts_inicio - tc_i;
                if (ts_fim >= tempoSimulacao) {
                    break;                                                                                               // Verificar
                }
                tuplas.add(new Tupla(id, tec, tc_i, ts_inicio, ts, ts_fim, t_fila));
            }
            id++;
        }
    }

    public void exibeTabela() {
        System.out.println("\n\n\n\nID\tTEC\tTC-I\tTS-Inicio\tTS\tTS-Fim\tT-Fila");
        for (Tupla tupla : tuplas) {
            if (tupla.getId() == 0) {
                System.out.println(tupla.getId() + "\t *\t" + tupla.getTc_i() + "\t" + tupla.getTs_inicio() + "\t\t" + tupla.getTs() + "\t" + tupla.getTs_fim() + "\t" + tupla.getT_fila());
            } else {
                System.out.println(tupla.getId() + "\t" + tupla.getTec() + "\t" + tupla.getTc_i() + "\t" + tupla.getTs_inicio() + "\t\t" + tupla.getTs() + "\t" + tupla.getTs_fim() + "\t" + tupla.getT_fila());
            }
        }
    }
}
