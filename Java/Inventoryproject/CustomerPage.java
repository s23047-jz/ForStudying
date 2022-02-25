/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventoryproject;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class CustomerPage extends javax.swing.JFrame {

    /**
     * Creates new form CustomerPage
     */
    public CustomerPage() {
        initComponents();
        showData();
    }


    Connection connection = null;
    Statement statement = null, statement1 = null;
    ResultSet resultSet = null, resultSet1 = null;  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Button_exit = new javax.swing.JButton();
        CustomerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CustomerId = new javax.swing.JTextField();
        CustomerPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_customers = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Button_add = new javax.swing.JButton();
        Button_update = new javax.swing.JButton();
        Button_delete = new javax.swing.JButton();
        Button_home = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Label_orderNumber = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Label_orderAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1328, 687));

        jPanel2.setBackground(new java.awt.Color(0, 38, 77));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 38, 77));
        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Customers");

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
                .addGap(459, 459, 459)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addComponent(Button_exit)
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Button_exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CustomerName.setBackground(new java.awt.Color(255, 255, 255));
        CustomerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(0, 38, 77));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 38, 77));
        jLabel2.setText("Name:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 38, 77));
        jLabel1.setText("Customer Id:");

        CustomerId.setBackground(new java.awt.Color(255, 255, 255));
        CustomerId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerId.setForeground(new java.awt.Color(0, 38, 77));

        CustomerPhone.setBackground(new java.awt.Color(255, 255, 255));
        CustomerPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerPhone.setForeground(new java.awt.Color(0, 38, 77));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 38, 77));
        jLabel3.setText("Phone:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        Table_customers.setBackground(new java.awt.Color(255, 255, 255));
        Table_customers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_customers.setForeground(new java.awt.Color(0, 38, 77));
        Table_customers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone"
            }
        ));
        Table_customers.setGridColor(new java.awt.Color(0, 0, 0));
        Table_customers.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Table_customers.setSelectionForeground(new java.awt.Color(13, 41, 62));
        Table_customers.setShowGrid(false);
        Table_customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_customersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_customers);

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
        jLabel9.setText("Customers List");

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

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Order Number");

        Label_orderNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_orderNumber.setForeground(new java.awt.Color(255, 255, 255));
        Label_orderNumber.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_orderNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Label_orderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order Amount");

        Label_orderAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_orderAmount.setForeground(new java.awt.Color(255, 255, 255));
        Label_orderAmount.setText("X");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_orderAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(Label_orderAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(365, 365, 365))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(CustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(CustomerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_delete)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_home)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_update)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_add)
                            .addComponent(Button_delete)
                            .addComponent(Button_update))
                        .addGap(18, 18, 18)
                        .addComponent(Button_home))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
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
            resultSet = statement.executeQuery("select * from CUSTOMERS");
            Table_customers.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    } 
    
    private void Table_customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_customersMouseClicked
        DefaultTableModel model = (DefaultTableModel)Table_customers.getModel();
        int id = Table_customers.getSelectedRow();
        CustomerId.setText(model.getValueAt(id, 0).toString());
        CustomerName.setText(model.getValueAt(id, 1).toString());
        CustomerPhone.setText(model.getValueAt(id, 2).toString());
        
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            statement = connection.createStatement();
            statement1 = connection.createStatement();
            resultSet = statement.executeQuery("select count(*) from ORDERS where CUSTNAME='"+model.getValueAt(id, 1).toString()+"'");
            resultSet1 = statement1.executeQuery("select sum(AMOUNT) from ORDERS where CUSTNAME='"+model.getValueAt(id, 1).toString()+"'");
            while(resultSet.next()) {
                Label_orderNumber.setText(""+resultSet.getInt(1));
            }
            while(resultSet1.next()) {
                Label_orderAmount.setText("Total: "+resultSet1.getInt(1));
            }
            
        }catch(SQLException e) {
            
        }
    }//GEN-LAST:event_Table_customersMouseClicked

    private void Button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_addMouseClicked
        try {
              connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
              PreparedStatement add = connection.prepareStatement("insert into CUSTOMERS values(?,?, ?)");
              add.setInt(1, Integer.valueOf(CustomerId.getText()));
              add.setString(2, CustomerName.getText());
              add.setString(3, CustomerPhone.getText());
              int row = add.executeUpdate();
              JOptionPane.showMessageDialog(this, "Succesfully added new customer!");
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
        if(CustomerId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty id field. Please enter customer's id");
        }else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String Id = CustomerId.getText();
                String Query = "delete from CUSTOMERS where ID="+Id;
                Statement Add = connection.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted customer with id: "+Id);
                showData();
            }catch (SQLException ex) {            
                ex.printStackTrace();
            }  
        }
    }//GEN-LAST:event_Button_deleteMouseClicked

    private void Button_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_updateMouseClicked
        if(CustomerId.getText().isEmpty() || CustomerName.getText().isEmpty() || CustomerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty field!");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String UpdateQuery = "update CUSTOMERS set NAME='"+CustomerName.getText()+"'"+", PHONE='"+CustomerPhone.getText()+"'"+" where ID="+CustomerId.getText();
                Statement Add = connection.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Updated customers data");
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
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_exit;
    private javax.swing.JButton Button_home;
    private javax.swing.JButton Button_update;
    private javax.swing.JTextField CustomerId;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JTextField CustomerPhone;
    private javax.swing.JLabel Label_orderAmount;
    private javax.swing.JLabel Label_orderNumber;
    private javax.swing.JTable Table_customers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
