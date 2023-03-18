package j18_ImmutableClass;

import java.util.ArrayList;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        /*
		  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
		  BigDecimal, BigInteger java’da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class’lardır.
		 */
        String  name="Aydın";
        System.out.println("   ***   immutable class ***   ");
        System.out.println("method call öncesi name : "+name);// Aydın

        name.concat(" QA team lead");

        System.out.println("method call sonrası name : "+name);// Aydın-> String ımmutable(değişmez) class old  içn variable aynı değeri korur
        System.out.println("   ***   mutable class ***   ");

        ArrayList<String > isimList=new ArrayList<>();// boş String type list
        System.out.println("method call öncesi isimList = " + isimList);//[]
        isimList.add("Abdi");
        isimList.add("Ceren");
        isimList.add("Tuğba");


        System.out.println("method call sonrası isimList = " + isimList);// [Abdi, Ceren, Tuğba]-> List mutable class old için method call sonrası  list değişti

    }
}
