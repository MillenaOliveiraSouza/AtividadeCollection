package collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ativ1List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> cores = new ArrayList<>();
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite 5 cores: ");
			
			for (int i =0; i< 5; i++) {
				System.out.print((i + 1)+" cor: ");
				String cor = scanner.nextLine();
				cores.add(cor);
			}
			
			Collections.sort(cores);
			
			System.out.println("\nCores ordenadas: ");
			
			for (String cor: cores) {
				System.out.println(cor);
			}
			
			scanner.close();
	}

}
