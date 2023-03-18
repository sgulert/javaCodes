package j16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        //localTime-> saat dakika saniye datalarını tutar.

        LocalTime simdi=LocalTime.now();
        System.out.println("simdi = " + simdi);

        System.out.println("simdi.getHour() = " + simdi.getHour());
        System.out.println("simdi.getNano() = " + simdi.getNano());

        //tanımlanan bir time'ın öncesi ve sonrası

        LocalTime time1=LocalTime.of(6,32,45);
        System.out.println("time1.plusHours(4).minusMinutes(76) = " + time1.plusHours(4).minusMinutes(76));

        LocalTime loopbasi=LocalTime.now();
        System.out.println("loopbasi = " + loopbasi);

        int sayi=0;

        for (int i = 0; i <1000 ; i++) {
            sayi+=i;

        }
        LocalTime loopsonu=LocalTime.now();
        System.out.println(loopsonu);
        System.out.println("loop çalışma süresi : " +(loopsonu.getNano()-loopbasi.getNano()));


    }
}
