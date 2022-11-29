package ej013_socket01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	
	public static void main(String[] args) {
		Socket sock = null ;
		try {
			// creamos el socket SIN INICIARLO, pero si pasamos el puerto con la dirección, se conecta automaticamente
			sock = new Socket("localhost", 3000);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("[Cliente]: Yo soy " + sock.getLocalAddress());	// obtenemos la dirección local
		System.out.println("[Cliente]: Yo estoy en el puerto " + sock.getLocalPort());	// obtenemos el puerto local
		
		System.out.println("[Cliente]: Yo estoy conectado con " + sock.getInetAddress());	// direccion remota (quien me ha conectado)
		System.out.println("[Cliente]: Yo estoy conectado con el puerto " + sock.getPort());	// recogemos el puerto al que está conectada la dirección remota
		
	}

}
