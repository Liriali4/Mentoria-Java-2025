package s12.composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import s12.enums.NivelDeTrabalho;

public class Composicao {

public static void composicao() throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String depName = input.nextLine();

        System.out.print("Digite o nome do Trabalhador: ");
        String tName = input.nextLine();
        System.out.print("Nível: ");
        String tNivel = input.nextLine();
        System.out.print("Salário Base: ");
        double salBase = input.nextDouble();

        Trabalhador trabalhador = new Trabalhador(
                tName,
                NivelDeTrabalho.valueOf(tNivel.toUpperCase()),
                salBase,
                new Departamento(depName)
        );

        System.out.print("Quantos contratos este trabalhador terá: ");
        int qtdd = input.nextInt();

        for (int i = 1; i <= qtdd; i++) {
            System.out.println("Contrato #" + i + ": ");

            System.out.print("Data (DD/MM/YYYY): ");
            String dateStr = input.next();
            Date contDate = null;

            try {
                contDate = sdf.parse(dateStr);
            } catch (ParseException e) {
                System.out.println("Erro: data inválida!");
                return;
            }

            System.out.print("Valor por hora: ");
            double sal = input.nextDouble();

            System.out.print("Quantidade de horas: ");
            int horas = input.nextInt();

            Contrato cont = new Contrato(contDate, sal, horas);
            trabalhador.addContrato(cont);
        }

        System.out.println();

        // Resolver problema do nextLine() após nextInt()
        input.nextLine();

        System.out.print("Calcular ganho de qual mês (MM/YYYY): ");
        String mesEAno = input.nextLine();

        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Valor ganho em " + mesEAno + ": " 
                + String.format("%.2f", trabalhador.calcularGanho(ano, mes)));
    }
}
