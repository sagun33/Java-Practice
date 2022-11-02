package day06_nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
//        // Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
//// 568
////Besyuzaltmissekiz
//
//        Scanner al = new Scanner(System.in);
//        System.out.println("3 basamaklı bir sayı giriniz.");
//        int num = al.nextInt();
//        if (num > -1000 && num < 1000) {
//            int birler = num % 10;
//            int onlar = (num / 10)%10;
//            int yuzler=(num/100)%10;
//            switch (yuzler) {
//                case 1:
//                    System.out.print("Yuz");
//                    break;
//                case 2:
//                    System.out.print("İkiyuz");
//                    break;
//                case 3:
//                    System.out.print("uçyuz");
//                    break;
//                case 4:
//                    System.out.print("Dortyuz");
//                    break;
//                case 5:
//                    System.out.print("Beşyuz");
//                    break;
//                case 6:
//                    System.out.print("Altıyuz");
//                    break;
//                case 7:
//                    System.out.print("Yediyuz");
//                    break;
//                case 8:
//                    System.out.print("Sekizyuz");
//                    break;
//                case 9:
//                    System.out.print("Dokuzyuz");
//                    break;
//            }
//            switch (onlar) {
//                case 1:
//                    System.out.print("On");
//                    break;
//                case 2:
//                    System.out.print("Yirmi");
//                    break;
//                case 3:
//                    System.out.print("Otuz");
//                    break;
//                case 4:
//                    System.out.print("Kirk");
//                    break;
//                case 5:
//                    System.out.print("Elli");
//                    break;
//                case 6:
//                    System.out.print("Altmis");
//                    break;
//                case 7:
//                    System.out.print("Yetmis");
//                    break;
//                case 8:
//                    System.out.print("Seksen");
//                    break;
//                case 9:
//                    System.out.print("Doksan");
//                    break;
//            }
//            switch (birler) {
//                case 1:
//                    System.out.print("Bir");
//                    break;
//                case 2:
//                    System.out.print("İki");
//                    break;
//                case 3:
//                    System.out.println("uc");
//                    break;
//                case 4:
//                    System.out.println("Dort");
//                    break;
//                case 5:
//                    System.out.println("Beş");
//                    break;
//                case 6:
//                    System.out.println("Altı");
//                    break;
//                case 7:
//                    System.out.println("Yedi");
//                    break;
//                case 8:
//                    System.out.println("Sekiz");
//                    break;
//                case 9:
//                    System.out.println("Dokuz");
//                    break;
//            }
//        } else {
//            System.out.println("hatalı giriş yaptınız:");
//        }
        String s = "Learn";
        String t = "Java";
        System.out.println(s.concat(String.valueOf(t.length())));
        System.out.println(s.length() > s.charAt(0));


    }
}
