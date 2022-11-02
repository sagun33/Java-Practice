package day02_variables;

import com.sun.jdi.LongType;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
//        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk
//        //  ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz
//        Scanner input =new Scanner(System.in);
//        System.out.println("Dort basamakli sayi giriniz");
//        int sayi = input.nextInt();
//         int sonRakam =sayi%10;
//         int ilkRakam=sayi/1000;
//        System.out.println("ilk rakam+son rakam: "+(ilkRakam+sonRakam));

        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,
        //  onlar ve yuzler basamagi olarak yazdirin

//        Scanner input =new Scanner(System.in);
//        System.out.println("uc  basamakli sayi giriniz");
//        int sayi = input.nextInt();
//
//        int birlerBasamagi = sayi%10;
//        System.out.println("birlerBasamagi = " + birlerBasamagi);
//
//        int OnlarBasamagi =(sayi/10)%10;
//        System.out.println("OnlarBasamagi = " + OnlarBasamagi);
//
//        int YuzlerBasamagi=(sayi/100)%10;
//        System.out.println("YuzlerBasamagi = " + YuzlerBasamagi);
//        int toplam=birlerBasamagi+OnlarBasamagi+YuzlerBasamagi;
//        System.out.println("toplam = " + toplam);
//
//


        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki
        //  rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("5 Basamakli bir Sayi giriniz");
//        int girilenSayi=input.nextInt();
//
//        System.out.println("girilenSayi = " + girilenSayi);
//
//        String strSayi =Integer.toString(girilenSayi);
//
//        String OnbinlerBasamagi=strSayi.substring(0,1);
//        System.out.println("OnbinlerBasamagi = " + OnbinlerBasamagi);
//
//        String BinlerBasamagi= strSayi.substring(1,2);
//        System.out.println("BinlerBasamagi = " + BinlerBasamagi);
//
//        String YuzlerBasamagi = strSayi.substring(2,3);
//
//        String OnlarBasamagi =strSayi.substring(3,4);
//        System.out.println("OnlarBasamagi = " + OnlarBasamagi);
//
//        String BirlerBasamagi = strSayi.substring(4);
//        System.out.println("BirlerBasamagi = " + BirlerBasamagi);
//
//        int OnbinlerBsmk =Integer.parseInt(OnbinlerBasamagi);
//        int BinlerBsmk =Integer.parseInt(BinlerBasamagi);
//        int YuzlerBsmk = Integer.parseInt(YuzlerBasamagi);
//        int OnlarBsmk =Integer.parseInt(OnlarBasamagi);
//        int BirlerBsmk =Integer.parseInt(BirlerBasamagi);
//        System.out.println(BirlerBsmk+OnlarBsmk+BinlerBsmk+OnbinlerBsmk);

//        Scanner input = new Scanner(System.in);
//        System.out.println("5 Basamakli bir Sayi giriniz");
//
//
//        int OnbinlerBasamagi = Integer.parseInt(input.next().substring(0, 1));
//        System.out.println("OnbinlerBasamagi = " + OnbinlerBasamagi);
//        int BinlerBasamagi = Integer.parseInt(input.next().substring(1, 2));
//        System.out.println("BinlerBasamagi = " + BinlerBasamagi);
//        int YuzleerBasamagi = Integer.parseInt(input.next().substring(2, 3));
//        System.out.println("YuzleerBasamagi = " + YuzleerBasamagi);
//        int OnlarBasamagi = Integer.parseInt(input.next().substring(3, 4));
//        System.out.println("OnlarBasamagi = " + OnlarBasamagi);
//        int BirlerBasamgi = Integer.parseInt(input.next().substring(4));
//        System.out.println("BirlerBasamgi = " + BirlerBasamgi);
//
//        System.out.println("ilk iki rakami ile son iki rakami toplami:  " + (OnbinlerBasamagi + BinlerBasamagi + OnlarBasamagi + BirlerBasamgi));
        //2.yol

        Scanner input = new Scanner(System.in);
        System.out.println("5 Basamakli bir Sayi giriniz");
        int sayi = input.nextInt();
        int OnbinlerBasamak1 = sayi / 10000;
        System.out.println("OnbinlerBasamak1 = " + OnbinlerBasamak1);
        int BinlerBasamak1= (sayi / 1000 )%10;
        System.out.println("BinlerBasamak1 = " + BinlerBasamak1);
        int YuzlerBasamak1 =(sayi / 100 )%10;
        System.out.println("YuzleBasamak1 = " + YuzlerBasamak1);
        int OnlarBasamak1 = (sayi / 10 )%10;
        System.out.println("OnlarBasamak1 = " + OnlarBasamak1);
        int BirlerBasamak1 = sayi % 10;
        System.out.println("BirlerBasamak1 = " + BirlerBasamak1);
        int toplam = OnbinlerBasamak1+BinlerBasamak1+OnlarBasamak1+BirlerBasamak1;
        System.out.println(toplam);
//
//
//        System.out.println("3 basamakli sayi giriniz");
//        Scanner input = new Scanner(System.in);
//        int sayi1 = input.nextInt();
//        if (sayi1 > 99 && sayi1 < 1000) {
//            int birler;
//            int onlar;
//            int yüzler;
//            birler = sayi1 % 10;
//            int x = sayi1 % 100;
//            onlar = (x - birler) / 10;
//            yüzler = (sayi1 - x) / 100;
//            System.out.println("birler = " + birler);
//            System.out.println("onlar = " + onlar);
//            System.out.println("yuzler = " + yüzler);
//        } else {
//            System.out.println("Geçerli bir sayı giriniz ... ");
//
//        }


    }
}
