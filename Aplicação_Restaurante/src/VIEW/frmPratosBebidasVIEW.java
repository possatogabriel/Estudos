package VIEW;

import DAO.BebidasDAO;
import DAO.PratosDAO;
import DTO.BebidasDTO;
import DTO.PratosDTO;

/**
 *
 * @author Gabriel Possato
 */
public class frmPratosBebidasVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmPratosBebidasVIEW
     */
    public frmPratosBebidasVIEW() {
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

        TÍTULO = new javax.swing.JLabel();
        PRATO = new javax.swing.JLabel();
        jtxNome_Pratos = new javax.swing.JTextField();
        DESCRIÇÃO_PRATO = new javax.swing.JLabel();
        jtxDescrição_Pratos = new javax.swing.JTextField();
        VALOR_PRATO = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnEnviar_Pratos = new javax.swing.JButton();
        btnLimpar_Pratos = new javax.swing.JButton();
        jtxValor_Pratos = new javax.swing.JFormattedTextField();
        jtxValor_Bebidas = new javax.swing.JFormattedTextField();
        TÍTULO1 = new javax.swing.JLabel();
        BEBIDA = new javax.swing.JLabel();
        jtxNome_Bebidas = new javax.swing.JTextField();
        DESCRIÇÃO_BEBIDA = new javax.swing.JLabel();
        jtxDescrição_Bebidas = new javax.swing.JTextField();
        VALOR_BEBIDA = new javax.swing.JLabel();
        btnEnviar_Bebidas = new javax.swing.JButton();
        btnLimpar_Bebidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Pratos");
        TÍTULO.setOpaque(true);

        PRATO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        PRATO.setText("Nome do prato:");

        jtxNome_Pratos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxNome_Pratos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxNome_Pratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNome_PratosActionPerformed(evt);
            }
        });

        DESCRIÇÃO_PRATO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        DESCRIÇÃO_PRATO.setText("Descrição do prato:");

        jtxDescrição_Pratos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxDescrição_Pratos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxDescrição_Pratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDescrição_PratosActionPerformed(evt);
            }
        });

        VALOR_PRATO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        VALOR_PRATO.setText("Valor:");

        btnVoltar.setBackground(new java.awt.Color(0, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEnviar_Pratos.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Pratos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Pratos.setText("ENVIAR");
        btnEnviar_Pratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_PratosActionPerformed(evt);
            }
        });

        btnLimpar_Pratos.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar_Pratos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar_Pratos.setText("LIMPAR");
        btnLimpar_Pratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_PratosActionPerformed(evt);
            }
        });

        try {
            jtxValor_Pratos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ###,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxValor_Pratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxValor_PratosActionPerformed(evt);
            }
        });

        try {
            jtxValor_Bebidas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxValor_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxValor_BebidasActionPerformed(evt);
            }
        });

        TÍTULO1.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO1.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO1.setText("Bebidas");
        TÍTULO1.setOpaque(true);

        BEBIDA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        BEBIDA.setText("Nome da bebida:");

        jtxNome_Bebidas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxNome_Bebidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxNome_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNome_BebidasActionPerformed(evt);
            }
        });

        DESCRIÇÃO_BEBIDA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        DESCRIÇÃO_BEBIDA.setText("Descrição da bebida:");

        jtxDescrição_Bebidas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxDescrição_Bebidas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxDescrição_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDescrição_BebidasActionPerformed(evt);
            }
        });

        VALOR_BEBIDA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        VALOR_BEBIDA.setText("Valor:");

        btnEnviar_Bebidas.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Bebidas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Bebidas.setText("ENVIAR");
        btnEnviar_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_BebidasActionPerformed(evt);
            }
        });

        btnLimpar_Bebidas.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar_Bebidas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar_Bebidas.setText("LIMPAR");
        btnLimpar_Bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_BebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TÍTULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TÍTULO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEnviar_Pratos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpar_Pratos))
                                    .addComponent(PRATO)
                                    .addComponent(DESCRIÇÃO_PRATO)
                                    .addComponent(VALOR_PRATO))
                                .addGap(0, 211, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxNome_Pratos, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(jtxDescrição_Pratos, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jtxValor_Pratos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BEBIDA)
                                    .addComponent(DESCRIÇÃO_BEBIDA)
                                    .addComponent(VALOR_BEBIDA)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEnviar_Bebidas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpar_Bebidas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVoltar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxNome_Bebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(jtxDescrição_Bebidas, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(jtxValor_Bebidas))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PRATO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxNome_Pratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DESCRIÇÃO_PRATO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxDescrição_Pratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VALOR_PRATO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxValor_Pratos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar_Pratos)
                    .addComponent(btnLimpar_Pratos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TÍTULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BEBIDA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxNome_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DESCRIÇÃO_BEBIDA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxDescrição_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VALOR_BEBIDA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxValor_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar_Bebidas)
                    .addComponent(btnLimpar_Bebidas)
                    .addComponent(btnVoltar))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxNome_PratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNome_PratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNome_PratosActionPerformed

    private void jtxDescrição_PratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDescrição_PratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDescrição_PratosActionPerformed

    private void jtxValor_PratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxValor_PratosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxValor_PratosActionPerformed

    private void jtxValor_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxValor_BebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxValor_BebidasActionPerformed

    private void jtxNome_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNome_BebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNome_BebidasActionPerformed

    private void jtxDescrição_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDescrição_BebidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDescrição_BebidasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
                
        dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimpar_PratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_PratosActionPerformed

        jtxDescrição_Pratos.setText("");
        jtxNome_Pratos.setText("");
        jtxValor_Pratos.setText("");
    }//GEN-LAST:event_btnLimpar_PratosActionPerformed

    private void btnLimpar_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_BebidasActionPerformed
        
        jtxDescrição_Bebidas.setText("");
        jtxNome_Bebidas.setText("");
        jtxValor_Bebidas.setText("");
    }//GEN-LAST:event_btnLimpar_BebidasActionPerformed

    private void btnEnviar_PratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_PratosActionPerformed
        String Nome_PratosVIEW, Descrição_PratosVIEW, Valor_PratosVIEW;
        
        Nome_PratosVIEW = jtxNome_Pratos.getText();
        Descrição_PratosVIEW = jtxDescrição_Pratos.getText();
        Valor_PratosVIEW = jtxValor_Pratos.getText();
        
        PratosDTO objPratosDTO = new PratosDTO();
        
        objPratosDTO.setDescrição_PratosDTO(Descrição_PratosVIEW);
        objPratosDTO.setNome_PratosDTO(Nome_PratosVIEW);
        objPratosDTO.setValor_PratosDTO(Valor_PratosVIEW);
        
        PratosDAO objPratosDAO = new PratosDAO();
        objPratosDAO.cadastrarPrato(objPratosDTO);
    }//GEN-LAST:event_btnEnviar_PratosActionPerformed

    private void btnEnviar_BebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_BebidasActionPerformed
        String Nome_BebidasVIEW, Descrição_BebidasVIEW, Valor_BebidasVIEW;
        
        Nome_BebidasVIEW = jtxNome_Bebidas.getText();
        Descrição_BebidasVIEW = jtxDescrição_Bebidas.getText();
        Valor_BebidasVIEW = jtxValor_Bebidas.getText();
        
        BebidasDTO objBebidasDTO = new BebidasDTO();
        
        objBebidasDTO.setDescrição_BebidasDTO(Descrição_BebidasVIEW);
        objBebidasDTO.setNome_BebidasDTO(Nome_BebidasVIEW);
        objBebidasDTO.setValor_BebidasDTO(Valor_BebidasVIEW);
        
        BebidasDAO objBebidasDAO = new BebidasDAO();
        objBebidasDAO.cadastrarBebida(objBebidasDTO);
    }//GEN-LAST:event_btnEnviar_BebidasActionPerformed

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
            java.util.logging.Logger.getLogger(frmPratosBebidasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPratosBebidasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPratosBebidasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPratosBebidasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPratosBebidasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BEBIDA;
    private javax.swing.JLabel DESCRIÇÃO_BEBIDA;
    private javax.swing.JLabel DESCRIÇÃO_PRATO;
    private javax.swing.JLabel PRATO;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JLabel TÍTULO1;
    private javax.swing.JLabel VALOR_BEBIDA;
    private javax.swing.JLabel VALOR_PRATO;
    private javax.swing.JButton btnEnviar_Bebidas;
    private javax.swing.JButton btnEnviar_Pratos;
    private javax.swing.JButton btnLimpar_Bebidas;
    private javax.swing.JButton btnLimpar_Pratos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField jtxDescrição_Bebidas;
    private javax.swing.JTextField jtxDescrição_Pratos;
    private javax.swing.JTextField jtxNome_Bebidas;
    private javax.swing.JTextField jtxNome_Pratos;
    private javax.swing.JFormattedTextField jtxValor_Bebidas;
    private javax.swing.JFormattedTextField jtxValor_Pratos;
    // End of variables declaration//GEN-END:variables
}
