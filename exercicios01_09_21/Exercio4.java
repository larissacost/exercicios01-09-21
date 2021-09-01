package exercicios01_09_21;

import java.util.Scanner;

public class Exercio4 {

	public static void main(String[] args) {
		double num,res;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com  o numero:");
		num = leia.nextInt();
		
		if(num % 2 ==0) {
			res = Math.sqrt(num);
			System.out.println("\nA raiz quadrada do seu numero é:"+res);
		}
		else {
			res = Math.pow(num, 2);
			System.out.println("\nSeu número elevado ao quadrado é:"+res);
		}
		

	}

}
