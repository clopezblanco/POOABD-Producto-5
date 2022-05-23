package cristhian.vista;

import cristhian.modelo.Datos;
import java.util.Scanner;
import cristhian.modelo.Lista;

public class Vista {
    Datos datos = new Datos();
    Lista lista = new Lista();
    
    public boolean menuInicial(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(!salir){
            System.out.println("");
            System.out.println("1. Gestión de Artículos");
            System.out.println("2. Gestión de Clientes");
            System.out.println("3. Gestión de Pedidos");
            System.out.println("0. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        menuArticulos(salir);
                    break;
                case 2:
                        menuClientes(salir);
                    break;
                case 3:
                        menuPedidos(salir);
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);
    }
    
    public boolean menuArticulos(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        
        while(!salir){
            System.out.println("");
            System.out.println("1. Añadir Articulo");
            System.out.println("2. Mostrar Articulos");
            System.out.println("0. Volver");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        datos.setListaArticulos();
                    break;
                case 2:
                        datos.printListaArticulos();
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);        
    }
    
    public boolean menuClientes(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        
        while(!salir){
            System.out.println("");
            System.out.println("1. Añadir Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Mostrar Clientes Estándar");
            System.out.println("4. Mostrar Clientes Premium");
            System.out.println("0. Volver");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        datos.setListaClientes();
                    break;
                case 2:
                        datos.printClientes();
                    break;
                case 3:
                        datos.printClientesEstandard();
                    break;
                case 4:
                        datos.printClientesPremium();
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);        
    }
    
    public boolean menuPedidos(boolean salir){
        Scanner sn = new Scanner(System.in);
        int opcion;
        
        while(!salir){
            System.out.println("");
            System.out.println("1. Añadir Pedido");
            System.out.println("2. Eliminar pedido");
            System.out.println("3. Mostrar Pedidos Pendientes");
            System.out.println("4. Mostrar Pedidos Enviados");
            System.out.println("0. Volver");
            System.out.println("Elige una opcion: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                        datos.setListaPedidos(lista);
                    break;
                case 2:
                        datos.eliminarPedido();
                    break;
                case 3:
                        data.printPedidosPendientes();
                    break;
                case 4:
                        data.printPedidosEnviados();
                    break;
                case 0:
                    salir=true;
            }
        }
        return(salir);        
    }
}
