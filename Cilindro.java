public class Cilindro extends Tanque{

	private int radio;

	public Cilindro(){
		super();
		radio = 10;
		tipo = "Cilindro";
	}

	public double CalcularcTotal(){
		return (Math.PI *altura*(radio*radio));
	}

}