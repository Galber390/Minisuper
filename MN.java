import java.util.Scanner;
public class MN {
    public static void main(String [] args){
        
        //Variable
        int Opcion;
        int REG;
        //Leer datos
        Scanner leer = new Scanner(System.in);
    
        //Menu
        do {
        System.out.println("==========");
        System.out.println("Bienvenido || Seleccione una opcion:");
        System.out.println("1.-Almacenamiento ");
        System.out.println("2.-Ventas");
        System.out.println("3.-Compras");
        System.out.println("4.Salir");
        System.out.println("==========");

        Opcion = leer.nextInt();
        //almacenamiento
        switch(Opcion){
        case 1: System.out.println("Productos ");
        System.out.println("========================");
        System.out.println("SELECCIONE UNA OPCION:");
        System.out.println("1.-REGISTRAR PRODUCTO");
        System.out.println("2.-VER");
        System.out.println("3.- QUITAR");
        System.out.println("========================");
         // 
        Opcion = leer.nextInt();
        switch(Opcion){
        case 1: System.out.println("================================");
                System.out.println("INGRESE EL PRODUCTO A REGISTRAR:");
                System.o;
        }
        break;

        case 2: System.out.println("Te veo al rato");
        break;
        default: System.out.println("Opcion Invalida");

        Opcion = leer.nextInt();
        switch(Opcion){
            case 1:;
            break;
        }
        switch(Opcion){
            case 3:;
            break;
        }
        case 4: System.out.println("Cerrando programa");
        break;
        }
    }
    while (Opcion !=4);
}
}
