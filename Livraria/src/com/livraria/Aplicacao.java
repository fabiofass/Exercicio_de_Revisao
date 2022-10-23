package com.livraria;

import java.util.Iterator;

public class Aplicacao extends Biblioteca {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.addLivro();
		System.out.println("MINHA LISTA DE LIVROS");

		int n = biblioteca.minhalista.size();
		for (int i = 0; i < n; i++) {
	    System.out.printf("Posição %d- %s\n", i, biblioteca.minhalista.get(i));
        }
        System.out.println("__________________________________________________________");

		biblioteca.deletLivro();

		System.out.println("MINHA LISTA DE LIVROS: ");
        int n2 = biblioteca.minhalista.size();
		for (int i = 0; i < n2; i++) {
	    System.out.printf("Posição %d- %s\n", i, biblioteca.minhalista.get(i));
        }
		System.out.println("__________________________________________________________");

	}

}
