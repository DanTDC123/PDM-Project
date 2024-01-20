/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Sora
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    protected String user;
    
    public Menu(String cusID) {
        this.user=cusID;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();
        j11 = new javax.swing.JLabel();
        j12 = new javax.swing.JLabel();
        j13 = new javax.swing.JLabel();
        j14 = new javax.swing.JLabel();
        j15 = new javax.swing.JLabel();
        j16 = new javax.swing.JLabel();
        j17 = new javax.swing.JLabel();
        j18 = new javax.swing.JLabel();
        j19 = new javax.swing.JLabel();
        j20 = new javax.swing.JLabel();
        jdes = new javax.swing.JLabel();
        jrat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SaiGon Delivery");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel11)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/spaghetti-bolognese-recipe.jpg"))); // NOI18N
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j1MouseEntered(evt);
            }
        });
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Tomata-Pizza.png"))); // NOI18N
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j2MouseEntered(evt);
            }
        });
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/171-1712915_mango-chicken-curry-nz-hd-png-download.png"))); // NOI18N
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j3MouseEntered(evt);
            }
        });
        jPanel1.add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/21b4645384abe4c8f018149cc424a67b.jpg"))); // NOI18N
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j4MouseEntered(evt);
            }
        });
        jPanel1.add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 100, 80));

        j5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/image_2024-01-02_204830823.png"))); // NOI18N
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j5MouseEntered(evt);
            }
        });
        jPanel1.add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        j6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/image_2024-01-02_204925643.png"))); // NOI18N
        j6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j6MouseEntered(evt);
            }
        });
        jPanel1.add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        j7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/image_2024-01-02_205002361.png"))); // NOI18N
        j7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j7MouseEntered(evt);
            }
        });
        jPanel1.add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        j8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/image_2024-01-02_205119810.png"))); // NOI18N
        j8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j8MouseEntered(evt);
            }
        });
        jPanel1.add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        j9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/image_2024-01-02_205157998.png"))); // NOI18N
        j9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j9MouseEntered(evt);
            }
        });
        jPanel1.add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        j10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/image_2024-01-02_205231640.png"))); // NOI18N
        j10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j10MouseEntered(evt);
            }
        });
        jPanel1.add(j10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        j11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/IMG_1918-scaled (1).jpg"))); // NOI18N
        j11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j11MouseEntered(evt);
            }
        });
        jPanel1.add(j11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        j12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/barbecue-ribs-cop (1).jpg"))); // NOI18N
        j12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j12MouseEntered(evt);
            }
        });
        jPanel1.add(j12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        j13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pad-thai-3 (1).jpg"))); // NOI18N
        j13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j13MouseEntered(evt);
            }
        });
        jPanel1.add(j13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        j14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Pepperonipizzahoriz-3d53b00a7cce429eae3bfb629df356ec (1).jpg"))); // NOI18N
        j14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j14MouseEntered(evt);
            }
        });
        jPanel1.add(j14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        j15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/th (1).jpg"))); // NOI18N
        j15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j15MouseEntered(evt);
            }
        });
        jPanel1.add(j15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, -1, -1));

        j16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/Low_FODMAP_Thai_Tom_Yum_Soup.original (1).jpg"))); // NOI18N
        j16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j16MouseEntered(evt);
            }
        });
        jPanel1.add(j16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        j17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/butter-chicken- (1).jpg"))); // NOI18N
        j17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j17MouseEntered(evt);
            }
        });
        jPanel1.add(j17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        j18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/FNKLIve_Elena-Besser_Steak-Frites-with-Red-Wine-Reduction-1_s4x3 (1).jpg"))); // NOI18N
        j18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j18MouseEntered(evt);
            }
        });
        jPanel1.add(j18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        j19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/chicken-fettuccine-alfredo-1 (1).jpg"))); // NOI18N
        j19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j19MouseEntered(evt);
            }
        });
        jPanel1.add(j19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        j20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/aedc167dc4a404f9396ea9b6a6e8ddf1 (1).jpg"))); // NOI18N
        j20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j20MouseEntered(evt);
            }
        });
        jPanel1.add(j20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        jdes.setBackground(new java.awt.Color(255, 255, 255));
        jdes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jdes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jdes.setText("Food Description:");
        jPanel1.add(jdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 560, 50));

        jrat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jrat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrat.setText("Food Rating: ");
        jPanel1.add(jrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        String id = "F001";
        int price = 12;
        Payment p = new Payment(id,this.user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j1MouseClicked

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
        String id = "F003";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j3MouseClicked

    private void j8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j8MouseClicked
        String id = "F008";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j8MouseClicked

    private void j7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j7MouseClicked
        String id = "F007";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j7MouseClicked

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        String id = "F002";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j2MouseClicked

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        String id = "F004";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j4MouseClicked

    private void j6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseClicked
        String id = "F006";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j6MouseClicked

    private void j9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j9MouseClicked
        String id = "F009";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j9MouseClicked

    private void j10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j10MouseClicked
        String id = "F010";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j10MouseClicked

    private void j20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j20MouseClicked
        String id = "F020";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j20MouseClicked

    private void j12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j12MouseClicked
        String id = "F012";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j12MouseClicked

    private void j17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j17MouseClicked
        String id = "F017";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j17MouseClicked

    private void j19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j19MouseClicked
        String id = "F019";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j19MouseClicked

    private void j18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j18MouseClicked
        String id = "F018";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j18MouseClicked

    private void j11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j11MouseClicked
        String id = "F011";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j11MouseClicked

    private void j16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j16MouseClicked
        String id = "F016";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j16MouseClicked

    private void j13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j13MouseClicked
        String id = "F013";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j13MouseClicked

    private void j14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j14MouseClicked
        String id = "F014";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j14MouseClicked

    private void j15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j15MouseClicked
        String id = "F015";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j15MouseClicked

    private void j1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseEntered
        String id = "F001";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j1MouseEntered

    private void j2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseEntered
        String id = "F002";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j2MouseEntered

    private void j3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseEntered
        String id = "F003";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j3MouseEntered

    private void j4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseEntered
        String id = "F004";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j4MouseEntered

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        String id = "F005";
        int price = 12;
        Payment p = new Payment(id,user,price);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_j5MouseClicked

    private void j5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseEntered
        String id = "F005";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j5MouseEntered

    private void j6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseEntered
        String id = "F006";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j6MouseEntered

    private void j7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j7MouseEntered
        String id = "F007";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } 

    }//GEN-LAST:event_j7MouseEntered

    private void j8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j8MouseEntered
        String id = "F008";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j8MouseEntered

    private void j9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j9MouseEntered
        String id = "F009";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j9MouseEntered

    private void j10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j10MouseEntered
        String id = "F010";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j10MouseEntered

    private void j11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j11MouseEntered
        String id = "F011";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j11MouseEntered

    private void j12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j12MouseEntered
        String id = "F012";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j12MouseEntered

    private void j13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j13MouseEntered
        String id = "F013";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j13MouseEntered

    private void j14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j14MouseEntered
        String id = "F014";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j14MouseEntered

    private void j15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j15MouseEntered
        String id = "F015";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j15MouseEntered

    private void j16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j16MouseEntered
        String id = "F016";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j16MouseEntered

    private void j17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j17MouseEntered
        String id = "F017";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j17MouseEntered

    private void j18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j18MouseEntered
        String id = "F018";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j18MouseEntered

    private void j19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j19MouseEntered
        String id = "F019";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j19MouseEntered

    private void j20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j20MouseEntered
        String id = "F020";
        String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=Project;user=sa;password=sa";
        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery("Select foodDescription, foodRating From Menu Where foodID='"+id+"';");
            if (rs.next()){
                jdes.setText(""+rs.getString(1));
                jrat.setText(""+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_j20MouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jdes.setText("Food Descriptions");
        jrat.setText("Food Ratings");
    }//GEN-LAST:event_jPanel1MouseEntered

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j11;
    private javax.swing.JLabel j12;
    private javax.swing.JLabel j13;
    private javax.swing.JLabel j14;
    private javax.swing.JLabel j15;
    private javax.swing.JLabel j16;
    private javax.swing.JLabel j17;
    private javax.swing.JLabel j18;
    private javax.swing.JLabel j19;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j20;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel j9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jdes;
    private javax.swing.JLabel jrat;
    // End of variables declaration//GEN-END:variables
}