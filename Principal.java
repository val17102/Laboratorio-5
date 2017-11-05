
public class Principal{
	private Municipio[] municipios;
	private Tanque[] tanques;
	private double cantDisponible;
	private int cantValvulas;

	public Principal(){
		municipios = new Municipio[5];
		municipios[0] = new Municipio("Coban", 250675);
		municipios[1] = new Municipio("Salama", 47264);
		municipios[2] = new Municipio("Chimaltenango", 43900);
		municipios[3] = new Municipio("Chiquimula", 79815);
		municipios[4] = new Municipio("Esquipulas", 53201);
		tanques = new Tanque[10];
		int x = 1000;
		for(int i = 0; i<10; i++){
		tanques[i].setID(""+x);
		x++;
		}
	}

	public void agregarTanque(int tipo, int pos, Valvula[] valve){
		if (tipo == 0){
		tanques[pos] = new Cilindro(valve, "Cilindro");
	}else if(tipo == 1){
		tanques[pos] = new Ortogonal(valve, "Ortogonal");
	}else if(tipo== 2){
		tanques[pos] = new Cubico(valve, "Cubo");
	}

	}

	public String mostrarTanques(){
		return "";
	}
}