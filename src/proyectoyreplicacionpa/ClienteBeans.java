/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoyreplicacionpa;

import java.sql.*;


public class ClienteBeans {
    private int ID_Cliente;
    private String Cedula; 
    private String Nombre; 
    private String Apellido; 
    private String Telefono;
    private String Observacion;
    ConexionDB db;


    public ClienteBeans() throws SQLException {
        db=new ConexionDB("localhost:3306","root","root","Cafeteria");
        db.ConectarDB();

    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }
    
    public String getObservacion(){
        return Observacion;
    }
    
        public int Incremento_Cliente() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = db.ConsultaDB("SELECT MAX(ID_Cliente) AS num FROM Cliente;");
        if (rs.next()) {
            inc = rs.getInt("num") + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Cliente() throws SQLException {
        String cadena = "INSERT INTO Cliente VALUES ('" + Incremento_Cliente() + "', '" + getCedula() + "', '" + getNombre() + "', '" + getApellido() + "', '" + getTelefono() + "', '" + getObservacion() + "')";
        db.ActualizarDB(cadena);
    }
    
    public void Actualizar_Cliente(){
        
    }
    
    public void Eliminar_Cliente(){
        
    }
    public ResultSet ConsultarTabla(String sql)throws SQLException{
        return db.ConsultaDB(sql);

    }
    
    public void Consultar_Cliente() throws SQLException {
    ResultSet rs;
    rs = db.ConsultaDB("SELECT * FROM Cliente");
    while (rs.next()) {
        System.out.print(rs.getInt(1) + " ");
        System.out.print(rs.getString(2) + " ");
        System.out.print(rs.getString(3) + " ");
        System.out.print(rs.getString(4) + " ");
        System.out.print(rs.getString(5) + " ");
        System.out.print(rs.getString(6) + " ");
        System.out.println("");
    }
    }
}
    
    




