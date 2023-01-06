
import java.util.Scanner;
/**
 * Clase principal 
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-15
*/

public class EjercicioNaves {
    /**
      * Creando los objetos de tipo Nave
    */
    static naveSatelital satelital = new naveSatelital(101, "ATV", 158, 100, 12000, "Monometilhidracina (MMH)",
            "Europa");
    static naveSatelital satelital1 = new naveSatelital(102, "Cassini-Huygens", 150, 120, 18000,
            "MMH y Tetróxido de nitrogeno", "EE.UU, Europa, Italia");
    static naveLanzadora lanzadora = new naveLanzadora(501, "Saturno V", 3500, 100, 3200, "Quimico Solido", "EE.UU");
    static naveLanzadora lanzadora1 = new naveLanzadora(502, "Energía", 2400, 60, 3060,
            "Petróleo Refinado y Oxigeno Liquido", "Rusia, Ucrania");
    static naveTripulada tripulada = new naveTripulada(301,"Skylab",77,100,14000,"Solido + Nitrogeno", "EE.UU");
    static naveTripulada tripulada1 = new naveTripulada(302,"Estacion Internacional",455,100,28000,"Queroseno + H(liq.)","EE.UU, Japon, Rusia,Canada,Europa");
    /**
   * Metodo principal de la clase
   * 
   * @param args Argumentos de la linea de comandos
   */
    public static void main(String[] args) {

        boolean respuesta = true;
        int opcion;
        clearScreen();

        do {
            menu();
            opcion = capturaopcion();
            clearScreen();
            respuesta = evaluaropcion(opcion);

        } while (respuesta == true);

    }
    /**
     * Metodo para acceder al menu.
    */

    private static void menu() {

        System.out.println("Seleccione una nave: ");
        System.out.println("[1]: ***** Naves Satelitales *****");
        System.out.println("[2]: ***** Naves Lanzadoras *****");
        System.out.println("[3]: ***** Naves Tripluladas ****");
        System.out.println("[0]: ***** Salir del taller *****");

    }
    /**
     * Metodo para borrar o limpiar.
    */
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    /**
     * Metodo para capturar informacion de enteros.
    */
    private static int capturaopcion(){
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }

    /**
     * Método para evaluar la opcion del menu
     * 
     * @return boolean
    */
    private static boolean evaluaropcion(int opcion) {

        switch (opcion) {
            case 1:
                System.out.println(satelital);
                System.out.println(satelital1);
                System.out.println("");
                satelital.mostrarObjetivos();
                System.out.println("====================================================================");
                seleccionNave();

                return true;
            case 2:
                System.out.println(lanzadora);
                System.out.println(lanzadora1);
                System.out.println("");
                lanzadora.mostrarObjetivos();
                System.out.println("====================================================================");
                seleccionCohete();

                return true;
            case 3:
                System.out.println(tripulada);
                System.out.println(tripulada1);
                System.out.println("");
                tripulada.mostrarObjetivos();
                System.out.println("====================================================================");
                seleccionTripulada();

            return true;

            case 0:
                System.out.println(" === Saliendo del sistema ===");
            return false;
            default:
                System.out.println("---------- Opcion Invalida --------");

        }
        return true;
    }

    /**
     * Método para seleccionar la nave satelital utilizando condicionales
     * 
    */
    public static void seleccionNave() {
        System.out.println("Seleccione la nave con el numero de la nave:");
        int seleccion = capturaopcion();
        if (seleccion == 101) {
            System.out.println("====================================================================");
            System.out.println("Su nave seleccionada es :" + satelital.getNombre());
            System.out.println("");
            satelital.mostrarPotencia();
            System.out.println("");
            satelital.duracionDestino();
            System.out.println("====================================================================");
            System.out.println("");
            satelital.estadoNave();
            System.out.println("");
         
        }
        if (seleccion == 102) {
            System.out.println("====================================================================");
            System.out.println("Su nave seleccionada es :" + satelital1.getNombre());
            System.out.println("");
            satelital1.mostrarPotencia();
            System.out.println("");
            satelital1.duracionDestino();
            System.out.println("====================================================================");
            System.out.println("");
            satelital1.estadoNave();
            System.out.println("");
          

        }

    }
    
    /**
     * Método para seleccionar la nave lanzadora utilizando condicionales
     * 
    */
    public static void seleccionCohete() {
        System.out.println("Seleccione la nave Lanzadora con el numero de la nave:");
        int seleccion = capturaopcion();
        if (seleccion == 501) {
            System.out.println("====================================================================");
            System.out.println("Su nave seleccionada es : " + lanzadora.getNombre());
            System.out.println("");
            lanzadora.mostrarPotencia();
            System.out.println("");
            lanzadora.seleccionCarga();
            System.out.println("====================================================================");
            System.out.println("");
            lanzadora.estadoNave();
            System.out.println("");
         
        }
        if (seleccion == 502) {
            System.out.println("====================================================================");
            System.out.println("Su nave seleccionada es : " + lanzadora1.getNombre());
            System.out.println("");
            lanzadora1.mostrarPotencia();
            System.out.println("");
            lanzadora1.seleccionCarga();
            System.out.println("====================================================================");
            System.out.println("");
            lanzadora1.estadoNave();
            System.out.println("");
         
        }

     

    }
    
    /**
     * Método para seleccionar la nave tripulada utilizando condicionales
     * 
    */
    public static void seleccionTripulada() {
        System.out.println("Seleccione la nave tripulada con el numero de la nave:");
        int seleccion = capturaopcion();
        if (seleccion == 301) {
            System.out.println("====================================================================");
            System.out.println("Su nave seleccionada es : " + tripulada.getNombre());
            System.out.println("");
            tripulada.mostrarPotencia();
            System.out.println("");
            tripulada.mostrarTripulantes();
            System.out.println("");
            tripulada.mostrarMision();
            System.out.println("====================================================================");
            System.out.println("");
            tripulada.mostrarEstado();
            System.out.println("");
         
        }
        if (seleccion == 302) {
            System.out.println("====================================================================");
            System.out.println("Su nave seleccionada es : " + tripulada1.getNombre());
            System.out.println("");
            tripulada1.mostrarPotencia();
            System.out.println("");
            tripulada1.mostrarTripulantes();
            System.out.println("");
            tripulada1.mostrarMision();
            System.out.println("====================================================================");
            System.out.println("");
            tripulada1.mostrarEstado();
            System.out.println("");

        }
    }


}