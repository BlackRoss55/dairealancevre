import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, c, pi=3.14,a;

        Scanner cevre = new Scanner(System.in);
        System.out.print("Daire yarıçapı giriniz: ");
        r = cevre.nextDouble();

        a = pi*r*r;
        c = pi*2*r;

        System.out.println("Dairenin alanı: "+  a);
        System.out.print("Dairenin çevresi: " + c);

    }
}