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

/**
 *
 * @author Kubus
 */
public class ProductPage extends javax.swing.JFrame {

    /**
     * Creates new form ProductPage
     */
    public ProductPage() {
        initComponents();
        showData();
        GetCategory();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        ProdQnty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ProdDesc = new javax.swing.JTextField();
        ProdCat = new javax.swing.JComboBox<>();
        Button_delete = new javax.swing.JButton();
        Button_add = new javax.swing.JButton();
        Button_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1328, 687));

        jPanel2.setBackground(new java.awt.Color(0, 38, 77));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 38, 77));
        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Product");

        jLabel5.setBackground(new java.awt.Color(0, 38, 77));
        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inventory Managment System");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 38, 77));
        jButton1.setLabel("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(588, 588, 588))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 38, 77));
        jLabel2.setText("Category:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 38, 77));
        jLabel1.setText("Id:");

        ProdId.setBackground(new java.awt.Color(255, 255, 255));
        ProdId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProdId.setForeground(new java.awt.Color(0, 38, 77));

        ProdQnty.setBackground(new java.awt.Color(255, 255, 255));
        ProdQnty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProdQnty.setForeground(new java.awt.Color(0, 38, 77));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 38, 77));
        jLabel3.setText("Quantity:");

        ProdName.setBackground(new java.awt.Color(255, 255, 255));
        ProdName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProdName.setForeground(new java.awt.Color(0, 38, 77));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 38, 77));
        jLabel6.setText("Product Name:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        ProductTable.setBackground(new java.awt.Color(255, 255, 255));
        ProductTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ProductTable.setForeground(new java.awt.Color(0, 38, 77));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Quantity", "Description", "Category"
            }
        ));
        ProductTable.setGridColor(new java.awt.Color(0, 0, 0));
        ProductTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        ProductTable.setSelectionForeground(new java.awt.Color(13, 41, 62));
        ProductTable.setShowGrid(false);
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

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
        jLabel9.setText("Product List");

        Home.setBackground(new java.awt.Color(0, 38, 77));
        Home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 38, 77));
        jLabel8.setText("Description:");

        ProdDesc.setBackground(new java.awt.Color(255, 255, 255));
        ProdDesc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProdDesc.setForeground(new java.awt.Color(0, 38, 77));

        ProdCat.setBackground(new java.awt.Color(255, 255, 255));
        ProdCat.setForeground(new java.awt.Color(0, 38, 77));

        Button_delete.setBackground(new java.awt.Color(0, 38, 77));
        Button_delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Button_delete.setForeground(new java.awt.Color(255, 255, 255));
        Button_delete.setText("Delete");
        Button_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_deleteMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProdQnty, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(ProdDesc)
                            .addComponent(ProdId)
                            .addComponent(ProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(ProdCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Button_delete)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Home)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_update)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(379, 379, 379))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProdQnty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProdCat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_add)
                            .addComponent(Button_delete)
                            .addComponent(Button_update))
                        .addGap(18, 18, 18)
                        .addComponent(Home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 113, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showData()
    {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from PRODUCTS");
            ProductTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void GetCategory() {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            statement = connection.createStatement();
            String query = "select * from CATEGORY";
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                   String myCategory = resultSet.getString("CATEGORYNAME");
                   ProdCat.addItem(myCategory);
            }
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int id = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(id, 0).toString());
        ProdName.setText(model.getValueAt(id, 1).toString());
        ProdQnty.setText(model.getValueAt(id, 2).toString());
        ProdDesc.setText(model.getValueAt(id, 3).toString());
        ProdCat.setSelectedItem(model.getValueAt(id, 4).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void Button_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_deleteMouseClicked
        if(ProdId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty id field. Please enter customer's id");
        }else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String Id = ProdId.getText();
                String Query = "delete from PRODUCTS where ID="+Id;
                Statement Add = connection.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Deleted product with id: "+Id);
                showData();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_Button_deleteMouseClicked

    private void Button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_addMouseClicked
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            String query = "insert into PRODUCTS values(?,?,?,?,?)";
            PreparedStatement add = connection.prepareStatement(query);
            add.setInt(1, Integer.valueOf(ProdId.getText()));
            add.setString(2, ProdName.getText());
            add.setInt(3, Integer.valueOf(ProdQnty.getText()));
            add.setString(4, ProdDesc.getText());
            add.setString(5, ProdCat.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Succesfully added new product!");
            connection.close();
            showData();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Button_addMouseClicked

    private void Button_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_updateMouseClicked
        if(ProdId.getText().isEmpty() || ProdName.getText().isEmpty() || ProdQnty.getText().isEmpty() || ProdDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Empty field!");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
                String UpdateQuery = "update PRODUCTS set PRODUCTNAME='"+ProdName.getText()+"'"+", QUANTITY='"+ProdQnty.getText()+"'"+", DESCRIPTION='"+ProdDesc.getText()+"'"+", CATEGORY='"+ProdCat.getSelectedItem().toString()+"'"+" where ID="+ProdId.getText();
                Statement Add = connection.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Updated products data");
                showData();
            }catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_Button_updateMouseClicked

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
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add;
    private javax.swing.JButton Button_delete;
    private javax.swing.JButton Button_update;
    private javax.swing.JButton Home;
    private javax.swing.JComboBox<String> ProdCat;
    private javax.swing.JTextField ProdDesc;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdQnty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
