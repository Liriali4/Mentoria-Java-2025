package s14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import s14.entidades.Reserva;
import s14.exception.DomainException;

public class Program {

    public static void reservas() {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Nº do quarto: ");
            int num = input.nextInt();
            System.out.print("Data de checkin (dd/MM/yyyy): ");
            Date checkin = sdf.parse(input.next());
            System.out.print("Data de checkout (dd/MM/yyyy): ");
            Date checkout = sdf.parse(input.next());

            Reserva reserva = new Reserva(num, checkin, checkout);
            System.out.println(reserva);
            System.out.println("");

            System.out.println("Dados para actualizar a reserva:");
            System.out.print("Data de checkin (dd/MM/yyyy): ");
            checkin = sdf.parse(input.next());
            System.out.print("Data de checkout (dd/MM/yyyy): ");
            checkout = sdf.parse(input.next());

            reserva.updateDates(checkin, checkout);
            System.out.println(reserva);
        } catch (ParseException e) {
            System.out.println("[Erro] : Formato de data errado!!!");
        } catch (DomainException e) {
            System.out.println("[Erro] : " + e.getMessage());
        } catch(RuntimeException e){
            System.out.println("Erro inesperado!!!");
        }
        input.close();
    }
}
