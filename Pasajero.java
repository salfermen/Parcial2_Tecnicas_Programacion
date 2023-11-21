public class Pasajero {
    private String nombre;
    private String apellido;
    private String numPasaporte;
    private int edad;
    private String prefAlimenticia;

/**
 * Constructor de la clase Pasajero
 * @param nombre Nombre del pasajero
 * @param apellido Apellido del pasajero
 * @param numPasaporte Numero de pasaporte del pasajero
 * @param edad Edad del pasajero
 * @param prefAlimenticia Preferencia de alimentos del pasajero
 * Complejidad temporal: O(1) Complejidad Constante
**/


public Pasajero(String nombre, String apellido, String numPasaporte, int edad, String prefAlimenticia)
{
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.numPasaporte = numPasaporte;
    this.prefAlimenticia = prefAlimenticia;
}
    /**
     * Retorna el nombre del pasajero
     * @return this.nombre
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del pasajero
     * @param nombre Nombre del pasajero
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna el apellido del pasajero
     * @return this.apellido
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Modifica el apellido del pasajero
     * @param apellido apellido del pasajero
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Retorna la edad del pasajero
     * @return this.edad
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad del pasajero
     * @param edad Edad del pasajero
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setEdad(int edad) {
        this.edad= edad;
    }

    public String getPrefAlimenticia() {
        return prefAlimenticia;
    }
    /**
     * Modifica la preferencia alimenticia del pasajero
     * @param  prefAlimenticia preferencia alimenticia del pasajero
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setPrefAlimenticia(String prefAlimenticia) {
        this.prefAlimenticia = prefAlimenticia;
    }
    /**
     * Retorna la preferencia alimenticia del pasajero
     * @return this.prefAlimenticia
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public String getNumPasaporte() {
        return numPasaporte;
    }
    /**
     * Modifica la preferencia alimenticia del pasajero
     * @param numPasaporte Numero del pasaporte  del pasajero
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }
    /**
     * Retorna el numero de pasaporte del pasajero
     * @return this.numPasaporte
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
}
