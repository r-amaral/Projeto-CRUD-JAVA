package View;

import DAO.FuncionarioDAO;
import Model.Funcionario;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class TelaPrincipal extends javax.swing.JFrame {

    private Funcionario objfuncionario;

    public TelaPrincipal() throws ParseException {
        initComponents();

        this.objfuncionario = new Funcionario();
        
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(false);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel_Section_1 = new javax.swing.JPanel();
        Jpanel_Caixa = new javax.swing.JPanel();
        Jpanel_Gerenciar_Funcionario = new javax.swing.JPanel();
        L_Gerenciar_Funcionario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Jpanel_Sair = new javax.swing.JPanel();
        L_Sair = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jpanel_Novo_Funcionario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        L_Novo_Funcionario = new javax.swing.JLabel();
        Jpanel_Sobre = new javax.swing.JPanel();
        L_Sobre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        L_Gerenciador = new javax.swing.JLabel();
        Separator_Gerenciador = new javax.swing.JSeparator();
        Jpanel_Section_2 = new javax.swing.JPanel();
        Menu_Cont_2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        g_cpf = new javax.swing.JTextField();
        b_Limpar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        L_Gerenciar_Header = new javax.swing.JLabel();
        g_nome = new javax.swing.JTextField();
        g_idade = new javax.swing.JTextField();
        g_profissao = new javax.swing.JTextField();
        g_salario = new javax.swing.JTextField();
        Menu_Cont_1 = new javax.swing.JPanel();
        c_nome = new javax.swing.JTextField();
        c_idade = new javax.swing.JTextField();
        c_profissao = new javax.swing.JTextField();
        B_Cadastro_Cadrastrar = new javax.swing.JButton();
        c_cpf = new javax.swing.JTextField();
        c_salario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Menu_Cont_3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Funcionários");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_Section_1.setBackground(new java.awt.Color(54, 33, 89));
        Jpanel_Section_1.setForeground(new java.awt.Color(153, 153, 255));

        Jpanel_Caixa.setBackground(new java.awt.Color(54, 33, 89));
        Jpanel_Caixa.setForeground(new java.awt.Color(255, 255, 0));
        Jpanel_Caixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_Gerenciar_Funcionario.setBackground(new java.awt.Color(64, 43, 100));

        L_Gerenciar_Funcionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Gerenciar_Funcionario.setForeground(new java.awt.Color(255, 255, 255));
        L_Gerenciar_Funcionario.setText("Gerenciar Funcionário");
        L_Gerenciar_Funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_Gerenciar_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Gerenciar_FuncionarioMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gerenciamento-de-arquivos.png"))); // NOI18N

        javax.swing.GroupLayout Jpanel_Gerenciar_FuncionarioLayout = new javax.swing.GroupLayout(Jpanel_Gerenciar_Funcionario);
        Jpanel_Gerenciar_Funcionario.setLayout(Jpanel_Gerenciar_FuncionarioLayout);
        Jpanel_Gerenciar_FuncionarioLayout.setHorizontalGroup(
            Jpanel_Gerenciar_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_Gerenciar_FuncionarioLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(L_Gerenciar_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        Jpanel_Gerenciar_FuncionarioLayout.setVerticalGroup(
            Jpanel_Gerenciar_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_Gerenciar_FuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_Gerenciar_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L_Gerenciar_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        Jpanel_Caixa.add(Jpanel_Gerenciar_Funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 50));

        Jpanel_Sair.setBackground(new java.awt.Color(64, 43, 100));

        L_Sair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Sair.setForeground(new java.awt.Color(255, 255, 255));
        L_Sair.setText("Sair");
        L_Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_SairMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N

        javax.swing.GroupLayout Jpanel_SairLayout = new javax.swing.GroupLayout(Jpanel_Sair);
        Jpanel_Sair.setLayout(Jpanel_SairLayout);
        Jpanel_SairLayout.setHorizontalGroup(
            Jpanel_SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_SairLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(L_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        Jpanel_SairLayout.setVerticalGroup(
            Jpanel_SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel_SairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(L_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Jpanel_Caixa.add(Jpanel_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 50));

        Jpanel_Novo_Funcionario.setBackground(new java.awt.Color(64, 43, 100));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus (3).png"))); // NOI18N

        L_Novo_Funcionario.setBackground(new java.awt.Color(204, 0, 51));
        L_Novo_Funcionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Novo_Funcionario.setForeground(new java.awt.Color(255, 255, 255));
        L_Novo_Funcionario.setText("Novo Funcionário");
        L_Novo_Funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_Novo_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Novo_FuncionarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Jpanel_Novo_FuncionarioLayout = new javax.swing.GroupLayout(Jpanel_Novo_Funcionario);
        Jpanel_Novo_Funcionario.setLayout(Jpanel_Novo_FuncionarioLayout);
        Jpanel_Novo_FuncionarioLayout.setHorizontalGroup(
            Jpanel_Novo_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_Novo_FuncionarioLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(L_Novo_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        Jpanel_Novo_FuncionarioLayout.setVerticalGroup(
            Jpanel_Novo_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_Novo_FuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_Novo_FuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Novo_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Jpanel_Caixa.add(Jpanel_Novo_Funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 50));

        Jpanel_Sobre.setBackground(new java.awt.Color(64, 43, 100));

        L_Sobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Sobre.setForeground(new java.awt.Color(255, 255, 255));
        L_Sobre.setText("Sobre");
        L_Sobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_SobreMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre-nos.png"))); // NOI18N

        javax.swing.GroupLayout Jpanel_SobreLayout = new javax.swing.GroupLayout(Jpanel_Sobre);
        Jpanel_Sobre.setLayout(Jpanel_SobreLayout);
        Jpanel_SobreLayout.setHorizontalGroup(
            Jpanel_SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_SobreLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(L_Sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        Jpanel_SobreLayout.setVerticalGroup(
            Jpanel_SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_SobreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpanel_SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Sobre, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Jpanel_Caixa.add(Jpanel_Sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 50));

        L_Gerenciador.setBackground(new java.awt.Color(255, 255, 255));
        L_Gerenciador.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        L_Gerenciador.setForeground(new java.awt.Color(255, 255, 255));
        L_Gerenciador.setText("Gerenciador de Funcionários");

        Separator_Gerenciador.setBackground(new java.awt.Color(255, 255, 255));
        Separator_Gerenciador.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Jpanel_Section_1Layout = new javax.swing.GroupLayout(Jpanel_Section_1);
        Jpanel_Section_1.setLayout(Jpanel_Section_1Layout);
        Jpanel_Section_1Layout.setHorizontalGroup(
            Jpanel_Section_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel_Caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(Jpanel_Section_1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Jpanel_Section_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L_Gerenciador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator_Gerenciador))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Jpanel_Section_1Layout.setVerticalGroup(
            Jpanel_Section_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_Section_1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(L_Gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator_Gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jpanel_Caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Jpanel_Section_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 540));

        Jpanel_Section_2.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel_Section_2.setOpaque(false);
        Jpanel_Section_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_Cont_2.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Cont_2.setForeground(new java.awt.Color(255, 255, 255));
        Menu_Cont_2.setOpaque(false);
        Menu_Cont_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Profissão", "CPF", "Salário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        Menu_Cont_2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 700, 163));

        g_cpf.setBackground(new java.awt.Color(238, 238, 238));
        g_cpf.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        g_cpf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        Menu_Cont_2.add(g_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 330, -1));

        b_Limpar.setBackground(new java.awt.Color(54, 33, 89));
        b_Limpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_Limpar.setForeground(new java.awt.Color(255, 255, 255));
        b_Limpar.setText("Limpar");
        b_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LimparActionPerformed(evt);
            }
        });
        Menu_Cont_2.add(b_Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 100, 30));

        b_alterar.setBackground(new java.awt.Color(54, 33, 89));
        b_alterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_alterar.setForeground(new java.awt.Color(255, 255, 255));
        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });
        Menu_Cont_2.add(b_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 100, 30));

        b_apagar.setBackground(new java.awt.Color(54, 33, 89));
        b_apagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b_apagar.setForeground(new java.awt.Color(255, 255, 255));
        b_apagar.setText("Deletar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });
        Menu_Cont_2.add(b_apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 100, 30));

        L_Gerenciar_Header.setBackground(new java.awt.Color(255, 255, 255));
        L_Gerenciar_Header.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        L_Gerenciar_Header.setForeground(new java.awt.Color(255, 255, 255));
        L_Gerenciar_Header.setText("Gerenciar Funcionário");
        Menu_Cont_2.add(L_Gerenciar_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 37, -1, 30));

        g_nome.setBackground(new java.awt.Color(238, 238, 238));
        g_nome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        g_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        Menu_Cont_2.add(g_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 330, -1));

        g_idade.setBackground(new java.awt.Color(238, 238, 238));
        g_idade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        g_idade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Idade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        Menu_Cont_2.add(g_idade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 330, -1));

        g_profissao.setBackground(new java.awt.Color(238, 238, 238));
        g_profissao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        g_profissao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Profissão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        Menu_Cont_2.add(g_profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 330, -1));

        g_salario.setBackground(new java.awt.Color(238, 238, 238));
        g_salario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        g_salario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Salário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        Menu_Cont_2.add(g_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 330, -1));

        Jpanel_Section_2.add(Menu_Cont_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 9, 720, 530));

        Menu_Cont_1.setBackground(new java.awt.Color(0, 0, 255));
        Menu_Cont_1.setOpaque(false);

        c_nome.setBackground(new java.awt.Color(238, 238, 238));
        c_nome.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        c_idade.setBackground(new java.awt.Color(238, 238, 238));
        c_idade.setForeground(new java.awt.Color(0, 0, 0));
        c_idade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Idade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        c_profissao.setBackground(new java.awt.Color(238, 238, 238));
        c_profissao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Profissão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        c_profissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_profissaoActionPerformed(evt);
            }
        });

        B_Cadastro_Cadrastrar.setBackground(new java.awt.Color(54, 33, 89));
        B_Cadastro_Cadrastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Cadastro_Cadrastrar.setForeground(new java.awt.Color(255, 255, 255));
        B_Cadastro_Cadrastrar.setText("Cadastrar");
        B_Cadastro_Cadrastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_Cadastro_Cadrastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Cadastro_CadrastrarActionPerformed(evt);
            }
        });

        c_cpf.setBackground(new java.awt.Color(238, 238, 238));
        c_cpf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        c_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cpfActionPerformed(evt);
            }
        });

        c_salario.setBackground(new java.awt.Color(238, 238, 238));
        c_salario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 33, 89)), "Salário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        c_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_salarioActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cadastrar Funcionario");

        javax.swing.GroupLayout Menu_Cont_1Layout = new javax.swing.GroupLayout(Menu_Cont_1);
        Menu_Cont_1.setLayout(Menu_Cont_1Layout);
        Menu_Cont_1Layout.setHorizontalGroup(
            Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel8))
                    .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(c_salario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c_profissao, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(B_Cadastro_Cadrastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                    .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Menu_Cont_1Layout.setVerticalGroup(
            Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_Cont_1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_profissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(c_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Cadastro_Cadrastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        Jpanel_Section_2.add(Menu_Cont_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, 530));

        Menu_Cont_3.setBackground(new java.awt.Color(0, 153, 51));
        Menu_Cont_3.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(54, 33, 89));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 33, 89));
        jLabel1.setText("Desenvolvido Por");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 33, 89));
        jLabel2.setText("Ruan Vinicius Amaral de Oliveira");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-git-64-64.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu_Cont_3Layout = new javax.swing.GroupLayout(Menu_Cont_3);
        Menu_Cont_3.setLayout(Menu_Cont_3Layout);
        Menu_Cont_3Layout.setHorizontalGroup(
            Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_3Layout.createSequentialGroup()
                .addGroup(Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_Cont_3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Menu_Cont_3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_Cont_3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(103, 103, 103))
        );
        Menu_Cont_3Layout.setVerticalGroup(
            Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        Jpanel_Section_2.add(Menu_Cont_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 119, 710, 410));

        getContentPane().add(Jpanel_Section_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 0, -1, 542));

        Header.setBackground(new java.awt.Color(54, 33, 89));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1080, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void L_Gerenciar_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Gerenciar_FuncionarioMouseClicked
        this.carregaTabela();
        
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(false);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_2.setVisible(true);

        Jpanel_Novo_Funcionario.setBackground(new Color(64, 43, 100));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(85, 85, 118));
        Jpanel_Sobre.setBackground(new Color(64, 43, 100));
        Jpanel_Sair.setBackground(new Color(64, 43, 100));
    }//GEN-LAST:event_L_Gerenciar_FuncionarioMouseClicked

    private void L_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_SairMouseClicked
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64, 43, 100));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64, 43, 100));
        Jpanel_Sair.setBackground(new Color(64, 43, 100));
        Jpanel_Sair.setBackground(new Color(85, 85, 118));
       
        System.exit(0);
    }//GEN-LAST:event_L_SairMouseClicked

    private void L_Novo_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Novo_FuncionarioMouseClicked
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(true);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_2.setVisible(false);

        Jpanel_Novo_Funcionario.setBackground(new Color(85, 85, 118));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64, 43, 100));
        Jpanel_Sobre.setBackground(new Color(64, 43, 100));
        Jpanel_Sair.setBackground(new Color(64, 43, 100));
    }//GEN-LAST:event_L_Novo_FuncionarioMouseClicked

    private void L_SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_SobreMouseClicked
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(false);
        Menu_Cont_3.setVisible(true);
        Menu_Cont_2.setVisible(false);

        Jpanel_Novo_Funcionario.setBackground(new Color(64, 43, 100));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64, 43, 100));
        Jpanel_Sobre.setBackground(new Color(85, 85, 118));
        Jpanel_Sair.setBackground(new Color(64, 43, 100));
    }//GEN-LAST:event_L_SobreMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try {
            int id = 0;
            if (this.jTableFuncionario.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionário para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 0).toString());
            }
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Funcionário ?");

            if (resposta_usuario == 0) {
                if (this.objfuncionario.DeleteFuncionarioBD(id)) {
                    this.g_nome.setText(null);
                    this.g_idade.setText(null);
                    this.g_profissao.setText(null);
                    this.g_cpf.setText(null);
                    this.g_salario.setText(null);
                    JOptionPane.showMessageDialog(rootPane, "Funcionário Apagado com Sucesso!");
                }
            }
            
            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {
            int id = 0;
            String nome = "";
            int idade = 0;
            String cpf = "";
            double salario = 0;
            String profissao = "";

            if (this.g_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.g_nome.getText();
            }

            if (this.g_idade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser número e maior que zero.");
            } else {
                idade = Integer.parseInt(this.g_idade.getText());
            }

            if (this.g_profissao.getText().length() < 2) {
                throw new Mensagens("Profissão deve conter ao menos 5 caracteres.");
            } else {
                profissao = this.g_profissao.getText();
            }

            if (this.g_cpf.getText().length() != 11) {
                throw new Mensagens("cpf deve ter 11 caracteres.");
            } else {
                cpf = this.g_cpf.getText();
            }

            if (this.g_salario.getText().length() <= 0) {
                throw new Mensagens("salário deve ser numero e maior que 0.");
            } else {
                salario = Integer.parseInt(this.g_salario.getText());
            }

            if (this.jTableFuncionario.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionário para Alterar");
            } else {
                id = Integer.parseInt(this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 0).toString());
            }

            if (this.objfuncionario.UpdateFuncionarioBD(profissao, salario, id, nome, idade, cpf)) {

                this.g_nome.setText(null);
                this.g_idade.setText(null);
                this.g_profissao.setText(null);
                this.g_cpf.setText(null);
                this.g_salario.setText(null);
                JOptionPane.showMessageDialog(rootPane, "Funcionário Alterado com Sucesso!");

            }
            System.out.println(this.objfuncionario.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_b_alterarActionPerformed

    private void b_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimparActionPerformed
        this.g_nome.setText(null);
        this.g_profissao.setText(null);
        this.g_salario.setText(null);
        this.g_idade.setText(null);
        this.g_cpf.setText(null);
    }//GEN-LAST:event_b_LimparActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked

        if (this.jTableFuncionario.getSelectedRow() != -1) {

            String nome = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 1).toString();
            String idade = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 2).toString();
            String profissao = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 3).toString();
            String cpf = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 4).toString();
            String salario = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 5).toString();

            this.g_nome.setText(nome);
            this.g_idade.setText(idade);
            this.g_profissao.setText(profissao);
            this.g_salario.setText(salario);
            this.g_cpf.setText(cpf);
        }
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void c_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cpfActionPerformed

    }//GEN-LAST:event_c_cpfActionPerformed
