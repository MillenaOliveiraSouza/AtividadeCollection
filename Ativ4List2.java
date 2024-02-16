package collection;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Ativ4List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> num = new HashSet <>();
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		int numDesejado = scanner.nextInt();
		
		if (num.contains(numDesejado)) {
			System.out.println("\nNúmero "+ numDesejado +" foi encontrado!");
		} else {
			System.out.println("\nNúmero "+ numDesejado + "não foi encontrado!");
		}
		
		scanner.close();

	}

}
