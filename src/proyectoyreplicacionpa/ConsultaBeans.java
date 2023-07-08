/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoyreplicacionpa;

import java.sql.*;





public class ConsultaBeans {
    private int ID_Producto;
    private String Producto; 
    private String Precio; 
    private String Cantidad; 
    private String Caducidad;
    private String Proveedor;
    ConexionDB db;


    public ConsultaBeans() throws SQLException {
        db=new ConexionDB("localhost:3306","root","root","Cafeteria");
        db.ConectarDB();

    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }
    
    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public String getProducto() {
        return Producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public String getCaducidad() {
        return Caducidad;
    }
    
    public String getProveedor(){
        return Proveedor;
    }
    
        public int Incremento_Producto() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = db.ConsultaDB("SELECT MAX(ID_Producto) AS num FROM Producto;");
        if (rs.next()) {
            inc = rs.getInt("num") + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Producto() throws SQLException {
        String cadena = "INSERT INTO Producto VALUES ('" + Incremento_Producto() + "', '" + getProducto() + "', '" + getPrecio() + "', '" + getCantidad() + "', '" + getCaducidad() + "', '" + getProveedor() + "')";
        db.ActualizarDB(cadena);
    }
    
    public void Actualizar_Producto(){
        
    }
    
    public void Eliminar_Producto(){
        
    }
    public ResultSet ConsultarTabla(String sql)throws SQLException{
        return db.ConsultaDB(sql);

    }
    
    public void Consultar_Producto() throws SQLException {
    ResultSet rs;
    rs = db.ConsultaDB("SELECT * FROM Productoselect Producto, precio, cantidad, Precio * cantidad as total from Producto;");
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
    