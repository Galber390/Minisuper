import java.util.ArrayList;
import java.util.Scanner;
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
        System.out.println("1.-Inventario");
        System.out.println("2.-Ventas");
        System.out.println("3.-Compras");
        System.out.println("4.-Salir");
        System.out.println("====================================");
        System.out.println(" ");
        Opcion = leer.nextInt();
        //Almacen
        switch(Opcion){
        case 1:
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================================");
        System.out.println("Esta en el inventario que desea hacer ");
        System.out.println("1.- REGISTRAR PRODUCTO");
        System.out.println("2.- VER");
        System.out.println("3.- QUITAR");
        System.out.println("4.- Buscar");
        System.out.println("========================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

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
                System.out.println( "Posicion"+ x);
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
                
                System.out.print("Ingrese la posición del producto a eliminar: ");
                int pos = leer.nextInt();

                if (pos >= 0 && pos < Descripcion.size()) {
                Descripcion.remove(pos);
                Precio.remove(pos);
                Cantidad.remove(pos);
                System.out.println("Producto eliminado correctamente.");
                } else {
                System.out.println("Posición inválida.");
                }
                break;
                case 4:
                
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
        case 3:
        break;
        case 4:
        break;

        }
        }while (Opcion !=4); System.out.println("Cerrando programa");
        System.out.println("Programa cerrado");
        }
}



