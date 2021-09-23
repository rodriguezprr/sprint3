
import java.util.Scanner;
public class MenuMaquina {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean sw= true;
        int opcion;
        MaquinaDeCafeV1 mcv1 = new MaquinaDeCafeV1();
        do {           
            // Mensaje de bienvenida e instrucciones al usuario
            System.out.println("Elige opción:"
                + "\n1.- Ingresar dinero "
                + "\n2.- Ingresar la cantidad de onzas a comprar "
                + "\n3.- Cerrar venta "
                + "\n4.- opción 4 "
                + "\n5.- opción 5 "
                + "\n6.- opción 6 "
                + "\n0.- Salir" );
            opcion=entrada.nextInt();
            // Menú
            switch(opcion) {
                case 0:
                sw=false;
                break;
                case 1:
                // bloque de código
                    System.out.println("Ingrese el valor del dinero");
                    int dineroRecibido=entrada.nextInt();
                    mcv1.recibirDinero(dineroRecibido);
                break;
                case 2:
                // bloque de código
                    System.out.println("Ingrese cantidad de onzas a comprar");
                    int cantidadDeOnzas=entrada.nextInt();
                    mcv1.pedirCantidadDeOnzas(cantidadDeOnzas);
                break;
                case 3:
                // bloque de código
                    mcv1.entregarCafe();
                break;
                case 4:
                // bloque de código
                    mcv1.mostarEstado();
                break;
                case 5:
                // bloque de código
                break;
                case 6:
                // bloque de código
                break;
                default:
                // bloque de Código por defecto
            }
        } while(sw);
    }
}