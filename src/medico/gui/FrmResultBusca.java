/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.gui;

import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import medico.bean.Paciente;

/**
 *
 * @author celso
 */
public class FrmResultBusca extends javax.swing.JFrame {

    private FrmPacientes fPac;
    private Paciente pacSel;
    private List<Paciente> pacList;
    private DefaultTableModel table;

    /**
     * Creates new form resultBusca
     */
    public FrmResultBusca() {
        initComponents();
        table = (DefaultTableModel) tblResultadoBusca.getModel();
    }

    public void recebePacientes(FrmPacientes frm, List<Paciente> pac) {

        table.setRowCount(0);

        String[] user = new String[]{null, null, null, null, null};

        for (int i = 0; i < pac.size(); i++) {
            table.addRow(user);
            table.setValueAt(pac.get(i).getId(), i, 0);
            table.setValueAt(pac.get(i).getNome(), i, 1);
            table.setValueAt(pac.get(i).getNasc(), i, 2);
            table.setValueAt(pac.get(i).getCpf(), i, 3);
            table.setValueAt(pac.get(i).getTelres(), i, 4);
        }

        this.fPac = frm;
        this.pacList = pac;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultadoBusca = new javax.swing.JTable();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultado da Busca");
        setAlwaysOnTop(true);

        tblResultadoBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nascimento", "CPF", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultadoBusca.setColumnSelectionAllowed(true);
        tblResultadoBusca.getTableHeader().setReorderingAllowed(false);
        tblResultadoBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadoBuscaMouseClicked(evt);
            }
        });
        tblResultadoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblResultadoBuscaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblResultadoBusca);
        tblResultadoBusca.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblResultadoBusca.getColumnModel().getColumnCount() > 0) {
            tblResultadoBusca.getColumnModel().getColumn(1).setPreferredWidth(400);
            tblResultadoBusca.getColumnModel().getColumn(2).setPreferredWidth(5);
            tblResultadoBusca.getColumnModel().getColumn(3).setPreferredWidth(11);
            tblResultadoBusca.getColumnModel().getColumn(4).setPreferredWidth(11);
        }

        btnOk.setText("OK");
        btnOk.setToolTipText("");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        int linha = tblResultadoBusca.getSelectedRow();
        
        if (linha >= 0) {
            fPac.recebeSelecionado(this.pacList.get(linha));
        }
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void tblResultadoBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblResultadoBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOkActionPerformed(null);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_tblResultadoBuscaKeyPressed

    private void tblResultadoBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoBuscaMouseClicked
        System.out.println("Linha selecionada: " + tblResultadoBusca.getSelectedRow());
    }//GEN-LAST:event_tblResultadoBuscaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResultadoBusca;
    // End of variables declaration//GEN-END:variables
}
