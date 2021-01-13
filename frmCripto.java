/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoSecreto;

import criptofinal.Decriptar;
import criptofinal.Encriptar;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author danielsalnikov
 */
public class frmCripto extends javax.swing.JFrame {

    /**
     * Creates new form frmCripto
     */
        int v[]=new int [200];
        int vec[]=new int [200];
        int vec2[]=new int [200];
        int vec4[]=new int [200];
        String vec5[]=new String [200];
        int vec6[]=new int [200];
        int [] vec7=new int[100];
        Bonos [] bons=new Bonos[100];
        
        public void escribeVector(int [] vec) {
        String aux = "Vector: \n";
        for (int i = 0; i < vec.length; i++) {
            aux = aux + vec[i] + "\n";
        }
        this.jTextArea1.setText(aux);
    }
    
    public frmCripto() {
        initComponents();
        logo();
        setTitle("Secret Message");
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Encriptar = new javax.swing.JButton();
        btnTextCipher = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDecriptar = new javax.swing.JButton();
        lblLogotipo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMensaje = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jRestButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );

        Encriptar.setText("Encrypt");
        Encriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncriptarActionPerformed(evt);
            }
        });

        btnTextCipher.setText("ciphertext");
        btnTextCipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextCipherActionPerformed(evt);
            }
        });

        jLabel1.setText("Write a simple phrase (no symbols, numbers) you wish to encrypt ");

        btnDecriptar.setText("Decrypt");
        btnDecriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecriptarActionPerformed(evt);
            }
        });

        txaMensaje.setColumns(20);
        txaMensaje.setRows(5);
        jScrollPane2.setViewportView(txaMensaje);

        jButton1.setText("Go to bond management");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRestButton.setText("Restart");
        jRestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit program");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("*200 characters max");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Encriptar)
                            .addComponent(btnTextCipher)
                            .addComponent(btnDecriptar)
                            .addComponent(jButton1))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRestButton)
                            .addComponent(quitButton))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Encriptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTextCipher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDecriptar)
                .addGap(3, 3, 3)
                .addComponent(jRestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitButton)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setup(){
        this.txaMensaje.setText("");
        this.jTextArea1.setText("");
    } 
    
    private void logo(){
        ImageIcon imagen = new javax.swing.ImageIcon(getClass().getResource("/textoSecreto/images/candado.png"));
        lblLogotipo.setIcon(new javax.swing.ImageIcon(imagen.getImage().getScaledInstance(
                lblLogotipo.getWidth(),
                lblLogotipo.getHeight(),
                Image.SCALE_DEFAULT)));
    }
    private void btnDecriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecriptarActionPerformed
       JFrame frame=new JFrame("Decrypted Text");
       Decriptar mens=new Decriptar(vec2, 17);
       this.vec4=mens.decriptarTexto(vec2);
       this.vec5=mens.claveLetras(vec4);
       this.vec6=mens.claveFinal(vec5);
       JOptionPane.showMessageDialog(frame,
        mens.traducir(vec6),
        "Your message is: ",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDecriptarActionPerformed

    private void EncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncriptarActionPerformed
        String frase;
        frase=this.txaMensaje.getText().toLowerCase();
        Encriptar mensaje=new Encriptar(frase);
        this.v=mensaje.traduccion(frase);
        this.vec=mensaje.claveNum(v);
        this.vec2=mensaje.encriptarTexto(vec);
        escribeVector(vec);
        
    }//GEN-LAST:event_EncriptarActionPerformed

    private void btnTextCipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextCipherActionPerformed
            escribeVector(vec2);
            
    }//GEN-LAST:event_btnTextCipherActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new frmEventos().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestButtonActionPerformed
        JFrame frame = new JFrame("Message cleared");
        setup();
        JOptionPane.showMessageDialog(frame, "The phrase has been deleted, you may now enter a new phrase.", "Message clear", 
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jRestButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(frmCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmCripto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Encriptar;
    private javax.swing.JButton btnDecriptar;
    private javax.swing.JButton btnTextCipher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRestButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JButton quitButton;
    private javax.swing.JTextArea txaMensaje;
    // End of variables declaration//GEN-END:variables
}
