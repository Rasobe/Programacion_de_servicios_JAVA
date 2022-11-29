package ej04_coleccionConcurrente;

import java.util.concurrent.ConcurrentHashMap;

public class Hilo extends Thread {
	
	ConcurrentHashMap<String, String> mapa;

	public Hilo(ConcurrentHashMap<String, String> mapa) {
		super();
		this.mapa = mapa;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			mapa.put("Barcelona", "España");
			mapa.put("Madrid", "España");
			mapa.put("Jaén", "España");
			mapa.put("París", "España");
			
		}
	}

}
