package cz.cvut.fel.pjv;
import java.util.Locale;
import java.util.Scanner;

public class Lab01 {
   
   public void start(String[] args) {
      homework();
   }

   public static void homework() {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(Locale.US);


      System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
      int number = sc.nextInt();

      if ( (number < 1) || (number > 4) ) {
         System.out.println("Chybna volba!");



      } else if (number == 1) {
         System.out.println("Zadej scitanec: ");
         double first_var = sc.nextDouble();
         System.out.println("Zadej scitanec: ");
         double second_var = sc.nextDouble();
         System.out.println("Zadej pocet desetinnych mist: ");
         int numberAfterDot = sc.nextInt();

         if (numberAfterDot < 0) {
            System.out.println("Chyba - musi byt zadane kladne cislo!");

         }
         else {
            double sum = first_var + second_var;
            String format = "%." + numberAfterDot + "f";
            String result = String.format(Locale.US, format, first_var) + " + " + String.format(Locale.US,format, second_var) + " = " + String.format(Locale.US,format, sum);
            System.out.println(result);

         }


      } else if (number == 2) {
         System.out.println("Zadej mensenec: ");
         double first_var = sc.nextDouble();
         System.out.println("Zadej mensitel: ");
         double second_var = sc.nextDouble();
         System.out.println("Zadej pocet desetinnych mist: ");
         int numberAfterDot = sc.nextInt();

         if (numberAfterDot < 0) {
            System.out.println("Chyba - musi byt zadane kladne cislo!");

         }
         else {
            double diff = first_var - second_var;
            String format = "%." + numberAfterDot + "f";
            String result = String.format(Locale.US,format, first_var) + " - " + String.format(Locale.US,format, second_var) + " = " + String.format(Locale.US,format, diff);
            System.out.println(result);

         }


      } else if (number == 3) {
         System.out.println("Zadej cinitel: ");
         double first_var = sc.nextDouble();
         System.out.println("Zadej cinitel: ");
         double second_var = sc.nextDouble();
         System.out.println("Zadej pocet desetinnych mist: ");
         int numberAfterDot = sc.nextInt();

         if (numberAfterDot < 0) {
            System.out.println("Chyba - musi byt zadane kladne cislo!");

         } else {
            double prod = first_var * second_var;
            String format = "%." + numberAfterDot + "f";
            String result = String.format(Locale.US,format, first_var) + " * " + String.format(Locale.US,format, second_var) + " = " + String.format(Locale.US,format, prod);
            System.out.println(result);

         }


      } else if (number == 4){
         System.out.println("Zadej delenec: ");
         double first_var = sc.nextDouble();
         System.out.println("Zadej delitel: ");
         double second_var = sc.nextDouble();

         if (second_var == 0) {
            System.out.println("Pokus o deleni nulou!");
            return;
         }

         System.out.println("Zadej pocet desetinnych mist: ");
         int numberAfterDot = sc.nextInt();


         if (numberAfterDot < 0) {
            System.out.println("Chyba - musi byt zadane kladne cislo!");

         } else {
            double podil = first_var / second_var;
            String format = "%." + numberAfterDot + "f";
            String result = String.format(Locale.US,format, first_var) + " / " + String.format(Locale.US,format, second_var) + " = " + String.format(Locale.US,format, podil);
            System.out.println(result);

         }

      } else
         System.out.println("Chybna volba!");



   }
}