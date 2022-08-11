
public class Centrifugado extends Estado {

	@Override
	public int estadoActual() {
		// TODO Auto-generated method stub
		return Lavadora.CENTRIFUGADO;
	}

	@Override
	public void estadoSiguiente(Lavadora lav) {
		
		
		// TODO Auto-generated method stub
		lav.setEstado(Lavadora.DESCANSO);
	}

	@Override
	public String toStringEstado() {
		// TODO Auto-generated method stub
		return "Centrifugado";
	}
	

}
