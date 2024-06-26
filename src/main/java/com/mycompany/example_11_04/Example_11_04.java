package com.mycompany.example_11_04;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author KIP-I-A
 */
public class Example_11_04 extends javax.swing.JFrame {

    /**
     * Creates new form Example_11_04
     */
    ArrayList<Train> trainArrayList;
    private int currentInd;
    public Example_11_04() {
        initComponents();
        trainArrayList = new ArrayList<Train>();
        currentInd = trainArrayList.size() -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jLabelHour = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jButtonNewTrain = new javax.swing.JButton();
        jButtonDeleteTrain = new javax.swing.JButton();
        jLabelTitleTime = new javax.swing.JLabel();
        jSpinnerCrn = new javax.swing.JSpinner();
        jButtonPlus_5_sec = new javax.swing.JButton();
        jButtonCalcTimeSeconds = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextNumbTrain = new javax.swing.JTextField();
        jLabelNumbTrain = new javax.swing.JLabel();
        jTextDirectTrain = new javax.swing.JTextField();
        jLabelDirect = new javax.swing.JLabel();
        jLabelTrainDepartureTime = new javax.swing.JLabel();
        jTextFieldHourDepartTrain = new javax.swing.JTextField();
        jTextFieldMinDepartTrain = new javax.swing.JTextField();
        jLabelDepartHour = new javax.swing.JLabel();
        jLabelDepartMin = new javax.swing.JLabel();
        jLabelDepartureTime = new javax.swing.JLabel();
        jTextFieldMinutesBeforeTrainDeparts = new javax.swing.JTextField();
        jLabelDepart = new javax.swing.JLabel();
        jButtonCalcDeparTime = new javax.swing.JButton();
        jTextFieldTimeHour = new javax.swing.JTextField();
        jTextFieldTimeMin = new javax.swing.JTextField();
        jTextFieldTimeSec = new javax.swing.JTextField();
        jTextFieldCount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Example_11_04");

        jLabelHour.setText("Часы");

        jLabelMin.setText("Минуты");

        jLabelSec.setText("Секунды");

        jButtonNewTrain.setText("New");
        jButtonNewTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewTrainActionPerformed(evt);
            }
        });

        jButtonDeleteTrain.setText("Delete");
        jButtonDeleteTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTrainActionPerformed(evt);
            }
        });

        jLabelTitleTime.setFont(new java.awt.Font("GOST type B", 0, 14)); // NOI18N
        jLabelTitleTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleTime.setText("Перевод времени в секунды");

        jSpinnerCrn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCrnStateChanged(evt);
            }
        });

        jButtonPlus_5_sec.setText("+5 секунд");
        jButtonPlus_5_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlus_5_secActionPerformed(evt);
            }
        });

        jButtonCalcTimeSeconds.setText("Расчет");
        jButtonCalcTimeSeconds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcTimeSecondsActionPerformed(evt);
            }
        });

        jLabelNumbTrain.setText("Номер поезда");

        jLabelDirect.setText("Направление");

        jLabelTrainDepartureTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTrainDepartureTime.setText("Время отправления поезда");

        jTextFieldHourDepartTrain.setToolTipText("");

        jLabelDepartHour.setText("Часы");

        jLabelDepartMin.setText("Минуты");

        jLabelDepartureTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDepartureTime.setText("Расчет времени до отправления поезда");

        jLabelDepart.setText("До отправления");

        jButtonCalcDeparTime.setText("Расчет времени до отправления");
        jButtonCalcDeparTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcDeparTimeActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Выбор ячейки");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Текущая ячейка");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitleTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNumbTrain)
                                    .addComponent(jLabelDirect))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextDirectTrain, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jTextNumbTrain)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDepartHour)
                                    .addComponent(jLabelDepartMin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldMinDepartTrain, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(jTextFieldHourDepartTrain)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelDepart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMinutesBeforeTrainDeparts, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButtonCalcDeparTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTrainDepartureTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDepartureTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelMin)
                            .addComponent(jLabelHour)
                            .addComponent(jLabelSec)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerCrn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCalcTimeSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldTimeSec, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTimeMin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonNewTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDeleteTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldTimeHour, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jButtonPlus_5_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitleTime)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHour)
                    .addComponent(jTextFieldTimeHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTimeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTimeSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSec))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewTrain)
                    .addComponent(jButtonDeleteTrain)
                    .addComponent(jSpinnerCrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPlus_5_sec)
                    .addComponent(jButtonCalcTimeSeconds)
                    .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNumbTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumbTrain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDirectTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDirect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTrainDepartureTime)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHourDepartTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDepartHour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMinDepartTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDepartMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMinutesBeforeTrainDeparts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDepart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCalcDeparTime)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewTrainActionPerformed
        // TODO add your handling code here:
        setTrain();
        trainArrayList.add(new Train());
        currentInd = trainArrayList.size()-1;
        getTrain();
        jTextFieldCount.setText("" + (currentInd + 1));
        jSpinnerCrn.setValue(currentInd);
    }//GEN-LAST:event_jButtonNewTrainActionPerformed

    private void jButtonDeleteTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTrainActionPerformed
        // TODO add your handling code here:
        trainArrayList.remove(currentInd);
        currentInd = trainArrayList.size()-1;
        if (currentInd == trainArrayList.size()) {
            currentInd--;
            jSpinnerCrn.setValue(currentInd);
        } else {
            getTrain();
        }
        jTextFieldCount.setText("" + trainArrayList.size());
    }//GEN-LAST:event_jButtonDeleteTrainActionPerformed

    private void jSpinnerCrnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCrnStateChanged
        // TODO add your handling code here:
        setTrain();
        currentInd = (int) jSpinnerCrn.getValue();
        if (currentInd > trainArrayList.size() - 1) {
            currentInd = trainArrayList.size() - 1;
            jSpinnerCrn.setValue(currentInd);
        } else if (currentInd < 0) {
            currentInd = 0;
            jSpinnerCrn.setValue(currentInd);
        }
        getTrain();
    }//GEN-LAST:event_jSpinnerCrnStateChanged

    private void jButtonCalcTimeSecondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcTimeSecondsActionPerformed
        // TODO add your handling code here:
        setTrain();
        for (int i = 0; i < trainArrayList.size(); i++) {
            trainArrayList.get(i).sumTimeSecond();
            trainArrayList.get(i).calculateMinutesToDeparture();
            
        }
        getTrain();
    }//GEN-LAST:event_jButtonCalcTimeSecondsActionPerformed

    private void jButtonPlus_5_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlus_5_secActionPerformed
        // TODO add your handling code here:
        setTrain();
        for (int i = 0; i < trainArrayList.size(); i++) {
            trainArrayList.get(i).sumFiveSecond();
        }
    }//GEN-LAST:event_jButtonPlus_5_secActionPerformed

    private void jButtonCalcDeparTimeActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
        setTrain();
        for (int i = 0; i < trainArrayList.size(); i++) {

        }
    }                                                      

    //  метод копирования данных из обьекта в текстовые поля формы
    protected void getTrain() {
        if (currentInd >= 0) {
            jTextFieldTimeHour.setText("" + trainArrayList.get(currentInd).hour);
            jTextFieldTimeMin.setText("" + trainArrayList.get(currentInd).min);
            jTextFieldTimeSec.setText("" + trainArrayList.get(currentInd).sec);
            jTextNumbTrain.setText("" + trainArrayList.get(currentInd).trainNumber);
            jTextDirectTrain.setText(trainArrayList.get(currentInd).directionTrain);
            jTextFieldHourDepartTrain.setText("" + trainArrayList.get(currentInd).departureHour);
            jTextFieldMinDepartTrain.setText("" + trainArrayList.get(currentInd).departureMin);
            jTextFieldMinutesBeforeTrainDeparts.setText(trainArrayList.get(currentInd).minutesBeforeTrainDeparts + " Минут");
        }
    }
    //  метод записи в поля обьекта данные из текстовых полей формы
    protected void setTrain() {
        if ((currentInd >= 0) && ((jTextFieldTimeHour.getText() != null) && (jTextFieldTimeMin.getText() != null))) {
            trainArrayList.get(currentInd).hour = Integer.parseInt(jTextFieldTimeHour.getText());
            trainArrayList.get(currentInd).min = Integer.parseInt(jTextFieldTimeMin.getText());
            trainArrayList.get(currentInd).sec = Integer.parseInt(jTextFieldTimeSec.getText());
            trainArrayList.get(currentInd).trainNumber = Integer.parseInt(jTextNumbTrain.getText());
            trainArrayList.get(currentInd).directionTrain = jTextDirectTrain.getText();
            trainArrayList.get(currentInd).departureHour = Integer.parseInt(jTextFieldHourDepartTrain.getText());
            trainArrayList.get(currentInd).departureMin = Integer.parseInt(jTextFieldMinDepartTrain.getText());
            try {
                trainArrayList.get(currentInd).hour = Integer.parseInt(jTextFieldTimeHour.getText());
                trainArrayList.get(currentInd).min = Integer.parseInt(jTextFieldTimeMin.getText());
                trainArrayList.get(currentInd).sec = Integer.parseInt(jTextFieldTimeSec.getText());
            } catch (Exception e) {
                trainArrayList.get(currentInd).sec = 0;
                jTextFieldTimeSec.setText(null);
            }
            try {
                trainArrayList.get(currentInd).directionTrain = jTextDirectTrain.getText();
            } catch (Exception e) {
                trainArrayList.get(currentInd).trainNumber = 0;
                jTextNumbTrain.setText(null);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Example_11_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Example_11_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Example_11_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Example_11_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Example_11_04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcDeparTime;
    private javax.swing.JButton jButtonCalcTimeSeconds;
    private javax.swing.JButton jButtonDeleteTrain;
    private javax.swing.JButton jButtonNewTrain;
    private javax.swing.JButton jButtonPlus_5_sec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDepart;
    private javax.swing.JLabel jLabelDepartHour;
    private javax.swing.JLabel jLabelDepartMin;
    private javax.swing.JLabel jLabelDepartureTime;
    private javax.swing.JLabel jLabelDirect;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelNumbTrain;
    private javax.swing.JLabel jLabelSec;
    private javax.swing.JLabel jLabelTitleTime;
    private javax.swing.JLabel jLabelTrainDepartureTime;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerCrn;
    private javax.swing.JTextField jTextDirectTrain;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldCount;
    private javax.swing.JTextField jTextFieldHourDepartTrain;
    private javax.swing.JTextField jTextFieldMinDepartTrain;
    private javax.swing.JTextField jTextFieldMinutesBeforeTrainDeparts;
    private javax.swing.JTextField jTextFieldTimeHour;
    private javax.swing.JTextField jTextFieldTimeMin;
    private javax.swing.JTextField jTextFieldTimeSec;
    private javax.swing.JTextField jTextNumbTrain;
    // End of variables declaration//GEN-END:variables
}
