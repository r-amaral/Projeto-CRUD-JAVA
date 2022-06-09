package View;

import Model.Funcionario;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    GerenciaFuncionario objeto = new GerenciaFuncionario();
    
    private Funcionario objfuncionario;

    public TelaPrincipal() {
        initComponents();
        
        this.objfuncionario = new Funcionario();
        
//        GitButton.setOpaque(false);
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
        Menu_Cont_1 = new javax.swing.JPanel();
        c_nome = new javax.swing.JTextField();
        L_Cadastro_Nome = new javax.swing.JLabel();
        L_Cadastro_Idade = new javax.swing.JLabel();
        c_idade = new javax.swing.JTextField();
        L_Cadastro_Curso = new javax.swing.JLabel();
        c_curso = new javax.swing.JTextField();
        L_Cadastro_Fase = new javax.swing.JLabel();
        B_Cadastro_Cadrastrar = new javax.swing.JButton();
        c_fase = new javax.swing.JTextField();
        Menu_Cont_2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_nome1 = new javax.swing.JTextField();
        c_idade1 = new javax.swing.JTextField();
        c_curso1 = new javax.swing.JTextField();
        c_fase1 = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        Menu_Cont_3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface de Teste");

        Jpanel_Section_1.setBackground(new java.awt.Color(54, 33, 89));
        Jpanel_Section_1.setForeground(new java.awt.Color(153, 153, 255));

        Jpanel_Caixa.setBackground(new java.awt.Color(54, 33, 89));
        Jpanel_Caixa.setForeground(new java.awt.Color(255, 255, 0));
        Jpanel_Caixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel_Gerenciar_Funcionario.setBackground(new java.awt.Color(64, 43, 100));

        L_Gerenciar_Funcionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Gerenciar_Funcionario.setForeground(new java.awt.Color(255, 255, 255));
        L_Gerenciar_Funcionario.setText("Gerenciar Funcionario");
        L_Gerenciar_Funcionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_Gerenciar_Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_Gerenciar_FuncionarioMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruana\\Downloads\\gerenciamento-de-arquivos.png")); // NOI18N

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

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruana\\Downloads\\sair.png")); // NOI18N

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

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruana\\Downloads\\plus (3).png")); // NOI18N

        L_Novo_Funcionario.setBackground(new java.awt.Color(204, 0, 51));
        L_Novo_Funcionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Novo_Funcionario.setForeground(new java.awt.Color(255, 255, 255));
        L_Novo_Funcionario.setText("Novo Funcionario");
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

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruana\\Downloads\\sobre-nos.png")); // NOI18N

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
        L_Gerenciador.setText("Gerenciador de Funcionarios");

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
                .addGap(48, 48, 48)
                .addComponent(L_Gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator_Gerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jpanel_Caixa, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jpanel_Section_2.setBackground(new java.awt.Color(0, 0, 0));
        Jpanel_Section_2.setOpaque(false);

        Menu_Cont_1.setBackground(new java.awt.Color(0, 0, 255));
        Menu_Cont_1.setOpaque(false);

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

        javax.swing.GroupLayout Menu_Cont_1Layout = new javax.swing.GroupLayout(Menu_Cont_1);
        Menu_Cont_1.setLayout(Menu_Cont_1Layout);
        Menu_Cont_1Layout.setHorizontalGroup(
            Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B_Cadastro_Cadrastrar)
                    .addGroup(Menu_Cont_1Layout.createSequentialGroup()
                        .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Cadastro_Nome)
                            .addComponent(L_Cadastro_Fase)
                            .addComponent(L_Cadastro_Idade)
                            .addComponent(L_Cadastro_Curso))
                        .addGap(26, 26, 26)
                        .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(c_fase)
                            .addComponent(c_idade)
                            .addComponent(c_curso))))
                .addGap(0, 220, Short.MAX_VALUE))
        );
        Menu_Cont_1Layout.setVerticalGroup(
            Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_Cont_1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Cadastro_Nome)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Cadastro_Fase)
                    .addComponent(c_fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Cadastro_Idade))
                .addGap(17, 17, 17)
                .addGroup(Menu_Cont_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_Cadastro_Curso)
                    .addComponent(c_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(B_Cadastro_Cadrastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Cont_2.setBackground(new java.awt.Color(0, 0, 0));
        Menu_Cont_2.setOpaque(false);

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Curso", "Fase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Curso: ");

        jLabel4.setText("Fase:");

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_Cont_2Layout = new javax.swing.GroupLayout(Menu_Cont_2);
        Menu_Cont_2.setLayout(Menu_Cont_2Layout);
        Menu_Cont_2Layout.setHorizontalGroup(
            Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30))
                        .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(32, 32, 32)))
                    .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                        .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_cancelar))
                        .addGap(15, 15, 15)))
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                        .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_fase1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_curso1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_idade1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(b_alterar)
                        .addGap(41, 41, 41)
                        .addComponent(b_apagar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        Menu_Cont_2Layout.setVerticalGroup(
            Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Menu_Cont_2Layout.createSequentialGroup()
                        .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(c_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addComponent(c_idade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_curso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_fase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Menu_Cont_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_alterar)
                    .addComponent(b_apagar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Menu_Cont_3.setBackground(new java.awt.Color(0, 153, 51));
        Menu_Cont_3.setOpaque(false);

        javax.swing.GroupLayout Menu_Cont_3Layout = new javax.swing.GroupLayout(Menu_Cont_3);
        Menu_Cont_3.setLayout(Menu_Cont_3Layout);
        Menu_Cont_3Layout.setHorizontalGroup(
            Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        Menu_Cont_3Layout.setVerticalGroup(
            Menu_Cont_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Jpanel_Section_2Layout = new javax.swing.GroupLayout(Jpanel_Section_2);
        Jpanel_Section_2.setLayout(Jpanel_Section_2Layout);
        Jpanel_Section_2Layout.setHorizontalGroup(
            Jpanel_Section_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel_Section_2Layout.createSequentialGroup()
                .addGroup(Jpanel_Section_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu_Cont_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu_Cont_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu_Cont_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jpanel_Section_2Layout.setVerticalGroup(
            Jpanel_Section_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Cont_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu_Cont_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu_Cont_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jpanel_Section_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jpanel_Section_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel_Section_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Jpanel_Section_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------Gerenciamento-----------------------------------------------------------------//
     
    private void L_Gerenciar_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Gerenciar_FuncionarioMouseClicked
        // TODO add your handling code here:
        
        this.carregaTabela();
        
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(false);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_2.setVisible(true);
        
        Jpanel_Novo_Funcionario.setBackground(new Color(64,43,100));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(85,85,118));
        Jpanel_Sair.setBackground(new Color(64,43,100));
        Jpanel_Sair.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_L_Gerenciar_FuncionarioMouseClicked

    private void L_SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_SairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64,43,100));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64,43,100));
        Jpanel_Sair.setBackground(new Color(64,43,100));
        Jpanel_Sair.setBackground(new Color(85,85,118));
    }//GEN-LAST:event_L_SairMouseClicked

    private void L_Novo_FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_Novo_FuncionarioMouseClicked
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(true);
        Menu_Cont_3.setVisible(false);
        Menu_Cont_2.setVisible(false);
        
        Jpanel_Novo_Funcionario.setBackground(new Color(85,85,118));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64,43,100));
        Jpanel_Sobre.setBackground(new Color(64,43,100));
        Jpanel_Sair.setBackground(new Color(64,43,100));
    }//GEN-LAST:event_L_Novo_FuncionarioMouseClicked

    private void L_SobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_SobreMouseClicked
        Jpanel_Section_2.setVisible(true);
        Menu_Cont_1.setVisible(false);
        Menu_Cont_3.setVisible(true);
        Menu_Cont_2.setVisible(false);
        
        Jpanel_Novo_Funcionario.setBackground(new Color(64,43,100));
        Jpanel_Gerenciar_Funcionario.setBackground(new Color(64,43,100));
        Jpanel_Sobre.setBackground(new Color(85,85,118));
        Jpanel_Sair.setBackground(new Color(64,43,100));
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

                    this.c_nome.setText("");
                    this.c_idade.setText("");
                    this.c_curso.setText("");
                    this.c_fase.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Funcionário Apagado com Sucesso!");
                }

            }

            System.out.println(this.objfuncionario.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {
            int id = 0;
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

            if (this.jTableFuncionario.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionário para Alterar");
            } else {
                id = Integer.parseInt(this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Funcionario processar
            if (this.objfuncionario.UpdateFuncionarioBD(curso, fase, id, nome, idade)) {

                // limpa os campos
                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_curso.setText("");
                this.c_fase.setText("");
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

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.c_nome1.setText(null);
        this.c_curso1.setText(null);
        this.c_fase1.setText(null);
        this.c_idade1.setText(null);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked

        if (this.jTableFuncionario.getSelectedRow() != -1) {

            String nome = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 1).toString();
            String idade = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 2).toString();
            String curso = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 3).toString();
            String fase = this.jTableFuncionario.getValueAt(this.jTableFuncionario.getSelectedRow(), 4).toString();

            this.c_nome1.setText(nome);
            this.c_idade1.setText(idade);
            this.c_curso1.setText(curso);
            this.c_fase1.setText(fase);
        }
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void c_faseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_faseActionPerformed

    }//GEN-LAST:event_c_faseActionPerformed

    private void B_Cadastro_CadrastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Cadastro_CadrastrarActionPerformed
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

    private void c_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cursoActionPerformed

    }//GEN-LAST:event_c_cursoActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed

    }//GEN-LAST:event_c_nomeActionPerformed
    
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
//                a.getProfissao(),
//                a.getProfissao(),
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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Cadastro_Cadrastrar;
    private javax.swing.JPanel Jpanel_Caixa;
    private javax.swing.JPanel Jpanel_Gerenciar_Funcionario;
    private javax.swing.JPanel Jpanel_Novo_Funcionario;
    private javax.swing.JPanel Jpanel_Sair;
    private javax.swing.JPanel Jpanel_Section_1;
    private javax.swing.JPanel Jpanel_Section_2;
    private javax.swing.JPanel Jpanel_Sobre;
    private javax.swing.JLabel L_Cadastro_Curso;
    private javax.swing.JLabel L_Cadastro_Fase;
    private javax.swing.JLabel L_Cadastro_Idade;
    private javax.swing.JLabel L_Cadastro_Nome;
    private javax.swing.JLabel L_Gerenciador;
    private javax.swing.JLabel L_Gerenciar_Funcionario;
    private javax.swing.JLabel L_Novo_Funcionario;
    private javax.swing.JLabel L_Sair;
    private javax.swing.JLabel L_Sobre;
    private javax.swing.JPanel Menu_Cont_1;
    private javax.swing.JPanel Menu_Cont_2;
    private javax.swing.JPanel Menu_Cont_3;
    private javax.swing.JSeparator Separator_Gerenciador;
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_curso;
    private javax.swing.JTextField c_curso1;
    private javax.swing.JTextField c_fase;
    private javax.swing.JTextField c_fase1;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_idade1;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_nome1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    // End of variables declaration//GEN-END:variables
}
