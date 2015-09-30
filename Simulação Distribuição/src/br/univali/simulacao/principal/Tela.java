package br.univali.simulacao.principal;

import br.univali.simulacao.modelo.Conversor;
import br.univali.simulacao.modelo.Relatorio;
import br.univali.simulacao.modelo.Tupla;
import br.univali.simulacao.modelo.distribuicoes.Distribuicao;
import br.univali.simulacao.modelo.distribuicoes.Exponencial;
import br.univali.simulacao.modelo.distribuicoes.Normal;
import br.univali.simulacao.modelo.distribuicoes.Triangular;
import br.univali.simulacao.modelo.distribuicoes.Uniforme;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Tela extends javax.swing.JFrame {

    List<Tupla> tuplas;
    List<Double> entidades;
    LinkedHashSet<Tupla> entidadesFila;
    int contTeste = 0;

    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_normal = new javax.swing.JPanel();
        label_media = new javax.swing.JLabel();
        spinner_media = new javax.swing.JSpinner();
        spinner_desvioPadrao = new javax.swing.JSpinner();
        label_desvioPadrao = new javax.swing.JLabel();
        panel_uniforme = new javax.swing.JPanel();
        label_uniformeA = new javax.swing.JLabel();
        spinner_uniformeA = new javax.swing.JSpinner();
        spinner_uniformeB = new javax.swing.JSpinner();
        label_uniformeB = new javax.swing.JLabel();
        panel_triangular = new javax.swing.JPanel();
        label_tringularA = new javax.swing.JLabel();
        spinner_triangularA = new javax.swing.JSpinner();
        spinner_triangularB = new javax.swing.JSpinner();
        label_tringularB = new javax.swing.JLabel();
        spinner_triangularC = new javax.swing.JSpinner();
        label_tringularC = new javax.swing.JLabel();
        panel_exponencial = new javax.swing.JPanel();
        label_exponencialLambda = new javax.swing.JLabel();
        spinner_exponencialLambda = new javax.swing.JSpinner();
        spinner_exponencialLimite = new javax.swing.JSpinner();
        label_limite = new javax.swing.JLabel();
        comboBox_TEC = new javax.swing.JComboBox();
        label_TEC = new javax.swing.JLabel();
        label_TS = new javax.swing.JLabel();
        comboBox_TS = new javax.swing.JComboBox();
        comboBox_tempoSistema = new javax.swing.JComboBox();
        label_tempoSistema = new javax.swing.JLabel();
        comboBox_tempoRelatorio = new javax.swing.JComboBox();
        label_tempoRelatorio = new javax.swing.JLabel();
        button_simulação = new javax.swing.JButton();
        desktopPane_simulacao = new javax.swing.JDesktopPane();
        panel_processador = new javax.swing.JPanel();
        label_chegada = new javax.swing.JLabel();
        label_tsi = new javax.swing.JLabel();
        label_tsf = new javax.swing.JLabel();
        separator_entrada = new javax.swing.JSeparator();
        separator_saida = new javax.swing.JSeparator();
        separator_fila = new javax.swing.JSeparator();
        separator_fila2 = new javax.swing.JSeparator();
        label_fila = new javax.swing.JLabel();
        label_processo = new javax.swing.JLabel();
        label_processador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_fila = new javax.swing.JList();
        label_tempo = new javax.swing.JLabel();
        label_saida = new javax.swing.JLabel();
        panel_processo = new javax.swing.JPanel();
        label_pid = new javax.swing.JLabel();
        label_tempoSimulacao = new javax.swing.JLabel();
        spinner_tempoSimulacao = new javax.swing.JSpinner();
        label_simulacao = new javax.swing.JLabel();
        label_termino = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        label_media.setText("μ:");

        spinner_media.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(1.0f)));

        spinner_desvioPadrao.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(1.0f)));

        label_desvioPadrao.setText("σ:");

        javax.swing.GroupLayout panel_normalLayout = new javax.swing.GroupLayout(panel_normal);
        panel_normal.setLayout(panel_normalLayout);
        panel_normalLayout.setHorizontalGroup(
            panel_normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_normalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_media)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_media, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(label_desvioPadrao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_desvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_normalLayout.setVerticalGroup(
            panel_normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_normalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_normalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_media)
                    .addComponent(spinner_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_desvioPadrao)
                    .addComponent(spinner_desvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_uniformeA.setText("a:");

        spinner_uniformeA.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        spinner_uniformeB.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        label_uniformeB.setText("b:");

        javax.swing.GroupLayout panel_uniformeLayout = new javax.swing.GroupLayout(panel_uniforme);
        panel_uniforme.setLayout(panel_uniformeLayout);
        panel_uniformeLayout.setHorizontalGroup(
            panel_uniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_uniformeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_uniformeA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_uniformeA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(label_uniformeB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_uniformeB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_uniformeLayout.setVerticalGroup(
            panel_uniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_uniformeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_uniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_uniformeA)
                    .addComponent(spinner_uniformeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_uniformeB)
                    .addComponent(spinner_uniformeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_tringularA.setText("A:");

        spinner_triangularA.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        spinner_triangularB.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        label_tringularB.setText("B:");

        spinner_triangularC.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        label_tringularC.setText("C:");

        javax.swing.GroupLayout panel_triangularLayout = new javax.swing.GroupLayout(panel_triangular);
        panel_triangular.setLayout(panel_triangularLayout);
        panel_triangularLayout.setHorizontalGroup(
            panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_triangularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tringularA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_triangularA, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_tringularB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_triangularB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_tringularC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_triangularC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel_triangularLayout.setVerticalGroup(
            panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_triangularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_tringularC)
                        .addComponent(spinner_triangularC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_tringularB)
                        .addComponent(spinner_triangularB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_tringularA)
                        .addComponent(spinner_triangularA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_exponencialLambda.setText("λ:");

        spinner_exponencialLambda.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        spinner_exponencialLimite.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(0.1f)));

        label_limite.setText("Limite:");

        javax.swing.GroupLayout panel_exponencialLayout = new javax.swing.GroupLayout(panel_exponencial);
        panel_exponencial.setLayout(panel_exponencialLayout);
        panel_exponencialLayout.setHorizontalGroup(
            panel_exponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_exponencialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_exponencialLambda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_exponencialLambda, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_limite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_exponencialLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_exponencialLayout.setVerticalGroup(
            panel_exponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exponencialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_exponencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_exponencialLambda)
                    .addComponent(spinner_exponencialLambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_limite)
                    .addComponent(spinner_exponencialLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulação");
        setResizable(false);

        comboBox_TEC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Exponencial", "Uniforme", "Triangular" }));
        comboBox_TEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_TECActionPerformed(evt);
            }
        });

        label_TEC.setText("Distribuição TEC");

        label_TS.setText("Distribuição TS");

        comboBox_TS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Exponencial", "Uniforme", "Triangular" }));

        comboBox_tempoSistema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Segundo", "Milisegundo", "Microsegundo", "Nanosegundo" }));

        label_tempoSistema.setText("Unidade de Tempo do Sistema");

        comboBox_tempoRelatorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Segundo", "Milisegundo", "Microsegundo", "Nanosegundo" }));

        label_tempoRelatorio.setText("Unidade de Tempo do Relatório");

        button_simulação.setText("Iniciar Simulação");
        button_simulação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simulaçãoActionPerformed(evt);
            }
        });

        desktopPane_simulacao.setBackground(new java.awt.Color(255, 255, 255));

        panel_processador.setBackground(new java.awt.Color(204, 204, 204));

        label_chegada.setForeground(new java.awt.Color(255, 255, 255));

        label_tsi.setForeground(new java.awt.Color(255, 255, 255));

        label_tsf.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_processadorLayout = new javax.swing.GroupLayout(panel_processador);
        panel_processador.setLayout(panel_processadorLayout);
        panel_processadorLayout.setHorizontalGroup(
            panel_processadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_processadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_processadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_chegada, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(label_tsi, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(label_tsf, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_processadorLayout.setVerticalGroup(
            panel_processadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_processadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_chegada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_tsi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_tsf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        desktopPane_simulacao.add(panel_processador);
        panel_processador.setBounds(130, 50, 125, 123);
        desktopPane_simulacao.add(separator_entrada);
        separator_entrada.setBounds(100, 110, 30, 20);

        separator_saida.setEnabled(false);
        desktopPane_simulacao.add(separator_saida);
        separator_saida.setBounds(240, 70, 70, 10);

        separator_fila.setEnabled(false);
        desktopPane_simulacao.add(separator_fila);
        separator_fila.setBounds(250, 110, 60, 10);

        separator_fila2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        desktopPane_simulacao.add(separator_fila2);
        separator_fila2.setBounds(310, 110, 10, 30);

        label_fila.setText("Fila");
        desktopPane_simulacao.add(label_fila);
        label_fila.setBounds(280, 90, 20, 20);

        label_processo.setText("Entidade");
        desktopPane_simulacao.add(label_processo);
        label_processo.setBounds(50, 60, 60, 20);

        label_processador.setText("Processador");
        desktopPane_simulacao.add(label_processador);
        label_processador.setBounds(160, 30, 80, 20);

        jScrollPane1.setViewportView(list_fila);

        desktopPane_simulacao.add(jScrollPane1);
        jScrollPane1.setBounds(280, 140, 60, 100);
        desktopPane_simulacao.add(label_tempo);
        label_tempo.setBounds(10, 230, 100, 20);

        label_saida.setText("Saida");
        desktopPane_simulacao.add(label_saida);
        label_saida.setBounds(270, 40, 34, 40);

        panel_processo.setBackground(new java.awt.Color(204, 204, 204));

        label_pid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_processoLayout = new javax.swing.GroupLayout(panel_processo);
        panel_processo.setLayout(panel_processoLayout);
        panel_processoLayout.setHorizontalGroup(
            panel_processoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_processoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_pid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_processoLayout.setVerticalGroup(
            panel_processoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_processoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        desktopPane_simulacao.add(panel_processo);
        panel_processo.setBounds(50, 80, 50, 73);

        label_tempoSimulacao.setText("Tempo da simulação");

        spinner_tempoSimulacao.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), null, Float.valueOf(1.0f)));

        label_simulacao.setText("Simulação");

        label_termino.setForeground(new java.awt.Color(51, 153, 0));
        label_termino.setPreferredSize(new java.awt.Dimension(48, 14));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("* em segundos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_simulacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(desktopPane_simulacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spinner_tempoSimulacao)
                                        .addGap(94, 94, 94))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(label_tempoSimulacao)
                                            .addComponent(label_TEC)
                                            .addComponent(label_tempoSistema)
                                            .addComponent(comboBox_TEC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBox_tempoSistema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_TS)
                                    .addComponent(label_tempoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBox_tempoRelatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBox_TS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label_termino, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_simulação)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_TEC)
                    .addComponent(label_TS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBox_TEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_TS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_tempoSistema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_tempoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_tempoRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_tempoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(label_tempoSimulacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinner_tempoSimulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_simulação)
                .addGap(4, 4, 4)
                .addComponent(label_simulacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane_simulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_termino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_simulaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simulaçãoActionPerformed
        label_termino.setText("");
        comboBox_TEC.setEnabled(false);
        comboBox_TS.setEnabled(false);
        comboBox_tempoRelatorio.setEnabled(false);
        comboBox_tempoSistema.setEnabled(false);
        button_simulação.setEnabled(false);
        spinner_tempoSimulacao.setEnabled(false);

        montaTabela((float) spinner_tempoSimulacao.getValue());
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    exibeTela();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        thread.start();

    }//GEN-LAST:event_button_simulaçãoActionPerformed

    private void comboBox_TECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_TECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_TECActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    private void montaTabela(float tempoSimulacao) {
        tuplas = new ArrayList<>();
        int id = 0;
        double tc_i;
        double ts_inicio;
        double ts_fim;
        double t_fila;
        Tupla tuplaAnterior;

        Distribuicao tecDist = verificaOpcoesEscolhidas(comboBox_TEC.getSelectedItem().toString(), "TEC");
        Distribuicao tsDist = verificaOpcoesEscolhidas(comboBox_TS.getSelectedItem().toString(), "TS");

        if (tecDist != null || tsDist != null) {
            while (true) {
                double tec = tecDist.calcula();
                double ts = tsDist.calcula();

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

    private Distribuicao verificaOpcoesEscolhidas(String dist, String coluna) {
        if (dist.equals("Normal")) {
            spinner_media.setValue(0);
            spinner_desvioPadrao.setValue(0);
            int resultNormal = JOptionPane.showConfirmDialog(null, panel_normal,
                    coluna + " - Distribuição Normal", JOptionPane.OK_CANCEL_OPTION);
            if (resultNormal == JOptionPane.OK_OPTION) {
                return new Normal((float) spinner_media.getValue(), (float) spinner_desvioPadrao.getValue());
            }
        } else if (dist.equals("Uniforme")) {
            int resultNormal = JOptionPane.showConfirmDialog(null, panel_uniforme,
                    coluna + " - Distribuição Uniforme", JOptionPane.OK_CANCEL_OPTION);
            if (resultNormal == JOptionPane.OK_OPTION) {
                return new Uniforme((float) spinner_uniformeA.getValue(), (float) spinner_uniformeB.getValue());
            }
        } else if (dist.equals("Triangular")) {
            int resultNormal = JOptionPane.showConfirmDialog(null, panel_triangular,
                    coluna + " - Distribuição Triangular", JOptionPane.OK_CANCEL_OPTION);
            if (resultNormal == JOptionPane.OK_OPTION) {
                return new Triangular((float) spinner_triangularA.getValue(), (float) spinner_triangularB.getValue(), (float) spinner_triangularC.getValue());
            }
        } else if (dist.equals("Exponencial")) {  // Exponencial
            int resultNormal = JOptionPane.showConfirmDialog(null, panel_exponencial,
                    coluna + " - Distribuição Exponencial", JOptionPane.OK_CANCEL_OPTION);
            if (resultNormal == JOptionPane.OK_OPTION) {
                return new Exponencial((float) spinner_exponencialLambda.getValue(), (float) spinner_exponencialLimite.getValue());
            }
        }
        return null;
    }

    private void exibeTela() throws InterruptedException {
        int tempoSimulacao = 0;
        int i = 0;
        Conversor conversor = new Conversor();

        entidades = new ArrayList<>();
        entidadesFila = new LinkedHashSet<>();

        while (tempoSimulacao < (float) spinner_tempoSimulacao.getValue()) {

            if (i < tuplas.size() && tuplas.get(i).getTc_i() == tempoSimulacao) {
                for (Tupla tupla : tuplas) {
                    entidades.add(tupla.getTs_fim());   // Guarda tempo de saida para comparar quando deve sair

                    removeEntidade(tempoSimulacao);
                    while (tempoSimulacao < tupla.getTc_i()) {
                        Thread.currentThread().sleep(350);
                        tempoSimulacao++;
                        label_tempo.setText("Tempo: " + conversor.ConverteValor(
                                tempoSimulacao, comboBox_tempoSistema.getSelectedItem().toString()));
                        removeEntidade(tempoSimulacao);
                    }

                    label_pid.setText("" + tupla.getId());
                    separator_entrada.setForeground(Color.orange);
                    while (tempoSimulacao < tupla.getTs_inicio()) {
                        Thread.currentThread().sleep(350);
                        tempoSimulacao++;
                        label_tempo.setText("Tempo: " + conversor.ConverteValor(
                                tempoSimulacao, comboBox_tempoSistema.getSelectedItem().toString()));
                        removeEntidade(tempoSimulacao);
                    }

                    if (!entidadesFila.isEmpty()) {
                        entidadesFila.remove(tupla);
                        exibeFila();
                        System.out.println(tupla.getId() + " saiu da fila " + tempoSimulacao);
                    }

                    separator_entrada.setForeground(Color.DARK_GRAY);
                    label_chegada.setText("TC-I: " + tupla.getTc_i());
                    label_tsi.setText("TS-I: " + tupla.getTs_inicio());
                    label_tsf.setText("TS-F: " + tupla.getTs_fim());
                    Thread.currentThread().sleep(350);

                    for (Tupla tuplaInterna : tuplas) {            // Tem alguem esperando
                        if (tuplaInterna.getId() > tupla.getId()) {
                            if (tuplaInterna.getTc_i() < tupla.getTs_fim()) {
                                entidadesFila.add(tuplaInterna);     // Guarda
                                separator_fila.setForeground(Color.ORANGE);
                                separator_fila2.setForeground(Color.ORANGE);
                            }
                        }
                    }

                    exibeFila();

                    Thread.currentThread().sleep(350);
                    separator_fila.setForeground(Color.DARK_GRAY);
                    separator_fila2.setForeground(Color.DARK_GRAY);
                    separator_saida.setForeground(Color.DARK_GRAY);

                    tempoSimulacao++;
                    label_tempo.setText("Tempo: " + conversor.ConverteValor(
                            tempoSimulacao, comboBox_tempoSistema.getSelectedItem().toString()));
                    i++;

                }
                Thread.currentThread().sleep(350);
                removeEntidade(tempoSimulacao);
                tempoSimulacao++;
                label_tempo.setText("Tempo: " + conversor.ConverteValor(
                        tempoSimulacao, comboBox_tempoSistema.getSelectedItem().toString()));
            }
            label_pid.setText("");
            label_chegada.setText("");
            label_tsi.setText("");
            label_tsf.setText("");
            removeEntidade(tempoSimulacao);
            while (tempoSimulacao < (float) spinner_tempoSimulacao.getValue()) {
                removeEntidade(tempoSimulacao);
                Thread.currentThread().sleep(500);
                tempoSimulacao++;
                label_tempo.setText("Tempo: " + conversor.ConverteValor(
                        tempoSimulacao, comboBox_tempoSistema.getSelectedItem().toString()));
            }
            comboBox_TEC.setEnabled(true);
            comboBox_TS.setEnabled(true);
            comboBox_tempoRelatorio.setEnabled(true);
            comboBox_tempoSistema.setEnabled(true);
            button_simulação.setEnabled(true);
            spinner_tempoSimulacao.setEnabled(true);
            label_termino.setText("Terminou");
            Relatorio relatorio = new Relatorio(tuplas);
        }
    }

    void exibeFila() {
        DefaultListModel<String> model = new DefaultListModel();
        for (Tupla entidadesFila1 : entidadesFila) {
            model.addElement("PID " + entidadesFila1.getId());
        }
        list_fila.setModel(model);
    }

    void removeEntidade(int tempoSimulacao) {
        if (!entidades.isEmpty() && entidades.get(0) == tempoSimulacao) {     // Verifica se é tempo de sair
            System.out.println("terminou em " + tempoSimulacao);
            entidades.remove(0);
            separator_saida.setForeground(Color.ORANGE);
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
            separator_saida.setForeground(Color.DARK_GRAY);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_simulação;
    private javax.swing.JComboBox comboBox_TEC;
    private javax.swing.JComboBox comboBox_TS;
    private javax.swing.JComboBox comboBox_tempoRelatorio;
    private javax.swing.JComboBox comboBox_tempoSistema;
    private javax.swing.JDesktopPane desktopPane_simulacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_TEC;
    private javax.swing.JLabel label_TS;
    private javax.swing.JLabel label_chegada;
    private javax.swing.JLabel label_desvioPadrao;
    private javax.swing.JLabel label_exponencialLambda;
    private javax.swing.JLabel label_fila;
    private javax.swing.JLabel label_limite;
    private javax.swing.JLabel label_media;
    private javax.swing.JLabel label_pid;
    private javax.swing.JLabel label_processador;
    private javax.swing.JLabel label_processo;
    private javax.swing.JLabel label_saida;
    private javax.swing.JLabel label_simulacao;
    private javax.swing.JLabel label_tempo;
    private javax.swing.JLabel label_tempoRelatorio;
    private javax.swing.JLabel label_tempoSimulacao;
    private javax.swing.JLabel label_tempoSistema;
    private javax.swing.JLabel label_termino;
    private javax.swing.JLabel label_tringularA;
    private javax.swing.JLabel label_tringularB;
    private javax.swing.JLabel label_tringularC;
    private javax.swing.JLabel label_tsf;
    private javax.swing.JLabel label_tsi;
    private javax.swing.JLabel label_uniformeA;
    private javax.swing.JLabel label_uniformeB;
    private javax.swing.JList list_fila;
    private javax.swing.JPanel panel_exponencial;
    private javax.swing.JPanel panel_normal;
    private javax.swing.JPanel panel_processador;
    private javax.swing.JPanel panel_processo;
    private javax.swing.JPanel panel_triangular;
    private javax.swing.JPanel panel_uniforme;
    private javax.swing.JSeparator separator_entrada;
    private javax.swing.JSeparator separator_fila;
    private javax.swing.JSeparator separator_fila2;
    private javax.swing.JSeparator separator_saida;
    private javax.swing.JSpinner spinner_desvioPadrao;
    private javax.swing.JSpinner spinner_exponencialLambda;
    private javax.swing.JSpinner spinner_exponencialLimite;
    private javax.swing.JSpinner spinner_media;
    private javax.swing.JSpinner spinner_tempoSimulacao;
    private javax.swing.JSpinner spinner_triangularA;
    private javax.swing.JSpinner spinner_triangularB;
    private javax.swing.JSpinner spinner_triangularC;
    private javax.swing.JSpinner spinner_uniformeA;
    private javax.swing.JSpinner spinner_uniformeB;
    // End of variables declaration//GEN-END:variables

}
