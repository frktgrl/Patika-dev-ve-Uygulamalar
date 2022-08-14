

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
    Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunuz:");
        mat = inp.nextInt();

        System.out.print("fizik notunuz:");
        fizik = inp.nextInt();

        System.out.print("kimya notunuz:");
        kimya = inp.nextInt();

        System.out.print("turkce notunuz:");
        turkce = inp.nextInt();

        System.out.print("tarih notunuz:");
        tarih = inp.nextInt();

        System.out.print("muzik notunuz:");
        muzik = inp.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz:" + sonuc);

        System.out.println(sonuc >= 60.0D ? "Geçti" : "Kaldı");




    }
}
