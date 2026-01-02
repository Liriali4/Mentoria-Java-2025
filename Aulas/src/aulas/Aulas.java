package aulas;

import java.util.Scanner;
import s16.LocadoraDeCarros;

/*import s12.composicao.Composicao;
import s12.enumeracao.Enumeracao;
import s12.exercicodefixacao.ExF;
import s12.stringbuilder.Social;
import static s13.ex1.ex1.ex1;
import s14.Program;
import s15.Servidor;*/
import s13.classesAbstratas.Ex2;
import s16.InterfaceComparable;
import s17.Conjuntos;
import s17.Curinga;
import s17.Delimitados;
import s17.Usuarios;

public class Aulas {

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("        EXERCÍCIOS DAS AULAS DO CURSO        ");
        System.out.println("============================================");

        Scanner input = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n1.Enumerações");
            System.out.println("2. Composição");
            System.out.println("3. Rede social");
            System.out.println("4. Pedidos do Cliente");
            System.out.println("5. Funcionário Externo");
            System.out.println("6. Formas Geométricas");
            System.out.println("7. Hotel");
            System.out.println("8. Servidor de arquivos");
            System.out.println("9. Locadora de carro");
            System.out.println("10. Interface Comparable");
            System.out.println("11. Genérico Delimitado");
            System.out.println("12. Curinga Delimiado");
            System.out.println("13. Conjunto de valores (Set)");
            System.out.println("14. Usuários (Map)");
            System.out.println("0. TERMINAR SESSÃO");

            System.out.print("R:");
            op = input.nextInt();

            switch (op) {
                case 1:
                    //Enumeracao.enumeracao();
                    break;
                case 2:
                    //Composicao.composicao();
                    break;
                case 3:
                    //Social.redeSocial();
                    break;
                case 4:
                //ExF.gestaoDePedidos();
                case 5:
                //ex1();
                case 6:
                    Ex2.ex2();

                case 7:
                    //Program.reservas();
                    break;
                case 8:
                    /*                    Servidor.ex1();
                    Servidor.ex2();
                    Servidor.ex3();
                    Servidor.ex4();
                    Servidor.ex5();*/
                    break;
                case 9:
                    LocadoraDeCarros.locadoraDeCarros();
                    break;
                case 10:
                    InterfaceComparable.lista();
                    break;
                case 11:
                    Delimitados.ex1();
                    break;
                case 12:
                    Curinga.curingaDelimitados();
                    break;
                case 13:
                    Conjuntos.conjuntos();
                    break;
                case 14:
                    Usuarios.usuarios();
                    break;
                default:
                    System.out.println("Digite um valor válido no menu...");
            }
        } while (op != 0);

    }

}
