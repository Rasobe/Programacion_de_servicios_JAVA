package ej013_socket01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		// Creamos serverSocket y lo ponemos a la espera con el puerto que le pasamos por parámetro para que se conecte un socket
		ServerSocket servSock = new ServerSocket(3000);
		// Se queda a la espera de una conexión y devuelve un Socket.
		System.out.println("[Server]: Esperando...");
		Socket sock = servSock.accept();	
		System.out.println("[Server]: Conectado!");
		
		System.out.println("[Server]: Yo soy " + sock.getLocalAddress());	// obtenemos la dirección local
		System.out.println("[Server]: Yo estoy en el puerto " + sock.getLocalPort());	// obtenemos el puerto local
		
		System.out.println("[Server]: Yo estoy conectado con " + sock.getInetAddress());	// direccion remota (quien me ha conectado)
		System.out.println("[Server]: Yo estoy conectado con el puerto " + sock.getPort());	// recogemos el puerto al que está conectada la dirección remota
		
		sock.close();
		servSock.close();
		
	}
	

}
