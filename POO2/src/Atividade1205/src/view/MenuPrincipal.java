package view;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFuncionario = new javax.swing.JButton();
        btnMovimentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal - RH");
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Menu Principal - RH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 250, 40);

        btnFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFuncionario.setText("Gerenciar Funcionários");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnFuncionario);
        btnFuncionario.setBounds(70, 100, 250, 40);

        btnMovimentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMovimentos.setText("Gerenciamento de Salário");
        btnMovimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimentosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMovimentos);
        btnMovimentos.setBounds(70, 160, 250, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        new FormFuncionario().setVisible(true);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnMovimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimentosActionPerformed
        new FormGerenciamentoSalario().setVisible(true);
    }//GEN-LAST:event_btnMovimentosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnMovimentos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
