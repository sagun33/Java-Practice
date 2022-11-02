package day04_ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
        Scanner input = new Scanner(System.in);
        System.out.println("y veya N harfini giriniz");
        char character = input.next().charAt(0);

      if (character=='Y' || character=='y'){
          System.out.println("YES");
      }else if (character=='N' || character=='n'){
          System.out.println("NO");
      }else{
          System.out.println("Lutfen Y/N ikilisinden birini giriniz");
      }




    }
}
