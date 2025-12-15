package s13.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex1 {

    public static void ex1() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        System.out.print("Qual é a quantidade de funcionários: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1));
            System.out.print("O funcionário é externo? (y/n):");
            char ch = input.next().charAt(0);
            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Horas: ");
            int horas = input.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = input.nextDouble();
            if (ch == 'y') {
                System.out.print("Custo adicional: ");
                double custo = input.nextDouble();
                lista.add(new FuncionarioExterno(custo, nome, horas, valorPorHora));
            } else {
                lista.add(new Funcionario(nome, horas, valorPorHora));
            }
            System.out.println("");
            System.out.println("PAGAMENTOS:");
            for (Funcionario f : lista) {
                System.out.println(f.getNome() + " - $ " + String.format("%.2f", f.pagamento()));
            }
        }

        input.close();
    }
}
