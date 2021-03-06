/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medico.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import medico.util.guis;

/**
 *
 * @author celso
 */
public class FrmFerramentas extends javax.swing.JInternalFrame {

    Path origem = Paths.get("medico.db");
    Path destino = Paths.get("\\medico_bkp.db");

    /**
     * Creates new form FrmFerramentas
     *
     * @throws java.io.IOException
     */
    public FrmFerramentas() throws IOException {
        initComponents();
        SelecionaLocal();
        //PreencheLook();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBackup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        btnRestaura = new javax.swing.JButton();
        btnLocal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblMsg = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Ferramentas");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Backup", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        btnBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/Backup.png"))); // NOI18N
        btnBackup.setText("Backup");
        btnBackup.setToolTipText("Executa backup da base de dados para o local desejado.");
        btnBackup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        jLabel2.setText("Local selecionado:");

        lblLocal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        btnRestaura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/Restaurar.png"))); // NOI18N
        btnRestaura.setText("Restauração");
        btnRestaura.setToolTipText("Realiza restauração da base de dados do local desejado.");
        btnRestaura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRestaura.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRestaura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestauraActionPerformed(evt);
            }
        });

        btnLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medico/imagens/Folder.png"))); // NOI18N
        btnLocal.setText("Selecionar outro local");
        btnLocal.setToolTipText("Seleciona outro local para realizar backup");
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(lblLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestaura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRestaura, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBackup, btnLocal, btnRestaura});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        guis.setiFerr(null);
        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        JFileChooser file = new JFileChooser();

        file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int resultado = file.showSaveDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            SalvaLocal(file.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnLocalActionPerformed

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja executar operação de backup do banco de dados?", "Executar Backup", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            System.out.println("Executando backup ...");
            ExecutaBackup(origem, destino);
        }
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnRestauraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestauraActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja executar operação de restauração do banco de dados?", "Executar Restauração", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            System.out.println("Executando restauração...");
            ExecutaRestauracao(origem, destino);
        }
    }//GEN-LAST:event_btnRestauraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnLocal;
    private javax.swing.JButton btnRestaura;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void SelecionaLocal() throws IOException {
        try (BufferedReader read = new BufferedReader(new FileReader("config.cfg"))) {
            String linha = read.readLine();
            lblLocal.setText(linha);

            read.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo config.cfg inexistente!");
        } catch (IOException ex) {
            System.out.println("Erro de IO");
        }
    }

    private void SalvaLocal(String local) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("config.cfg"))) {
            String linha = "";

            writer.append(local + "\n");

            lblLocal.setText(local);

            writer.close();

        } catch (IOException ex) {
            System.out.println("Erro de IO");
        }

    }

    private void ExecutaBackup(Path origem, Path destino) {
        try {
            System.out.println("Realizando backup de origem: " + origem + " para destino: " + destino + "medico_bkp.db");

            Path destino2 = Paths.get(lblLocal.getText() + destino);

            Files.copy(origem, destino2, REPLACE_EXISTING);
            lblMsg.setForeground(Color.blue);
            lblMsg.setText("Cópia de segurança realizada com sucesso!");

        } catch (IOException ex) {
            lblMsg.setForeground(Color.red);
            lblMsg.setText("Erro ao copiar arquivo!");

            System.out.println("Erro ao copiar arquivo: " + ex.getMessage());
        }
    }

    private void ExecutaRestauracao(Path origem, Path destino) {
        try {
            System.out.println("Realizando restauracao origem: " + origem + " para destino: " + destino);

            Path destino2 = Paths.get(lblLocal.getText() + destino);

            Files.copy(destino2, origem, REPLACE_EXISTING);
            lblMsg.setForeground(Color.blue);
            lblMsg.setText("Restauração realizada com sucesso!");

        } catch (IOException ex) {
            lblMsg.setForeground(Color.red);
            lblMsg.setText("Erro ao copiar arquivo!");

            System.out.println("Erro ao copiar arquivo: " + ex.getMessage());
        }
    }
}
