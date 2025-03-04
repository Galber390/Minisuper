import java.util.ArrayList;
import java.util.Scanner;
public class MN {
public static void main(String [] args){
        //Variable
        ArrayList<String> Descripcion = new ArrayList<>();
        ArrayList<Float> Precio = new ArrayList<>();
        ArrayList<Integer> Cantidad = new ArrayList<>();
        int Opcion;

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
        System.out.println("1.-REGISTRAR PRODUCTO");
        System.out.println("2.-VER");
        System.out.println("3.-QUITAR");
        System.out.println("======================================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
         // 
        Opcion = leer.nextInt();
        switch(Opcion){
                //Opcion para registrar producto
                case 1:
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
                System.out.print("Descripcion: ");
                System.out.println(Descripcion.get(x));
                System.out.print("Precio: $");
                System.out.println(Precio.get(x));
                System.out.print("Cantidad: ");
                System.out.println(Cantidad.get(x));
                System.out.println("======================");}
                break;
                
                case 3:
                break;
                }
        case 2:
        break;
        
        case 3:
        break;
        case 4:
        break;

        default: System.out.println("Opcion invalida");
        }
        }while (Opcion !=4); System.out.println("Cerrando programa");
System.out.println("Programa cerrado");
        }
}



