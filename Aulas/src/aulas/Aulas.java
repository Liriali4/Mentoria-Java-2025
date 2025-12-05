package aulas;

import java.util.Scanner;

public class Aulas {

    public static void main(String[] args) {
         System.out.println("============================================");
        System.out.println("        EXERCÍCIOS DAS AULAS DO CURSO        ");
        System.out.println("============================================\n");

        Scanner input = new Scanner(System.in);
        byte op;

        do {
            System.out.println("1.Classe pessoa");
            System.out.println("2. Fornecedor");
            System.out.println("3. Empregado");
            System.out.println("0. TERMINAR SESSÃO");

            System.out.print("R:");
            op = input.nextByte();

            switch (op) {
                case 1:
                    System.out.println("\nApenas criei a classe pessoa\n");
                    break;
                case 2:
                    System.out.println("  ");
                    break;
                case 3:
                    System.out.println("  ");
                    break;
                default:
                    System.out.println("Digite um valor válido no menu...");
            }
        } while (op != 0);

    }
    
}
