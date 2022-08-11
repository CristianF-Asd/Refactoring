
public class Enjuague extends Estado {

	@Override
	public int estadoActual() {
		// TODO Auto-generated method stub
		return Lavadora.ENJUAGUE;
	}

	@Override
	public void estadoSiguiente(Lavadora lav) {
		// TODO Auto-generated method stub
		lav.setEstado(Lavadora.CENTRIFUGADO);
	}

	@Override
	public String toStringEstado() {
		// TODO Auto-generated method stub
		return "Enjuague";
	}

}
