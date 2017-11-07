/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase padre de un tanque
*/
import javax.swing.JOptionPane;
/**
 * 
 * @author Miguel
 */
public class Tanque{
  /**
   *Numero de identificacion del tanque
   */
  protected String idNum;
  /**
   * tipo de tanque que es
   */
  protected String tipo;
  /**
   * Capacidad total de agua que puede contener el tanque
   */
  protected double cTotal; 
  /**
   * Capacidad de agua que tiene el tanque actualmente
   */
  protected double cActual;
  /**
   * Altura del tanque
   */
  protected double altura;
  /**
   * Arreglo de objetos de tipo valvula que tiene el tanque
   */
  protected Valvula[] valvulas;
  /**
   * Municipio al que esta asignado el tanque
   */
  protected Municipio mAsignado; 

  /**
   * Constructor
   * @param type tipo de tanque
   * @param m  municipio asignado
   */
  public Tanque(String type, Municipio m){
  	altura = 30.0;
  	valvulas = new Valvula[10];
  	tipo = type;
  	mAsignado = m;
        for(int i = 0; i<10;i++){
            valvulas[i] = new Valvula();
        }
  }
/**
 * Metodo que abre una valvula
 * @param i posicion de la valvula que se va a abrir
 */
  public void abrirValvula(int i){
        if (porcentaje()>25.0){
  	valvulas[i].abrirValvula();
  	cActual = calcularcActual();
        } else if (porcentaje()<25.0 && porcentaje()>10.0){
            JOptionPane.showMessageDialog(null,"Advertencia: Hay menos de 25% en el tanque");
        } else if (porcentaje()<10.0){
            JOptionPane.showMessageDialog(null,"Advertencia: Hay menos de 10% en el tanque");
            for(int j = 0; j<10;j++){
            valvulas[j].cerrarValvula();
            }
            JOptionPane.showMessageDialog(null,"Se han cerrado todas las valvulas");
        }


  }
/**
 * Metodo que se encarga de cerrar una valvula
 * @param i posicion de la valvula que se quiere cerrar
 */
  public void cerrarValvula(int i){
  	valvulas[i].cerrarValvula();
  	cActual = calcularcActual();
  }
/**
 * Calcula la capacidad actual que tiene el tanque de agua
 * @return devuelve la capacidad actual 
 */
  public double calcularcActual(){
  		double x = cTotal;
  	for(int i = 0; i<10; i++){
  		if (valvulas[i].getestado()){
  		x = x - (cTotal/10.0);
  		}
  	}
  	return x;
  }
/**
 * Metodo que obtiene la cantidad de valvulas que estan vertiendo
 * @return cantidad de valvulas
 */
  public int vertiendo(){
  	int x = 0;
  	for(int i = 0; i<10; i++){
  		if(valvulas[i].getestado()){
  			x++;
  		}
     }
     return x;
  }
/**
 * Asigna el valor de ID
 * @param id numero de identificacion
 */
  public void setID(String id){
  	idNum = id;
  }
/**
 * obtiene el numero de identificacion
 * @return  numero de identificacion
 */
  public String getID(){
  	return idNum;
  }
/**
 * obtiene el tipo del tanque
 * @return tipo de tanque
 */
  public String gettipo(){
  	return tipo;
  }
/**
 * obtiene la capacidad de agua actual
 * @return capacidad actual
 */
  public double getcActual(){
  	return cActual;
  }
  /**
   * obtiene una valvula del tanque
   * @param i posicion de la valvula
   * @return valvula
   */
  public Valvula getValvula(int i){
      return valvulas[i];
  }
  /**
   * calcula el porcentaje de agua en el tanque
   * @return porcentaje de agua
   */
  public double porcentaje(){
      return (cActual/cTotal*100);
  }
}