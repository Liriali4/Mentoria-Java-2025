package Aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Laura", "laura@gmail.com");
		Pessoa p2 = new Pessoa(2, "Aurora", "aurora@gmail.com");
		Pessoa p3 = new Pessoa(3, "Kayla", "kay@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
