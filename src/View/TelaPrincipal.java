package View;

import Model.Funcionario;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    GerenciaFuncionario objeto = new GerenciaFuncionario();
    
    private Funcionario objfuncionario;

    public TelaPrincipal() {
        initComponents();
        
        this.objfuncionario = new Funcionario();
        
        GitButton.setOpaque(false);
        Menu_Cont_1.setVisible(true);
        Menu_Cont_2.setVisible(false);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_4.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        GitButton = new javax.swing.JButton();
        Menu_Cont_1 = new javax.swing.JPanel();
        Menu_Cont_2 = new javax.swing.JPanel();
        c_nome = new javax.swing.JTextField();
        L_Cadastro_Nome = new javax.swing.JLabel();
        L_Cadastro_Idade = new javax.swing.JLabel();
        c_idade = new javax.swing.JTextField();
        L_Cadastro_Curso = new javax.swing.JLabel();
        c_curso = new javax.swing.JTextField();
        L_Cadastro_Fase = new javax.swing.JLabel();
        B_Cadastro_Cadrastrar = new javax.swing.JButton();
        c_fase = new javax.swing.JTextField();
        Menu_Cont_4 = new javax.swing.JPanel();
        Menu_Cont_3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface de Teste");

        jPanel1.setBackground(new java.awt.Color(104, 51, 228));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jButton1.setText("Novo Funcionario");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerenciar Funcionario");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Sobre");

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GitButton.setBackground(new java.awt.Color(0, 0, 0));
        GitButton.setForeground(new java.awt.Color(0, 0, 0));
        GitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruana\\Desktop\\icon-git-64-64.png")); // NOI18N
        GitButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        GitButton.setBorderPainted(false);
        GitButton.setContentAreaFilled(false);
        GitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(GitButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addGap(36, 36, 36)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(GitButton)
                .addContainerGap())
        );

        Menu_Cont_1.setBackground(new java.awt.Color(0, 0, 0));
        Menu_Cont_1.setOpaque(false);

        Menu_Cont_2.setBackground(new java.awt.Color(0, 0, 255));

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        L_Cadastro_Nome.setText("Nome:");

        L_Cadastro_Idade.setText("idade:");

        L_Cadastro_Curso.setText("Curso:");

        c_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cursoActionPerformed(evt);
            }
        });

        L_Cadastro_Fase.setText("Fase:");

        B_Cadastro_Cadrastrar.setText("Cadastrar");
        B_Cadastro_Cadrastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cadastro_CadrastrarActionPerformed(evt);
            }
        });

        c_fase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_faseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_Cont_2Layout = new javax.swing.GroupLayout(Menu_Cont_2);
        Menu_Cont_2.setLayout(Menu_Cont_2Layout);
        Menu_Cont_2Layout.setHorizontalGroup(
            Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_Cadastro_Cadrastrar)
                    .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                        .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Cadastro_Nome)
                            .addComponent(L_Cadastro_Fase)
                            .addComponent(L_Cadastro_Idade)
                            .addComponent(L_Cadastro_Curso))
                        .addGap(26, 26, 26)
                        .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(c_fase)
                            .addComponent(c_idade)
                            .addComponent(c_curso))))
                .addGap(0, 236, Short.MAX_VALUE))
        );
        Menu_Cont_2Layout.setVerticalGroup(
            Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_Cont_2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Cadastro_Nome)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Cadastro_Fase)
                    .addComponent(c_fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Cadastro_Idade))
                .addGap(17, 17, 17)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_Cadastro_Curso)
                    .addComponent(c_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(B_Cadastro_Cadrastrar)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        Menu_Cont_4.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout Menu_Cont_4Layout = new javax.swing.GroupLayout(Menu_Cont_4);
        Menu_Cont_4.setLayout(Menu_Cont_4Layout);
        Menu_Cont_4Layout.setHorizontalGroup(
            Menu_Cont_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        Menu_Cont_4Layout.setVerticalGroup(
            Menu_Cont_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        Menu_Cont_3.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout Menu_Cont_3Layout = new javax.swing.GroupLayout(Menu_Cont_3);
        Menu_Cont_3.setLayout(Menu_Cont_3Layout);
        Menu_Cont_3Layout.setHorizontalGroup(
            Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        Menu_Cont_3Layout.setVerticalGroup(
            Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Menu_Cont_1Layout = new javax.swing.GroupLayout(Menu_Cont_1);
        Menu_Cont_1.setLayout(Menu_Cont_1Layout);
        Menu_Cont_1Layout.setHorizontalGroup(
            Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                    .addComponent(Menu_Cont_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
            .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                    .addComponent(Menu_Cont_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Menu_Cont_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Menu_Cont_1Layout.setVerticalGroup(
            Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Menu_Cont_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Menu_Cont_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Menu_Cont_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu_Cont_1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu_Cont_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GitButtonActionPerformed
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://github.com/r-amaral/Projeto-CRUD-JAVA"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_GitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_faseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_faseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_faseActionPerformed

    private void c_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cursoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Menu_Cont_1.setVisible(true);
        Menu_Cont_2.setVisible(true);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_4.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Menu_Cont_1.setVisible(true);
        Menu_Cont_2.setVisible(false);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_4.setVisible(false);

    }//GEN-LAST:event_jButton2MouseClicked

    private void B_Cadastro_CadrastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastro_CadrastrarActionPerformed
        // TODO add your handling code here:
        try {
            // recebendo e validando dados da interface grafica.
            String nome = "";
            int idade = 0;
            String curso = "";
            int fase = 0;

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_idade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser número e maior que zero.");
            } else {
                idade = Integer.parseInt(this.c_idade.getText());
            }
            
            if (this.c_curso.getText().length() < 2) {
                throw new Mensagens("Curso deve conter ao menos 2 caracteres.");
            } else {
                curso = this.c_curso.getText();
            }

            if (this.c_fase.getText().length() <= 0) {
                throw new Mensagens("Fase deve ser número e maior que zero.");
            } else {
                fase = Integer.parseInt(this.c_fase.getText());
            }

            // envia os dados para o Controlador cadastrar
            if (this.objfuncionario.InsertFuncionarioBD(curso, fase, nome, idade)) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_curso.setText("");
                this.c_fase.setText("");

            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        }
    }//GEN-LAST:event_B_Cadastro_CadrastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastro_Cadrastrar;
    private javax.swing.JButton GitButton;
    private javax.swing.JLabel L_Cadastro_Curso;
    private javax.swing.JLabel L_Cadastro_Fase;
    private javax.swing.JLabel L_Cadastro_Idade;
    private javax.swing.JLabel L_Cadastro_Nome;
    private javax.swing.JPanel Menu_Cont_1;
    private javax.swing.JPanel Menu_Cont_2;
    private javax.swing.JPanel Menu_Cont_3;
    private javax.swing.JPanel Menu_Cont_4;
    private javax.swing.JTextField c_curso;
    private javax.swing.JTextField c_fase;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
