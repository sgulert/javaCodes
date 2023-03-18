package j16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        //LocalDate -> sadece gün ay yıl datalarını tutar

        LocalDate bugun= LocalDate.now();
        System.out.println("bugun = " + bugun);

        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());
        System.out.println("bugun.getMonth() = " + bugun.getMonth());

        LocalDate date1= LocalDate.of(2016, 7, 15);
        LocalDate date2= LocalDate.of(1995, Month.JUNE, 9);

        System.out.println("date1.plusDays(3) = " + date1.plusDays(3));
        System.out.println("date2 = " + date2);
        System.out.println("date2.minusMonths(45) = " + date2.minusMonths(45));


    }
}
