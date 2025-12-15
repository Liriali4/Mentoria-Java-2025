package aulas;

import java.util.Scanner;
import s12.composicao.Composicao;
import s12.enumeracao.Enumeracao;
import s12.exercicodefixacao.ExF;
import s12.stringbuilder.Social;
import s13.classesAbstratas.Ex2;
import static s13.ex1.ex1.ex1;

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
            System.out.println("3. Rede social");
            System.out.println("4. Pedidos do Cliente");
            System.out.println("5. Funcionário Externo");
            System.out.println("6. Formas Geométricas");
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
                    Social.redeSocial();
                    break;
                case 4: 
                    ExF.gestaoDePedidos();
                case 5:
                    ex1();
                case 6:
                    Ex2.ex2();
                default:
                    System.out.println("Digite um valor válido no menu...");
            }
        } while (op != 0);

    }

}
