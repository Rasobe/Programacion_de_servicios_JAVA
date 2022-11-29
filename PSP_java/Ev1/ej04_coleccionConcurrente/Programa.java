package ej04_coleccionConcurrente;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Programa {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> mapa = new ConcurrentHashMap<>();
		Hilo h;
		ArrayList<Hilo> hijos = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			h = new Hilo(mapa);
			h.start();
			hijos.add(h);
		}

		hijos.forEach(hilo -> {
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println(mapa);
		
	}

}
