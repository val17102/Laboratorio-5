/**
*@autor: Héctor Miguel Valle Quinto
*@date: 06/11/2017
*@proposito: Clase que representa un tanque con forma de cilindro
*/
public class Cilindro extends Tanque{
        /**
         * radio del cilindro
         */
	private double radio;
        
        /**
         * constructor
         * @param type tipo de tanque
         * @param m municipio asignado
         */
	public Cilindro(String type, Municipio m){
		super(type, m);
		radio = 10.00;
		tipo = "Cilindro";
                cTotal = CalcularcTotal();
                cActual = cTotal;
	}
        /**
         * Calcula la capacidad total del tanque
         * @return capacidad total del tanque
         */
	public double CalcularcTotal(){
		return (Math.PI *altura*(radio*radio));
	}

}