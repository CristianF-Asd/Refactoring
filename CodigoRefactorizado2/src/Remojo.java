
public class Remojo extends Estado{

	@Override
	public int estadoActual() {
		// TODO Auto-generated method stub
		return Lavadora.REMOJO;
	}

	@Override
	public void estadoSiguiente(Lavadora lav) {
		lav.setEstado(Lavadora.LAVADO);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toStringEstado() {
		// TODO Auto-generated method stub
		return "Remojo";
	}

}
