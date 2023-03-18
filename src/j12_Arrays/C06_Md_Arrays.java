package j12_Arrays;

import java.util.Arrays;

public class C06_Md_Arrays {
     /*
Çok Boyutlu Diziler
      Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
       Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
       formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
       matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
       satır ve sütun sayısını girmemiz yeterli olacaktır.
      * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
      Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
 *  icerdeki  array'lere  inner->Daire array denir
 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
 *  Array'i ancak tum elemenlari atanarak declare edilmeli
 * 3- Multi dimensional array'de bir elemanin indexi icin
 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
 */
     public static void main(String[] args) {
         //multi diamensional declerasyon
          int arr1[][]=new int [3][5];//>3 satır 5 sütun
          int arr2[][][]=new int[5][7][12];//bir sitede 12 dairelik 7 kattan oluşan 5 apt

          //md Arraye eleman ekleme
          arr1[2][3]=43; // 2. kat 3. daireye 43 atandı
          arr2[3][2][1]=32;
          System.out.println(arr2[3][2][1]);//sadece 32 çıkar

          //md array tüm elemanları girerek tanımlama

          int arr3[][]={
                  {3,5},
                  {11,13,15},
                  {34, 105,132,1450},
          };

          //md array print etme
          System.out.println(arr1);//Referans
          System.out.println("arr2 = " + arr2);//referans
          System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));//tün satır sütüunlar basılır, belirtilmeyen 0 basar
          System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));
          System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));//referanslarını basar
          System.out.println("Arrays.toString(arr3[2]) = " + Arrays.toString(arr3[2]));//arraydeki elemanı girince girilen çıkar

          /*
MdArray  print etmek için..
toString method kullanılırsa herbir iç(inner) array'in ref değeri print eder
toString method dış(outer) arrayı Stringe cevirir.
dış(outer) arrayı elemanları print etmek için deepToString method kullanılmalı
 */
          //md array istenilen elemanı print etme
          int yas[]={1,2,3,4,5,6,7,8,9};
          System.out.println("yas[2] = " + yas[2]);//3 verir

          System.out.println("arr3[2][1] = " + arr3[2][1]);//doğrudan inner iç array elemanına ulaşılır
          System.out.println("arr3[2] = " + arr3[2]);// index doğrudan inner iç array referansna ulaşır.
          //>>>>>>>>>>istenilen elemana ulaşmak için istenen elemanın iç dış tüm array indexlerini girmek lazım.

     }
}
