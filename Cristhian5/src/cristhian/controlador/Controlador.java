package cristhian.controlador;

import cristhian.modelo.Articulo;
import cristhian.vista.Vista;
import cristhian.modelo.Datos;
import cristhian.modelo.Lista;
import cristhian.modelo.ListaArticulos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controlador {
    public static void main(String[] args) {
        Connection myconObj=null;
        Statement mystatObj=null;
        ResultSet myresObj=null;
        //myresObj=mystatObj.executeQuery("");
        try{
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/DatosModelo");
            mystatObj=myconObj.createStatement();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        Vista vista = new Vista();
        boolean salir=false;
        while(!salir){
            salir=vista.menuInicial(salir);
        }
    }
    
}
