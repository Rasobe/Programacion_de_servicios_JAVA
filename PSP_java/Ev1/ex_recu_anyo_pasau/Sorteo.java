package ex_recu_anyo_pasau;

import java.util.Random;

public class Sorteo implements Runnable {

	private ResultadoSorteo resultadoSorteo;
	private int numeroParticipantes;

	public Sorteo(ResultadoSorteo resultadoSorteo, int numeroParticipantes) {
		super();
		this.resultadoSorteo = resultadoSorteo;
		this.numeroParticipantes = numeroParticipantes;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			Random r = new Random();
			resultadoSorteo.establecerNumPremiado(r.nextInt(numeroParticipantes) + 1);
			System.out.println("[Sorteo]: Sorteo realizado, número premiado: " + resultadoSorteo.consultarNumeroPremiado());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
