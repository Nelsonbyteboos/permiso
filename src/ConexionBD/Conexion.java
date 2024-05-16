package ConexionBD;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;



public class Conexion {
     
    Connection conectar =null;
    String basededatos ="permisos";
    String usuario ="root";
    String contraseña ="";
    String url = "jdbc:mysql://localhost:3306/"+basededatos+"?useUnicode=true&characterEncoding=utf8";
    
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url, usuario, contraseña);
            
            
        } catch (ClassNotFoundException | SQLException e ){
            
            JOptionPane.showMessageDialog(null,"sin conexion"+e,"conexxion",JOptionPane.INFORMATION_MESSAGE);
        }
          return conectar;
}
    
}