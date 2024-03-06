package estagioRibeiraoPreto2024;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, n3 = 0, i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número que seja da sequência de Fibonacci:");
		i = scan.nextInt();
		
		while (i > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		
		if(i == 0) {
			System.out.println("O número 0 está na sequência de fibonacci. \nO próximo número é: 1.");
		} else if(i == n3) {
			System.out.println("O número " + i + " está na sequência de fibonacci. \nO próximo número é: " + (n1 + i) + ".");
		} else {
			System.out.println("Este número não faz parte da sequência de fibonacci.");
		}
	}	
}
