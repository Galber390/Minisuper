import java.util.ArrayList;
import java.util.Scanner;

// Clase Proveedor
class Proveedor {
        String nombre;
        String empresa;
        String fecha;
        String horaDeLlegada;
        String producto;
        String costoUnitario;
        int cantidadDeProductos;
        double costoDeProductos;

public Proveedor(String nombre, String empresa, String fecha, String horaDeLlegada,  String producto, String costoUnitario, String costoUnitario2, int cantidadDeProductos, double costoDeProductos) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.fecha = fecha;
        this.producto = producto;
        this.costoUnitario = costoUnitario;
        this.horaDeLlegada = horaDeLlegada;
        this.cantidadDeProductos = cantidadDeProductos;
        this.costoDeProductos = costoDeProductos;
        }

@Override
public String toString() {
        return "Nombre: " + nombre + 
        ", Nombre de la empresa: " + empresa +
        ", Fecha: " + fecha +
        ", Hora de llegada: " + horaDeLlegada +
        ", Producto: " + producto +
        ", Costo unitario: " + costoUnitario + 
        ", Cantidad de Productos: " + cantidadDeProductos + 
        ", Costo Total: $" + costoDeProductos;
}
}
public class MN {
public static void main(String [] args){
        //Variable
        ArrayList<String> Descripcion = new ArrayList<>();
        ArrayList<Float> Precio = new ArrayList<>();
        ArrayList<Integer> Cantidad = new ArrayList<>();
        int Opcion, Opcion1;
        //Leer datos
        Scanner leer = new Scanner(System.in);

        //Menu
        do {
        System.out.println("====================================");
        System.out.println("Bienvenido || Seleccione una opcion:");
        System.out.println("1.-Almacen");
        System.out.println("2.-Ventas");
        System.out.println("3.-Provedores");
        System.out.println("4.-Salir");
        System.out.println("====================================");
        System.out.println(" ");
        Opcion = leer.nextInt();
        //Almacen
        switch(Opcion){
        case 1:

        System.out.println("======================================");
        System.out.println("Esta en el inventario que desea hacer ");
        System.out.println("1.- REGISTRAR PRODUCTO");
        System.out.println("2.- VER");
        System.out.println("3.- QUITAR");
        System.out.println("4.- Buscar");
        System.out.println("========================");

        Opcion1 = leer.nextInt();
        switch(Opcion1){

                case 1:
                //Opcion para registrar producto
                
                System.out.println("\n\n======================");
                System.out.print("Descripcion: ");
                leer.nextLine();
                Descripcion.add(leer.nextLine());
                System.out.print("Precio: $");
                Precio.add(leer.nextFloat());
                        
                System.out.print("Cantidad: ");
                Cantidad.add(leer.nextInt());
                
                System.out.println("======================");
                break;
                
                case 2:
                //Opcion para ver los productos

                System.out.println("\n\n=========================");
                System.out.println("---PRODUCTOS ALMACENADOS---");
                System.out.println("=========================");
                for(int x = 0; x < Descripcion.size(); x++) {
                System.out.println("\n\n======================");
                System.out.println( "Posicion: "+ x);
                System.out.print("Descripcion: ");
                System.out.println(Descripcion.get(x));
                System.out.print("Precio: $");
                System.out.println(Precio.get(x));
                System.out.print("Cantidad: ");
                System.out.println(Cantidad.get(x));
                System.out.println("======================");}
                break;
                
                case 3:
                //Opcion para elimininar productos
                System.out.println("=============================================");
                System.out.print("Ingrese la posicion del producto a eliminar: ");
                int pos = leer.nextInt();

                if (pos >= 0 && pos < Descripcion.size()) {
                Descripcion.remove(pos);
                Precio.remove(pos);
                Cantidad.remove(pos);
                System.out.println("Producto eliminado correctamente.");
                } else {
                System.out.println("Posicion invalida.");
                }
                System.out.println("=============================================");
                break;
                case 4:
                System.out.println("=============================================");
                System.out.print("Ingrese el nombre del Producto a buscar: ");
                leer.nextLine();
                String buscarProducto = leer.nextLine();
                int indice = Descripcion.indexOf(buscarProducto);

                if (indice != -1) {
                System.out.println("Producto encontrado:");
                System.out.println("Descripcion: " + Descripcion.get(indice));
                System.out.println("Precio: " + Precio.get(indice));
                System.out.println("Cantidad: " + Cantidad.get(indice));
                } else {
                System.out.println("Producto no encontrado.");
                }
                System.out.println("=============================================");
                break;
                }
        break;
        case 2: System.out.println("========================================");
        System.out.println("A INGRESADO A VENTAS");
        System.out.println("================================================");
        System.out.println("1.- REGISTRO DE VENTAS");
        System.out.println("2.- SODASASDCASC");
        System.out.println("3.-  VACIO XD XD XD XD XD");
        System.out.println("1.- REGISTRO");

        break;
        //Provedores
        case 3:
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        int opcion;
        
        do {
                System.out.println("====================================");
                System.out.println("Gestio de proveedores");
                System.out.println("1.-Agregar proveedor");
                System.out.println("2.-Mostrar lista de proveedores");
                System.out.println("3.-Salir");
                System.out.println("====================================");
                opcion = leer.nextInt();
                leer.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                case 1 -> {
                        
                        System.out.print("Nombre del proveedor: ");
                        String nombre = leer.nextLine();
                        
                        System.out.print("Nombre de la empresa: ");
                        String empresa = leer.nextLine();

                        System.out.print("Fecha: ");
                        String fecha = leer.nextLine();

                        System.out.print("Hora de llegada: (24 Horas) ");
                        String horaDeLlegada = leer.nextLine();

                        System.out.print("Nombre de producto: ");
                        String producto = leer.nextLine();

                        System.out.print("Costo por Pieza: ");
                        String costoUnitario = leer.nextLine();

                        System.out.print("Cantidad de productos: ");
                        int cantidadDeProductos = leer.nextInt();

                        System.out.print("Costo total de productos comprados: ");
                        double costoDeProductos = leer.nextDouble();

                        leer.nextLine(); // Limpiar el buffer
                        
                        Proveedor proveedor = new Proveedor (nombre, empresa, fecha, horaDeLlegada, producto, costoUnitario, costoUnitario, cantidadDeProductos, costoDeProductos);

                        proveedores.add(proveedor);
                        System.out.println("¡Proveedor registrado correctamente!");
                }
                        
                case 2 -> {
                        System.out.println("\n--- Lista de Proveedores ---");
                        for (Proveedor p : proveedores) {
                System.out.println(p);
                        } {
                        }
                }
                        
                case 3 -> System.out.println("Saliendo del sistema. ¡Gracias por usar el programa!");

                default -> System.out.println("Opción no válida. Por favor, intenta nuevamente.");
                }
        } while (opcion != 3);


        break;
        case 4:
        break;

        }
        }while (Opcion !=4); System.out.println("Cerrando programa");
        System.out.println("Programa cerrado");
        }
}



