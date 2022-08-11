
public class Lavadora {
	
	private Estado est = new Descanso();
    protected static final int DESCANSO = 0;
    protected static final int REMOJO = 1;
    protected static final int LAVADO = 2;
    protected static final int ENJUAGUE = 3;
    protected static final int CENTRIFUGADO = 4;
    
    
    
    public void SiguienteEstado(){
    	if(est instanceof Descanso) {
            setEstado(REMOJO);
        } else if(est instanceof Remojo) {
        	setEstado(LAVADO);
        } else if(est instanceof Lavado) {
        	setEstado(ENJUAGUE);
        } else if(est instanceof Enjuague) {
        	setEstado(CENTRIFUGADO);
        } else if(est instanceof Centrifugado) {
        	setEstado(REMOJO);
        } else {
            throw new RuntimeException("Estado desconocido");
        }
    }
    
    public String MostrarEstado(){
    	if(est instanceof Descanso) {
            return "Descanso";
        } else if(est instanceof Remojo) {
            return "Remojo";
        } else if(est instanceof Lavado) {
            return "Lavado";
        } else if(est instanceof Enjuague) {
            return "Enjuague";
        } else if(est instanceof Centrifugado) {
            return ("Centrifugado");
        } else {
            throw new RuntimeException("Estado desconocido");
        }
    }
    
    public void setEstado(int state) {
    	switch (state) {
        case DESCANSO:
            this.est = new Descanso();
            break;
        case REMOJO:
            this.est = new Remojo();
            break;
        case LAVADO:
            this.est = new Lavado();
            break;
        case ENJUAGUE:
            this.est = new Enjuague();
            break;
        case CENTRIFUGADO:
            this.est = new Centrifugado();
            break;
        default:
            this.est = null;
            break;
        } 
    }
    
    public int getEstado() {
    	return est.estadoActual();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
