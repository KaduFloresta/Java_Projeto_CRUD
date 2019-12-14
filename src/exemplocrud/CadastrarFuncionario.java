package exemplocrud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Kadu.Floresta
 */
public class CadastrarFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaFuncionario
     */
    int idAlteracao=0;
    public CadastrarFuncionario() {
        initComponents();
    }
    
    public CadastrarFuncionario(int idAlteracao) {
        initComponents();
        this.idAlteracao = idAlteracao;
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joao","root","");
            String sql = "select * from Funcionario where IdFuncionario = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idAlteracao);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                LabelID.setText(rs.getString("IDFuncionario"));
                LabelID.setEnabled(false);
                txtNome.setText(rs.getString("Nome"));
                txtDDD.setText(rs.getString("DDD"));
                txtTelefone.setText(rs.getString("Telefone"));
                txtEmail.setText(rs.getString("Email"));
                txtSalario.setText(rs.getString("Salario"));
                java.util.Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("Admissao"));
                txtAdmissao.setText(new SimpleDateFormat("dd/MM/yyyy").format(dt));
            }
            stmt.close();
            con.close();
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelID = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelTelfone = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtDDD = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtAdmissao = new javax.swing.JTextField();
        CampoID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        LabelID.setText("ID:");

        LabelNome.setText("Nome:");

        LabelTelfone.setText("Telefone:");

        jLabel6.setText("Salário:");

        jLabel7.setText("Admissão");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtDDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDDDActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar)
                    .addComponent(LabelID)
                    .addComponent(LabelNome)
                    .addComponent(LabelTelfone)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelID)
                    .addComponent(CampoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNome))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTelfone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDDDActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        try{
            if(idAlteracao == 0){
                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "joao","root","");
                String sql = "insert into Funcionario(Nome,Telefone,DDD,Email,Salario,"
                + "Admissao) values (?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, this.txtNome.getText());
                stmt.setInt(2, Integer.parseInt(this.txtTelefone.getText()));
                stmt.setInt(3, Integer.parseInt(this.txtDDD.getText()));
                stmt.setString(4, this.txtEmail.getText());
                stmt.setString(5, this.txtSalario.getText());
                SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                Date dt = new Date(df.parse(txtAdmissao.getText()).getTime());
                stmt.setDate(6, dt);
                stmt.execute();
                stmt.close();
                con.close();
            }else{
                Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "joao","root","");
                String sql = "update Funcionario set Nome=?,Telefone=?,DDD=?,Email=?"
                + ",Salario=?,Admissao=? where idFuncionario = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, this.txtNome.getText());
                stmt.setInt(2, Integer.parseInt(this.txtTelefone.getText()));
                stmt.setInt(3, Integer.parseInt(this.txtDDD.getText()));
                stmt.setString(4, this.txtEmail.getText());
                stmt.setString(5, this.txtSalario.getText());
                SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                Date dt = new Date(df.parse(txtAdmissao.getText()).getTime());
                stmt.setDate(6, dt);
                stmt.setInt(7, idAlteracao);
                stmt.execute();
                stmt.close();
                con.close();
            }
            JOptionPane.showMessageDialog(this, "Funcionario Cadastrado com Sucesso!");
            this.dispose();
        }catch(SQLException | ParseException e){
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoID;
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelTelfone;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAdmissao;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
