package br.com.vainaweb.backend.java.aula.projeto1;

import java.util.Scanner;
import java.util.Random;

public class MegaSena {

//	1 - MEGA-SENA EM JAVA
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
//		Os números escolhidos terão de ser guardados em um vetor
		int[] numeros = new int[7];
		
		for(int i = 0; i < 7; i++) {
			byte inputValido = 0;
			do {
//				Precisa ser obrigatoriamente um numero inteiro. Caso o usuário digite outro tipo de dado, o programa não pode parar
				try {
//					O usuário precisa escolher 7 números de 0 a 100. 
					System.out.println("Digite o" + (i+1) + "° número (entre 0 e 100)");
					numeros[i] = sc.nextInt();
					inputValido = 1;
				} catch (NumberFormatException e) {
					System.out.println("Digite um número inteiro");
				}
			} while(inputValido == 0);
		}
			
//		Os 7 números vencedores terão de ser sorteado pela classe Random do java. 	
		
		int[] numerosVencedores = new int[7];
		
		for(int i = 0; i < 7; i++) {
			int num = rand.nextInt((100 - 0) + 1) + 0;
			numerosVencedores[i] = num;
		}
		
//		Após o final, percorrer o vetor com as respostas e comparar com os 7 números sorteados
		int	quantAcertos = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(numeros[i] == numerosVencedores[j]) {
					quantAcertos += 1;
				}
			}
		}
		
		if(quantAcertos == 5) {
//			Se o usuário acertar 5 números → Premio de 10 mil reais
			System.out.println("Parabéns! Você ganhou um prêmio de 10 mil reais.");
		} else if(quantAcertos == 6) {
//			Se o usuário acertar 6 números → Premio de 50 mil reais
			System.out.println("Parabéns! Você ganhou um prêmio de 50 mil reais.");
		} else if(quantAcertos == 7) {
//			Se o usuário acertar 7 números → Premio de 200 mil reais
			System.out.println("Parabéns! Você ganhou um prêmio de 200 mil reais.");
		} else {
			System.out.println("É... Tu não ganhou nada não.");
		}
		
		sc.close();
	}

}
