package day02_variables;


import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {


        

//Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan 
// bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen yaricapi giriniz");
//        int yariCap= scan.nextInt();
//        double piSayisi = 3.14;
//        double cevre = 2*piSayisi/100*yariCap;
//        double alan = piSayisi/100*yariCap*yariCap;
//
//
//        System.out.println("cevre = " + cevre);
//        System.out.println("alan = " + alan);

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("kisa kenar giriniz");
//        double a = scan.nextDouble();
//        System.out.println("uzun kenar girin");
//        double b=scan.nextDouble();
//        double alan =a*b;
//        double cevre =2*(a+b);
//        System.out.println("alan = " + alan);
//        System.out.println("cevre = " + cevre);
//        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin 
        // cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c

//        Scanner scan = new Scanner(System.in);
//        System.out.println("üc adet kenar giriniz");
//        byte a = scan.nextByte();
//        byte b =scan.nextByte();
//        byte c=scan.nextByte();
//        int cevre =a+b+c;
//        System.out.println("cevre = " + cevre);

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki
        // gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char s = input.next().charAt(0);
        System.out.println("girdiginiz sembol :  "+s );
        System.out.println();

        System.out.println("       "+s+"\n\n"+"     "+s+"  "+s+"\n\n"+"  "+s+"   "+s+"    "+s);
        System.out.println();


        System.out.println("  "+s+"  ");
        System.out.println(" "+s+" "+s);
        System.out.println(" "+s+" "+s);

    }
}
