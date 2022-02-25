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
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserPage
     */
    public UserPage() {
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
        Button_close = new javax.swing.JButton();
        UserPassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        UserPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_users = new javax.swing.JTable();
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
        jLabel4.setText("Manage Users");

        jLabel5.setBackground(new java.awt.Color(0, 38, 77));
        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inventory Managment System");

        Button_close.setBackground(new java.awt.Color(255, 255, 255));
        Button_close.setForeground(new java.awt.Color(0, 38, 77));
        Button_close.setLabel("X");
        Button_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_closeMouseClicked(evt);
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
                .addComponent(Button_close)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Button_close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        UserPassword.setBackground(new java.awt.Color(255, 255, 255));
        UserPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserPassword.setForeground(new java.awt.Color(0, 38, 77));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 38, 77));
        jLabel2.setText("Password:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 38, 77));
        jLabel1.setText("UserName:");

        UserName.setBackground(new java.awt.Color(255, 255, 255));
        UserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(0, 38, 77));

        UserPhone.setBackground(new java.awt.Color(255, 255, 255));
        UserPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserPhone.setForeground(new java.awt.Color(0, 38, 77));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 38, 77));
        jLabel3.setText("Phone:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Table_users.setBackground(new java.awt.Color(255, 255, 255));
        Table_users.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_users.setForeground(new java.awt.Color(0, 38, 77));
        Table_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "UserName", "Password", "Phone"
            }
        ));
        Table_users.setGridColor(new java.awt.Color(0, 0, 0));
        Table_users.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Table_users.setSelectionForeground(new java.awt.Color(13, 41, 62));
        Table_users.setShowGrid(false);
        Table_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_users);

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
        jLabel9.setText("Users List");

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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(UserPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_delete)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_home)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_update)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
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
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(UserPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
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
            resultSet = statement.executeQuery("select * from USERS");
            Table_users.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void Button_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Button_closeMouseClicked

    private void Button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_addMouseClicked
        try {
              connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
              PreparedStatement add = connection.prepareStatement("insert into USERS values(?,?, ?)");
              add.setString(1, UserName.getText());
              add.setString(2, UserPassword.getText());
              add.setString(3, UserPhone.getText());
              int row = add.executeUpdate();
              JOptionPane.showMessageDialog(this, "Succesfully added new user!");
              connection.close();
              showData();
          } catch (SQLException ex) {            
                ex.printStackTrace();
        }  
    }//GEN-LAST:event_Button_addMouseClicked

    private void Button_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_deleteMouseClicked
        if(UserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty id field. Pls enter categorie's id");
        }else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String Id = UserName.getText().toString();
                String Query = "delete from USERS where USERNAME='"+Id+"'";
                Statement Add = connection.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted: "+Id);
                showData();
            }catch (SQLException ex) {            
                ex.printStackTrace();
            }  
        }
    }//GEN-LAST:event_Button_deleteMouseClicked

    private void Button_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_updateMouseClicked
        if(UserName.getText().isEmpty() || UserPassword.getText().isEmpty() || UserPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty field!");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String UpdateQuery = "update USERS set USERNAME='"+UserName.getText()+"'"+", PASSWORD='"+UserPassword.getText()+"'"+""+", PHONE='"+UserPhone.getText().toString()+"'"+" where USERNAME='"+UserName.getText()+"'";
                Statement Add = connection.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Updated user data");
                showData();
            }catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_Button_updateMouseClicked

    private void Button_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_homeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_homeMouseClicked

    private void Table_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_usersMouseClicked
        DefaultTableModel model = (DefaultTableModel)Table_users.getModel();
        int id = Table_users.getSelectedRow();
        UserName.setText(model.getValueAt(id, 0).toString());
        UserPassword.setText(model.getValueAt(id, 1).toString());
        UserPhone.setText(model.getValueAt(id, 2).toString());
    }//GEN-LAST:event_Table_usersMouseClicked

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_close;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_home;
    private javax.swing.JButton Button_update;
    private javax.swing.JTable Table_users;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserPassword;
    private javax.swing.JTextField UserPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
