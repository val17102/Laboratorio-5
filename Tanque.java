public class Tanque{
  
  protected String IDNum;
  protected String tipo;
  protected double cTotal; 
  protected double cActual;
  protected double altura;
  protected Valvula[] valvulas;

  public Tanque(){
  	altura = 30.0;
  	valvulas = new Valvula[10];
  }

  public void abrirValvula(int i){
  	valvulas[i].abrirValvula();
  	calcularcActual();

  }

  public void cerrarValvula(int i){
  	valvulas[i].cerrarValvula();
  	calcularcActual();
  }

  public void calcularcActual(){
  		cActual = cTotal;
  	for(int i = 0; i<=10; i++){
  		cActual = cActual - valvulas[i].calcularSalida();
  	}
  }

}
