package day05ifstatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {
       //Kullanicidan dortgenin kenar uzunluklarini isteyin
//ve dortgenin kare veya dikdortgen  olup  olmadigini yazdirin
//
//        Scanner input = new Scanner(System.in);
////        System.out.println("Lutfen 1.kenar uzunlugunu giriniz");
////        int kenar1=input.nextInt();
////
////        System.out.println("Lutfen 2.kenar uzunlugunu giriniz");
////        int kenar2=input.nextInt();
////
////        System.out.println("Lutfen 3.kenar uzunlugunu giriniz");
////        int kenar3=input.nextInt();
////
////        System.out.println("Lutfen 4.kenar uzunlugunu giriniz");
////        int kenar4=input.nextInt();
////
////        if (kenar1==kenar2 && kenar2==kenar3&& kenar3==kenar4){
////            System.out.println("Karedir");
////
////        } else if (kenar1==kenar2 && kenar3==kenar4){
////            System.out.println("Dikdortgendir");{
////
////            }
////        } else System.out.println("Kare degildir");

        /*Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
 Egr kullanici tamsayinin disinda herhangi bir sey girerse " Uyari verin.
  */
        Scanner input = new Scanner(System.in);
        System.out.println(" Tek mi cift mi oldugunu gormek istediginiz bir tam sayi daha giriniz");

        int rakam = input.nextInt();
        String result = (rakam % 2 == 0 ? ("Girdiginiz rakam cifttir") : (rakam%2!=0 ?("Girdiginiz rakam tektir") :  ("Uyari!!")));
        System.out.println(result);




    }
}
