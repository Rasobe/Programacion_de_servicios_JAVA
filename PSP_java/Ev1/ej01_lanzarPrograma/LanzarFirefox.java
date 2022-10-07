package ej01_lanzarPrograma;

import java.io.IOException;

public class LanzarFirefox {
	
	public static void main(String[] args) {
		
		try {
			Process proc = new ProcessBuilder("/usr/bin/firefox", "https://twitter.com/Crow6_Esports").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
