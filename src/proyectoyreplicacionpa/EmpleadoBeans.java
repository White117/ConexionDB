/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoyreplicacionpa;

/**
 *
 * @author Usuario
 */
import java.sql.*;


public class EmpleadoBeans {
    private int ID_empleado;
    private String Nombre; 
    private String Apellido; 
    private String Cargo; 
    private String Sueldo;
    ConexionDB db;


    public EmpleadoBeans() throws SQLException {
        db=new ConexionDB("localhost:3306","root","root","Cafeteria");
        db.ConectarDB();

    }

    public void setID_empleado(int ID_empleado) {
        this.ID_empleado = ID_empleado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setSueldo(String Sueldo) {
        this.Sueldo = Sueldo;
    }


    


    public int getID_empleado() {
        return ID_empleado;
    }

    public String getNombre() {
        return Nombre;
    }


    public String getApellido() {
        return Apellido;
    }

    public String getCargo() {
        return Cargo;
    }
    
    public String getSueldo(){
        return Sueldo;
    }
        public int Incremento_Empleado() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = db.ConsultaDB("SELECT MAX(ID_Empleado) AS num FROM Empleado;");
        if (rs.next()) {
            inc = rs.getInt("num") + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Empleado() throws SQLException {
        String cadena = "INSERT INTO Empleado VALUES ('" + Incremento_Empleado() + "', '" + getNombre() + "', '" + getApellido() + "', '" + getCargo() + "', '" + getSueldo() + "')";
        db.ActualizarDB(cadena);
    }
    
    public void Actualizar_Empleado(){
        
    }
    
    public void Eliminar_Empleado(){
        
    }
    public ResultSet ConsultarTabla(String sql)throws SQLException{
        return db.ConsultaDB(sql);

    }
    
    public void Consultar_Cliente() throws SQLException {
    ResultSet rs;
    rs = db.ConsultaDB("SELECT * FROM Empleado");
    while (rs.next()) {
        System.out.print(rs.getInt(1) + " ");
        System.out.print(rs.getString(2) + " ");
        System.out.print(rs.getString(3) + " ");
        System.out.print(rs.getString(4) + " ");
        System.out.print(rs.getString(5) + " ");
        System.out.println("");
    }
    }
}