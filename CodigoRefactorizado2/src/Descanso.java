
public class Descanso extends Estado{

	@Override
	public int estadoActual() {
		
		return Lavadora.DESCANSO;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estadoSiguiente(Lavadora lav) {
		// TODO Auto-generated method stub
		lav.setEstado(Lavadora.REMOJO);
	}

	@Override
	public String toStringEstado() {
		// TODO Auto-generated method stub
		return "Descanso";
	}

}
