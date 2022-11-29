package ej05_colaProdcutorConsumidor;

import java.util.concurrent.LinkedBlockingDeque;

public class Hilo implements Runnable {

	@Override
	public void run() {
		LinkedBlockingDeque<String> cola = new LinkedBlockingDeque<>(50);
		
	}

}
