package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// 
		
		Scanner input = new Scanner(System.in);
		
		int num, soma = 0, cont =0;
		
		do {
			System.out.println("Digite um número: ");
			num = input.nextInt();
			if(num != 0) {
				cont++;
			}
			soma += num;
			}
		while (num != 0);
		
		System.out.println("Foram digitados " + cont + " numeros diferentes de 0");
		System.out.println("A soma dos numeros digitados é : " + soma);
		
		
		input.close();
	}

}
