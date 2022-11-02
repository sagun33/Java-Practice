package day03_ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {
        char harf = 'a';
        char harf2 = 'A';

        System.out.println("harf>harf2==> " + (harf > harf2));//true
        //Karsilastirma islemlerinin sonucunu booleantrue yada false döner.
        //Büyük harflerin ASCII Degerleri Kücük harflerin ASCII Degerlerinden daha kücüktür.

        //1)Herhangi bir char variable'in ASCII degerlerini  kod yazarak bulunuz.

        //1.yol
        char space = ' ';
        System.out.println("Space'in ASCII degeri: " + (space + 0));//32 space'in ASCII degerini toplamak icin
        // toplamaya etkisi olmayan
        // '0' la toplariz.Böylece yazdirdigimizda deger bize space ASCII degerini verir

        char m = 'm';
        System.out.println("m nin ASCII Degeri: " + (m + 0));

        //2.Yol:
        int harf3 = 'm';
        System.out.println("m'nin ASCII Degeri: " + harf3);//char'larda Java char karakteri int 'a atayabiliriz.
        //Cünkü char'lar bir resim karakteri bir de matematiksel ASCII degeri vardir.
        // Bu nedenle ASCII degerlerini hesaplayabiliriz.

        int harf4 = 's';
        System.out.println(harf4);

        //soru:
        byte b1 =12;
        byte b2 =-125;
        System.out.println("b1>b2==>: "+(b1>b2));

        float f1 = 2.45645f;
        float f2 = 5.86786f;
        System.out.println("f1>f2==>: "+(f1>f2));
        System.out.println("b1>f1==>: "+(b1>f1));

        long lng1 = 545645646L;
        System.out.println("b1<lng1==> "+(b1<lng1));
        char ch = 'h';
        System.out.println("b1>ch ==>: "+(b1>ch));
        System.out.println(ch+0);

    }

}
