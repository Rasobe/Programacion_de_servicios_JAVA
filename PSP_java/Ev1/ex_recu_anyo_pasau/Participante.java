package ex_recu_anyo_pasau;

public class Participante extends Thread {
	
	private ResultadoSorteo resultadoSorteo;
	private int numeroBoleto;
	
	public Participante(ResultadoSorteo resultadoSorteo, int numeroBoleto) {
		super();
		this.resultadoSorteo = resultadoSorteo;
		this.numeroBoleto = numeroBoleto;
	}

	@Override
	public void run() {
		super.run();
		
		synchronized (this) {
			if (numeroBoleto == resultadoSorteo.consultarNumeroPremiado()) {
				System.out.println("[Participante]: Soy el hilo " + this.getName() + " ¡He ganado el sorteo!");
			} else {
				System.out.println("[Participante]: Soy el hilo " + this.getName() + " no ha habido suerte.");
			}
		}
	}
	
}
