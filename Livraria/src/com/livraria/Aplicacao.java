package com.livraria;

import java.util.Iterator;

public class Aplicacao extends Biblioteca {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();
		//chamando metodo addlivro
		biblioteca.addLivro();
		//Listando todos os livros cadastrados
		System.out.println("MINHA LISTA DE LIVROS");
        int n = biblioteca.minhalista.size();
		for (int i = 0; i < n; i++) {
	    System.out.printf("Posição %d- %s\n", i, biblioteca.minhalista.get(i));
        }
        System.out.println("__________________________________________________________");
        
         //chamando metodo deletalivro
		biblioteca.deletLivro();
		
         //atualizando lista de livros
		System.out.println("MINHA LISTA DE LIVROS: ");
        int n2 = biblioteca.minhalista.size();
		for (int i = 0; i < n2; i++) {
	    System.out.printf("Posição %d- %s\n", i, biblioteca.minhalista.get(i));
        }
		System.out.println("__________________________________________________________");
		
		//adicionando novo livro
		Livros livros4 = new Livros();
		livros4.setTitulo("Aprendendo Java");
		livros4.setAutor("fabiofass");
		biblioteca.minhalista.add(2, livros4);
		
		//Atualizando lista
		System.out.println("MINHA LISTA DE LIVROS: ");
        int n3 = biblioteca.minhalista.size();
		for (int i = 0; i < n3; i++) {
	    System.out.printf("Posição %d- %s\n", i, biblioteca.minhalista.get(i));
        }
		System.out.println("__________________________________________________________");
		

	}

}
