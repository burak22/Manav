import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? ");
        float armut = input.nextFloat();
        System.out.print("Elma Kaç Kilo? ");
        float elma = input.nextFloat();
        System.out.print("Domates Kaç Kilo? ");
        float domt = input.nextFloat();
        System.out.print("Muz Kaç Kilo? ");
        float muz = input.nextFloat();
        System.out.print("Patlıcan Kaç Kilo? ");
        float patl = input.nextFloat();

        float toplam = (armut * 2.14f)+(elma * 3.67f)+(domt * 1.11f)+(muz * .95f)+(patl * 5);
        System.out.println("Toplam Alışveriş Tutarı: " + toplam);
    }


}