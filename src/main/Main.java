package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Digite a string que deseja inverter: ");
        
        String original = read.nextLine();
        String invertida = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("A string invertida é: " + invertida);
		
        
        read.close();
		
	}

}
