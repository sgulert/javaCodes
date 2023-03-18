package j16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        //localdate time yıl gün ay saat dakika saniye datalarını tutar
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        LocalDate date=LocalDate.of(2022,12,27);
        LocalTime time=LocalTime.of(17,23,44);

        LocalDateTime ldt1=LocalDateTime.of(date,time);
        System.out.println("ldt1 = " + ldt1);// 2022-12-27T17:23:44




    }
}
