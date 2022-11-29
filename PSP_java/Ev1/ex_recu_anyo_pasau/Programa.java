package ex_recu_anyo_pasau;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
		ResultadoSorteo resultadoSorteo = new ResultadoSorteo();
		List<Participante> listaParticipantes = new ArrayList();
		int numeroParticipantes = 5;
		
		Sorteo sorteo = new Sorteo(resultadoSorteo, numeroParticipantes);
		sorteo.run();
		
		for (int i = 1; i <= numeroParticipantes; i++) {
			listaParticipantes.add(new Participante(resultadoSorteo, i));
		}
		
		for (Participante participante : listaParticipantes) {
			synchronized (resultadoSorteo) {
				participante.start();				
			}
		}
		
		for (Participante participante : listaParticipantes) {
			participante.join();
		}
		
	}
	
}
