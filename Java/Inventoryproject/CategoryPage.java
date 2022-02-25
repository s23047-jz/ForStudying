/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventoryproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Kubus
 */
public class CategoryPage extends javax.swing.JFrame {

    /**
     * Creates new form CategoryPage
     */
    public CategoryPage() {
        initComponents();
        showData();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Button_exit = new javax.swing.JButton();
        CategoryName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CategoryId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Categories_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Button_add = new javax.swing.JButton();
        Button_update = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        Button_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1328, 687));

        jPanel2.setBackground(new java.awt.Color(0, 38, 77));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 38, 77));
        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Categories");

        jLabel5.setBackground(new java.awt.Color(0, 38, 77));
        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inventory Managment System");

        Button_exit.setBackground(new java.awt.Color(255, 255, 255));
        Button_exit.setForeground(new java.awt.Color(0, 38, 77));
        Button_exit.setLabel("X");
        Button_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(518, 518, 518)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_exit)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Button_exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CategoryName.setBackground(new java.awt.Color(255, 255, 255));
        CategoryName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CategoryName.setForeground(new java.awt.Color(0, 38, 77));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 38, 77));
        jLabel2.setText("Category Name:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 38, 77));
        jLabel1.setText("Category Id:");

        CategoryId.setBackground(new java.awt.Color(255, 255, 255));
        CategoryId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CategoryId.setForeground(new java.awt.Color(0, 38, 77));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Categories_table.setBackground(new java.awt.Color(255, 255, 255));
        Categories_table.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Categories_table.setForeground(new java.awt.Color(0, 38, 77));
        Categories_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        Categories_table.setGridColor(new java.awt.Color(0, 0, 0));
        Categories_table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Categories_table.setSelectionForeground(new java.awt.Color(13, 41, 62));
        Categories_table.setShowGrid(false);
        Categories_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Categories_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Categories_table);

        jPanel3.setBackground(new java.awt.Color(0, 38, 77));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 38, 77));
        jLabel9.setText("Categories List");

        Button_add.setBackground(new java.awt.Color(0, 38, 77));
        Button_add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button_add.setForeground(new java.awt.Color(255, 255, 255));
        Button_add.setText("Add");
        Button_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_addMouseClicked(evt);
            }
        });

        Button_update.setBackground(new java.awt.Color(0, 38, 77));
        Button_update.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button_update.setForeground(new java.awt.Color(255, 255, 255));
        Button_update.setText("Update");
        Button_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_updateMouseClicked(evt);
            }
        });

        Button_delete.setBackground(new java.awt.Color(0, 38, 77));
        Button_delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button_delete.setForeground(new java.awt.Color(255, 255, 255));
        Button_delete.setText("Delete");
        Button_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_deleteMouseClicked(evt);
            }
        });

        Button_home.setBackground(new java.awt.Color(0, 38, 77));
        Button_home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button_home.setForeground(new java.awt.Color(255, 255, 255));
        Button_home.setText("Home");
        Button_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CategoryName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(CategoryId, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_delete)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_home)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_update)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(368, 368, 368))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_add)
                            .addComponent(Button_delete)
                            .addComponent(Button_update))
                        .addGap(18, 18, 18)
                        .addComponent(Button_home))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showData()
    {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from CATEGORY");
            Categories_table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void Button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_addMouseClicked
        try {
              connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
              PreparedStatement add = connection.prepareStatement("insert into CATEGORY values(?,?)");
              add.setInt(1, Integer.valueOf(CategoryId.getText()));
              add.setString(2, CategoryName.getText());
              int row = add.executeUpdate();
              JOptionPane.showMessageDialog(this, "Succesfully added new category!");
              connection.close();
              showData();
          } catch (SQLException ex) {            
                ex.printStackTrace();
        }            
    }//GEN-LAST:event_Button_addMouseClicked

    private void Button_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Button_exitMouseClicked

    private void Button_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_deleteMouseClicked
        if(CategoryId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty id field. Pls enter categorie's id");
        }else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String Id = CategoryId.getText();
                String Query = "delete from CATEGORY where ID="+Id;
                Statement Add = connection.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted category with id: "+Id);
                showData();
            }catch (SQLException ex) {            
                ex.printStackTrace();
            }  
        }
    }//GEN-LAST:event_Button_deleteMouseClicked

    private void Button_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_updateMouseClicked
        if(CategoryId.getText().isEmpty() || CategoryName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty field!");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String UpdateQuery = "update CATEGORY set CATEGORYNAME='"+CategoryName.getText()+"'"+" where ID="+CategoryId.getText();
                Statement Add = connection.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Updated categories data");
                showData();
            }catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_Button_updateMouseClicked

    private void Categories_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Categories_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)Categories_table.getModel();
        int id = Categories_table.getSelectedRow();
        CategoryId.setText(model.getValueAt(id, 0).toString());
        CategoryName.setText(model.getValueAt(id, 1).toString());
    }//GEN-LAST:event_Categories_tableMouseClicked

    private void Button_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_homeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_homeMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CategoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_exit;
    private javax.swing.JButton Button_home;
    private javax.swing.JButton Button_update;
    private javax.swing.JTable Categories_table;
    private javax.swing.JTextField CategoryId;
    private javax.swing.JTextField CategoryName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
