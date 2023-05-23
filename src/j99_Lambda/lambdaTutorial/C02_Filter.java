package j99_Lambda.lambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        ciftBul(sayiList);
        ciftBulFunctioanl(sayiList);
        ciftBulFunctioanlOtuzBestenkucuk(sayiList);
        answerTask04(sayiList);
    }//main sonu

    //task01 --> structerd programming kullanarak listin çift elemanlarını aynı satırda aralarında boşluk ile print ediniz.

    public static void ciftBul(List<Integer> sayilist){
        for (int i = 0; i <sayilist.size() ; i++) {
            if (sayilist.get(i)%2==0){
                System.out.print(sayilist.get(i)+ " ");
            }

        }
        System.out.println();
    }

    public static void ciftBulFunctioanl(List<Integer> sayilist){
        sayilist
                .stream()
                .filter(C01_LambdaExpression::isEven)
                .forEach(C01_LambdaExpression::yazdir);
        System.out.println();
    }
    //task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin ,
    // 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
    public static void ciftBulFunctioanlOtuzBestenkucuk(List<Integer> sayilist){
        sayilist.stream().filter(C01_LambdaExpression::isEven).filter(t->t<35).forEach(C01_LambdaExpression::yazdir);
    }

    public static void answerTask04(List<Integer> sayilist){
        sayilist.stream().filter(t->t>34 || t%2==1).forEach(C01_LambdaExpression::yazdir);
    }



}
