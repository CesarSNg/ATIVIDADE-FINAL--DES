package pacotao;

import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;


public class JFCadClientes extends javax.swing.JFrame {

    public JFCadClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsulta = new javax.swing.JTable();
        TxtID = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        TxtNome = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        TxtTelR = new javax.swing.JLabel();
        TelRede = new javax.swing.JTextField();
        TxtTelCo = new javax.swing.JLabel();
        TelCome = new javax.swing.JTextField();
        TxtTelCe = new javax.swing.JLabel();
        TelCel = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbConsulta1 = new javax.swing.JTable();
        lblMensagem = new javax.swing.JLabel();

        tbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Cor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbConsulta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TxtID.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TxtID.setText("ID:");

        Id.setEnabled(false);

        TxtNome.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TxtNome.setText("Nome: ");

        Nome.setEnabled(false);

        TxtTelR.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TxtTelR.setText("Tel. Residencial:");

        TelRede.setEnabled(false);

        TxtTelCo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TxtTelCo.setText("Tel. Comercial:");

        TelCome.setEnabled(false);

        TxtTelCe.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TxtTelCe.setText("Tel. Celular:");

        TelCel.setEnabled(false);

        TxtEmail.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TxtEmail.setText("Email:");

        Email.setEnabled(false);

        btnInserir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInserirMouseClicked(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        tbConsulta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbConsulta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsulta1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbConsulta1);
        if (tbConsulta1.getColumnModel().getColumnCount() > 0) {
            tbConsulta1.getColumnModel().getColumn(0).setHeaderValue("ID");
            tbConsulta1.getColumnModel().getColumn(1).setHeaderValue("Nome");
            tbConsulta1.getColumnModel().getColumn(2).setHeaderValue("Email");
        }

        lblMensagem.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNome)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Nome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelR)
                            .addComponent(TelRede, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelCo)
                            .addComponent(TelCome))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTelCe)
                            .addComponent(TelCel))
                        .addGap(47, 47, 47))
                    .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TxtEmail)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtTelCo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelCome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtTelR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelRede, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtTelCe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInserirMouseClicked
        
        Nome.setEnabled(true);
        TelRede.setEnabled(true);
        TelCome.setEnabled(true);
        TelCel.setEnabled(true);
        Email.setEnabled(true);
        btnConfirmar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnInserir.setEnabled(false);
        
    }//GEN-LAST:event_btnInserirMouseClicked

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked

        Connection con = Conexao.AbrirConexao();

        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);

        cb.setId(Id.getText());

        Object[] opcoes = {"Sim", "Não"};

        int i = JOptionPane.showOptionDialog(
            null,
            "Deseja excluir esse cliente: " + Nome.getText() + "?",
            "Exclusão",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);

        if (i == JOptionPane.YES_OPTION) {
            lblMensagem.setText(cd.excluirCliente(cb));
        }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnRemoverMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        
        Connection con = Conexao.AbrirConexao();

        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);

        cb.setNome(Nome.getText());
        cb.setTelRede(TelRede.getText());
        cb.setTelCome(TelCome.getText());
        cb.setTelCel(TelCel.getText());
        cb.setEmail(Email.getText());
        
        lblMensagem.setText(cd.alterarCliente(cb));
        
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        
        Connection con = Conexao.AbrirConexao();
        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);

        cb.setNome(Nome.getText());
        cb.setTelRede(TelRede.getText());
        cb.setTelCome(TelCome.getText());
        cb.setTelCel(TelCel.getText());
        cb.setEmail(Email.getText());        
        
        lblMensagem.setText(cd.inserirCliente(cb));

        Conexao.fecharConexao(con);
        
        /*// Pesquisando valores do banco de dados
        Connection con = Conexao.AbrirConexao();

        ClienteDAO cd = new ClienteDAO(con);

        List<ClienteBean> listaCliente = new ArrayList<ClienteBean>();

        listaCliente = cd.listarTodos();

        DefaultTableModel tbm = (DefaultTableModel) tbConsulta.getModel();

        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }

        int i = 0;

        for (ClienteBean cb : listaCliente) {
            tbm.addRow(new String[1]);

            tbConsulta.setValueAt(cb.getPlaca(), i, 0);
            tbConsulta.setValueAt(cb.getCor(), i, 1);
            tbConsulta.setValueAt(cb.getDescricao(), i, 2);

            i++;
        }

        Conexao.fecharConexao(con);*/

    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // Limpando dados da janela
        Id.setText("");
        Nome.setText("");
        TelRede.setText("");
        TelCome.setText("");
        TelCel.setText("");
        Email.setText("");        

        lblMensagem.setText("");

        DefaultTableModel tbm = (DefaultTableModel) tbConsulta.getModel();

        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void tbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultaMouseClicked
        // Passando os valores da linha da tabela para os campos

        Integer linha = tbConsulta.getSelectedRow();

        int id = (int) tbConsulta.getValueAt(linha, 0);
        String nome = (String) tbConsulta.getValueAt(linha, 1);
        String email = (String) tbConsulta.getValueAt(linha, 2);

        id.setText(id);
        nome.setText(nome);
        email.setText(email);

    }//GEN-LAST:event_tbConsultaMouseClicked

    private void tbConsulta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsulta1MouseClicked
        // Passando os valores da linha da tabela para os campos

        Integer linha = tbConsulta.getSelectedRow();

        Int id = (Int) tbConsulta.getValueAt(linha, 0);
        String nome = (String) tbConsulta.getValueAt(linha, 1);
        String email = (String) tbConsulta.getValueAt(linha, 2);

        id.setText(id);
        nome.setText(nome);
        email.setText(email);
    }//GEN-LAST:event_tbConsulta1MouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField TelCel;
    private javax.swing.JTextField TelCome;
    private javax.swing.JTextField TelRede;
    private javax.swing.JLabel TxtEmail;
    private javax.swing.JLabel TxtID;
    private javax.swing.JLabel TxtNome;
    private javax.swing.JLabel TxtTelCe;
    private javax.swing.JLabel TxtTelCo;
    private javax.swing.JLabel TxtTelR;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTable tbConsulta;
    private javax.swing.JTable tbConsulta1;
    // End of variables declaration//GEN-END:variables
}
