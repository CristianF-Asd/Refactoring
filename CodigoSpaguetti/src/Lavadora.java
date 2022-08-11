
public class Lavadora {
	
	
	private int est;
    protected static final int DESCANSO = 0;
    protected static final int REMOJO = 1;
    protected static final int LAVADO = 2;
    protected static final int ENJUAGUE = 3;
    protected static final int CENTRIFUGADO = 4;
    
    
    
    public void SiguienteEstado(){
        if(est == DESCANSO) {
            est = REMOJO;
        } else if(est == REMOJO) {
            est = LAVADO;
        } else if(est == LAVADO) {
            est= ENJUAGUE;
        } else if(est == ENJUAGUE) {
            est = CENTRIFUGADO;   
        } else if(est == CENTRIFUGADO) {
            est = DESCANSO;  
        }else {
        	throw new RuntimeException("Estado desconocido");
        }
    }
    
    //Si se quiere añadir un codigo como el siguiente 
    //se tiene que añair  una secuencia de condiciones
    //haciendo el codigo dificil de mantener
    public String MostrarEstado(){
        if(est==DESCANSO) {
            return "Descanso";
        } else if(est==REMOJO) {
            return "Remojo";
        } else if(est==LAVADO) {
            return "Lavado";
        }else if(est==ENJUAGUE){
            return "Enjuague";
        } else if(est==CENTRIFUGADO) {
            return ("Centrifugado");
        } else {
        	throw new RuntimeException("Estado desconocido");
        }
    }
    
}
