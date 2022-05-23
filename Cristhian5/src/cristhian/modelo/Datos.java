package cristhian.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Datos {
       
    myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/DatosModelo");
    public Datos() {
        
    }
    
        public void printListaArticulos(){
    String insert = "SELECT * FROM ARTICULOS";
    mystatObj.executeUpdate(insert);
    }
    
    public void printClientes(){
    String insert = "SELECT * FROM CLIENTES";
    mystatObj.executeUpdate(insert);
    }

    public void printClientesEstandard(){
    String insert = "SELECT * FROM CLIENTESESTANDARD";
    mystatObj.executeUpdate(insert);
    }

    public void printClientesPremium(){
    String insert = "SELECT * FROM CLIENTESPREMIUM";
    mystatObj.executeUpdate(insert);
    }
    
    public void printPedidosPendientes(){
    String insert = "SELECT * FROM PEDIDOS WHERE ENVIADO=FALSE";
    mystatObj.executeUpdate(insert);
    }
    
    public void printPedidosEnviados(){
    String insert = "SELECT * FROM PEDIDOS WHERE ENVIADO=TRUE";
    mystatObj.executeUpdate(insert);
    }

    public void setListaArticulos() {
        String codigo;
        String descripcion;
        float precioVenta;
        float gastoEnvio;
        Scanner sc=new Scanner(System.in);
        System.out.print("Codigo de articulo: ");
        codigo=sc.nextLine();
        System.out.print("Descripcion de articulo: ");
        descripcion=sc.nextLine();
        System.out.print("Precio de venta de articulo: ");
        precioVenta=sc.nextFloat();
        System.out.print("Gasto de envio de articulo: ");
        gastoEnvio=sc.nextFloat();
        String insert = "INSERT INTO ARTICULOS VALUES('"+codigo+"','"+descripcion+"','"+precioVenta+"'+'"gastoEnvio"'+'"false"'+"');";
        mystatObj.executeUpdate(insert);
    }

    public void setListaClientes() {
        Scanner sn = new Scanner(System.in);
        int tipo;
        String nombre;
        String dni;
        String correo;
        String direccion;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nombre de cliente: ");
        nombre=sc.nextLine();
        System.out.print("Dni de cliente: ");
        dni=sc.nextLine();
        System.out.print("Correo del cliente: ");
        correo=sc.nextLine();
        System.out.print("Gasto de envio de articulo: ");
        direccion=sc.nextLine();
        System.out.println("Elige tipo de Cliente: ");
        System.out.println("1. Cliente Estandard: ");
        System.out.println("2. Cliente Premium: ");
            tipo = sn.nextInt();
        if(tipo==1){
            String insert = "INSERT INTO CLIENTEESTANDARD VALUES('"+dni+"','"+nombre+"','"+correo+"'+'"direccion"'+"');";
            mystatObj.executeUpdate(insert);
        }else if(tipo==2){
            String insert = "INSERT INTO CLIENTEpremium VALUES('"+dni+"','"+nombre+"','"+correo+"'+'"direccion"'+"');";
            mystatObj.executeUpdate(insert);
        }
    }

    public void setListaPedidos() {
        int numPedido;
        int cantidad;
        LocalDate fecha;
        String dni;
        String codigo;
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero de pedido: ");
        numPedido=sc.nextInt();
        System.out.print("Cantidad de pedidos: ");
        cantidad=sc.nextInt();
        System.out.print("Fecha y hora de envio: ");
        fecha=sc.nextDate();
        System.out.print("Dni de cliente del pedido: ");
        dni=sc.nextLine();
        System.out.print("Codigo de articulo: ");
        codigo=sc.nextLine();
        String insert = SELECT * FROM CLIENTES WHERE DNI ="+dni;"
         if(!mystatObj.executeUpdate(insert)){
         datos.setListaClientes();
        }
        String insert2 = "INSERT INTO PEDIDOS VALUES('"+numPedido+"','"+cantidad+"','"+fecha+"'+"','"+codigo+"'+'"dni"'+"');";
            mystatObj.executeUpdate(insert2);
        
    }

    public void eliminarPedido(){
        int numPedido;
        Scanner sc=new Scanner(System.in);
        System.out.print("Numero de pedido a eliminar: ");
        numPedido=sc.nextInt();
        String insert = DELETE * FROM PEDIDOS WHERE numPedido ="+numpedido+ AND ENVIADO=FALSE;"
    }
}
