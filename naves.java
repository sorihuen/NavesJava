/**
 * Clase naves
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-15
*/
public abstract class naves{

    /**
     * Crea una instancia de la clase naves con parámetros.
    */
    public naves(int numeroNave, String nombre, double peso, double altura, int velocidad, String combustible, String pais) {
        this.numeroNave = numeroNave;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.velocidad = velocidad;
        this.combustible = combustible;
       
    }  


    /**
     * Representa el numero identificador de la nave.
    */
    protected int numeroNave;

    /**
     * Método accesador del numero de la nave
     * @return numero Nave
    */
    public int getNumeroNave() {
        return numeroNave;
    }
    public void setNumeroNave(int numeroNave) {
        this.numeroNave = numeroNave;
    }

    /**
     * Representa el nombre de la nave.
    */
    protected String nombre;

    /**
     * Método accesador del nombre de la nave
     * @return nombre
    */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Representa el peso de la nave.
    */
    protected double peso;
    
    /**
     * Método accesador del peso de la nave
     * @return peso
    */

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Representa la altura de la nave.
    */
    protected double altura;

    /**
     * Método accesador de la altura de la nave
     * @return altura
    */
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Representa la velocidad de la nave.
    */
    protected int velocidad;

    /**
     * Método accesador de la velocidad de la nave
     * @return velocidad
    */
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Representa el tipo de combustible de la nave.
    */
    protected String combustible;
    /**
     * Método accesador del tipo de combustible de la nave
     * @return combustible
    */
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * Representa el pais  de la nave.
    */
    protected String pais;

    /**
     * Método accesador del pais de la nave
     * @return pais
    */
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo abstracto para mostrar la potencia de las naves.
    */
    protected abstract  void mostrarPotencia();
    
    /**
     * Metodo abstracto para mostrar los objetivos de las naves.
    */
    protected abstract  void mostrarObjetivos();

    /**
     * Metodo toString para mostrar los datos de las naves.
    */
    @Override
    public String toString() {
        return "Naves: [Numero = " + numeroNave  + " , Nombre = " + nombre + ", Peso = " + peso + ", Altura = " + altura + ", Velocidad = " + velocidad +  "Km/h"
                + ", Combustible = " + combustible + ", Pais = " + pais + "]";
    }






}
