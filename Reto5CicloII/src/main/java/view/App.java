/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.table.DefaultTableModel;
import model.vo.*;
/**
 *
 * @author jealm_000
 */
public class App extends javax.swing.JFrame {
    /**
     * Creates new form Vista
     */
    public App() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        Informe1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInforme1 = new javax.swing.JTable();
        BotonInforme1 = new javax.swing.JButton();
        BorrarInforme1 = new javax.swing.JButton();
        Informe2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInforme2 = new javax.swing.JTable();
        BotonInforme2 = new javax.swing.JButton();
        BorrarInforme2 = new javax.swing.JButton();
        Informe3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaInforme3 = new javax.swing.JTable();
        BotonInforme3 = new javax.swing.JButton();
        BorrarInformea3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(600, 450));

        TablaInforme1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Lider", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaInforme1);

        BotonInforme1.setText("Cargar");
        BotonInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInforme1ActionPerformed(evt);
            }
        });

        BorrarInforme1.setText("Limpiar");
        BorrarInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarInforme1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Informe1Layout = new javax.swing.GroupLayout(Informe1);
        Informe1.setLayout(Informe1Layout);
        Informe1Layout.setHorizontalGroup(
            Informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Informe1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Informe1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(BotonInforme1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BorrarInforme1)
                .addGap(115, 115, 115))
        );
        Informe1Layout.setVerticalGroup(
            Informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Informe1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Informe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInforme1)
                    .addComponent(BorrarInforme1))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Informe 1", Informe1);

        TablaInforme2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Proyecto", "Constructora", "N° Habitaciones", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaInforme2);

        BotonInforme2.setText("Cargar");
        BotonInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInforme2ActionPerformed(evt);
            }
        });

        BorrarInforme2.setText("Limpiar");
        BorrarInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarInforme2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Informe2Layout = new javax.swing.GroupLayout(Informe2);
        Informe2.setLayout(Informe2Layout);
        Informe2Layout.setHorizontalGroup(
            Informe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Informe2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Informe2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(BotonInforme2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BorrarInforme2)
                .addGap(115, 115, 115))
        );
        Informe2Layout.setVerticalGroup(
            Informe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Informe2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Informe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInforme2)
                    .addComponent(BorrarInforme2))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Informe 2", Informe2);

        TablaInforme3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Compra", "Constructora ", "Banco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaInforme3);

        BotonInforme3.setText("Cargar");
        BotonInforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInforme3ActionPerformed(evt);
            }
        });

        BorrarInformea3.setText("Limpiar");
        BorrarInformea3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarInformea3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Informe3Layout = new javax.swing.GroupLayout(Informe3);
        Informe3.setLayout(Informe3Layout);
        Informe3Layout.setHorizontalGroup(
            Informe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Informe3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(BotonInforme3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BorrarInformea3)
                .addGap(115, 115, 115))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        Informe3Layout.setVerticalGroup(
            Informe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Informe3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Informe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInforme3)
                    .addComponent(BorrarInformea3))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Informe 3", Informe3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInforme1ActionPerformed
        // TODO add your handling code here:  
         TablaInforme1.setModel(Informe1Vo.valores());
           
    }//GEN-LAST:event_BotonInforme1ActionPerformed

    private void BotonInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInforme2ActionPerformed
        // TODO add your handling code here:
            TablaInforme2.setModel(Informe2Vo.valores());


    }//GEN-LAST:event_BotonInforme2ActionPerformed

    private void BotonInforme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInforme3ActionPerformed
        // TODO add your handling code here: 
            TablaInforme3.setModel(Informe3Vo.valores());
    }//GEN-LAST:event_BotonInforme3ActionPerformed

    private void BorrarInformea3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarInformea3ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelo = new DefaultTableModel();
            TablaInforme3.setModel(modelo);
            modelo.addColumn("ID Compra");
            modelo.addColumn("Constructora");
            modelo.addColumn("Banco");
            
    }//GEN-LAST:event_BorrarInformea3ActionPerformed

    private void BorrarInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarInforme1ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelo = new DefaultTableModel();
            TablaInforme1.setModel(modelo);
            modelo.addColumn("ID");
            modelo.addColumn("Lider");
            modelo.addColumn("Ciudad");
    }//GEN-LAST:event_BorrarInforme1ActionPerformed

    private void BorrarInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarInforme2ActionPerformed
        // TODO add your handling code here:
            DefaultTableModel modelo = new DefaultTableModel();
            TablaInforme2.setModel(modelo);
            modelo.addColumn("ID Proyecto");
            modelo.addColumn("Constructora");
            modelo.addColumn("N° Habitantes");
            modelo.addColumn("Ciudad");        
    }//GEN-LAST:event_BorrarInforme2ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarInforme1;
    private javax.swing.JButton BorrarInforme2;
    private javax.swing.JButton BorrarInformea3;
    private javax.swing.JButton BotonInforme1;
    private javax.swing.JButton BotonInforme2;
    private javax.swing.JButton BotonInforme3;
    private javax.swing.JPanel Informe1;
    private javax.swing.JPanel Informe2;
    private javax.swing.JPanel Informe3;
    private javax.swing.JTable TablaInforme1;
    private javax.swing.JTable TablaInforme2;
    private javax.swing.JTable TablaInforme3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}