//-------------------------------------Cadastro----------------------------------------

    private void B_Cadastro_CadrastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastro_CadrastrarActionPerformed
        try {
            String nome = "";
            int idade = 0;
            String cpf = "";
            double salario = 0;
            String profissao = "";
            
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

            if (this.c_profissao.getText().length() < 2) {
                throw new Mensagens("Profissão deve conter ao menos 5 caracteres.");
            } else {
                profissao = this.c_profissao.getText();
            }

            if (this.c_cpf.getText().length() != 11) {
                throw new Mensagens("cpf deve ser ter 11 caracteres.");
            } else {
                cpf = this.c_cpf.getText();
            }

            if (this.c_salario.getText().length() <= 0) {
                throw new Mensagens("salário deve ser numero e maior que 0.");
            } else {
                salario = Integer.parseInt(this.c_salario.getText());
            }

            if (this.objfuncionario.InsertFuncionarioBD(profissao, salario, nome, idade, cpf)) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário Cadastrado com Sucesso!");

                this.c_nome.setText(null);
                this.c_idade.setText(null);
                this.c_profissao.setText(null);
                this.c_cpf.setText(null);
                this.c_salario.setText(null);
            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B_Cadastro_CadrastrarActionPerformed

    private void c_profissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_profissaoActionPerformed

    }//GEN-LAST:event_c_profissaoActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed

    }//GEN-LAST:event_c_nomeActionPerformed

    private void c_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_salarioActionPerformed
    }//GEN-LAST:event_c_salarioActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            URI link = new URI("https://github.com/r-amaral/Projeto-CRUD-JAVA");
            Desktop.getDesktop().browse(link);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableFuncionario.getModel();
        modelo.setNumRows(0);

        ArrayList<Funcionario> minhalista = new ArrayList<>();
        minhalista = objfuncionario.getMinhaLista();

        for (Funcionario a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getProfissao(),
                a.getCpf(),
                a.getSalario()
            });
        }
    }

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastro_Cadrastrar;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Jpanel_Caixa;
    private javax.swing.JPanel Jpanel_Gerenciar_Funcionario;
    private javax.swing.JPanel Jpanel_Novo_Funcionario;
    private javax.swing.JPanel Jpanel_Sair;
    private javax.swing.JPanel Jpanel_Section_1;
    private javax.swing.JPanel Jpanel_Section_2;
    private javax.swing.JPanel Jpanel_Sobre;
    private javax.swing.JLabel L_Gerenciador;
    private javax.swing.JLabel L_Gerenciar_Funcionario;
    private javax.swing.JLabel L_Gerenciar_Header;
    private javax.swing.JLabel L_Novo_Funcionario;
    private javax.swing.JLabel L_Sair;
    private javax.swing.JLabel L_Sobre;
    private javax.swing.JPanel Menu_Cont_1;
    private javax.swing.JPanel Menu_Cont_2;
    private javax.swing.JPanel Menu_Cont_3;
    private javax.swing.JSeparator Separator_Gerenciador;
    private javax.swing.JButton b_Limpar;
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JTextField c_cpf;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_profissao;
    private javax.swing.JTextField c_salario;
    private javax.swing.JTextField g_cpf;
    private javax.swing.JTextField g_idade;
    private javax.swing.JTextField g_nome;
    private javax.swing.JTextField g_profissao;
    private javax.swing.JTextField g_salario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    // End of variables declaration//GEN-END:variables
}
