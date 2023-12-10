/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FuzzySystem;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ChartFrame;

/**
 *
 * @author Reapy
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPaneA = new javax.swing.JScrollPane();
        jTableA = new javax.swing.JTable();
        jButtonA = new javax.swing.JButton();
        jLabelA1 = new javax.swing.JLabel();
        jTextFieldA1 = new javax.swing.JTextField();
        jLabelA2 = new javax.swing.JLabel();
        jTextFieldA2 = new javax.swing.JTextField();
        jLabelA3 = new javax.swing.JLabel();
        jTextFieldA3 = new javax.swing.JTextField();
        jLabelA = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPaneB = new javax.swing.JScrollPane();
        jTableB = new javax.swing.JTable();
        jButtonB = new javax.swing.JButton();
        jLabelB1 = new javax.swing.JLabel();
        jTextFieldB1 = new javax.swing.JTextField();
        jLabelB2 = new javax.swing.JLabel();
        jTextFieldB2 = new javax.swing.JTextField();
        jLabelB3 = new javax.swing.JLabel();
        jTextFieldB3 = new javax.swing.JTextField();
        jLabelB = new javax.swing.JLabel();
        jTextFieldB = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPaneB1 = new javax.swing.JScrollPane();
        jTableC = new javax.swing.JTable();
        jButtonC = new javax.swing.JButton();
        jLabelC1 = new javax.swing.JLabel();
        jTextFieldC1 = new javax.swing.JTextField();
        jLabelC2 = new javax.swing.JLabel();
        jTextFieldC2 = new javax.swing.JTextField();
        jLabelC3 = new javax.swing.JLabel();
        jTextFieldC3 = new javax.swing.JTextField();
        jLabelC = new javax.swing.JLabel();
        jTextFieldC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "0", "0"},
                {"1", "1", "0", "0"},
                {"2", "1", "0", "0"},
                {"3", "1", ".2", "0"},
                {"4", ".5", ".5", "0"},
                {"5", "0", "1", ".2"},
                {"6", "0", ".5", ".5"},
                {"7", "0", ".2", "1"},
                {"8", "0", "0", "1"},
                {"9", "0", "0", "1"},
                {"10", "0", "0", "1"}
            },
            new String [] {
                "", "A1", "A2", "A3"
            }
        ));
        jTableA.setShowGrid(true);
        jScrollPaneA.setViewportView(jTableA);

        jButtonA.setText("Set A Line Graph");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jLabelA1.setText("A1 Name:");

        jTextFieldA1.setText("inadequate");

        jLabelA2.setText("A2 Name:");

        jTextFieldA2.setText("marginal");
        jTextFieldA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldA2ActionPerformed(evt);
            }
        });

        jLabelA3.setText("A3 Name:");

        jTextFieldA3.setText("adequate");

        jLabelA.setText("Set A Name:");

        jTextFieldA.setText("project_funding");
        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneA, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabelA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldA, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelA2)
                                    .addComponent(jLabelA1)
                                    .addComponent(jLabelA3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldA1)
                                    .addComponent(jTextFieldA2)
                                    .addComponent(jTextFieldA3)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButtonA)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelA)
                            .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelA1)
                            .addComponent(jTextFieldA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelA2)
                            .addComponent(jTextFieldA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelA3)
                            .addComponent(jTextFieldA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPaneA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonA)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Set A", jPanel1);

        jTableB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "0", "0"},
                {"1", "1", "0", "0"},
                {"2", "1", "0", "0"},
                {"3", ".7", "0", "0"},
                {"4", ".5", ".2", "0"},
                {"5", ".3", ".3", "0"},
                {"6", ".2", ".5", "0"},
                {"7", "0", ".7", "0"},
                {"8", "0", "1", "0"},
                {"9", "0", "1", "0"},
                {"10", "0", "1", "0"}
            },
            new String [] {
                "", "B1", "B2", "B3"
            }
        ));
        jTableB.setShowGrid(true);
        jScrollPaneB.setViewportView(jTableB);

        jButtonB.setText("Set B Line Graph");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        jLabelB1.setText("B1 Name:");

        jTextFieldB1.setText("small");

        jLabelB2.setText("B2 Name:");

        jTextFieldB2.setText("large");
        jTextFieldB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldB2ActionPerformed(evt);
            }
        });

        jLabelB3.setText("B3 Name:");

        jLabelB.setText("Set B Name:");

        jTextFieldB.setText("project_staffing");
        jTextFieldB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneB, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabelB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldB, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelB2)
                                    .addComponent(jLabelB1)
                                    .addComponent(jLabelB3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldB1)
                                    .addComponent(jTextFieldB2)
                                    .addComponent(jTextFieldB3)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButtonB)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelB)
                            .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelB1)
                            .addComponent(jTextFieldB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelB2)
                            .addComponent(jTextFieldB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelB3)
                            .addComponent(jTextFieldB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPaneB, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonB)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Set B", jPanel2);

        jTableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "0", "0"},
                {"1", "1", "0", "0"},
                {"2", "1", ".2", "0"},
                {"3", ".7", ".5", "0"},
                {"4", ".5", ".7", "0"},
                {"5", ".2", "1", ".2"},
                {"6", "0", ".7", ".5"},
                {"7", "0", ".5", ".7"},
                {"8", "0", ".2", "1"},
                {"9", "0", "0", "1"},
                {"10", "0", "0", "1"}
            },
            new String [] {
                "", "C1", "C2", "C3"
            }
        ));
        jTableC.setShowGrid(true);
        jScrollPaneB1.setViewportView(jTableC);

        jButtonC.setText("Set C Line Graph");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jLabelC1.setText("C1 Name:");

        jTextFieldC1.setText("low");

        jLabelC2.setText("C2 Name:");

        jTextFieldC2.setText("normal");
        jTextFieldC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldC2ActionPerformed(evt);
            }
        });

        jLabelC3.setText("C3 Name:");

        jLabelC.setText("Set C Name:");

        jTextFieldC.setText("risk");
        jTextFieldC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneB1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabelC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldC, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelC2)
                                    .addComponent(jLabelC1)
                                    .addComponent(jLabelC3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldC1)
                                    .addComponent(jTextFieldC2)
                                    .addComponent(jTextFieldC3)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButtonC)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelC)
                            .addComponent(jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelC1)
                            .addComponent(jTextFieldC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelC2)
                            .addComponent(jTextFieldC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelC3)
                            .addComponent(jTextFieldC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPaneB1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonC)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Set C", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCActionPerformed

    private void jTextFieldC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldC2ActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        XYSeries xySeriesC1 = new XYSeries(jTextFieldC1.getText());
        XYSeries xySeriesC2 = new XYSeries(jTextFieldC2.getText());
        XYSeries xySeriesC3 = new XYSeries(jTextFieldC3.getText());

        for (int i = 0; i < jTableC.getRowCount(); i++) {
            float x_axis = Float.parseFloat(jTableC.getModel().getValueAt(i, 0).toString());
            xySeriesC1.add(x_axis, Float.parseFloat(jTableC.getModel().getValueAt(i, 1).toString()));
            xySeriesC2.add(x_axis, Float.parseFloat(jTableC.getModel().getValueAt(i, 2).toString()));
            xySeriesC3.add(x_axis, Float.parseFloat(jTableC.getModel().getValueAt(i, 3).toString()));
        }

        XYSeriesCollection datasetC = new XYSeriesCollection();
        datasetC.addSeries(xySeriesC1);
        datasetC.addSeries(xySeriesC2);
        datasetC.addSeries(xySeriesC3);

        JFreeChart chartC = ChartFactory.createXYLineChart(jTextFieldC.getText(), "", "", datasetC, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frameC = new ChartFrame("line chart", chartC);
        frameC.setVisible(true);
        frameC.setSize(450, 350);
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jTextFieldBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBActionPerformed

    private void jTextFieldB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldB2ActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        XYSeries xySeriesB1 = new XYSeries(jTextFieldB1.getText());
        XYSeries xySeriesB2 = new XYSeries(jTextFieldB2.getText());
        XYSeries xySeriesB3 = new XYSeries(jTextFieldB3.getText());

        for (int i = 0; i < jTableB.getRowCount(); i++) {
            float x_axis = Float.parseFloat(jTableB.getModel().getValueAt(i, 0).toString());
            xySeriesB1.add(x_axis, Float.parseFloat(jTableB.getModel().getValueAt(i, 1).toString()));
            xySeriesB2.add(x_axis, Float.parseFloat(jTableB.getModel().getValueAt(i, 2).toString()));
            xySeriesB3.add(x_axis, Float.parseFloat(jTableB.getModel().getValueAt(i, 3).toString()));
        }

        XYSeriesCollection datasetB = new XYSeriesCollection();
        datasetB.addSeries(xySeriesB1);
        datasetB.addSeries(xySeriesB2);
        datasetB.addSeries(xySeriesB3);

        JFreeChart chartB = ChartFactory.createXYLineChart(jTextFieldB.getText(), "", "", datasetB, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frameB = new ChartFrame("line chart", chartB);
        frameB.setVisible(true);
        frameB.setSize(450, 350);
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jTextFieldA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldA2ActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        XYSeries xySeriesA1 = new XYSeries(jTextFieldA1.getText());
        XYSeries xySeriesA2 = new XYSeries(jTextFieldA2.getText());
        XYSeries xySeriesA3 = new XYSeries(jTextFieldA3.getText());

        for (int i = 0; i < jTableA.getRowCount(); i++) {
            float x_axis = Float.parseFloat(jTableA.getModel().getValueAt(i, 0).toString());
            xySeriesA1.add(x_axis, Float.parseFloat(jTableA.getModel().getValueAt(i, 1).toString()));
            xySeriesA2.add(x_axis, Float.parseFloat(jTableA.getModel().getValueAt(i, 2).toString()));
            xySeriesA3.add(x_axis, Float.parseFloat(jTableA.getModel().getValueAt(i, 3).toString()));
        }

        XYSeriesCollection datasetA = new XYSeriesCollection();
        datasetA.addSeries(xySeriesA1);
        datasetA.addSeries(xySeriesA2);
        datasetA.addSeries(xySeriesA3);

        JFreeChart chartA = ChartFactory.createXYLineChart(jTextFieldA.getText(), "", "", datasetA, PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frameA = new ChartFrame("line chart", chartA);
        frameA.setVisible(true);
        frameA.setSize(450, 350);
    }//GEN-LAST:event_jButtonAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelA1;
    private javax.swing.JLabel jLabelA2;
    private javax.swing.JLabel jLabelA3;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelB1;
    private javax.swing.JLabel jLabelB2;
    private javax.swing.JLabel jLabelB3;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelC1;
    private javax.swing.JLabel jLabelC2;
    private javax.swing.JLabel jLabelC3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPaneA;
    private javax.swing.JScrollPane jScrollPaneB;
    private javax.swing.JScrollPane jScrollPaneB1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableA;
    private javax.swing.JTable jTableB;
    private javax.swing.JTable jTableC;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldA1;
    private javax.swing.JTextField jTextFieldA2;
    private javax.swing.JTextField jTextFieldA3;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldB1;
    private javax.swing.JTextField jTextFieldB2;
    private javax.swing.JTextField jTextFieldB3;
    private javax.swing.JTextField jTextFieldC;
    private javax.swing.JTextField jTextFieldC1;
    private javax.swing.JTextField jTextFieldC2;
    private javax.swing.JTextField jTextFieldC3;
    // End of variables declaration//GEN-END:variables
}
