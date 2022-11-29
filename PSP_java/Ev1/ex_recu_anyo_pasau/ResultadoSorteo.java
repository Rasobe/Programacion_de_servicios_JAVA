package ex_recu_anyo_pasau;

public class ResultadoSorteo {
	
	private int numeroPremiado;

	public synchronized int consultarNumeroPremiado() {
		return numeroPremiado;
	}

	public synchronized void establecerNumPremiado(int numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}

}
