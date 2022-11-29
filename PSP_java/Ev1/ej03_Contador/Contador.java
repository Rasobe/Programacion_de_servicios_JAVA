package ej03_Contador;

public class Contador {

	private boolean positivo;
	private int numero;

	public Contador(boolean positivo) {
		super();
		this.positivo = positivo;
		this.numero = 0;
	}

	public synchronized void contar() { // 3ª forma de sincronizar
		if (positivo) {
			// synchronized (this) { // se puede sincronizar desde aqui o desde los hiloscontadador y hilodescontador				
			// 2ª forma de sincronizar
				this.numero++;
			// }
		} else {
			// synchronized (this) {
				this.numero--;
			// }
		}
	}
	
	public synchronized void descontar() {
		if (!positivo) {
			synchronized (this) {				
				this.numero++;
			}
		} else {
			synchronized (this) {	
				this.numero--;
			}
		}
	}

	@Override
	public String toString() {
		return "Contador [positivo=" + positivo + ", numero=" + numero + "]";
	}

}
