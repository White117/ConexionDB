/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoyreplicacionpa;

import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.PreparedStatement;




public class FrmCliente extends javax.swing.JFrame {


    private Icon icono;
    private ImageIcon imagen;
    
    
    public FrmCliente() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.lblFondo,  "src/Imagenes/descarga.gif");

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID_Cliente = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtID_Empleado = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtObservacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCliente = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono1 = new javax.swing.JLabel();
        lblObservacion = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        txtObservacion1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID_Cliente.setForeground(new java.awt.Color(153, 255, 102));
        lblID_Cliente.setText("ID");
        getContentPane().add(lblID_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(153, 255, 102));
        lblCedula.setText("Cedula");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 255, 102));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(153, 255, 102));
        lblApellido.setText("Apellido");
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtID_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_EmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtID_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 7, 255, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 255, -1));
        getContentPane().add(txtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 255, -1));

        txtNombre.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 255, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 255, -1));

        btnNuevo.setBackground(new java.awt.Color(36, 133, 19));
        btnNuevo.setForeground(new java.awt.Color(153, 255, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 92, -1));

        btnEnviar.setBackground(new java.awt.Color(36, 133, 19));
        btnEnviar.setForeground(new java.awt.Color(153, 255, 102));
        btnEnviar.setText("Enviar");
        btnEnviar.setEnabled(false);
        btnEnviar.setFocusCycleRoot(true);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 92, -1));

        btnActualizar.setBackground(new java.awt.Color(36, 133, 19));
        btnActualizar.setForeground(new java.awt.Color(153, 255, 102));
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 93, -1));

        btnMostrar.setBackground(new java.awt.Color(36, 133, 19));
        btnMostrar.setForeground(new java.awt.Color(153, 255, 102));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 93, -1));

        jTCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cedula", "Nombre", "Apellido", "Telefono", "Observacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTCliente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 510, 145));

        btnEliminar.setBackground(new java.awt.Color(36, 133, 19));
        btnEliminar.setForeground(new java.awt.Color(153, 255, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 92, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 255, -1));

        lblTelefono1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefono1.setForeground(new java.awt.Color(153, 255, 102));
        lblTelefono1.setText("Telefono");
        getContentPane().add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblObservacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblObservacion.setForeground(new java.awt.Color(153, 255, 102));
        lblObservacion.setText("Observacion");
        getContentPane().add(lblObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 80, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.gif"))); // NOI18N
        lblFondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -70, 760, 520));
        getContentPane().add(txtObservacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 255, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtID_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_EmpleadoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.nuevo();
        btnEnviar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        this.enviar();
        btnEnviar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jTClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClienteMouseClicked
        this.mouseclick();
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_jTClienteMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.Actualizar();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       this.mostrar(jTCliente,"Select * from Cliente");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.Eliminar();
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

private void nuevo(){
    try{
       ClienteBeans Ca=new ClienteBeans();
       txtID_Empleado.setText(""+Ca.Incremento_Cliente()); 
       txtCedula.setText("");
       txtNombre.setText("");
       txtApellido.setText("");
       txtTelefono.setText("");
       txtObservacion.setText("");

                     
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error..."+ e.toString());  
    }
}
    
    private void enviar() {
    try {
        ClienteBeans Cl = new ClienteBeans();
        Cl.setID_Cliente(Integer.parseInt(txtID_Empleado.getText()));
        Cl.setCedula(txtCedula.getText());
        Cl.setNombre(txtNombre.getText());
        Cl.setApellido(txtApellido.getText());
        Cl.setTelefono(txtTelefono.getText());
        Cl.setObservacion(txtObservacion.getText());
        Cl.Insertar_Cliente();
        this.mostrar(jTCliente,"Select * from Cliente");
        
        JOptionPane.showMessageDialog(null, "La información se ha guardado con éxito");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error de la transacción... RollBack: " + e.toString());
    }
}
    
public void Actualizar() {
    ConexionDB conexionDB = new ConexionDB("localhost", "root", "root", "Cafeteria");

    try {
        conexionDB.ConectarDB();
        ClienteBeans Ca=new ClienteBeans();
        String query = "UPDATE Cliente SET Cedula=?, Nombre=?, Apellido=?, Telefono=?, Observacion=? WHERE ID_Cliente=?";
        PreparedStatement pstmt = conexionDB.getConexion().prepareStatement(query);
        pstmt.setString(1, txtCedula.getText());
        pstmt.setString(2, txtNombre.getText());
        pstmt.setString(3, txtApellido.getText());
        pstmt.setString(4, txtTelefono.getText());
        pstmt.setString(5, txtObservacion.getText());
        pstmt.setInt(6, (int) jTCliente.getValueAt(jTCliente.getSelectedRow(), 0));

        pstmt.executeUpdate();
 
        System.out.println("Transacción exitosa....Commit");
        this.mostrar(jTCliente,"Select * from Cliente");
    } catch (SQLException e) {
        System.out.println("Error de la transacción...RollBack: " + e.toString());
    } finally {
    }
}
    
    private void Eliminar(){
    ConexionDB conexionDB = new ConexionDB("localhost", "root", "root", "Cafeteria");
    String query="delete from Cliente  "+ "where ID_cliente='"+jTCliente.getValueAt(jTCliente.getSelectedRow(),0)+"';";
    try {
        conexionDB.ConectarDB();
        PreparedStatement pstmt = conexionDB.getConexion().prepareStatement(query);
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtObservacion.setText("");
        pstmt.executeUpdate();
    
    System.out.println("Transacción exitosa....Commit");
        this.mostrar(jTCliente,"Select * from Cliente");
    } catch (SQLException e) {
        System.out.println("Error de la transacción...RollBack: " + e.toString());
    } finally {
    }
    }

private void mostrar(javax.swing.JTable JT, String sql){
    try{
        ClienteBeans Cl = new ClienteBeans();
        ResultSet rs;
        DefaultTableModel modelo=new DefaultTableModel();
        JT.setModel(modelo);
        rs=Cl.ConsultarTabla(sql);
        ResultSetMetaData rsMd;
        rsMd = rs.getMetaData();
        int cantcolumnas=rsMd.getColumnCount();
        
        for (int i = 1; i <= cantcolumnas; i++) {
            modelo.addColumn(rsMd.getColumnLabel(i));
        }
        while(rs.next()){
            Object [] columna=new Object[cantcolumnas];
            for(int i = 0; i < cantcolumnas; i++){
                columna[i]=rs.getObject(i+1);
            }
            modelo.addRow(columna);
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }

}
    private void mouseclick(){
     
     int fila=jTCliente.getSelectedRow();
     txtID_Empleado.setText(jTCliente.getModel().getValueAt(fila, 0).toString());
     txtCedula.setText(jTCliente.getModel().getValueAt(fila, 1).toString());
     txtNombre.setText(jTCliente.getModel().getValueAt(fila, 2).toString());
     txtApellido.setText(jTCliente.getModel().getValueAt(fila, 3).toString());
     txtTelefono.setText(jTCliente.getModel().getValueAt(fila, 4).toString());
     txtObservacion.setText(jTCliente.getModel().getValueAt(fila, 5).toString());
     
}
    
    private  void pintarImagen(JLabel lbl, String ruta){
    
           this.imagen = new ImageIcon(ruta);
           this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
           lbl.setIcon(this.icono);
           this.repaint();
    }
   
    

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTCliente;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblID_Cliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObservacion;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtID_Empleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtObservacion1;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
