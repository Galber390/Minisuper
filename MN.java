import java.util.Scanner;
public class MN {
    public static void main(String [] args){
        
        //Variable
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
        //almacenamiento
        switch(Opcion){
        case 1:
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======================================");
        System.out.println("Esta en el inventario que desea hacer ");
        System.out.println("1.-REGISTRAR PRODUCTO");
        System.out.println("2.-VER");
<<<<<<< HEAD
        System.out.println("3.- QUITAR");
        System.out.println("========================");
        //dsad
=======
        System.out.println("3.-QUITAR");
        System.out.println("======================================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
         // 
>>>>>>> f9fb193c6320403dd0c25b89b91266b509b8095a
        Opcion = leer.nextInt();
        switch(Opcion){
        case 1: System.out.println("================================");
                System.out.println("Cuantos productos va a registrar");
                REG = leer.nextInt();

                String[] Productos = new String [REG];
                int[] Cantidad = new int [REG];

                for (int i = 0; i < REG; i++){

                System.out.println("Ingrese el nombre del producto:");
                Productos [i] = leer.nextLine();
                Productos [i] = leer.nextLine();

                System.out.println("Ingrese la cantidad de Productos:");
                Cantidad [i] = leer.nextInt();
                }
                for (int i = 0; i<REG; i++){
                System.out.println("Se registro el producto " + Productos[i] + " con " + Cantidad[i] + " unidades");
                }
        break;

<<<<<<< HEAD
        case 2: System.out.println("========================================");
        System.out.println("A INGRESADO A VENTAS");
        System.out.println("================================================");
        System.out.println();
        break;
        
        default: System.out.println("Opcion Invalida");
=======
        case 2: 
        break;
>>>>>>> f9fb193c6320403dd0c25b89b91266b509b8095a

        case 3:
        break;

        default: System.out.println("Opcion invalida");

        }
        default: System.out.println("Opcion invalida");
        }
        }
while (Opcion !=4); System.out.println("Cerrando programa");
}
}


