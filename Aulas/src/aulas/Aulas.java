package aulas;

import java.util.Scanner;
import s12.Composicao;
import s12.Enumeracao;

public class Aulas {

public static void main(String[] args) throws Exception {
        System.out.println("============================================");
        System.out.println("        EXERCÍCIOS DAS AULAS DO CURSO        ");
        System.out.println("============================================\n");

        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("1.Enumerações");
            System.out.println("2. Composição");
            System.out.println("3. Empregado");
            System.out.println("0. TERMINAR SESSÃO");

            System.out.print("R:");
            op = input.nextInt();

            switch (op) {
                case 1:
                    Enumeracao.enumeracao();
                    break;
                case 2:
                    Composicao.composicao();
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
