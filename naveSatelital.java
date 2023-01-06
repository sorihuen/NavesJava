import java.util.Scanner;

public class naveSatelital extends naves implements Isatelital {

    /**
     * Crea una instancia de la clase nave satelital con parámetros.
    */
    public naveSatelital(int numeroNave, String nombre, double peso, double altura, int velocidad, String combustible,
            String pais) {
        super(numeroNave, nombre, peso, altura, velocidad, combustible, pais);
    }

    /**
     * Metodo abstracto para mostrar los objetivos de las naves.
    */
    @Override
    protected void mostrarObjetivos() {

        System.out.println(" Su principal objetivo estriba en estudiar otros cuerpos celestes. ");
    }

    /**
     * Metodo abstracto para mostrar la potencia de las naves.
     * Se utilizo condicionales
    */

    @Override
    protected void mostrarPotencia() {
        System.out.println(" Seleccione el tipo de propulsion: ");
        System.out.println(" 1. Motor cohete");
        System.out.println(" 2. Motor iónico");
        int tipo = capturaopcion();
        if (tipo ==1){
            System.out.println("La propulsion de su nave es Motor Cohete");
        }
        if (tipo ==2){
            System.out.println("La propulsion de su nave es Motor Iónico");
        }

    }

    /**
     * Metodo para la seleccion del destino de las naves tipo satelital.
     * Se utilizo switch case.
    */

    @Override
    public void duracionDestino() {
        System.out.println(" Seleccione el destino de la misión: ");
        System.out.println(" 1. Saturno y sus Lunas ");
        System.out.println(" 2. Jupiter ");
        System.out.println(" 3. Marte ");
        int opc = capturaopcion();
        switch(opc){
            case 1:
             System.out.println(" Su misión es : Saturno y sus Lunas ");
             System.out.println(" Tiempo aproximado para llegar al destino 7 años ");

            break;
            case 2:
             System.out.println(" Su misión es : Jupiter ");
             System.out.println(" Tiempo aproximado para llegar al destino 4 millones de años ");
            break;
            case 3:
             System.out.println("  Su misión es : Marte ");
             System.out.println(" Tiempo aproximado para llegar al destino ida y vuelta es 400 y 450 días ");
            break;
            default:
             System.out.println("---------- Opcion Invalida --------");
            break;

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
     * Metodo para mostrar la activacion de las naves tipo satelital.
    */

    @Override
    public void estadoNave() {
        System.out.println("Su nave ha sido activada");
    }



    
}
