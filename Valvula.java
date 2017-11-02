import java.util.ArrayList;

public class Valvula{ 

  private Boolean estado;
  private ArrayList<String> rFechas;
  private Municipio mAsignado; 

  public Valvula(Municipio m){
  	estado = false;
  	mAsignado = m;
  	rFechas = new ArrayList<String>();
  }

  public void abrirValvula(){
  	estado = true;
  }

  public void cerrarValvula(){
  	estado = false;
  }

  public double calcularSalida(){
  	
  }

}
