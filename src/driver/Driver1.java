package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String kode = input.nextLine();

            if (kode.equals("END")) {
                break;
            }

            double beratButet = input.nextDouble();
            input.nextLine(); // buang newline

            double beratUcok = 1.5 * beratButet;
            double totalBerat = beratButet + beratUcok;

            int ongkirPerKg = Model1.getOngkir(kode);
            String kategori = Model1.getKategori(kode);
            String namaKota = Model1.getNamaKota(kode);

            double totalBiaya = totalBerat * ongkirPerKg;

            String promo = "Tidak ada promo";

            
            if (totalBerat > 10) {
                totalBiaya *= 0.9;
                promo = "Diskon 10%";
            }

            
            if (kategori.equals("Luar Pulau")) {
                promo += " + Asuransi Gratis";
            }

            
            System.out.println("===== STRUK =====");
            System.out.println("Kota Tujuan      : " + namaKota);
            System.out.println("Berat Butet      : " + beratButet);
            System.out.println("Berat Ucok       : " + beratUcok);
            System.out.println("Total Berat      : " + totalBerat);
            System.out.println("Total Ongkir     : " + totalBiaya);
            System.out.println("Promo            : " + promo);
            System.out.println();
        }

        input.close();
    }
}
