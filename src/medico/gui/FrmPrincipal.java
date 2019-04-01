/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.gui;

import medico.util.guis;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author celso
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private static UIManager.LookAndFeelInfo aparencia[];

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/medico/imagens/doctor.png")).getImage());

    }

    private void sairSistema() {
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente sair do Sistema?", "Sair do sistema.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    public void SelectLook(int LookId) {
        try {
            javax.swing.UIManager.setLookAndFeel(aparencia[LookId].getClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmFerramentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnPacientes = new javax.swing.JButton();
        btnFerramentas = new javax.swing.JButton();
        btnImpressos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consultório Médico Dr. Paulo Sergio");
        setName("frmPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Funções"));

        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/doctor.png"))); // NOI18N
        btnPacientes.setMnemonic('m');
        btnPacientes.setText("Pacientes");
        btnPacientes.setToolTipText("Cadastro, Alteração e Manutenção de Pacientes Médicos");
        btnPacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        btnFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/Vista (17).png"))); // NOI18N
        btnFerramentas.setMnemonic('a');
        btnFerramentas.setText("Ferramentas");
        btnFerramentas.setToolTipText("Agenda de contatos importantes");
        btnFerramentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerramentasActionPerformed(evt);
            }
        });

        btnImpressos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/Vista (297).png"))); // NOI18N
        btnImpressos.setMnemonic('d');
        btnImpressos.setText("Impressos");
        btnImpressos.setToolTipText("Cadastro, Alteração e Manutenção de Pacientes Odontológicos");
        btnImpressos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImpressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpressosActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/tabela_precos.png"))); // NOI18N
        jButton1.setText("Tabela de Preços");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImpressos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(btnFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFerramentas, btnPacientes, jButton1});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImpressos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFerramentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFerramentas, btnImpressos, btnPacientes, jButton1});

        desktop.setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        if (guis.getiPac() != null) {
            try {
                System.out.println("Janela ja criada Pacientes");
                guis.getiPac().moveToFront();
                guis.getiPac().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiPac(new FrmPacientes());
                this.desktop.add(guis.getiPac());
                guis.getiPac().setMaximum(true);
                guis.getiPac().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerramentasActionPerformed
        if (guis.getiFerr() != null) {
            try {
                System.out.println("Janela ja criada Agenda de Ferramentas");
                guis.getiFerr().moveToFront();
                guis.getiFerr().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiFerr(new FrmFerramentas());
            } catch (IOException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.desktop.add(guis.getiFerr());
            guis.getiFerr().setVisible(true);
            guis.getiFerr().setPosicao();
        }
    }//GEN-LAST:event_btnFerramentasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sairSistema();
    }//GEN-LAST:event_formWindowClosing

    private void btnImpressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpressosActionPerformed
        if (guis.getiPrint() != null) {
            try {
                System.out.println("Janela ja criada Impressos");
                guis.getiPrint().moveToFront();
                guis.getiPrint().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiPrint(new FrmImpressos());
                this.desktop.add(guis.getiPrint());
                guis.getiPrint().setMaximum(true);
                guis.getiPrint().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnImpressosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (guis.getiPrecos() != null) {
            try {
                System.out.println("Janela ja criada Tabela de precos");
                guis.getiPrecos().moveToFront();
                guis.getiPrecos().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiPrecos(new FrmPrecos());
                this.desktop.add(guis.getiPrecos());
                guis.getiPrecos().setMaximum(true);
                guis.getiPrecos().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        aparencia = UIManager.getInstalledLookAndFeels();

        for (UIManager.LookAndFeelInfo aparencia1 : aparencia) {
            System.out.println("Look: " + aparencia1.getName());
        }

        try {
            javax.swing.UIManager.setLookAndFeel(aparencia[1].getClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                FrmPrincipal frm = new FrmPrincipal();
                frm.setLocationRelativeTo(null);
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFerramentas;
    private javax.swing.JButton btnImpressos;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
