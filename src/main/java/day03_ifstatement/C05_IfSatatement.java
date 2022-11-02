package day03_ifstatement;

import java.util.Scanner;

public class C05_IfSatatement {
    public static void main(String[] args) {
        // Task:
        //Kullanicida alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        // dort islemden biri ile isleme koyup sonucu yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n Toplama islemi icin 1\n cikarma islemi icin 2 \n" +
                " bolme islemi icin 3 \n carpma islemi icin 4\n giriniz ");

        int islem =input.nextInt();//Kullanicinin islem tercihi icin variable olusturduk.

        System.out.println("Lutfen iki tam sayi giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if (islem==1){
            System.out.println("Toplama isleminin sonucu: " +num1+ "+"+num2 +"="+(num1+num2));
        } else if (islem==2) {
            System.out.println( "Cikarma isleminin sonucu: " +num1+ "-"+num2 +"="+(num1-num2));

        } else if (islem==3) {
            System.out.println("Bolme isleminin sonucu: " +num1+ "/"+num2 +"="+(num1/num2));

        } else if (islem==4) {
            System.out.println("Carpma isleminin sonucu: " +num1+ "*"+num2 +"="+(num1*num2));

        }else{
            System.out.println("islem disi giris yaptiniz");
        }

    }



    }

