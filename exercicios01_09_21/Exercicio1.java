package exercicios01_09_21;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		 int num1,num2,num3;
		 
		 
		 Scanner leia = new Scanner(System.in);
			System.out.println("\nEntre com o primeiro numero:");
			num1 = leia.nextInt();
			System.out.println("\nEntre com o segundo numero:");
			num2 = leia.nextInt();
			System.out.println("\nEntre com o terceiro numero:");
			num3 = leia.nextInt();
		 
			if (num1>num2 && num1>num3) {
				System.out.println("\nO maior número é o primeiro: "+num1);
			}
			else if(num2>num1 && num2>num3) {
				System.out.println("\nO maior número é o segundo: "+num2);
			}
			else {
				System.out.println("\nO maior número é o terceiro: "+num3);
			}
	}
}
