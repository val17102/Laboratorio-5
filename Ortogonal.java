/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase que representa un tanque ortogonal 
*/

public class Ortogonal extends Tanque{
        /**
         * ancho del tanque
         */
	private double ancho;
        /**
         * largo del lado del tanque
         */
	private double lado;
/**
 * constructor
 * @param type tipo de tanque
 * @param m municipio asignado
 */
	public Ortogonal(String type, Municipio m){
		super(type, m);
		ancho = 20.0;
		lado = 20.0;
                cTotal = CalcularcTotal();
                cActual = cTotal;
	}
/**
 * Calcula la capacidad total del tanque
 * @return capacidad total del tanque
 */
	public double CalcularcTotal(){
		return altura*ancho*lado;
	}

}