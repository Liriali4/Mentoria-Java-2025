package s14.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public long duration() {
        long diff = checkout.getTime() - checkin.getTime();
        TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
        return diff;
    }

    public String updateDates(Date checkin, Date checkout) {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            return "As Datas devem ser futuras!!!";
        }
        if (!checkout.after(checkin)) {
            return "[ERRO] : Data do chekin não pode ser maior que checkout!!!";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    @Override
    public String toString() {
        return "Reserva:"
                + "Quarto = "
                + roomNumber
                + ", checkin = "
                + sdf.format(checkin)
                + ", checkout = "
                + sdf.format(checkout)
                + ", duração de "
                + duration()
                + " dias";
    }

}
