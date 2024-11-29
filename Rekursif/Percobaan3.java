package Rekursif;

import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;
        double saldoAwal;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = input.nextDouble();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = input.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}
