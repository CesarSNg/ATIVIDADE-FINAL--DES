package pacotao;

import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class JFCadClientes extends javax.swing.JFrame {

    public JFCadClientes() {
        initComponents();
        /*btnRemover.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        Id.setEnabled(false);
        Nome.setEnabled(false);
        TelRede.setEnabled(false);
        TelCome.setEnabled(false);
        TelCel.setEnabled(false);
        Email.setEnabled(false);
        lblMensagem.setText("");
        Id.setText("");*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblMensagem = new javax.swing.JLabel();
        TxtClientesCad = new javax.swing.JLabel();
        PnlConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsulta = new javax.swing.JTable();

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

        lblMensagem.setText("Resultado:");

        TxtClientesCad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtClientesCad.setForeground(new java.awt.Color(51, 153, 255));
        TxtClientesCad.setText("Clientes cadastrados ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        tbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout PnlConsultaLayout = new javax.swing.GroupLayout(PnlConsulta);
        PnlConsulta.setLayout(PnlConsultaLayout);
        PnlConsultaLayout.setHorizontalGroup(
            PnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        PnlConsultaLayout.setVerticalGroup(
            PnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TxtClientesCad, javax.swing.GroupLayout.PREFERRED_SIZE, 1467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTelR)
                                    .addComponent(TelRede, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelCome, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTelCo))
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTelCe)
                                    .addComponent(TelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNome)
                                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TxtEmail)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PnlConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelCo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelCe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelRede, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelCome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelCel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtClientesCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PnlConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        cb.setId(Integer.parseInt(Id.getText()));


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
        btnInserir.setEnabled(true);
        btnRemover.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        Id.setEnabled(false);
        Nome.setEnabled(false);
        TelRede.setEnabled(false);
        TelCome.setEnabled(false);
        TelCel.setEnabled(false);
        Email.setEnabled(false);
        Id.setText("");
        Nome.setText("");
        TelRede.setText("(00)0000-0000"); 
        TelCome.setText("(00)0000-0000"); 
        TelCel.setText("(00)00000-0000");
        Email.setText("");
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnRemoverMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        
        Connection con = Conexao.AbrirConexao();

        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
        
        Integer i_id = Integer.parseInt(Id.getText());

        cb.setId(i_id);
        cb.setNome(Nome.getText());
        cb.setTelRede(TelRede.getText());
        cb.setTelCome(TelCome.getText());
        cb.setTelCel(TelCel.getText());
        cb.setEmail(Email.getText());
        
        lblMensagem.setText(cd.alterarCliente(cb));
        
        Conexao.fecharConexao(con);
        
        /*Connection con = Conexao.abrirConexao();
        
        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
           
        Integer i_id = Integer.parseInt(TxtId.getText());
        
        cb.setCodCli(i_id);
        cb.setNomeCli(TxtNome.getText());
        cb.setEmailCli(TxtEmail.getText());
        cb.setTelResCli(TxtTelResidencial.getText());
        cb.setTelComCli(TxtTelComercial.getText());        
        cb.setTelCelCli(TxtTelCelular.getText());

        lblMensagem.setText(cd.alterarCliente(cb));
        
        Conexao.fecharConexao(con);*/
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
        
        Id.setText("");
        Nome.setText("");
        TelRede.setText("");
        TelCome.setText("");
        TelCel.setText("");
        Email.setText("");        

        Conexao.fecharConexao(con);
        
        /*//
        
        Pesquisando valores do banco de dados
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

        Conexao.fecharConexao(con);
        
        */

    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // Limpando dados da janela
        
        Nome.setEnabled(false);
        TelRede.setEnabled(false);
        TelCome.setEnabled(false);
        TelCel.setEnabled(false);
        Email.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnInserir.setEnabled(true);
        
        Id.setText("");
        Nome.setText("");
        TelRede.setText("");
        TelCome.setText("");
        TelCel.setText("");
        Email.setText("");        

        lblMensagem.setText("");
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSairMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
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
            
            tbConsulta.setValueAt(cb.getId(), i, 0);
            tbConsulta.setValueAt(cb.getNome(), i, 1);
            tbConsulta.setValueAt(cb.getEmail(), i, 2);
            
            i++;
        }
        
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_formWindowOpened

    private void tbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultaMouseClicked
        // TODO add your handling code here:
        
        Integer linha = tbConsulta.getSelectedRow();
                        
        Integer id = (Integer) tbConsulta.getValueAt(linha, 0);
        String nome = (String) tbConsulta.getValueAt(linha, 1);
        //String telRede = (String) tbConsulta.getValueAt(linha, 2);
        //String telCome = (String) tbConsulta.getValueAt(linha, 3);
        //String telCel = (String) tbConsulta.getValueAt(linha, 4);
        String email = (String) tbConsulta.getValueAt(linha, 2);
        
        String s_id = Integer.toString(id);
        
        Id.setText(s_id);
        Nome.setText(nome);
        //TelRede.setText(telRede);
        //TelCome.setText(telCome);
        //TelCel.setText(telCel);
        Email.setText(email);
        
        lblMensagem.setText("");
        btnInserir.setEnabled(false);
        btnRemover.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(true);
        Nome.setEnabled(true);
        TelRede.setEnabled(true);
        TelCome.setEnabled(true);
        TelCel.setEnabled(true);
        Email.setEnabled(true);
    }//GEN-LAST:event_tbConsultaMouseClicked

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
    private javax.swing.JPanel PnlConsulta;
    private javax.swing.JTextField TelCel;
    private javax.swing.JTextField TelCome;
    private javax.swing.JTextField TelRede;
    private javax.swing.JLabel TxtClientesCad;
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
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTable tbConsulta;
    // End of variables declaration//GEN-END:variables
}
