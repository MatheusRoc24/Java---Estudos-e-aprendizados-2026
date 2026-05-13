package view;

import beans.Funcionario;
import beans.GerenciamentoSalario;
import dao.FuncionarioDAO;
import dao.GerenciamentoSalarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormGerenciamentoSalario extends javax.swing.JFrame {

    public FormGerenciamentoSalario() {
        initComponents();
        carregarFuncionarios();
        preencherTabela();
    }

    private void carregarFuncionarios() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            List<Funcionario> lista = dao.getAll();
            cbFuncionario.removeAllItems();
            for (Funcionario f : lista) {
                cbFuncionario.addItem(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar funcionários: " + e.getMessage());
        }
    }

    private void preencherTabela() {
        try {
            GerenciamentoSalarioDAO dao = new GerenciamentoSalarioDAO();
            List<GerenciamentoSalario> lista = dao.getAll();
            DefaultTableModel model = (DefaultTableModel) tblGerenciamento.getModel();
            model.setNumRows(0);
            for (GerenciamentoSalario g : lista) {
                model.addRow(new Object[]{
                    g.getId(), 
                    g.getFuncionario().getNomeFuncionario(), 
                    g.getBonus(), 
                    g.getHoraExtra()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + e.getMessage());
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtBonus.setText("");
        txtHoraExtra.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtBonus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoraExtra = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGerenciamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Salário");
        setPreferredSize(new java.awt.Dimension(550, 480));
        getContentPane().setLayout(null);

        jLabelID.setText("ID:");
        getContentPane().add(jLabelID);
        jLabelID.setBounds(20, 20, 30, 20);
        getContentPane().add(txtId);
        txtId.setBounds(50, 20, 60, 25);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(120, 20, 100, 25);

        jLabel1.setText("Funcionário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 55, 200, 20);

        getContentPane().add(cbFuncionario);
        cbFuncionario.setBounds(20, 75, 290, 25);

        jLabel2.setText("Bônus (R$):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 100, 20);
        getContentPane().add(txtBonus);
        txtBonus.setBounds(20, 130, 120, 25);

        jLabel3.setText("Horas Extras:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 110, 100, 20);
        getContentPane().add(txtHoraExtra);
        txtHoraExtra.setBounds(180, 130, 120, 25);

        btnSalvar.setText("Inserir");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 175, 80, 30);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(110, 175, 80, 30);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(200, 175, 80, 30);

        tblGerenciamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Funcionário", "Bônus", "Horas Extras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGerenciamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGerenciamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGerenciamento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 490, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            GerenciamentoSalario g = new GerenciamentoSalario();
            g.setFuncionario((Funcionario) cbFuncionario.getSelectedItem());
            String bonusStr = txtBonus.getText().replace(",", ".");
            g.setBonus(Double.parseDouble(bonusStr.isEmpty() ? "0" : bonusStr));
            g.setHoraExtra(Integer.parseInt(txtHoraExtra.getText().isEmpty() ? "0" : txtHoraExtra.getText()));

            GerenciamentoSalarioDAO dao = new GerenciamentoSalarioDAO();
            dao.inserir(g);

            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            limparCampos();
            preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            if (txtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Informe o ID para pesquisar!");
                return;
            }
            int id = Integer.parseInt(txtId.getText());
            GerenciamentoSalarioDAO dao = new GerenciamentoSalarioDAO();
            GerenciamentoSalario g = dao.getById(id);
            if (g != null) {
                txtBonus.setText(String.valueOf(g.getBonus()));
                txtHoraExtra.setText(String.valueOf(g.getHoraExtra()));
                // Seta o item no combobox
                for (int i = 0; i < cbFuncionario.getItemCount(); i++) {
                    Funcionario f = cbFuncionario.getItemAt(i);
                    if (f.getId() == g.getFuncionario().getId()) {
                        cbFuncionario.setSelectedIndex(i);
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Registro não encontrado!");
                limparCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            if (txtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pesquise um registro primeiro!");
                return;
            }
            GerenciamentoSalario g = new GerenciamentoSalario();
            g.setId(Integer.parseInt(txtId.getText()));
            g.setFuncionario((Funcionario) cbFuncionario.getSelectedItem());
            String bonusStr = txtBonus.getText().replace(",", ".");
            g.setBonus(Double.parseDouble(bonusStr.isEmpty() ? "0" : bonusStr));
            g.setHoraExtra(Integer.parseInt(txtHoraExtra.getText().isEmpty() ? "0" : txtHoraExtra.getText()));

            GerenciamentoSalarioDAO dao = new GerenciamentoSalarioDAO();
            dao.editar(g);

            JOptionPane.showMessageDialog(null, "Registro editado com sucesso!");
            limparCampos();
            preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if (txtId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Pesquise um registro primeiro!");
                return;
            }
            int id = Integer.parseInt(txtId.getText());
            GerenciamentoSalarioDAO dao = new GerenciamentoSalarioDAO();
            dao.excluir(id);

            JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
            limparCampos();
            preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblGerenciamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGerenciamentoMouseClicked
        int linhaSelecionada = tblGerenciamento.getSelectedRow();
        if (linhaSelecionada != -1) {
            txtId.setText(tblGerenciamento.getValueAt(linhaSelecionada, 0).toString());
            // Para preencher o resto automaticamente sem clicar em "pesquisar":
            txtBonus.setText(tblGerenciamento.getValueAt(linhaSelecionada, 2).toString());
            txtHoraExtra.setText(tblGerenciamento.getValueAt(linhaSelecionada, 3).toString());
            String nomeFuncionario = tblGerenciamento.getValueAt(linhaSelecionada, 1).toString();
            for (int i = 0; i < cbFuncionario.getItemCount(); i++) {
                if (cbFuncionario.getItemAt(i).getNomeFuncionario().equals(nomeFuncionario)) {
                    cbFuncionario.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_tblGerenciamentoMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerenciamentoSalario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<beans.Funcionario> cbFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGerenciamento;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtHoraExtra;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
