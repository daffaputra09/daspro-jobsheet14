package Rekursif;
import java.util.Scanner;

public class Tugas {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int jumlahAngka = input.nextInt();

        int[] angka = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (jumlahAngka - i) + ": ");
            angka[i] = input.nextInt();
        }

        int totalIteratif = hitungTotalIteratif(angka);
        System.out.println("Total dengan iteratif adalah: " + totalIteratif);

        int totalRekursif = hitungTotalRekursif(angka, jumlahAngka - 1);
        System.out.println("Total dengan rekursif adalah: " + totalRekursif);
    }

    static int hitungTotalIteratif(int[] angka) {
        int total = 0;
        for (int num : angka) {
            total += num;
        }
        return total;
    }

    static int hitungTotalRekursif(int[] angka, int index) {
        if (index < 0) {
            return 0;
        }
        return angka[index] + hitungTotalRekursif(angka, index - 1);
    }

}