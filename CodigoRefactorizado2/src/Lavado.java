
public class Lavado extends Estado {

	@Override
	public int estadoActual() {
		// TODO Auto-generated method stub
		return Lavadora.LAVADO;
	}

	@Override
	public void estadoSiguiente(Lavadora lav) {
		// TODO Auto-generated method stub
		lav.setEstado(Lavadora.ENJUAGUE);
	}

	@Override
	public String toStringEstado() {
		// TODO Auto-generated method stub
		return "Lavado";
	}

}
