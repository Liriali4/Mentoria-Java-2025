package s13.classesAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

    public static void ex2() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Forma> lista = new ArrayList<>();
        System.out.print("Qual é a quantidade de formas: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Formas"+ (i + 1));
            System.out.print("Retângulo ou Circulo (r/c): ");
            char ch = input.next().charAt(0);
            System.out.print("Cor (BLACK/BLUE/RED): ");
            input.nextLine();
            Cor cor = Cor.valueOf(input.next());

            if (ch == 'r') {
                System.out.print("Largura: ");
                double lar = input.nextDouble();
                System.out.print("Altura: ");
                double alt = input.nextDouble();
                lista.add(new Retangulo(lar, alt, cor));
            } else {
                System.out.print("Raio: ");
                double raio = input.nextDouble();
                lista.add(new Circulo(raio, cor));
            }

            for (Forma f : lista) {
                System.out.println(f.area());
            }

        }
        input.close();
    }
}
