package ej03_Contador;

import java.util.Iterator;

public class HiloContador implements Runnable {

	private int vueltas;
	private Contador contador;
	
	public HiloContador(int vueltas, Contador contador) {
		super();
		this.vueltas = vueltas;
		this.contador = contador;
	}



	@Override
	public void run() { 
		for (int i = 0; i < vueltas; i++) {
//			 1ª forma de sincronizar
			synchronized (contador) { // poner un candado en el objeto para que no se superpongan los hilos				
				contador.contar();			
			}
		}
		
	}

}
