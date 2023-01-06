import java.util.Scanner;
/**
 * Clase nave Tripulada que extendemos de naves e implementamos la interfaz tripuladas
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-15
*/
public class naveTripulada extends naves implements Itripuladas{
    private Scanner sc= new Scanner(System.in);
    
    /**
     * Crea una instancia de la clase nave tripulada con parámetros.
    */
    public naveTripulada(int numeroNave, String nombre, double peso, double altura, int velocidad, String combustible,
            String pais) {
        super(numeroNave, nombre, peso, altura, velocidad, combustible, pais);
       
    }

    /**
     * Metodo abstracto para mostrar los objetivos de las naves.
    */
    @Override
    protected void mostrarObjetivos() {
        System.out.println("Mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación, en misiones");
        
    }

    /**
     * Metodo abstracto para mostrar la potencia de las naves.
     * Se utilizo condicionales
    */

    @Override
    protected void mostrarPotencia() {
        System.out.println(" Seleccione el tipo de propulsion: ");
        System.out.println(" 1. Bi propulsores de tetróxido");
        System.out.println(" 2. Diferentes Giroscopios");
        int tipo = capturaopcion();
        if (tipo ==1){
            System.out.println("Su nave usara propulsores de tetróxido");
        }
        if (tipo ==2){
            System.out.println("Su nave usara diferentes Giroscopios");
        }

    }
       
    /**
     * Metodo para la seleccion de tripulantes de las naves tipo tripulada.
     * Se utilizo condicionales.
    */
    @Override
    public void mostrarTripulantes() {
        System.out.println(" Seleccione la opcion con la cantidad de tripulantes: ");
        System.out.println("[1]. 3 Tripulantes ");
        System.out.println("[2]. 6 Tripulantes ");
        int tripulante = capturaopcion();

        if (tripulante ==1){
            System.out.println("Ingrese el Nombre Completo e Identificacion del Comandante de la mision:");
            String comandante = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del Piloto de la mision:");
            String piloto = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del Especialista de la mision:");
            String especialista = sc.nextLine();
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("Su tripulacion es:");
            System.out.println("Comandante: " + comandante);
            System.out.println("Piloto: " + piloto);
            System.out.println("Especialista: " + especialista);
            System.out.println("====================================================================");

        }
        if (tripulante ==2){
            System.out.println("Ingrese el Nombre Completo e Identificacion del Comandante de la mision:");
            String comandante = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del Piloto de la mision:");
            String piloto = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del primer(1)Especialista de la mision:");
            String especialista = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del segundo(2) Especialista de la mision:");
            String especialista1 = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del tercer(3) Especialista de la mision:");
            String especialista2 = sc.nextLine();
            System.out.println("Ingrese el Nombre Completo e Identificacion del cuarto(4) Especialista de la mision:");
            String especialista3 = sc.nextLine();
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("Su tripulacion es:");
            System.out.println("Comandante: " + comandante);
            System.out.println("Piloto: " + piloto);
            System.out.println("Especialista 1: " +  especialista);
            System.out.println("Especialista 2: " +  especialista1);
            System.out.println("Especialista 3: " +  especialista2);
            System.out.println("Especialista 4: " +  especialista3);
            System.out.println("====================================================================");
            
        }
        
    }

    /**
     * Metodo para capturar informacion de enteros.
    */
    private static int capturaopcion(){
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }

    /**
     * Metodo para la seleccion de mision de las naves tipo tripulada.
     * Se utilizo switch case.
    */
    @Override
    public void mostrarMision() {
        System.out.println(" Seleccione la misión: ");
        System.out.println(" 1. Misiones Lunares ");
        System.out.println(" 2. Experimentacion y estudio del comportamiento humano en condiciones ingrávidas ");
        System.out.println(" 3. Mantenimiento de Satelites, probar acoplamiento con otras naves y equipos electrónicos ");
        int opc = capturaopcion();
        switch(opc){
            case 1:
             System.out.println(" Su misión es : Misiones Lunares ");
            
            break;
            case 2:
             System.out.println(" Su misión es : Experimentacion y estudio del comportamiento humano en condiciones ingrávidas");
            
            break;
            case 3:
             System.out.println("  Su misión es : Mantenimiento de Satelites, probar acoplamiento con otras naves y equipos electrónicos");
            
            break;
            default:
             System.out.println("---------- Opcion Invalida --------");
            break;

        }

     
        
    }

    /**
     * Metodo para mostrar la activacion de las naves tipo tripulada.
    */

    @Override
    public void mostrarEstado() {
        System.out.println("Su nave ha sido activada");
        
    }
    
}
  