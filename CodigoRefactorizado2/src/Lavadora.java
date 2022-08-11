
public class Lavadora {
	
	private Estado est = new Descanso();
    protected static final int DESCANSO = 0;
    protected static final int REMOJO = 1;
    protected static final int LAVADO = 2;
    protected static final int ENJUAGUE = 3;
    protected static final int CENTRIFUGADO = 4;
    
    
    
    public void SiguienteEstado(){
    	est.estadoSiguiente(this);
    }
    
    public void MostrarEstado(){
    	est.toStringEstado();
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
