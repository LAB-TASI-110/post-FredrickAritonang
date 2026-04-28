package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSemua = 0;

        while (true) {
            System.out.println("=== MENU KAFETARIA IT DEL ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Teh");
            System.out.println("4. Kopi");
            System.out.println("0. Selesai");

            System.out.print("Pilih menu: ");
            int kode = input.nextInt();

            if (kode == 0) break;

            String nama = Model3.getNamaMenu(kode);
            int harga = Model3.getHarga(kode);

            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();

            int subtotal = Model3.hitungTotal(harga, jumlah);
            totalSemua += subtotal;

            System.out.println("Subtotal " + nama + " = " + subtotal);
            System.out.println();
        }

        double diskon = Model3.hitungDiskon(totalSemua);
        double setelahDiskon = totalSemua - diskon;
        double pajak = Model3.hitungPajak(setelahDiskon);
        double totalAkhir = setelahDiskon + pajak;

        System.out.println("===== STRUK =====");
        System.out.println("Total        : " + totalSemua);
        System.out.println("Diskon       : " + diskon);
        System.out.println("Pajak 10%    : " + pajak);
        System.out.println("Total Bayar  : " + totalAkhir);

        input.close();
    }
}
