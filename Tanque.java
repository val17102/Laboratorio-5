public class Tanque{
  
  protected String idNum;
  protected String tipo;
  protected double cTotal; 
  protected double cActual;
  protected double altura;
  protected Valvula[] valvulas;

  public Tanque(Valvula[] valve, String type){
  	altura = 30.0;
  	valvulas = new Valvula[10];
  	valvulas = valve;
  	tipo = type;
  }

  public void abrirValvula(int i){
  	valvulas[i].abrirValvula();
  	cActual = calcularcActual();

  }

  public void cerrarValvula(int i){
  	valvulas[i].cerrarValvula();
  	cActual = calcularcActual();
  }

  public double calcularcActual(){
  		double x = cTotal;
  	for(int i = 0; i<=10; i++){
  		x = x - valvulas[i].calcularSalida();
  	}
  	return x;
  }

  public int vertiendo(){
  	int x = 0;
  	for(int i = 0; i<10; i++){
  		if(valvulas[i].getestado()){
  			x++;
  		}
     }
     return x;
  }

  public void setID(String id){
  	idNum = id;
  }
}