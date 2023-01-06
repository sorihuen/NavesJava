import java.util.Scanner;
/**
 * Clase nave Lanzadora que extendemos de naves e implementamos la interfaz autopropulsado
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-15
*/

public class naveLanzadora extends naves implements Iautopropulsado{
    private Scanner sc= new Scanner(System.in);
    
    /**
     * Crea una instancia de la clase nave lanzadora con parámetros.
    */
    public naveLanzadora(int numeroNave, String nombre, double peso, double altura, int velocidad, String combustible,
            String pais) {
        super(numeroNave, nombre, peso, altura, velocidad, combustible, pais);
      
    }

    /**
     * Metodo abstracto para mostrar los objetivos de las naves.
    */
    @Override
    protected void mostrarObjetivos() {
        System.out.println("Su objetivo es lanzar una carga útil al espacio");
        
    }

    
    /**
     * Metodo abstracto para mostrar la potencia de las naves.
     * Se utilizo condicionales
    */
    @Override
    protected void mostrarPotencia() {
        System.out.println(" Seleccione el tipo de propulsion: ");
        System.out.println(" 1. Motor de propergol sólido");
        System.out.println(" 2. Motor de propergol liquido");
        System.out.println(" 3. Motor de propergol híbrido");
        int tipo = capturaopcion();
        if (tipo ==1){
            System.out.println("La propulsion de su nave es de propergol sólido");
        }
        if (tipo ==2){
            System.out.println("La propulsion de su nave es propergol Liquido");
        }
        if(tipo ==3){
            System.out.println("La propulsion de su nave es propergol híbrido");

        }
        
    }

    /**
     * Metodo para la seleccion de carga de las naves tipo lanzadora.
     * Se utilizo un switch case.
    */
    @Override
    public void seleccionCarga() {
        System.out.println(" Seleccione la carga: ");
        System.out.println(" 1. Satelite Artificial ");
        System.out.println(" 2. Una Sonda ");
        System.out.println(" 3. Nave Tripulada ");
        int opc = capturaopcion();
        switch(opc){
            case 1:
             System.out.println(" Su carga es : un Satelite Artificial ");
             

            break;
            case 2:
             System.out.println(" Su carga es : una Sonda ");
             
            break;
            case 3:
             System.out.println("  Su misión es : una Nave Tripulada ");
            
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
     * Metodo para mostar si esta activada las naves tipo lanzadora.
    */
    @Override
    public void estadoNave() {
        System.out.println("Su nave ha sido activada");
    
        
    }
    
        
}



