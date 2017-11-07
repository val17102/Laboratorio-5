/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase que representa uno de los municipios que necesita agua
*/
public class Municipio{ 
/**
 * nombre del municipio
 */
  private String nombre;
  /**
   * cantidad de habitantes
   */
  private int habitantes;
/**
 * Constructor
 * @param nom nombre del municipio
 * @param hab cantidad de habitantes
 */
  public Municipio(String nom, int hab){
  	nombre = nom;
  	habitantes = hab;
  }
/**
 * obtiene la cantidad de habitantes
 * @return habitantes
 */
  public int gethabitantes(){
  	return habitantes;
  }
  /**
   * obtiene el nombre del municipio
   * @return nombre del municipio
   */
  public String getnombre(){
      return nombre;
  }
}