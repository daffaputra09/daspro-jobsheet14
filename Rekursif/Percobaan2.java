package Rekursif;
import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input.nextInt();

        System.out.print("Hasil perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print(" x 1");
            return 1;
        } else {
            System.out.print(x + (y > 1 ? " x " : ""));
            return x * hitungPangkat(x, y - 1);
        }
    }
}
