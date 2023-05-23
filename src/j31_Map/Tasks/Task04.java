package j31_Map.Tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence...");
        String kelime = input.nextLine();

        TreeMap<Character, Integer> harfSayi = new TreeMap<>();

        for (int i = 0; i < kelime.length(); i++) {

            char c = kelime.charAt(i);

            if (harfSayi.containsKey(c)) {
                harfSayi.replace(c, harfSayi.get(c) + 1);
            } else {
                harfSayi.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : harfSayi.entrySet()) {
            System.out.println("Karakter " + entry.getKey() + " " + entry.getValue() + " kadar var...");
        }


    }


}

