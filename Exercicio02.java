package br.com.generation.repeticao;

import java.util.Scanner;
								//contPar --> contar quantos sao par/impar
public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // o input recebe uma classe de scanner //10 numeros
		int num = 0, contPar = 0, contImp = 0; //guardando um valor
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.print("\nDigite o " + contador + "° numero:");
			num = input.nextInt();
			
			if(num % 2 == 0) {
				contPar++;        //a variavel vai receber +1 --> contPar = contPar + 1
			}
			else {
				contImp++;
			}
		}
			System.out.println("Foram digitados " + contPar + " numeros pares. ");
			System.out.println("Foram digitados " + contImp + " numeros impares. ");
			
		input.close ();
		
		
	}

}
