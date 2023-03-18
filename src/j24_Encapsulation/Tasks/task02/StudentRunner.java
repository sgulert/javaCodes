package j24_Encapsulation.Tasks.task02;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz: ");
        String ad=scan.nextLine();
        System.out.println("yaşınız: ");
        int yas= scan.nextInt();
        Student student=new Student(ad,yas);
        System.out.println(student);
    }

    }

