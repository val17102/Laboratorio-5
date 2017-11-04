public class Cilindro extends Tanque{

	private double radio;

	public Cilindro(){
		super();
		radio = 10.00;
		tipo = "Cilindro";
	}

	public double CalcularcTotal(){
		return (Math.PI *altura*(radio*radio));
	}

}