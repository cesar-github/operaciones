package duoc.ejerciciogit.main;

import duoc.ejerciciogit.main.modelo.OperacionesBasicas;

public class Launcher {

	public static void main(String[] args) {
	
		
		OperacionesBasicas opes = new OperacionesBasicas();
		System.out.println("La suma de 15+20 es:  " +opes.sumar(15, 20));
		System.out.println("La resta de 15-20 es:  " +opes.restar(15, 20));
		System.out.println("La multiplicar de 15*20 es:  " +opes.multiplicar(15, 20));
		System.out.println("La dividir de 15/20 es:  " + (double)opes.dividir(15, 20));
		
		
	}

}
