package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);      //solicitar idade
		
		int idade = 0, menos21 = 0 , mais50 = 0;
		boolean pausa;
		while (idade != -99) {
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		if(idade <21 & idade >0) {
			menos21++;
		}
		if (idade > 50) {
			mais50++;
			}
		if (idade ==-99) {
			pausa = false;
		}
		if (idade <0 && idade != -99) {
			System.out.println("idade inválida");
		}
		}
		
		System.out.println(menos21);
		System.out.println(mais50);
		
		
		input.close();
	}
}

	


