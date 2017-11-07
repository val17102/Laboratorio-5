/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase quue representa una valvula que tiene cualquier tanque
*/
import java.util.ArrayList;
/**
 * 
 * @author Miguel
 */
public class Valvula{ 
/**
 * estado de la valvula
 */
  private Boolean estado;
  /**
   * lista de fechas
   */
  private ArrayList<String> rFechas;

/**
 * Constructor
 */
  public Valvula(){
  	estado = false;
  	rFechas = new ArrayList<String>();
  }
/**
 * Metodo que se encarga de abrir una valvula
 */
  public void abrirValvula(){
  	estado = true;
  }
/**
 * Metodo que se encarga de cerrar una valvula
 */
  public void cerrarValvula(){
  	estado = false;
  }
/**
 * Obtiene el estado de la valvula
 * @return  estado de la valvula
 */
  public Boolean getestado(){
  	return estado;
  }
}

