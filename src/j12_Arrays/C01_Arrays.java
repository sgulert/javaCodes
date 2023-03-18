package j12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable omalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
        //trick: ataması yapılmayan bir array actiona alınmaz, ctre verir
        String isimArr[]={"yusuf","murat", "ceren", "*vedat", "**suzan", "abdi"};
        int sayiArr[]=new int[5];
        //arraye eleman ekleme
        sayiArr[1]=25; //1. index 25 value atandı
        sayiArr[0]=46; //0. index 46 atandı
        sayiArr[2]=31; //2. index 31 atandı
        sayiArr[1]=2; //1. index update yapıldı
        sayiArr[3]=2;
        sayiArr[4]=46;
        //array elaman sayısı->length
        System.out.println(sayiArr.length);
        System.out.println("isimArr.length = " + isimArr.length);

        int kacIsim= isimArr.length;
        System.out.println("kacIsim = " + kacIsim);

        //array son index eleman:: length-1
        System.out.println(isimArr[isimArr.length - 1]);

        //array eleman print etme
        System.out.println(isimArr);//array non primitive data olduğu için heapteki referans değeri print edilir.[Ljava.lang.String;@38082d64
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));
        System.out.println();

        //TASK->    sayiArr çift index elemanlarını print eden code create ediniz

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        for (int i = 0; i <sayiArr.length ; i++) {
            if (i%2==0){
                System.out.println(sayiArr[i]);
            }
        }
        System.out.println();
        //TASK->isimArrayde karakteri 5 karakterden fazla olan elemanları print eden code

        for (int i = 0; i <isimArr.length ; i++) {
            if (isimArr[i].length()>5){
                System.out.println(isimArr[i]);
            }

        }
        //TASK-> isimArrayde 6 karakterden az olan elemanları saklayan array print ediniz
        //arrayde boyut, uzunluk ilk şart
        int yeniArrayboyut=0;
        for (int i = 0; i <isimArr.length ; i++) {
            if (isimArr[i].length()<6){
                yeniArrayboyut++;
            }

        }
        System.out.println(yeniArrayboyut);

        String yeniArr[]=new String[yeniArrayboyut];
        int j=0;//yeni array indexi

        for (int i = 0; i < isimArr.length; i++) {
            yeniArr[j]=isimArr[i];
            j++;
        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
