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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Order extends javax.swing.JFrame {

    public Order() {
        initComponents();
        showDataProd();
        showDataCusto();
        showDataOrder();
        GetToday();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomersTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button_exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProdQnty = new javax.swing.JTextField();
        AddToOrder_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        DateLabel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CustomerName = new javax.swing.JTextField();
        OrderId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddOrder_button = new javax.swing.JButton();
        ViewOrder_button = new javax.swing.JButton();
        Home_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Order_table = new javax.swing.JTable();
        Amount_label = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Print_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        CustomersTable.setBackground(new java.awt.Color(255, 255, 255));
        CustomersTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CustomersTable.setForeground(new java.awt.Color(0, 38, 77));
        CustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone"
            }
        ));
        CustomersTable.setGridColor(new java.awt.Color(0, 0, 0));
        CustomersTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        CustomersTable.setSelectionForeground(new java.awt.Color(13, 41, 62));
        CustomersTable.setShowGrid(false);
        CustomersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomersTable);

        jPanel2.setBackground(new java.awt.Color(0, 38, 77));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 38, 77));
        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Orders");

        jLabel5.setBackground(new java.awt.Color(0, 38, 77));
        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Inventory Managment System");

        button_exit.setBackground(new java.awt.Color(255, 255, 255));
        button_exit.setForeground(new java.awt.Color(0, 38, 77));
        button_exit.setLabel("X");
        button_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_exit)
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
                    .addComponent(button_exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 38, 77));
        jLabel9.setText("Customers List");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 38, 77));
        jLabel3.setText("Quantity:");

        ProdQnty.setBackground(new java.awt.Color(255, 255, 255));
        ProdQnty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProdQnty.setForeground(new java.awt.Color(0, 38, 77));

        AddToOrder_button.setBackground(new java.awt.Color(0, 38, 77));
        AddToOrder_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddToOrder_button.setForeground(new java.awt.Color(255, 255, 255));
        AddToOrder_button.setText("Add To Order");
        AddToOrder_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToOrder_buttonMouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane2.setViewportView(ProductTable);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 38, 77));
        jLabel10.setText("Product List");

        DateLabel.setBackground(new java.awt.Color(255, 255, 255));
        DateLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(0, 38, 77));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 38, 77));
        jLabel6.setText("Date:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 38, 77));
        jLabel2.setText("Name:");

        CustomerName.setBackground(new java.awt.Color(255, 255, 255));
        CustomerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerName.setForeground(new java.awt.Color(0, 38, 77));

        OrderId.setBackground(new java.awt.Color(255, 255, 255));
        OrderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OrderId.setForeground(new java.awt.Color(0, 38, 77));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 38, 77));
        jLabel1.setText("Order Id:");

        AddOrder_button.setBackground(new java.awt.Color(0, 38, 77));
        AddOrder_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddOrder_button.setForeground(new java.awt.Color(255, 255, 255));
        AddOrder_button.setText("Add Order");
        AddOrder_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrder_buttonMouseClicked(evt);
            }
        });

        ViewOrder_button.setBackground(new java.awt.Color(0, 38, 77));
        ViewOrder_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewOrder_button.setForeground(new java.awt.Color(255, 255, 255));
        ViewOrder_button.setText("View Orders");
        ViewOrder_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrder_buttonMouseClicked(evt);
            }
        });

        Home_button.setBackground(new java.awt.Color(0, 38, 77));
        Home_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Home_button.setForeground(new java.awt.Color(255, 255, 255));
        Home_button.setText("Home");
        Home_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_buttonMouseClicked(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        Order_table.setBackground(new java.awt.Color(255, 255, 255));
        Order_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Order_table.setForeground(new java.awt.Color(0, 38, 77));
        Order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Num", "Product", "Quantity", "UPrice", "Total"
            }
        ));
        Order_table.setGridColor(new java.awt.Color(0, 0, 0));
        Order_table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Order_table.setSelectionForeground(new java.awt.Color(13, 41, 62));
        Order_table.setShowGrid(false);
        jScrollPane3.setViewportView(Order_table);

        Amount_label.setBackground(new java.awt.Color(255, 255, 255));
        Amount_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amount_label.setForeground(new java.awt.Color(0, 38, 77));
        Amount_label.setText("Amount");

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

        Price.setBackground(new java.awt.Color(255, 255, 255));
        Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Price.setForeground(new java.awt.Color(0, 38, 77));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 38, 77));
        jLabel7.setText("Price:");

        Print_button.setBackground(new java.awt.Color(0, 38, 77));
        Print_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Print_button.setForeground(new java.awt.Color(255, 255, 255));
        Print_button.setText("Print");
        Print_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Print_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(211, 211, 211))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ViewOrder_button)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AddOrder_button))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CustomerName)
                                        .addComponent(OrderId)
                                        .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Home_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ProdQnty, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(AddToOrder_button)))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Print_button)
                .addGap(112, 112, 112))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProdQnty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddToOrder_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Print_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddOrder_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewOrder_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Home_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(161, 161, 161)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showDataProd()
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
    
    public void showDataCusto()
    {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from CUSTOMERS");
            CustomersTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void showDataOrder()
    {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from ORDERS");
            Order_table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void GetToday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime nowTime = LocalDateTime.now();
        DateLabel.setText(dtf.format(nowTime));
    }
    
    private void update() {
        int newQty = oldQty - Integer.valueOf(ProdQnty.getText());
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
            String UpdateQuery = "update PRODUCTS set QUANTITY='"+newQty+"'"+" where ID="+productId;
            Statement Add = connection.createStatement();
            Add.executeUpdate(UpdateQuery);
            //JOptionPane.showMessageDialog(this, "Updated customers data");
            showDataProd();
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void Home_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_buttonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Home_buttonMouseClicked

    private void button_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_button_exitMouseClicked

    private void CustomersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomersTable.getModel();
        int id = CustomersTable.getSelectedRow();
        CustomerName.setText(model.getValueAt(id, 1).toString());
    }//GEN-LAST:event_CustomersTableMouseClicked
int i=1, UPrice, totP=0, total;
String Prodname;
    private void AddToOrder_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrder_buttonMouseClicked
        if(flag == 0 || ProdQnty.getText().isEmpty() || Price.getText().isEmpty()) {
               JOptionPane.showConfirmDialog(this, "Select Product and Enter Quantity");
        }else {
        UPrice = Integer.valueOf(Price.getText());
        totP = UPrice * Integer.valueOf(ProdQnty.getText());
        Vector vector = new Vector();
        vector.add(i);
        vector.add(Prodname);
        vector.add(ProdQnty.getText());
        vector.add(UPrice);
        vector.add(totP);
        DefaultTableModel model = (DefaultTableModel)Order_table.getModel();
        model.addRow(vector);
        total += totP;
        Amount_label.setText("Total: "+total);
        update();
        i++;
        }
    }//GEN-LAST:event_AddToOrder_buttonMouseClicked
    int flag = 0, productId, oldQty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int id = ProductTable.getSelectedRow();
        productId = Integer.valueOf(model.getValueAt(id, 0).toString());
        Prodname = model.getValueAt(id, 1).toString();
        oldQty = Integer.valueOf(model.getValueAt(id, 2).toString());
        flag = 1;
    }//GEN-LAST:event_ProductTableMouseClicked

    private void ViewOrder_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrder_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewOrder_buttonMouseClicked

    private void AddOrder_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrder_buttonMouseClicked
        if(OrderId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter order id");
        }else {
            try {
              connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDb", "User1", "1234");
              PreparedStatement add = connection.prepareStatement("insert into ORDERS values(?,?,?,?)");
              add.setInt(1, Integer.valueOf(OrderId.getText()));
              add.setString(2, CustomerName.getText());
              add.setString(3, DateLabel.getText());
              add.setInt(4, Integer.valueOf(Amount_label.getText()));
              int row = add.executeUpdate();
              JOptionPane.showMessageDialog(this, "Succesfully added new order!");
              connection.close();
              showDataOrder();
          } catch (SQLException ex) {            
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddOrder_buttonMouseClicked

    private void Print_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Print_buttonMouseClicked
        try {
        OrderId.print();        
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Print_buttonMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrder_button;
    private javax.swing.JButton AddToOrder_button;
    private javax.swing.JTextField Amount_label;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JTable CustomersTable;
    private javax.swing.JTextField DateLabel;
    private javax.swing.JButton Home_button;
    private javax.swing.JTextField OrderId;
    private javax.swing.JTable Order_table;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Print_button;
    private javax.swing.JTextField ProdQnty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton ViewOrder_button;
    private javax.swing.JButton button_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
