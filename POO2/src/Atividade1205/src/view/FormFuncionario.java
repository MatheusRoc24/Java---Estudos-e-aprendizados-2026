package view;

import beans.Funcionario;
import dao.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormFuncionario extends javax.swing.JFrame {

    public FormFuncionario() {
        initComponents();
        preencherTabela();
    }

    private void preencherTabela() {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            List<Funcionario> lista = dao.getAll();
            DefaultTableModel model = (DefaultTableModel) tblFuncionarios.getModel();
            model.setNumRows(0);
            for (Funcionario f : lista) {
                model.addRow(new Object[]{f.getId(), f.getNomeFuncionario(), f.getSalario()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar tabela: " + e.getMessage());
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtNomeFuncionario.setText("");
        txtSalario.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setPreferredSize(new java.awt.Dimension(550, 400));
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

        jLabel1.setText("Nome do Funcionário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 55, 150, 20);
        getContentPane().add(txtNomeFuncionario);
        txtNomeFuncionario.setBounds(20, 75, 290, 25);

        jLabel2.setText("Salário:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 55, 100, 20);
        getContentPane().add(txtSalario);
        txtSalario.setBounds(330, 75, 120, 25);

        btnSalvar.setText("Inserir");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(20, 115, 80, 30);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(110, 115, 80, 30);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(200, 115, 80, 30);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Salário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
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
        tblFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 160, 490, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Funcionario f = new Funcionario();
            f.setNomeFuncionario(txtNomeFuncionario.getText());
            String salarioStr = txtSalario.getText().replace(",", ".");
            f.setSalario(Double.parseDouble(salarioStr));

            FuncionarioDAO dao = new FuncionarioDAO();
            dao.inserir(f);

            JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso!");
            limparCampos();
            preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            if(txtId.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Informe o ID para pesquisar!");
                return;
            }
            int id = Integer.parseInt(txtId.getText());
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario f = dao.getById(id);
            if (f != null) {
                txtNomeFuncionario.setText(f.getNomeFuncionario());
                txtSalario.setText(String.valueOf(f.getSalario()));
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
            if(txtId.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Pesquise um funcionário primeiro!");
                return;
            }
            Funcionario f = new Funcionario();
            f.setId(Integer.parseInt(txtId.getText()));
            f.setNomeFuncionario(txtNomeFuncionario.getText());
            String salarioStr = txtSalario.getText().replace(",", ".");
            f.setSalario(Double.parseDouble(salarioStr));

            FuncionarioDAO dao = new FuncionarioDAO();
            dao.editar(f);

            JOptionPane.showMessageDialog(null, "Funcionário editado com sucesso!");
            limparCampos();
            preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            if(txtId.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Pesquise um funcionário primeiro!");
                return;
            }
            int id = Integer.parseInt(txtId.getText());
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.excluir(id);

            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
            limparCampos();
            preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {
        int linhaSelecionada = tblFuncionarios.getSelectedRow();
        if (linhaSelecionada != -1) {
            txtId.setText(tblFuncionarios.getValueAt(linhaSelecionada, 0).toString());
            txtNomeFuncionario.setText(tblFuncionarios.getValueAt(linhaSelecionada, 1).toString());
            txtSalario.setText(tblFuncionarios.getValueAt(linhaSelecionada, 2).toString());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
