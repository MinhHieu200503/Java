/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ql_xe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class CustomerGUI extends javax.swing.JPanel {

    /**
     * Creates new form ..
     */
    public CustomerGUI() {
        initComponents();
                
       
                
                
                
                
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        panelCustomerID = new javax.swing.JPanel();
        txtCustomerID = new RoundJTextField(30);
        labelCustomerID = new javax.swing.JLabel();
        panelName = new javax.swing.JPanel();
        txtName = new RoundJTextField(30);
        labelName = new javax.swing.JLabel();
        panelPhone = new javax.swing.JPanel();
        txtPhone = new RoundJTextField(30);
        labelPhone = new javax.swing.JLabel();
        panelAddress = new javax.swing.JPanel();
        labelAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextArea();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();

        setPreferredSize(new java.awt.Dimension(1580, 770));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("QUẢN LÝ KHÁCH HÀNG");
        Main.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1580, 60));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Header.setPreferredSize(new java.awt.Dimension(1580, 770));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCustomerID.setBackground(new java.awt.Color(255, 255, 255));
        panelCustomerID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCustomerID.setBackground(new java.awt.Color(255, 255, 255));
        txtCustomerID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtCustomerID.setForeground(new java.awt.Color(0, 0, 0));
        txtCustomerID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCustomerID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        panelCustomerID.add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        labelCustomerID.setBackground(new java.awt.Color(255, 255, 255));
        labelCustomerID.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelCustomerID.setForeground(new java.awt.Color(0, 0, 0));
        labelCustomerID.setText("Mã Khách Hàng:");
        panelCustomerID.add(labelCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        Header.add(panelCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 480, 40));

        panelName.setBackground(new java.awt.Color(255, 255, 255));
        panelName.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panelName.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 0));
        labelName.setText("Tên Khách Hàng:");
        panelName.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 480, 40));

        panelPhone.setBackground(new java.awt.Color(255, 255, 255));
        panelPhone.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPhone.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        panelPhone.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 270, 30));

        labelPhone.setBackground(new java.awt.Color(255, 255, 255));
        labelPhone.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelPhone.setForeground(new java.awt.Color(0, 0, 0));
        labelPhone.setText("Số Điện Thoại:");
        panelPhone.add(labelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 470, 40));

        panelAddress.setBackground(new java.awt.Color(255, 255, 255));
        panelAddress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAddress.setBackground(new java.awt.Color(255, 255, 255));
        labelAddress.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelAddress.setText("Địa Chỉ:");
        panelAddress.add(labelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        panelAddress.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 270, 100));
        txtAddress.setLineWrap(true);

        txtAddress.setWrapStyleWord(false);

        txtAddress.setBorder(new RoundBorderArea(10));

        Header.add(panelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 480, 110));

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-50 (2) (2).png"))); // NOI18N
        buttonAdd.setText("THÊM");
        buttonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonAdd.setIconTextGap(15);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        Header.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 40, 140, 40));

        buttonDelete.setBackground(new java.awt.Color(255, 255, 255));
        buttonDelete.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(0, 0, 0));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-20.png"))); // NOI18N
        buttonDelete.setText("XÓA");
        buttonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonDelete.setIconTextGap(15);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        Header.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 90, 140, 40));

        buttonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        buttonUpdate.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-write-20.png"))); // NOI18N
        buttonUpdate.setText("SỬA");
        buttonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonUpdate.setIconTextGap(15);
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        Header.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, 140, 40));

        buttonSearch.setBackground(new java.awt.Color(255, 255, 255));
        buttonSearch.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-20.png"))); // NOI18N
        buttonSearch.setText("TÌM");
        buttonSearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonSearch.setIconTextGap(15);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        Header.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, 140, 40));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1558, 251));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));
        scrollTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        table.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        table.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table.setColorSelBackgound(new java.awt.Color(51, 51, 51));
        table.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(false);
        table.setShowVerticalLines(true);
        table.setSurrendersFocusOnKeystroke(true);
        table.getTableHeader().setReorderingAllowed(false);
        scrollTable.setViewportView(table);
        model = new DefaultTableModel(new String[] {"Mã Khách Hàng", "Tên Khách Hàng", "Địa Chỉ", "Số Điện Thoại"},0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(model);
        model.addRow(new String []{"asd","asd","asdaskjdhasjkdhkjhdwquihwquidhuqiwhduidhiwquhduhausihdasuihduiqwhduiwqhduiwqhiwqd","asdjkashd"});

        Main.add(scrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, 1560, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 1584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIDActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelCustomerID;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JPanel panelAddress;
    private javax.swing.JPanel panelCustomerID;
    private javax.swing.JPanel panelName;
    private javax.swing.JPanel panelPhone;
    private javax.swing.JScrollPane scrollTable;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JLabel title;
    private javax.swing.JTextArea txtAddress;
    public javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    
    
    
    
    public class RoundJTextField extends JTextField {
    private Shape shape;
    public RoundJTextField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(Color.BLACK);
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}

    public class RoundBorderArea implements Border {

        private int radius;

        public RoundBorderArea(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, getRadius(), getRadius()));
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            int value = getRadius() / 2;
            return new Insets(value, value, value, value);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }

    }
    
}
