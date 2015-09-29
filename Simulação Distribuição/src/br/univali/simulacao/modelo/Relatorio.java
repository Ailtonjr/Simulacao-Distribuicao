
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
    
    public Relatorio(List<Tupla> tabela) {
        
        try {
            double auxMaiorProcessado = 0;
            double auxMenorProcessado = VALOR_MAX;
            double auxMaiorFila = 0;
            double auxMenorFila = VALOR_MAX;
            double auxMaiorSistemaFilas = 0;
            double auxMenorSistemaFilas = VALOR_MAX;
            System.out.println(auxMenorProcessado);
            
            for (Tupla tupla : tabela) {
                // Mais demorou para ser processado
                if (tupla.getTs() > auxMaiorProcessado) {
                    auxMaiorProcessado = tupla.getTs();
                    maiorTempoProcessado = tupla.getId()+ "\t" + tupla.getTs();
                }
                // Menos demorou para ser processado
                if (tupla.getTs() < auxMenorProcessado) {
                    auxMenorProcessado = tupla.getTs();
                    menorTempoProcessado = tupla.getId()+ "\t" + tupla.getTs();
                }
                
                // Maior tempo em fila
                if (tupla.getT_fila() > auxMaiorFila) {
                    auxMaiorFila = tupla.getT_fila();
                    maiorTempoFila = tupla.getId()+ "\t" + tupla.getT_fila();
                }
                // Menor tempo em fila  
                if (tupla.getT_fila() < auxMenorFila && tupla.getT_fila() > 0) {
                    auxMenorFila = tupla.getT_fila();
                    menorTempoFila = tupla.getId() + "\t" + tupla.getT_fila();
                }
                
                // Maior tempo Sistema filas
                if ((tupla.getTs() + tupla.getT_fila()) > auxMaiorSistemaFilas) {
                    auxMaiorSistemaFilas = tupla.getTs() + tupla.getT_fila();
                    maiorSistemaFilas = tupla.getId() + "\t" + (tupla.getTs() + tupla.getT_fila());
                }
                // Menor tempo Sistema filas
                if ((tupla.getTs() + tupla.getT_fila()) < auxMenorSistemaFilas) {
                    auxMenorSistemaFilas = tupla.getTs() + tupla.getT_fila();
                    menorSistemaFilas = tupla.getId() + "\t" + (tupla.getTs() + tupla.getT_fila());
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
            else    permanencia = "" + dividendoPermanencia/divisorPermanencia;
            
            dados.add("Maior tempo para ser processado: " + maiorTempoProcessado);
            dados.add("Menor tempo para ser processado: " + menorTempoProcessado);
            dados.add("Maior tempo em fila: " + maiorTempoFila);
            dados.add("Menor tempo em fila: " + menorTempoFila);
            dados.add("Maior tempo filas + processos: " + maiorSistemaFilas);
            dados.add("Menor tempo filas + processos: " + menorSistemaFilas);
            dados.add("Processo que gerou mais filas: " + "PROCESSO 1");        // M3
            dados.add("Processo que gerou menos filas: " + "PROCESSO 1");       // M3
            dados.add("Tempo medio de permanencia das entidades em fila: " + permanencia);    // M3
            dados.add("Tempo medio de atendimendo das entidades: " + dividendoAtendimento/divisorAtendimento);
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
