
import java.util.Date;

public class Vuelo {
    int numVuelo;
    String origenVuelo;
    String destinoVuelo;
    int fechaSalida;
    int horaSalida;
    int cpMax;
/**
 * Constructor de la clase Pasajero
 * @param numVuelo Numero del vuelo
 * @param origenVuelo Origen de salida del vuelo
 * @param destinoVuelo Destino del vuelo
 * @param fechaSalida Fecha de la salida del vuelo
 * @param horaSalida Hora de salida del vuelo
 * @param cpMax Capacidad Maxima del vuelo                  
 * Complejidad temporal: O(1) Complejidad Constante
 **/

public Vuelo(int numVuelo, String origenVuelo, String destinoVuelo, int fechaSalida, int horaSalida, int cpMax)
{
    this.numVuelo = numVuelo;
    this.origenVuelo = origenVuelo;
    this.destinoVuelo = destinoVuelo;
    this.fechaSalida = fechaSalida;
    this.horaSalida = cpMax;
    this.cpMax = cpMax;
}



}
