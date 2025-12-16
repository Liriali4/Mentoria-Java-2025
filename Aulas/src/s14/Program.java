package s14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import s14.entidades.Reserva;

public class Program {

    public static void reservas() throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nº do quarto: ");
        int num = input.nextInt();
        System.out.print("Data de checkin (dd/MM/yyyy): ");
        Date checkin = sdf.parse(input.next());
        System.out.print("Data de checkout (dd/MM/yyyy): ");
        Date checkout = sdf.parse(input.next());

        if (!checkout.after(checkin)) {
            System.out.println("[ERRO] : Data do chekin não pode ser maior que checkout!!!");
        } else {
            Reserva reserva = new Reserva(num, checkin, checkout);
            System.out.println(reserva);
            System.out.println("");

            System.out.println("Dados para actualizar a reserva:");
            System.out.print("Data de checkin (dd/MM/yyyy): ");
            checkin = sdf.parse(input.next());
            System.out.print("Data de checkout (dd/MM/yyyy): ");
            checkout = sdf.parse(input.next());
            
           String error = reserva.updateDates(checkin, checkout);
           if(error != null){
               System.out.println("[ERRO] : "+ error);
           }else{
               System.out.println(reserva);
           }
        }

        input.close();
    }
}
