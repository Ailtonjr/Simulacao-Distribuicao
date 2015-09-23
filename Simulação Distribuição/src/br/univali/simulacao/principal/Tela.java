/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.simulacao.principal;

import br.univali.simulacao.controle.Montador;
import javax.swing.JOptionPane;

/**
 *
 * @author Ailton Jr
 */
public class Tela extends javax.swing.JFrame {


    Montador montador;
    
    public Tela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_tempoSimulacao = new javax.swing.JLabel();
        spinner_tempoSimulacao = new javax.swing.JSpinner();

        label_media.setText("μ:");

        spinner_media.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

        spinner_desvioPadrao.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

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

        spinner_uniformeA.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

        spinner_uniformeB.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

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

        spinner_triangularA.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

        spinner_triangularB.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

        label_tringularB.setText("B:");

        spinner_triangularC.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

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
                .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tringularA)
                    .addComponent(spinner_triangularA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_tringularB)
                        .addComponent(spinner_triangularB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_triangularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_tringularC)
                            .addComponent(spinner_triangularC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_exponencialLambda.setText("λ:");

        spinner_exponencialLambda.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

        spinner_exponencialLimite.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

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

        comboBox_tempoSistema.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Segundo", "Minisegundo", "Microsegundo", "Nanosegundo" }));

        label_tempoSistema.setText("Unidade de Tempo do Sistema");

        comboBox_tempoRelatorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Segundo", "Minisegundo", "Microsegundo", "Nanosegundo" }));

        label_tempoRelatorio.setText("Unidade de Tempo do Relatório");

        button_simulação.setText("Iniciar Simulação");
        button_simulação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simulaçãoActionPerformed(evt);
            }
        });

        desktopPane_simulacao.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        desktopPane_simulacao.add(jPanel1);
        jPanel1.setBounds(140, 50, 125, 124);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        desktopPane_simulacao.add(jPanel3);
        jPanel3.setBounds(72, 80, 40, 73);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane_simulacao.add(jPanel4);
        jPanel4.setBounds(180, 200, 25, 25);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        desktopPane_simulacao.add(jPanel5);
        jPanel5.setBounds(150, 200, 25, 25);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane_simulacao.add(jPanel6);
        jPanel6.setBounds(210, 200, 25, 25);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        desktopPane_simulacao.add(jPanel7);
        jPanel7.setBounds(240, 200, 25, 25);

        jSeparator1.setEnabled(false);
        desktopPane_simulacao.add(jSeparator1);
        jSeparator1.setBounds(270, 110, 50, 10);
        desktopPane_simulacao.add(jSeparator2);
        jSeparator2.setBounds(270, 210, 50, 10);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        desktopPane_simulacao.add(jSeparator3);
        jSeparator3.setBounds(320, 110, 10, 100);
        desktopPane_simulacao.add(jSeparator4);
        jSeparator4.setBounds(110, 120, 30, 10);

        jLabel1.setText("Fila");
        desktopPane_simulacao.add(jLabel1);
        jLabel1.setBounds(200, 180, 20, 10);

        jLabel2.setText("IMG");
        desktopPane_simulacao.add(jLabel2);
        jLabel2.setBounds(80, 60, 30, 20);

        jLabel3.setText("Processamento");
        desktopPane_simulacao.add(jLabel3);
        jLabel3.setBounds(160, 30, 110, 20);

        label_tempoSimulacao.setText("Tempo da simulação");

        spinner_tempoSimulacao.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(0.1f)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_tempoSimulacao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(desktopPane_simulacao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label_TEC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_tempoSistema, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox_tempoSistema, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBox_TEC, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_TS)
                                    .addComponent(label_tempoRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBox_TS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBox_tempoRelatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spinner_tempoSimulacao)
                                .addGap(264, 264, 264))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button_simulação)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                .addGap(16, 16, 16)
                .addComponent(button_simulação)
                .addGap(18, 18, 18)
                .addComponent(desktopPane_simulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_simulaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simulaçãoActionPerformed
        verificaOpcoesEscolhidas();
    }//GEN-LAST:event_button_simulaçãoActionPerformed

    private void comboBox_TECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_TECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_TECActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_simulação;
    private javax.swing.JComboBox comboBox_TEC;
    private javax.swing.JComboBox comboBox_TS;
    private javax.swing.JComboBox comboBox_tempoRelatorio;
    private javax.swing.JComboBox comboBox_tempoSistema;
    private javax.swing.JDesktopPane desktopPane_simulacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_TEC;
    private javax.swing.JLabel label_TS;
    private javax.swing.JLabel label_desvioPadrao;
    private javax.swing.JLabel label_exponencialLambda;
    private javax.swing.JLabel label_limite;
    private javax.swing.JLabel label_media;
    private javax.swing.JLabel label_tempoRelatorio;
    private javax.swing.JLabel label_tempoSimulacao;
    private javax.swing.JLabel label_tempoSistema;
    private javax.swing.JLabel label_tringularA;
    private javax.swing.JLabel label_tringularB;
    private javax.swing.JLabel label_tringularC;
    private javax.swing.JLabel label_uniformeA;
    private javax.swing.JLabel label_uniformeB;
    private javax.swing.JPanel panel_exponencial;
    private javax.swing.JPanel panel_normal;
    private javax.swing.JPanel panel_triangular;
    private javax.swing.JPanel panel_uniforme;
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

    private void verificaOpcoesEscolhidas() {
        String tec = comboBox_TEC.getSelectedItem().toString();
        String ts = comboBox_TS.getSelectedItem().toString();

        if (tec.equalsIgnoreCase("Normal")) {
            if (ts.equalsIgnoreCase("Normal")) {
                
                normalNormal("TEC", "TS");
                
            } else if (ts.equalsIgnoreCase("Exponencial")) {
                
                normalExponencial("TEC", "TS");
                
            } else if (ts.equalsIgnoreCase("Uniforme")) {
                
                normalUniforme("TEC", "TS");
                
            } else if (ts.equalsIgnoreCase("Triangular")) {
                
                normalTriangular("TEC", "TS");
                
            }
        } else if (tec.equalsIgnoreCase("Exponencial")) {
            if (ts.equalsIgnoreCase("Normal")) {
                
                normalExponencial("TS", "TEC");
                
            } else if (ts.equalsIgnoreCase("Exponencial")) {
                System.out.println(tec + " " + ts);
            } else if (ts.equalsIgnoreCase("Uniforme")) {
                System.out.println(tec + " " + ts);
            } else if (ts.equalsIgnoreCase("Triangular")) {
                System.out.println(tec + " " + ts);
            }
        } else if (tec.equalsIgnoreCase("Uniforme")) {
            if (ts.equalsIgnoreCase("Normal")) {
                
                normalUniforme("TS", "TEC");
                
            } else if (ts.equalsIgnoreCase("Exponencial")) {
                System.out.println(tec + " " + ts);
            } else if (ts.equalsIgnoreCase("Uniforme")) {
                System.out.println(tec + " " + ts);
            } else if (ts.equalsIgnoreCase("Triangular")) {
                System.out.println(tec + " " + ts);
            }
        } else if (tec.equalsIgnoreCase("Triangular")) {
            if (ts.equalsIgnoreCase("Normal")) {
                
                normalTriangular("TS", "TEC");
                
            } else if (ts.equalsIgnoreCase("Exponencial")) {
                System.out.println(tec + " " + ts);
            } else if (ts.equalsIgnoreCase("Uniforme")) {
                System.out.println(tec + " " + ts);
            } else if (ts.equalsIgnoreCase("Triangular")) {
                System.out.println(tec + " " + ts);
            }
        }
    }

    private void normalNormal(String coluna1, String coluna2) {
        float normalMedia1 = 0, normalDesvioPadrao1 = 0, 
                normalMedia2 = 0, normalDesvioPadrao2 = 0;
        
        int resultNormal = JOptionPane.showConfirmDialog(null, panel_normal,
                coluna1 + " - Distribuição Normal", JOptionPane.OK_CANCEL_OPTION);
        if (resultNormal == JOptionPane.OK_OPTION) {
            normalMedia1 = (float) spinner_media.getValue();
            normalDesvioPadrao1 = (float) spinner_desvioPadrao.getValue();
            
            System.out.println("\nμ: " + normalMedia1);
            System.out.println("σ: " + normalDesvioPadrao1);
        }
        int resultExponencial = JOptionPane.showConfirmDialog(null, panel_normal,
                coluna2 + " - Distribuição Normal", JOptionPane.OK_CANCEL_OPTION);
        if (resultExponencial == JOptionPane.OK_OPTION) {
            normalMedia2 = (float) spinner_media.getValue();
            normalDesvioPadrao2 = (float) spinner_desvioPadrao.getValue();
            
            System.out.println("\nμ: " + normalMedia2);
            System.out.println("σ: " + normalDesvioPadrao2);
        }
        
        montador = new Montador(comboBox_TEC.getSelectedItem().toString(), comboBox_TS.getSelectedItem().toString(), normalMedia1, normalDesvioPadrao1, normalMedia2, normalDesvioPadrao2, (float) spinner_tempoSimulacao.getValue());
    }
    
    private void normalUniforme(String coluna1, String coluna2) {
        float normalMedia = 0, normalDesvioPadrao = 0,
                uniformeA = 0, uniformeB = 0;
        
        int resultNormal = JOptionPane.showConfirmDialog(null, panel_normal,
                coluna1 + " - Distribuição Normal", JOptionPane.OK_CANCEL_OPTION);
        if (resultNormal == JOptionPane.OK_OPTION) {
            normalMedia = (float) spinner_media.getValue();
            normalDesvioPadrao = (float) spinner_desvioPadrao.getValue();
            
            System.out.println("\nμ: " + normalMedia);
            System.out.println("σ: " + normalDesvioPadrao);
        }
        int resultExponencial = JOptionPane.showConfirmDialog(null, panel_uniforme,
                coluna2 + " - Distribuição Exponencial", JOptionPane.OK_CANCEL_OPTION);
        if (resultExponencial == JOptionPane.OK_OPTION) {
            uniformeA = (float) spinner_uniformeA.getValue();
            uniformeB = (float) spinner_uniformeB.getValue();
            
            System.out.println("a: " + uniformeA);
            System.out.println("b: " + uniformeB);
        }
        
        montador = new Montador(comboBox_TEC.getSelectedItem().toString(), comboBox_TS.getSelectedItem().toString(), normalMedia, normalDesvioPadrao, uniformeA, uniformeB, (float) spinner_tempoSimulacao.getValue());
        montador.exibeTabela();
    }
    
    private void normalTriangular(String coluna1, String coluna2) {
        
        int resultNormal = JOptionPane.showConfirmDialog(null, panel_normal,
                coluna1 + " - Distribuição Normal", JOptionPane.OK_CANCEL_OPTION);
        if (resultNormal == JOptionPane.OK_OPTION) {
            System.out.println("μ: " + spinner_media.getValue());
            System.out.println("σ: " + spinner_desvioPadrao.getValue());
        }
        int resultExponencial = JOptionPane.showConfirmDialog(null, panel_triangular,
                coluna2 + " - Distribuição Triangular", JOptionPane.OK_CANCEL_OPTION);
        if (resultExponencial == JOptionPane.OK_OPTION) {
            System.out.println("a: " + spinner_triangularA.getValue());
            System.out.println("b: " + spinner_triangularB.getValue());
            System.out.println("C: " + spinner_triangularC.getValue());
        }
    }
    
    private void normalExponencial(String coluna1, String coluna2) {
        
        int resultNormal = JOptionPane.showConfirmDialog(null, panel_normal,
                coluna1 + " - Distribuição Normal", JOptionPane.OK_CANCEL_OPTION);
        if (resultNormal == JOptionPane.OK_OPTION) {
            System.out.println("μ: " + spinner_media.getValue());
            System.out.println("σ: " + spinner_desvioPadrao.getValue());
        }
        int resultExponencial = JOptionPane.showConfirmDialog(null, panel_exponencial,
                coluna2 + " - Distribuição Exponencial", JOptionPane.OK_CANCEL_OPTION);
        if (resultExponencial == JOptionPane.OK_OPTION) {
            System.out.println("a: " + spinner_exponencialLambda.getValue());
            System.out.println("b: " + spinner_exponencialLimite.getValue());
        }
    }
}
