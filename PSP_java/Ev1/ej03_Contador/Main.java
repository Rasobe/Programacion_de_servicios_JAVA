package ej03_Contador;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Contador contador = new Contador(true);
		HiloDescontador h1 = new HiloDescontador(1000, contador);
		HiloDescontador h2 = new HiloDescontador(1000, contador);
		Thread h3 = new Thread(new HiloContador(2000, contador));
		Thread h4 = new Thread(new HiloContador(2000, contador));
		
		h1.start();		
		h2.start();
		h3.start();
		h4.start();
		
		h1.join();
		h2.join();
		h3.join();
		h4.join();
		
		System.out.println(contador);

	}

}
