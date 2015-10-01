
package br.univali.simulacao.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Relatorio {
    
    private final double VALOR_MAX = 9223372036854775807L;
    private List<String> dados = new ArrayList();
    private String maiorTempoProcessado;
    private String menorTempoProcessado;
    private String maiorTempoFila;
    private String menorTempoFila;
    private String maiorSistemaFilas;
    private String menorSistemaFilas;
    private double dividendoPermanencia = 0;
    private double divisorPermanencia = 0;
    private double dividendoAtendimento = 0;
    private double divisorAtendimento = 0;
    private Conversor conversor = new Conversor();
    
    public Relatorio(List<Tupla> tabela, String unidade) {
        System.out.println("Tempo unidade " + unidade);
        try {
            double auxMaiorProcessado = 0;
            double auxMenorProcessado = VALOR_MAX;
            double auxMaiorFila = 0;
            double auxMenorFila = VALOR_MAX;
            double auxMaiorSistemaFilas = 0;
            double auxMenorSistemaFilas = VALOR_MAX;
            
            for (Tupla tupla : tabela) {
                // Mais demorou para ser processado
                if (tupla.getTs() > auxMaiorProcessado) {
                    auxMaiorProcessado = tupla.getTs();
                    maiorTempoProcessado = tupla.getId()+ "\t" + conversor.converteValor(tupla.getTs(), unidade);
                }
                // Menos demorou para ser processado
                if (tupla.getTs() < auxMenorProcessado) {
                    auxMenorProcessado = tupla.getTs();
                    menorTempoProcessado = tupla.getId()+ "\t" + conversor.converteValor(tupla.getTs(), unidade);
                }
                
                // Maior tempo em fila
                if (tupla.getT_fila() > auxMaiorFila) {
                    auxMaiorFila = tupla.getT_fila();
                    maiorTempoFila = tupla.getId()+ "\t" + conversor.converteValor(tupla.getT_fila(), unidade);
                }
                // Menor tempo em fila  
                if (tupla.getT_fila() < auxMenorFila && tupla.getT_fila() > 0) {
                    auxMenorFila = tupla.getT_fila();
                    menorTempoFila = tupla.getId() + "\t" + conversor.converteValor(tupla.getT_fila(), unidade);
                }
                
                // Maior tempo Sistema filas
                if ((tupla.getTs() + tupla.getT_fila()) > auxMaiorSistemaFilas) {
                    auxMaiorSistemaFilas = tupla.getTs() + tupla.getT_fila();
                    maiorSistemaFilas = tupla.getId() + "\t" + conversor.converteValor((tupla.getTs() + tupla.getT_fila()), unidade);
                }
                // Menor tempo Sistema filas
                if ((tupla.getTs() + tupla.getT_fila()) < auxMenorSistemaFilas) {
                    auxMenorSistemaFilas = tupla.getTs() + tupla.getT_fila();
                    menorSistemaFilas = tupla.getId() + "\t" + conversor.converteValor((tupla.getTs() + tupla.getT_fila()), unidade);
                }
                
                // Reservado para processos
                
                // Tempo medio de permanencia das entidades em fila
                if (tupla.getT_fila() > 0) {
                    dividendoPermanencia += tupla.getT_fila();
                    divisorPermanencia++;
                }
                
                // Tempo medio de atendimento das entidades por processo
                dividendoAtendimento += tupla.getTs_inicio();
                divisorAtendimento++;
            }
            
            String permanencia;
            if (dividendoPermanencia == 0)  permanencia = "0 nao houveram filas.";
            else    permanencia = "" + conversor.converteValor(dividendoPermanencia/divisorPermanencia, unidade);
            
            dados.add("Maior tempo para ser processado: " + maiorTempoProcessado);
            dados.add("Menor tempo para ser processado: " + menorTempoProcessado);
            dados.add("Maior tempo em fila: " + maiorTempoFila);
            dados.add("Menor tempo em fila: " + menorTempoFila);
            dados.add("Maior tempo filas + processos: " + maiorSistemaFilas);
            dados.add("Menor tempo filas + processos: " + menorSistemaFilas);
            dados.add("Processo que gerou mais filas: " + "PROCESSO 1");        // M3
            dados.add("Processo que gerou menos filas: " + "PROCESSO 1");       // M3
            dados.add("Tempo medio de permanencia das entidades em fila: " + permanencia);    // M3
            dados.add("Tempo medio de atendimendo das entidades: " + conversor.converteValor(dividendoAtendimento/divisorAtendimento, unidade));
            dados.add("Quantidade de entidades que entram no PROCESSO 1: " + tabela.size());    // M3
            dados.add("Quantidade de entidades que saem do PROCESSO 1: " + tabela.size());
            
            // Construcao do arquivo
            File file = new File("relatorio.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Relatorio da Simulacao\r\n");
            for (String dado : dados) {
                bw.write(dado + "\r\n");
            }
            
            bw.write("\r\n\r\n\r\n ID \t TEC \t TC-I \t TS-Inicio \t TS \t TS-Fim \t T-Fila \r\n");
            for (Tupla tupla : tabela) {
                bw.write(tupla.getId() + "\t" + tupla.getTec() + "\t" + tupla.getTc_i() + "\t" + tupla.getTs_inicio() + "\t\t" + tupla.getTs() + "\t" + tupla.getTs_fim() + "\t\t" + tupla.getT_fila() + "\r\n");
            }
            
            bw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Simulação concluida com sucesso!\nRelatorio gerado em: \n" + System.getProperty("user.dir"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório");
            ex.printStackTrace();
        }
    }
}
