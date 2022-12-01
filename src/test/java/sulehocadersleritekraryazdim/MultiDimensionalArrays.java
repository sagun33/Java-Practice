package sulehocadersleritekraryazdim;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //Kullanicidan alinan bir Stringde gecen sesli harfleri console yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz ");
        String str = input.nextLine();

        String arr[] = str.split("");
        for (String w : arr
        ) {

            if (w.equalsIgnoreCase("a") ||
                    w.equalsIgnoreCase("e") ||
                    w.equalsIgnoreCase("i") ||
                    w.equalsIgnoreCase("o") ||
                    w.equalsIgnoreCase("u")) {
                System.out.println(w);
            }




        }

    }

}
;        
        
        
    

