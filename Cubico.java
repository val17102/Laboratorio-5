public class Cubico extends Tanque{

	private int radio;

	public Cubico(Valvula[] valve, String type){
		super(valve, type);
	}

	public double CalcularcTotal(){
		return altura*altura*altura;
	}

}