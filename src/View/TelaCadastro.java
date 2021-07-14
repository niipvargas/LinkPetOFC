package View;

import DAO.PetDAO;
import DAO.UsuarioDAO;
import Model.Pet;
import Model.Usuario;
import ProjetoLinkPet.ProjetoLinkPet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        CarregarCampos();
    }
    
     public void CarregarComboPet() {
        for (int i = 0; i < ProjetoLinkPet.listaUsuario.size(); i++) {
            Caixinha.addItem(ProjetoLinkPet.listaUsuario.get(i).getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        tfdEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdTelefone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfdConfirmarSenha = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Caixinha = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("TELA CADASTRO PESSOA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NOME:");

        tfdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ENDEREÇO:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME"
            }
        ));
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(60);
            tabela.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        tfdEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("TELEFONE:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PET:");

        Caixinha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Caixinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixinhaActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149))))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Caixinha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfdTelefone)
                            .addComponent(tfdNome, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Caixinha, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdNomeActionPerformed

    private void tfdEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdEnderecoActionPerformed

    public void CarregarCampos() {
        ProjetoLinkPet.listaUsuario = UsuarioDAO.BuscarTodosUsuarios();
        DefaultTableModel tabela = (DefaultTableModel) this.tabela.getModel();
        tabela.setNumRows(0);

        for (int i = 0; i < ProjetoLinkPet.listaUsuario.size(); i++) {
            Object[] dado = {
                ProjetoLinkPet.listaUsuario.get(i).getCodigo(),
                ProjetoLinkPet.listaUsuario.get(i).getNome(),
                ProjetoLinkPet.listaUsuario.get(i).getTelefone(),
                ProjetoLinkPet.listaUsuario.get(i).getEndereco()};
            tabela.addRow(dado);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = tfdNome.getText();
        String endereco = tfdEndereco.getText();
        String telefone = tfdTelefone.getText();
        
        Usuario p1 = new Usuario(nome, endereco, telefone);
        int codigo = UsuarioDAO.InserirUsuarioDB(p1);
        p1.setCodigo(codigo); 
        
        int petIndex = Caixinha.getSelectedIndex();
        Pet pet = ProjetoLinkPet.ListaPet.get(petIndex); 
        pet.adicionarListaUsuario(p1);

        p1.setCodigo(codigo);

        UsuarioDAO.RelacionarPessoaPet(p1, pet);
        
        if(codigo == 0){
            JOptionPane.showMessageDialog(null, "NÃO FOI POSSÍVEL CADASTRAR"); 
        }else{
            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO");
            LimparCampos();
        }

    }

    public void AdicionarLinhaTabela(Usuario usuario) {
        DefaultTableModel tabela = (DefaultTableModel) this.tabela.getModel();
        Object[] dado = {usuario.getCodigo(), usuario.getNome(), usuario.getEndereco(), usuario.getTelefone()};
        tabela.addRow(dado);
       
    }
    
    public void LimparCampos() {
        tfdNome.setText("");
        tfdEndereco.setText("");
        tfdTelefone.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void CaixinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixinhaActionPerformed
CarregarComboPet();
    }//GEN-LAST:event_CaixinhaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int index = this.tabela.getSelectedRow();
        Pet pet = ProjetoLinkPet.ListaPet.get(index);
        PetDAO.DeletarPetPorCodigo(pet.getCodigo());
        this.tabela.clearSelection();
        DefaultTableModel table = (DefaultTableModel) this.tabela.getModel();
        table.removeRow(index);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Caixinha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfdConfirmarSenha;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdTelefone;
    // End of variables declaration//GEN-END:variables
}
