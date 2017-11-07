/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase principal que almacena el conjunto de tanques se van a utilizar.
*/
import javax.swing.JOptionPane;


public class Principal{
    /**
     * Arreglo de Municipios a los que se puede asignar una valvula.
     */
	private Municipio[] municipios;
        /**
     * Arreglo de Tanques que se van a utilizar.
     */
	private Tanque[] tanques;
        /**
     * Atributo que guarda la cantidad total de agua que guarda la 
     * cantidad de agua disponible en metros cuadrados. 
     */
	private double cantDisponible;
        /**
     * : Atributos que guarda la cantidad de válvulas abiertas 
     * pertenecientes a tanques cilíndricos.
     */
	private int cantValvulas;
/**
 * Constructor
 */
	public Principal(){
		municipios = new Municipio[5];
		municipios[0] = new Municipio("Coban", 250675);
		municipios[1] = new Municipio("Salama", 47264);
		municipios[2] = new Municipio("Chimaltenango", 43900);
		municipios[3] = new Municipio("Chiquimula", 79815);
		municipios[4] = new Municipio("Esquipulas", 53201);
		tanques = new Tanque[10];
		
	}
/**
 * Método que agrega un Tanque al arreglo Tanques
 * @param tipo el tipo de tanque que se va a agregar
 * @param pos la posicion en el arreglo de tanques donde se va a agregar
 * @param m el municipio al que se va asignar
 */
	public void agregarTanque(int tipo, int pos, Municipio m){
		if (tipo == 0){
		tanques[pos] = new Cilindro("Cilindro", m);
	}else if(tipo == 1){
		tanques[pos] = new Ortogonal("Ortogonal", m);
	}else if(tipo == 2){
		tanques[pos] = new Cubico("Cubo", m);
	}
                int x = 100;
                tanques[pos].setID(""+x+""+pos);
	}
/**
 * Método que se encarga de devolver un tanque en el arreglo tanques
 * @param i posicion en el arreglo
 * @return devuelve el numero de ID del tanque y su tipo
 */
	public String mostrarTanques(int i ){
		String s = "";
                if (tanques[i]!=null){
		s = "#"+tanques[i].getID()+" "+tanques[i].gettipo()+"\n";
                }
		return s;
	}
/**
 * Método que se encarga de devolver la cantidad 
 * de válvulas de tanques cilíndricos que están vertiendo
 * @return devuelve la cantidad de valvulas de tanque cilindricos vertiendo
 */
	public int cantidadTanquesC(){
		int cant = 0;
		for(int i = 0; i<10; i++){
			if (tanques[i] instanceof Cilindro && tanques[i]!=null){
				cant = cant + tanques[i].vertiendo();
			}
		}
		return cant;
	}
/**
 * Método que se encarga de devolver la cantidad de agua disponible para la región
 * @return cantidad de agua que esta disponible
 */
	public double cantidadAgua(){
		double total = 0.0;
		for (int i = 0; i<10; i++){
                    if(tanques[i]!=null){
			total = total + tanques[i].getcActual();
                    }
		}
		return total;
	}
  /**
   * Optiene un objeto tipo Municipio del arreglo de municipios
   * @param i posicion del municipio que se desea obtener
   * @return municipio que se quiere obtener
   */     
        public Municipio getmunicipios(int i){
            return municipios[i];
        }
    /**
     * Obtiene un objeto de tipo tanque del arreglo de tanques
     * @param i posicion del tanque que se desea obtener
     * @return tanque que se quiere obtener
     */  
        public Tanque gettanques(int i){
            return tanques[i];
        }
}