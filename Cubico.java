/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase que representa un tanque cubico
*/
import javax.swing.JOptionPane;

public class Cubico extends Tanque{
        
        /**
         * constructor
         * @param type tipo de tanque
         * @param m municipio asignado
         */
	public Cubico(String type, Municipio m){
		super(type, m);
                cTotal = CalcularcTotal();
                cActual = cTotal;
        
	}
/**
 * Calcula la capacidad total del tanque
 * @return capacidad total del tanque
 */
	public double CalcularcTotal(){
		return altura*altura*altura;
	}

}