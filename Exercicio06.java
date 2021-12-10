package br.com.generation.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double num, soma = 0, media = 0, contMedia = 0;
		
		do { 
			System.out.println("Digite um numero");
			num = input.nextInt();
			if (num % 3 == 0 && num != 0 ) {
				
				soma += num;
				contMedia++;
			}
		
	} 
			while (num !=0);
		
		media = soma / contMedia;
		System.out.println("Foram digitados: " + contMedia + " numeros multiplos de 3.");
		System.out.println("A soma dos numeros multiplos de 3 é: " + soma);
		System.out.println("A média dos numeros multiplos de 3: " + media);
		
			
	input.close();
}
}
