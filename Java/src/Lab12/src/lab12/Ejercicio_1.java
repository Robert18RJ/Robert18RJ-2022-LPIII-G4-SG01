package lab12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ejercicio_1 extends javax.swing.JFrame {

    public Ejercicio_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnMostrar = new javax.swing.JButton();
        jTextSQL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TMostrar = new javax.swing.JTable();
        jTextFiltrar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnMostrar.setText("Submit Query");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        TMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TMostrar);

        jLabel1.setText("Filter");

        BtnFiltrar.setText("Apply Filter");
        BtnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnFiltrar)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        try {
            mostrar("cursos");
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejercicio_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFiltrarActionPerformed
        try {
            filtrar("cursos");
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejercicio_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnFiltrarActionPerformed

    /////Interface Rowsset/////
    public void mostrar(String tabla) throws SQLException, ClassNotFoundException {
        //Variables        
        String sql = jTextSQL.getText();

        //Conexion
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ejercicio_1");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        if (jTextSQL.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese una sentencia SQL");
        } else {
            rowSet.setCommand(sql);
            rowSet.execute();
        }

        System.out.println("sql");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IdCurso");
        model.addColumn("Descripcion");
        model.addColumn("Credito");
        TMostrar.setModel(model);

        String[] datos = new String[3];

        try {

            while (rowSet.next()) {
                datos[0] = rowSet.getString(1);
                datos[1] = rowSet.getString(2);
                datos[2] = rowSet.getString(3);
                model.addRow(datos);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }

    }

    public void filtrar(String tabla) throws SQLException, ClassNotFoundException {
        //Variables        
        String sql = "SELECT * FROM cursos WHERE " + jTextFiltrar.getText();

        //Conexion
        Class.forName("com.mysql.cj.jdbc.Driver");
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ejercicio_1");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        if (jTextFiltrar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese una sentencia SQL");
        } else {
            rowSet.setCommand(sql);
            rowSet.execute();
        }

        System.out.println("sql");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IdCurso");
        model.addColumn("Descripcion");
        model.addColumn("Credito");
        TMostrar.setModel(model);

        String[] datos = new String[3];

        try {

            while (rowSet.next()) {
                datos[0] = rowSet.getString(1);
                datos[1] = rowSet.getString(2);
                datos[2] = rowSet.getString(3);
                model.addRow(datos);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFiltrar;
    public javax.swing.JButton BtnMostrar;
    public javax.swing.JTable TMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFiltrar;
    private javax.swing.JTextField jTextSQL;
    // End of variables declaration//GEN-END:variables

}
