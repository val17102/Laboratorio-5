public class Ortogonal extends Tanque{

	private double ancho;
	private double lado;

	public Ortogonal(){
		super();
		ancho = 20.0;
		lado = 20.0;
	}

	public double CalcularcTotal(){
		return altura*ancho*lado;
	}

}